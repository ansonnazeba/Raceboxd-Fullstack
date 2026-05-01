import React from "react";

function RatedRaces({ raceData }) {
  const ratedRaces = Object.values(raceData)
    .flat()
    .filter((race) => race.userRating > 0)
    .sort((a, b) => b.userRating - a.userRating);

  return (
    <section className="summary-panel">
      <p className="summary-kicker">Journal</p>
      <h2 className="summary-title">Your recent verdicts</h2>
      {ratedRaces.length === 0 ? (
        <p className="summary-empty">You have not logged any race weekends yet.</p>
      ) : (
        <div className="verdict-stack">
          {ratedRaces.slice(0, 5).map((race) => (
            <article key={race.id} className="verdict-card">
              <div className="verdict-card__header">
                <strong>{race.name}</strong>
                <span className="summary-list__score">★ {race.userRating}</span>
              </div>
              <p className="verdict-card__meta">
                {race.season} / {race.date}
              </p>
              {race.userReview ? (
                <p className="verdict-card__quote">“{race.userReview}”</p>
              ) : (
                <p className="verdict-card__quote verdict-card__quote--muted">
                  No written review yet, just the score.
                </p>
              )}
            </article>
          ))}
        </div>
      )}
    </section>
  );
}

export default RatedRaces;
