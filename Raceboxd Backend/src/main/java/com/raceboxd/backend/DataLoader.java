package com.raceboxd.backend;

import com.raceboxd.backend.model.Race;
import com.raceboxd.backend.repository.RaceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {
    @Bean
    CommandLineRunner initDatabase(RaceRepository raceRepository) {
        return args -> {
            // ===== 2025 Season =====
            raceRepository.save(new Race("melbourne", "LOUIS VUITTON AUSTRALIAN GRAND PRIX", "2025-03-16", "Albert Park Circuit, Melbourne, Australia", "Lando Norris", 2025, 1));
            raceRepository.save(new Race("shanghai", "STC SAUDI ARABIAN GRAND PRIX", "2025-03-23", "Shanghai International Circuit, Shanghai, China", "Oscar Piastri", 2025, 2));
            raceRepository.save(new Race("suzuka", "LENOVO JAPANESE GRAND PRIX", "2025-04-06", "Suzuka Circuit, Suzuka, Japan", "Max Verstappen", 2025, 3));
            raceRepository.save(new Race("bahrain", "GULF AIR BAHRAIN GRAND PRIX", "2025-04-13", "Bahrain International Circuit, Sakhir, Bahrain", "Oscar Piastri", 2025, 4));
            raceRepository.save(new Race("jeddah", "STC SAUDI ARABIAN GRAND PRIX", "2025-04-20", "Jeddah Corniche Circuit, Jeddah, Saudi Arabia", "Oscar Piastri", 2025, 5));
            raceRepository.save(new Race("miami", "CRYPTO.COM MIAMI GRAND PRIX", "2025-05-04", "Miami International Autodrome, Miami, USA", "Oscar Piastri", 2025, 6));
            raceRepository.save(new Race("imola", "AWS GRAN PREMIO DEL MADE IN ITALY E DELL'EMILIA-ROMAGNA", "2025-05-18", "Autodromo Internazionale Enzo e Dino Ferrari, Imola, Italy", "Max Verstappen", 2025, 7));
            raceRepository.save(new Race("monaco", "TAG HEUER GRAND PRIX DE MONACO", "2025-05-25", "Circuit de Monaco, Monaco", "Lando Norris", 2025, 8));
            raceRepository.save(new Race("barcelona", "ARAMCO GRAND PREMIO DE ESPANA", "2025-06-01", "Circuit de Barcelona-Catalunya, Barcelona, Spain", "Oscar Piastri", 2025, 9));
            raceRepository.save(new Race("montreal", "PIRELLI GRAND PRIX DU CANADA", "2025-06-15", "Circuit Gilles-Villeneuve, Montreal, Canada", "George Russell", 2025, 10));
            raceRepository.save(new Race("spielberg", "MSC CRUISES AUSTRIAN GRAND PRIX", "2025-06-29", "Red Bull Ring, Spielberg, Austria", "Lando Norris", 2025, 11));
            raceRepository.save(new Race("silverstone", "QATAR AIRWAYS BRITISH GRAND PRIX", "2025-07-06", "Silverstone Circuit, Silverstone, Great Britain", "Lando Norris", 2025, 12));
            raceRepository.save(new Race("spa", "MOET & CHANDON BELGIAN GRAND PRIX", "2025-07-27", "Circuit de Spa-Francorchamps, Spa-Francorchamps, Belgium", "Oscar Piastri", 2025, 13));
            raceRepository.save(new Race("budapest", "LENOVO HUNGARIAN GRAND PRIX", "2025-08-03", "Hungaroring, Budapest, Hungary", "Lando Norris", 2025, 14));
            raceRepository.save(new Race("zandvoort", "HEINEKEN DUCTH GRAND PRIX", "2025-08-31", "Circuit Zandvoort, Zandvoort, Belgium", "Oscar Piastri", 2025, 15));
            raceRepository.save(new Race("monza", "PIRELLI GRAN PREMIO D'ITALIA", "2025-09-07", "Autodromo Nazionale Monza, Monza, Italy", "Max Verstappen", 2025, 16));
            raceRepository.save(new Race("baku", "QATAR AIRWAYS AZERBAIJAN GRAND PRIX", "2025-09-21", "Baku City Circuit, Baku, Azerbaijan", "Max Verstappen", 2025, 17));
            raceRepository.save(new Race("marina bay", "SINGAPORE AIRLINES SINGAPORE GRAND PRIX", "2025-10-03", "Marina Bay Street Circuit, Marina bay, Singapore", "George Russell", 2025, 18));
            

            // ===== 2024 Season =====
            raceRepository.save(new Race("bahrain", "GULF AIR BAHRAIN GRAND PRIX", "2024-03-02", "Bahrain International Circuit, Sakhir, Bahrain", "Max Verstappen", 2024, 1));
            raceRepository.save(new Race("jeddah", "STC SAUDI ARABIAN GRAND PRIX", "2024-03-09", "Jeddah Corniche Circuit, Jeddah, Saudi Arabia", "Max Verstappen", 2024, 2));
            raceRepository.save(new Race("melbourne", "ROLEX AUSTRALIAN GRAND PRIX", "2024-03-24", "Albert Park Grand Prix, Melbourne, Australia", "Carlos Sainz", 2024, 3));
            raceRepository.save(new Race("suzuka", "MSC CRUISES JAPANESE GRAND PRIX", "2024-04-07", "Suzuka Circuit, Suzuka, Japan", "Max Verstappen", 2024, 4));
            raceRepository.save(new Race("shanghai", "LENOVO CHINESE GRAND PRIX", "2024-04-21", "Shanghai International Circuit, Shanghai, China", "Max Verstappen", 2024, 5));
            raceRepository.save(new Race("miami", "CRYPTO.COM MIAMI GRAND PRIX", "2024-05-05", "Miami International Autodrome, Miami, USA", "Max Verstappen", 2024, 6));
            raceRepository.save(new Race("imola", "MSC CRUISES GRAN PREMIO DEL MADE IN ITALY E DELL'EMILIA-ROMAGNA", "2024-05-19", "Autodromo Internazionale Enzo e Dino Ferrari, Imola, Italy", "Max Verstappen", 2024, 7));
            raceRepository.save(new Race("monaco", "GRAND PRIX DE MONACO", "2024-05-26", "Circuit de Monaco, Moanco", "Charles Leclerc", 2024, 8));
            raceRepository.save(new Race("montreal", "AWS GRAND PRIX DU CANADA", "2024-06-09", "Circuit Gilles-Villeneuve, Montreal, Canada", "Max Verstappen", 2024, 9));
            raceRepository.save(new Race("barcelona", "ARAMCO GRAN PREMIO DE ESPANA", "2024-06-23", "Circuit de Barcelona-Catalunya, Barcelona, Spain", "Max Verstappen", 2024, 10));
            raceRepository.save(new Race("spielberg", "QATAR AIRWAYS AUSTRIAN GRAND PRIX", "2024-06-30", "red Bull Ring, Spielberg, Austria", "George Russell", 2024, 11));
            raceRepository.save(new Race("silverstone", "QATAR AIRQYAS BRITISH GRAND PRIX", "2024-07-07", "Silverstone Circuit, Silverstone, Great Britain", "Lewis Hamilton", 2024, 12));
            raceRepository.save(new Race("budapest", "HUNGARIAN GRAND PRIX", "2024-07-21", "Hungaroring, Budapest, Hungary", "Oscar Piastri", 2024, 13));
            raceRepository.save(new Race("spa", "ROLEX BELGIAN GRAND PRIX", "2024-07-28", "Circuit de Spa-Francorchamps, Spa-Francorchamps, Belgium", "Lewis Hamilton", 2024, 14));
            raceRepository.save(new Race("zandvoort", "HEINEKEN DUTCH GRAND PRIX", "2024-08-25", "Circuit Zandvoort, Zandvoort, Belgium", "Lando Norris", 2024, 15));
            raceRepository.save(new Race("monza", "PIRELLI GRAN PREMIO D'ITALIA", "2024-09-01", "Autodromo Nazionale Monza, Monza, Italy", "Charles Leclerc", 2024, 16));
            raceRepository.save(new Race("baku", "QATAR AIRWAYS AZERBAIJAN GRAND PRIX", "2024-09-15", "Baku City Circuit, Baku, Azerbaijan", "Oscar Piastri", 2024, 17));
            raceRepository.save(new Race("marina bay", "SINGAPORE AIRLINES GRAND PRIX", "2024-09-22", "Marina Bay Street Circuit, Marina Bay, Singapore", "Lando Norris", 2024, 18));
            raceRepository.save(new Race("cota", "PIRELLI UNITED STATES GRAND PRIX", "2024-10-20", "Circuit of The Americas, Austin, USA", "Charles Leclerc", 2024, 19));
            raceRepository.save(new Race("mexico city", "GRAN PREMIO DE LA CIUDAD DE MEXICO", "2024-10-27", "Autódromo Hermanos Rodríguez, Mexico City, Mexico", "Carlos Sainz", 2024, 20));
            raceRepository.save(new Race("sao paulo", "LENOVO GRANDE PREMIO DE SAO PAULO", "2024-11-03", "Autodromo Jose Carlos Pace, Sao Paulo, Brazil", "Max Verstappen", 2024, 21));
            raceRepository.save(new Race("las vegas", "HEINEKEN SILVER LAS VEGAS GRAND PRIX", "2024-11-23", "Las Vegass Strip Circuit, Las Vegas, USA", "George Russell", 2024, 22));
            raceRepository.save(new Race("lusail", "QATAR AIRWAYS QATAR GRAND PRIX", "2024-12-01", "Lusail International Circuit, Lusail, Qatar", "Max Verstappen", 2024, 23));
            raceRepository.save(new Race("yas marina", "ETIHAD AIRWAYS ABU DHABI GRAND PRIX", "2024-12-08", "Yas Marina Circuit, Yas Island, UAE", "Lando Norris", 2024, 24));

            // ==== 2023 Season ====
        };
    }
}
