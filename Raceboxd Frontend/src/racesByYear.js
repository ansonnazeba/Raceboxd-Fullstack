import React, { useEffect, useState } from "react";

function App() {
  const [races, setRaces] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/races")
      .then((response) => response.json())
      .then((data) => setRaces(data))
      .catch((error) => console.error("Error fetching races:", error));
  }, []);

  return (
    <div className="App">
      <h1>Formula 1 Races</h1>
      {races.map((race) => (
        <div key={race.id}>
          <h2>{race.name}</h2>
          <p>{race.location}</p>
          <p>{race.date}</p>
          <p>Winner: {race.winner}</p>
          <p>Season: {race.season}</p>
        </div>
      ))}
    </div>
  );
}

export default App;