import React, { useState, useEffect } from "react";
import RaceCard from "./Racecard";
import TopRated from "./TopRated";
import RatedRaces from "./RatedRaces";

function App() {
  const [selectedYear, setSelectedYear] = useState("2025");
  const [raceData, setRaceData] = useState({});
  const [loading, setLoading] = useState(true);

  // Fetch races from backend and group by year
  useEffect(() => {
    fetch("http://localhost:8080/api/races")
      .then((response) => response.json())
      .then((data) => {
        const grouped = data.reduce((acc, race) => {
          const year = race.season; // handle either field name
          console.log("Race:", race);
          if (!acc[year]) acc[year] = [];
          acc[year].push(race);
          return acc;
        }, {});
        setRaceData(grouped);
        setLoading(false);
      })
      .catch((error) => {
        console.error("Error fetching races:", error);
        setLoading(false);
      });
  }, []);

  // Load user reviews/ratings from localStorage
  

  // Save race data to localStorage whenever updated
  useEffect(() => {
    if (Object.keys(raceData).length > 0) {
      localStorage.setItem("raceData", JSON.stringify(raceData));
    }
  }, [raceData]);

  // Handle submitting a review
  const handleSubmitReview = (raceId, newRating, newReview) => {
    const updatedYear = raceData[selectedYear].map((r) =>
      r.id === raceId
        ? { ...r, userRating: newRating, userReview: newReview }
        : r
    );

    setRaceData((prev) => ({
      ...prev,
      [selectedYear]: updatedYear,
    }));

    localStorage.setItem(
      `race-${raceId}`,
      JSON.stringify({ userRating: newRating, userReview: newReview })
    );
  };

  return (
    <div style={appStyle}>
      <h1>🏎️ RaceBoxd</h1>
      <p style={{ fontSize: "20px", marginBottom: "24px", color: "#f4ecec" }}>
        Explore and review your favorite Formula 1 races by year.
      </p>

      <TopRated raceData={raceData} />
      <RatedRaces />

      <div className="year-selector" style={yearSelectorStyle}>
        <label htmlFor="year-select">Select Year: </label>
        <select
          id="year-select"
          value={selectedYear}
          onChange={(e) => setSelectedYear(e.target.value)}
        >
          {Object.keys(raceData).map((year) => (
            <option key={year} value={year}>
              {year}
            </option>
          ))}
        </select>
      </div>

      {loading ? (
        <p>Loading races...</p>
      ) : raceData[selectedYear] ? (
        raceData[selectedYear].map((race) => (
          <RaceCard
            key={race.id}
            race={race}
            onSubmitReview={handleSubmitReview}
            reviewTextareaStyle={{
              width: "100%",
              height: "80px",
              padding: "10px",
              fontSize: "18px",
              fontWeight: "500",
              color: "#fb0707",
              borderRadius: "6px",
              border: "1px solid #f50909",
              resize: "vertical",
            }}
            submitButtonStyle={{
              marginTop: "10px",
              padding: "12px 24px",
              fontSize: "20px",
              backgroundColor: "#040404",
              color: "white",
              border: "none",
              borderRadius: "8px",
              cursor: "pointer",
              boxShadow: "0 2px 5px rgba(0, 0, 0, 0.2)",
            }}
            cardBackgroundStyle={{
              backgroundColor: "#f4eaea",
              color: "#cc0000",
              borderRadius: "10px",
              padding: "24px",
              marginBottom: "20px",
              boxShadow: "0 4px 10px rgba(0, 0, 0, 0)",
            }}
          />
        ))
      ) : (
        <p>No races found for {selectedYear}.</p>
      )}
    </div>
  );
}

const appStyle = {
  textAlign: "center",
  fontFamily: "serif",
  maxWidth: "700px",
  margin: "auto",
  padding: "24px",
  backgroundColor: "#000000",
  color: "#ffffff",
};

const yearSelectorStyle = {
  display: "flex",
  alignItems: "center",
  gap: "10px",
  marginBottom: "20px",
  fontSize: "18px",
  color: "#fcfcfc",
};

export default App;