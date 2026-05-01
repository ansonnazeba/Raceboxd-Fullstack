import React from "react";

function TopRated({ raceData }) {
  const topRaces = Object.values(raceData)
    .flat()
    .filter((race) => race.userRating >= 4)
    .sort((a, b) => b.userRating - a.userRating)
    .slice(0, 5);

  return (
    <section className="summary-panel">
      <p className="summary-kicker">Leaderboard</p>
      <h2 className="summary-title">Top rated races</h2>
      {topRaces.length === 0 ? (
        <p className="summary-empty">No races rated 4 stars or above yet.</p>
      ) : (
        <ol className="summary-list">
          {topRaces.map((race, index) => (
            <li key={`${race.id}-${index}`} className="summary-list__item">
              <span className="summary-list__rank">{String(index + 1).padStart(2, "0")}</span>
              <div className="summary-list__content">
                <strong>{race.name}</strong>
                <span>{race.season}</span>
              </div>
              <span className="summary-list__score">★ {race.userRating}</span>
            </li>
          ))}
        </ol>
      )}
    </section>
  );
}

export default TopRated;
