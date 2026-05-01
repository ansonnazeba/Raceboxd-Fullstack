import React, { useState, useEffect } from "react";

function RaceCard({ race, onSubmitReview }) {
  const [tempRating, setTempRating] = useState(race.userRating ?? 0);
  const [tempReview, setTempReview] = useState(race.userReview ?? "");
  const [feedback, setFeedback] = useState({ type: "idle", message: "" });

  useEffect(() => {
    setTempRating(race.userRating ?? 0);
    setTempReview(race.userReview ?? "");
    setFeedback({ type: "idle", message: "" });
  }, [race.userRating, race.userReview]);

  const handleSubmit = () => {
    if (tempRating === 0) {
      setFeedback({ type: "error", message: "Pick a rating before logging the race." });
      return;
    }

    setFeedback({ type: "saving", message: "Saving your verdict..." });

    // Create review data payload
    const reviewData = {
      review: tempReview,
      rating: tempRating,
    };

    // Save review to backend
    fetch(`http://localhost:8080/api/reviews/race/${race.id}`, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(reviewData),
    })
      .then(async (res) => {
        const data = await res.json();
        if (!res.ok) {
          throw new Error(data.message || "Failed to save review");
        }
        return data;
      })
      .then((savedReview) => {
        setFeedback({ type: "success", message: "Race logged to your journal." });
        onSubmitReview(race.id, savedReview.rating, savedReview.review);
      })
      .catch((error) => {
        console.error("Error saving review:", error);
        setFeedback({
          type: "error",
          message: error.message || "Error saving review. Check backend connection.",
        });
      });
  };

  return (
    <article className={`race-card ${race.userRating > 0 ? "race-card--reviewed" : ""}`}>
      <div className="race-card__header">
        <div>
          <p className="race-card__meta">
            Round {race.round} / {race.date}
          </p>
          <h3 className="race-card__title">{race.name}</h3>
        </div>

        <span className="race-card__badge">
          {race.userRating > 0 ? `${race.userRating}.0 / 5` : "Unrated"}
        </span>
      </div>

      <div className="race-card__facts">
        <div className="race-card__fact">
          <span>Location</span>
          <strong>{race.location}</strong>
        </div>
        <div className="race-card__fact">
          <span>Winner</span>
          <strong>{race.winner}</strong>
        </div>
        <div className="race-card__fact">
          <span>Season</span>
          <strong>{race.season}</strong>
        </div>
      </div>

      <div className="race-card__review">
        <div className="race-card__review-header">
          <div>
            <p className="summary-kicker">Your verdict</p>
            <h4 className="race-card__review-title">How did this weekend rate?</h4>
          </div>
          {feedback.message ? (
            <span className={`race-card__feedback race-card__feedback--${feedback.type}`}>
              {feedback.message}
            </span>
          ) : race.userRating > 0 ? (
            <span className="race-card__feedback race-card__feedback--saved">
              Stored locally
            </span>
          ) : null}
        </div>

        <div className="rating-picker" role="radiogroup" aria-label={`Rate ${race.name}`}>
          {[1, 2, 3, 4, 5].map((num) => (
            <button
              key={num}
              type="button"
              className={`rating-button ${num <= tempRating ? "rating-button--active" : ""}`}
              aria-pressed={num === tempRating}
              onClick={() => setTempRating(num)}
            >
              <span className="rating-button__star">★</span>
              <span className="rating-button__value">{num}</span>
            </button>
          ))}
        </div>

        <textarea
          className="race-card__textarea"
          value={tempReview}
          onChange={(e) => setTempReview(e.target.value)}
          rows={4}
          placeholder="Strategy chaos, tyre calls, overtakes, safety cars. What made this one memorable?"
        />

        <div className="race-card__actions">
          <button
            type="button"
            className="race-card__button"
            onClick={handleSubmit}
            disabled={feedback.type === "saving"}
          >
            {feedback.type === "saving"
              ? "Saving..."
              : race.userRating > 0
                ? "Update verdict"
                : "Save verdict"}
          </button>
        </div>
      </div>
    </article>
  );
}

export default RaceCard;
