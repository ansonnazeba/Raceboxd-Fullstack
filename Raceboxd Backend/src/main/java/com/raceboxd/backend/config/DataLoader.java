package com.raceboxd.backend.config;

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
            raceRepository.save(new Race("las vegas", "HEINEKEN SILVER LAS VEGAS GRAND PRIX", "2024-11-23", "Las Vegas Strip Circuit, Las Vegas, USA", "George Russell", 2024, 22));
            raceRepository.save(new Race("lusail", "QATAR AIRWAYS QATAR GRAND PRIX", "2024-12-01", "Lusail International Circuit, Lusail, Qatar", "Max Verstappen", 2024, 23));
            raceRepository.save(new Race("yas marina", "ETIHAD AIRWAYS ABU DHABI GRAND PRIX", "2024-12-08", "Yas Marina Circuit, Yas Island, UAE", "Lando Norris", 2024, 24));

            // ==== 2023 Season ====
            raceRepository.save(new Race("bahrain", "GULF AIR BAHRAIN GRAND PRIX ", "2023-03-05", "Bahrain International Circuit, Sakhir, Bahrain", "Max Verstappen", 2023, 1));
            raceRepository.save(new Race("jeddah", "STC SAUDI ARABIAN GRAND PRIX", "2023-03-19", "Jeddah Corniche Circuit, Jeddah, Saudi Arabia", "Sergio Perez", 2023, 2));
            raceRepository.save(new Race("melbourne", "ROLEX AUSTRALIAN GRAND PRIX", "2023-04-02", "Albert Park Circuit, Melbourne, Australia", "Max Verstappen", 2023, 3));
            raceRepository.save(new Race("baku", "AZERBAIJAN GRAND PRIX", "2023-04-30", "Baku City Circuit, Baku, Azerbaijan", "Sergio Perez", 2023, 4));
            raceRepository.save(new Race("miami", "CRYPTO.COM MIAMI GRAND PRIX", "2023-05-07", "Miami International Autodrome, Miami, USA", "Max Verstappen", 2023, 5));
            raceRepository.save(new Race("imola", "CALLED OFF: QATAR AIRWAYS GRAN PREMIO DEL MADE IN ITALY E DELL'EMILIA-ROMAGNA", "2023-05-21", "Autodromo Enzo e Dino Ferrari, Imola, Italy", "Cancelled", 2023, 6));
            raceRepository.save(new Race("monaco", "GRAND PRIX DE MONACO", "2023-05-28", "Circuit de Monaco, Monaco", "Max Verstappen", 2023, 7));
            raceRepository.save(new Race("barcelona", "AWS GRAN PREMIO DE ESPAÑA", "2023-06-04", "Circuit de Barcelona-Catalunya, Barcelona, Spain", "Max Verstappen", 2023, 8));
            raceRepository.save(new Race("montreal", "PIRELLI GRAND PRIX DU CANADA", "2023-06-18", "Circuit Gilles-Villeneuve, Montreal, Canada", "Max Verstappen", 2023, 9));
            raceRepository.save(new Race("spielberg", "ROLEX GROSSER PREIS VON ÖSTERREICH", "2023-07-02", "Red Bull Ring, Spielberg, Austria", "Max Verstappen", 2023, 10));
            raceRepository.save(new Race("silverstone", "ARAMCO BRITISH GRAND PRIX", "2023-07-09", "Silverstone Circuit, Silverstone, Great Britain", "Max Verstappen", 2023, 11));
            raceRepository.save(new Race("budapest", "QATAR AIRWAYS HUNGARIAN GRAND PRIX", "2023-07-23", "Hungaroring, Budapest, Hungary", "Max Verstappen", 2023, 12));
            raceRepository.save(new Race("spa", "MSC CRUISES BELGIAN GRAND PRIX", "2023-07-30", "Circuit de Spa-Francorchamps, Spa-Francorchamps, Belgium", "Max Verstappen", 2023, 13));
            raceRepository.save(new Race("zandvoort", "HEINEKEN DUTCH GRAND PRIX", "2023-08-27", "Circuit Zandvoort, Zandvoort, Netherlands", "Max Verstappen", 2023, 14));
            raceRepository.save(new Race("monza", "PIRELLI GRAN PREMIO D’ITALIA", "2023-09-03", "Autodromo Nazionale Monza, Monza, Italy", "Max Verstappen", 2023, 15));
            raceRepository.save(new Race("singapore", "SINGAPORE AIRLINES SINGAPORE GRAND PRIX", "2023-09-17", "Marina Bay Street Circuit, Singapore", "Carlos Sainz", 2023, 16));
            raceRepository.save(new Race("suzuka", "LENOVO JAPANESE GRAND PRIX", "2023-09-24", "Suzuka Circuit, Suzuka, Japan", "Max Verstappen", 2023, 17));
            raceRepository.save(new Race("lusail", "QATAR AIRWAYS QATAR GRAND PRIX", "2023-10-08", "Lusail International Circuit, Lusail, Qatar", "Max Verstappen", 2023, 18));
            raceRepository.save(new Race("cota", "LENOVO UNITED STATES GRAND PRIX", "2023-10-22", "Circuit of the Americas, Austin, USA", "Max Verstappen", 2023, 19));
            raceRepository.save(new Race("mexico city", "GRAN PREMIO DE LA CIUDAD DE MÉXICO", "2023-10-29", "Autódromo Hermanos Rodríguez, Mexico City, Mexico", "Max Verstappen", 2023, 20));
            raceRepository.save(new Race("sao paulo", "ROLEX GRANDE PRÊMIO DE SÃO PAULO", "2023-11-05", "Autódromo José Carlos Pace, São Paulo, Brazil", "Max Verstappen", 2023, 21));
            raceRepository.save(new Race("las vegas", "HEINEKEN SILVER LAS VEGAS GRAND PRIX", "2023-11-19", "Las Vegas Strip Circuit, Las Vegas, USA", "Max Verstappen", 2023, 22));
            raceRepository.save(new Race("yas marina", "ETIHAD AIRWAYS ABU DHABI GRAND PRIX", "2023-11-26", "Yas Marina Circuit, Yas Island, UAE", "Max Verstappen", 2023, 23));

            // ==== 2022 Season =====
            raceRepository.save(new Race("bahrain", "GULF AIR BAHRAIN GRAND PRIX", "2022-03-20", "Bahrain International Circuit, Sakhir, Bahrain", "Charles Leclerc", 2022, 1));
            raceRepository.save(new Race("jeddah", "STC SAUDI ARABIAN GRAND PRIX", "2022-03-27", "Jeddah Corniche Circuit, Jeddah, Saudi Arabia", "Max Verstappen", 2022, 2));
            raceRepository.save(new Race("melbourne", "HEINEKEN AUSTRALIAN GRAND PRIX", "2022-04-10", "Albert Park Circuit, Melbourne, Australia", "Charles Leclerc", 2022, 3));
            raceRepository.save(new Race("imola", "ROLEX GRAN PREMIO DEL MADE IN ITALY E DELL'EMILIA-ROMAGNA", "2022-04-24", "Autodromo Enzo e Dino Ferrari, Imola, Italy", "Max Verstappen", 2022, 4));
            raceRepository.save(new Race("miami", "CRYPTO.COM MIAMI GRAND PRIX", "2022-05-08", "Miami International Autodrome, Miami, USA", "Max Verstappen", 2022, 5));
            raceRepository.save(new Race("barcelona", "PIRELLI GRAN PREMIO DE ESPAÑA", "2022-05-22", "Circuit de Barcelona-Catalunya, Barcelona, Spain", "Max Verstappen", 2022, 6));
            raceRepository.save(new Race("monaco", "GRAND PRIX DE MONACO", "2022-05-29", "Circuit de Monaco, Monaco", "Sergio Perez", 2022, 7));
            raceRepository.save(new Race("baku", "AZERBAIJAN GRAND PRIX", "2022-06-12", "Baku City Circuit, Baku, Azerbaijan", "Max Verstappen", 2022, 8));
            raceRepository.save(new Race("montreal", "PIRELLI GRAND PRIX DU CANADA", "2022-06-19", "Circuit Gilles-Villeneuve, Montreal, Canada", "Max Verstappen", 2022, 9));
            raceRepository.save(new Race("silverstone", "PIRELLI BRITISH GRAND PRIX", "2022-07-03", "Silverstone Circuit, Silverstone, Great Britain", "Carlos Sainz", 2022, 10));
            raceRepository.save(new Race("spielberg", "ROLEX GROSSER PREIS VON ÖSTERREICH", "2022-07-10", "Red Bull Ring, Spielberg, Austria", "Charles Leclerc", 2022, 11));
            raceRepository.save(new Race("paul ricard", "LENOVO GRAND PRIX DE FRANCE", "2022-07-24", "Circuit Paul Ricard, Le Castellet, France", "Max Verstappen", 2022, 12));
            raceRepository.save(new Race("budapest", "ARAMCO HUNGARIAN GRAND PRIX", "2022-07-31", "Hungaroring, Budapest, Hungary", "Max Verstappen", 2022, 13));
            raceRepository.save(new Race("spa", "ROLEX BELGIAN GRAND PRIX", "2022-08-28", "Circuit de Spa-Francorchamps, Spa-Francorchamps, Belgium", "Max Verstappen", 2022, 14));
            raceRepository.save(new Race("zandvoort", "HEINEKEN DUTCH GRAND PRIX", "2022-09-04", "Circuit Zandvoort, Zandvoort, Netherlands", "Max Verstappen", 2022, 15));
            raceRepository.save(new Race("monza", "PIRELLI GRAN PREMIO D’ITALIA", "2022-09-11", "Autodromo Nazionale Monza, Monza, Italy", "Max Verstappen", 2022, 16));
            raceRepository.save(new Race("marina bay", "SINGAPORE AIRLINES SINGAPORE GRAND PRIX", "2022-10-02", "Marina Bay Street Circuit, Singapore", "Sergio Perez", 2022, 17));
            raceRepository.save(new Race("suzuka", "HONDA JAPANESE GRAND PRIX", "2022-10-09", "Suzuka Circuit, Suzuka, Japan", "Max Verstappen", 2022, 18));
            raceRepository.save(new Race("cota", "ARAMCO UNITED STATES GRAND PRIX", "2022-10-23", "Circuit of the Americas, Austin, USA", "Max Verstappen", 2022, 19));
            raceRepository.save(new Race("mexico city", "GRAN PREMIO DE LA CIUDAD DE MÉXICO", "2022-10-30", "Autódromo Hermanos Rodríguez, Mexico City, Mexico", "Max Verstappen", 2022, 20));
            raceRepository.save(new Race("sao paulo", "HEINEKEN GRANDE PRÊMIO DE SÃO PAULO", "2022-11-13", "Autódromo José Carlos Pace, São Paulo, Brazil", "George Russell", 2022, 21));
            raceRepository.save(new Race("yas marina", "ETIHAD AIRWAYS ABU DHABI GRAND PRIX", "2022-11-20", "Yas Marina Circuit, Yas Island, UAE", "Max Verstappen", 2022, 22));

            // ==== 2021 Season =====
            raceRepository.save(new Race("bahrain", "GULF AIR BAHRAIN GRAND PRIX", "2021-03-28", "Bahrain International Circuit, Sakhir, Bahrain", "Lewis Hamilton", 2021, 1));
            raceRepository.save(new Race("imola", "PIRELLI GRAN PREMIO DEL MADE IN ITALY E DELL'EMILIA-ROMAGNA", "2021-04-18", "Autodromo Enzo e Dino Ferrari, Imola, Italy", "Max Verstappen", 2021, 2));
            raceRepository.save(new Race("portimao", "HEINEKEN GRANDE PRÉMIO DE PORTUGAL", "2021-05-02", "Algarve International Circuit, Portimão, Portugal", "Lewis Hamilton", 2021, 3));
            raceRepository.save(new Race("barcelona", "ARAMCO GRAN PREMIO DE ESPAÑA", "2021-05-09", "Circuit de Barcelona-Catalunya, Barcelona, Spain", "Lewis Hamilton", 2021, 4));
            raceRepository.save(new Race("monaco", "GRAND PRIX DE MONACO", "2021-05-23", "Circuit de Monaco, Monaco", "Max Verstappen", 2021, 5));
            raceRepository.save(new Race("baku", "AZERBAIJAN GRAND PRIX", "2021-06-06", "Baku City Circuit, Baku, Azerbaijan", "Sergio Perez", 2021, 6));
            raceRepository.save(new Race("paul ricard", "GRAND PRIX DE FRANCE", "2021-06-20", "Circuit Paul Ricard, Le Castellet, France", "Max Verstappen", 2021, 7));
            raceRepository.save(new Race("spielberg", "STYRIAN GRAND PRIX", "2021-06-27", "Red Bull Ring, Spielberg, Austria", "Max Verstappen", 2021, 8));
            raceRepository.save(new Race("spielberg", "ROLEX AUSTRIAN GRAND PRIX", "2021-07-04", "Red Bull Ring, Spielberg, Austria", "Max Verstappen", 2021, 9));
            raceRepository.save(new Race("silverstone", "PIRELLI BRITISH GRAND PRIX", "2021-07-18", "Silverstone Circuit, Silverstone, Great Britain", "Lewis Hamilton", 2021, 10));
            raceRepository.save(new Race("budapest", "HUNGARIAN GRAND PRIX", "2021-08-01", "Hungaroring, Budapest, Hungary", "Esteban Ocon", 2021, 11));
            raceRepository.save(new Race("spa", "ROLEX BELGIAN GRAND PRIX", "2021-08-29", "Circuit de Spa-Francorchamps, Spa-Francorchamps, Belgium", "Max Verstappen", 2021, 12));
            raceRepository.save(new Race("zandvoort", "HEINEKEN DUTCH GRAND PRIX", "2021-09-05", "Circuit Zandvoort, Zandvoort, Netherlands", "Max Verstappen", 2021, 13));
            raceRepository.save(new Race("monza", "HEINEKEN GRAN PREMIO D’ITALIA", "2021-09-12", "Autodromo Nazionale Monza, Monza, Italy", "Daniel Ricciardo", 2021, 14));
            raceRepository.save(new Race("sochi", "VTB RUSSIAN GRAND PRIX", "2021-09-26", "Sochi Autodrom, Sochi, Russia", "Lewis Hamilton", 2021, 15));
            raceRepository.save(new Race("istanbul", "TURKISH GRAND PRIX", "2021-10-10", "Istanbul Park, Istanbul, Turkey", "Valtteri Bottas", 2021, 16));
            raceRepository.save(new Race("cota", "ARAMCO UNITED STATES GRAND PRIX", "2021-10-24", "Circuit of the Americas, Austin, USA", "Max Verstappen", 2021, 17));
            raceRepository.save(new Race("mexico city", "GRAN PREMIO DE LA CIUDAD DE MÉXICO", "2021-11-07", "Autódromo Hermanos Rodríguez, Mexico City, Mexico", "Max Verstappen", 2021, 18));
            raceRepository.save(new Race("sao paulo", "HEINEKEN GRANDE PRÊMIO DE SÃO PAULO", "2021-11-14", "Autódromo José Carlos Pace, São Paulo, Brazil", "Lewis Hamilton", 2021, 19));
            raceRepository.save(new Race("lusail", "OOREDOO QATAR GRAND PRIX", "2021-11-21", "Losail International Circuit, Lusail, Qatar", "Lewis Hamilton", 2021, 20));
            raceRepository.save(new Race("yas marina", "ETIHAD AIRWAYS ABU DHABI GRAND PRIX", "2021-12-12", "Yas Marina Circuit, Yas Island, UAE", "Max Verstappen", 2021, 21));
        };
    }
}
