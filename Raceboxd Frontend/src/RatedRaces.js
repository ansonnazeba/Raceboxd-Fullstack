

import React from "react";
import  racesByYear from "./racesByYear";

function RatedRaces() {
  const ratedRaces = [];

  Object.keys(localStorage).forEach((key) => {
    if (key.startsWith("race-")) {
      const raceId = key.replace("race-", "");
      const saved = JSON.parse(localStorage.getItem(key));
      const race = Object.values(racesByYear)
        .flat()
        .find((r) => r.id === raceId);

      if (race && saved.userRating) {
        ratedRaces.push({ ...race, ...saved });
      }
    }
  });

  return (
    <div style={{ padding: "20px", color: "#f2f2f2" }}>
      <h2>Your Rated Races</h2>
      {ratedRaces.length === 0 ? (
        <p>You haven’t rated any races yet.</p>
      ) : (
        ratedRaces.map((race) => (
          <div
            key={race.id}
            style={{
              background: "#222",
              padding: "16px",
              marginBottom: "12px",
              borderRadius: "10px",
              boxShadow: "0 0 10px rgba(0,0,0,0.3)"
            }}
          >
            <strong>{race.name}</strong> ({race.date})<br />
            ⭐ {race.userRating}/5<br />
            {race.userReview && <em>"{race.userReview}"</em>}
          </div>
        ))
      )}
    </div>
  );
}

export default RatedRaces;