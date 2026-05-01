import { render, screen } from "@testing-library/react";
import App from "./App";

beforeEach(() => {
  global.fetch = jest.fn(() =>
    Promise.resolve({
      ok: true,
      json: () =>
        Promise.resolve([
          {
            id: 1,
            name: "Australian Grand Prix",
            season: 2025,
            date: "2025-03-16",
            location: "Melbourne",
            winner: "Lando Norris",
          },
        ]),
    })
  );
  localStorage.clear();
});

afterEach(() => {
  jest.restoreAllMocks();
});

test("renders the app heading", async () => {
  render(<App />);
  expect(await screen.findByText(/RaceBoxd/i)).toBeInTheDocument();
  expect((await screen.findAllByText(/Australian Grand Prix/i)).length).toBeGreaterThan(0);
});
