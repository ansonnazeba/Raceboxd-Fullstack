import React from "react";
import racesByYear  from "./racesByYear";

function TopRated() {
  // Flatten all races from all seasons
  const allRaces = Object.values(racesByYear).flat();

  // Merge in userRating from localStorage allowing distinct races per season
  const ratedRaces = allRaces.reduce((acc, race) => {
    const stored = localStorage.getItem(`race-${race.id}`);
    if (stored) {
      const parsed = JSON.parse(stored);
      acc.push({ ...race, userRating: parsed.userRating });
    }
    return acc;
  }, []);

  // Filter races with a rating >= 4
  const filteredRaces = ratedRaces.filter(r => r.userRating !== null && r.userRating >= 4);

  // Remove duplicate race names unless from different seasons
  const uniqueRaces = [];
  const seen = new Set();
  for (const race of filteredRaces) {
    const key = `${race.name}-${race.season}`;
    if (!seen.has(key)) {
      seen.add(key);
      uniqueRaces.push(race);
    }
  }
  // Sort by rating descending and take top 5
  const topRaces = uniqueRaces.sort((a, b) => b.userRating - a.userRating).slice(0, 5);

  return (
    <div>
      <h2>🔥 Top Rated Races (4★+)</h2>
      {topRaces.length === 0 ? (
        <p>No races rated yet.</p>
      ) : (
        <ul>
          {topRaces.map((race, index) => (
            <li key={index}>
              <strong>{race.name}</strong> ({race.season}) - ⭐ {race.userRating}
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default TopRated;