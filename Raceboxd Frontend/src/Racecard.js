import React, { useState, useEffect } from "react";

function RaceCard({ race, onSubmitReview }) {
  const savedData = JSON.parse(localStorage.getItem(`race-${race.id}`)) || {};

  const [tempRating, setTempRating] = useState(
    savedData.userRating ?? race.userRating ?? 0
  );
  const [tempReview, setTempReview] = useState(
    (savedData.userReview ?? race.userReview) || ""
  );

  useEffect(() => {
    const saved = JSON.parse(localStorage.getItem(`race-${race.id}`));
    if (saved) {
      if (saved.userRating !== undefined) setTempRating(saved.userRating);
      if (saved.userReview !== undefined) setTempReview(saved.userReview);
    }
  }, [race.id]);

  const handleSubmit = () => {
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
      .then((res) => res.json())
      .then((savedReview) => {
        console.log("Review saved:", savedReview);
        alert("Review submitted successfully!");

        // ✅ Clear form
        setTempReview("");
        setTempRating(0);

        // ✅ Update parent so “Your Rated Races” refreshes
        onSubmitReview(race.id, savedReview.rating, savedReview.review);
      })
      .catch((error) => {
        console.error("Error saving review:", error);
        alert("Error saving review. Check backend connection.");
      });
  };

  return (
    <div className="race-card" style={cardStyle}>
      <h2>{race.name}</h2>
      <p>
        <strong>Date:</strong> {race.date}
      </p>
      <p>
        <strong>Location:</strong> {race.location}
      </p>
      <p>
        <strong>Winner:</strong> {race.winner}
      </p>

      <p>
        <strong>Your Rating:</strong>{" "}
        {[1, 2, 3, 4, 5].map((num) => (
          <span
            key={num}
            onClick={() => setTempRating(num)}
            style={{
              cursor: "pointer",
              color: num <= tempRating ? "#FFD700" : "#CCCCCC",
              filter: num <= tempRating ? "none" : "brightness(75%)",
              fontSize: "20px",
              marginRight: "4px",
            }}
          >
            ⭐
          </span>
        ))}
      </p>

      <div>
        <strong>Your Review:</strong>
        <br />
        <textarea
          value={tempReview}
          onChange={(e) => setTempReview(e.target.value)}
          rows={3}
          cols={40}
          placeholder="Write your thoughts..."
        />
        <br />
        <button onClick={handleSubmit}>Submit Review</button>
      </div>
    </div>
  );
}

const cardStyle = {
  border: "1px solid #ccc",
  padding: "16px",
  margin: "12px 0",
  borderRadius: "8px",
  backgroundColor: "#fff",
  color: "#000",
};

export default RaceCard;