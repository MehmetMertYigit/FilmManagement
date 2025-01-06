 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filmmanagement;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class FilmManagementSystem {
    HashMap<String, Film> films = new HashMap<>();
    HashMap<String, Actor> actors = new HashMap<>();
    RevenueManager revenueSimulator = new RevenueManager();
    Popularityranking popularityRankings = new Popularityranking();
    Recommendations recommendations = new Recommendations(this);
    ViewerFeedback viewerFeedback = new ViewerFeedback();

    public void addFilm(String name, String id, String genre, int year, double popularityScore) {
        Film film = new Film(name, id, genre, year, popularityScore);
        films.put(id, film); // Film HashMap'e ekleniyor
        popularityRankings.addOrUpdateFilm(film); // Popülerlik sıralamasına ekleniyor
    }
    public void addSampleFilms() {
    // Filmleri ekleyelim
    addFilm("Forrest Gump", "F001", "Drama", 1994, 8.6);
    addFilm("The Shawshank Redemption", "F002", "Drama", 1994, 9.0);
    addFilm("Fight Club", "F003", "Dram", 1999, 8.0);
    addFilm("Vikings", "F004", "Dram", 2013, 9.6);
    addFilm("Punisher", "F005", "Action",2004 , 8.8);
    addFilm("The Matrix", "F006", "Sci-Fi", 1999, 8.4);
    addFilm("Inception", "F007", "Sci-Fi", 2010, 9.3);
    addFilm("Pulp Fiction", "F008", "Crime", 1994, 8.1);
    addFilm("The Godfather", "F009", "Crime", 1972, 8.2);
    addFilm("3 idiots", "F010", "Comedy", 2009, 9.5);

    // Her filme 3 başrol oyuncusu ekleyelim
    Actor actor1 = new Actor("Tom Hanks", "A001");
    Actor actor2 = new Actor("Robin Wright", "A002");
    Actor actor3 = new Actor("Gary Sinise", "A003");
    Film forrestGump = films.get("F001");
    addActor(actor1.name, actor1.uniqueID);
    addActor(actor2.name, actor2.uniqueID);
    addActor(actor3.name, actor3.uniqueID);
    addActorToFilm(actor1.uniqueID, forrestGump.uniqueID);
    addActorToFilm(actor2.uniqueID, forrestGump.uniqueID);
    addActorToFilm(actor3.uniqueID, forrestGump.uniqueID);
    
    
    Actor actor4 = new Actor("Morgan Freeman", "A004");
    Actor actor5 = new Actor("Tim Robbins", "A005");
    Actor actor6 = new Actor("Toney mackil"," A006");
    Film shawshankRedemption = films.get("F002");
    addActor(actor4.name, actor4.uniqueID);
    addActor(actor5.name, actor5.uniqueID);
    addActor(actor6.name, actor6.uniqueID);
    addActorToFilm(actor4.uniqueID, shawshankRedemption.uniqueID);
    addActorToFilm(actor5.uniqueID, shawshankRedemption.uniqueID);
    addActorToFilm(actor6.uniqueID, shawshankRedemption.uniqueID);

    
    Actor actor7 = new Actor("Bradd Pitt", "A007");
    Actor actor8 = new Actor("Edward Northon", "A008");
    Actor actor9 = new Actor("Meat Loaf", "A009");
    Film fightClub = films.get("F003");
    addActor(actor7.name, actor7.uniqueID);
    addActor(actor8.name, actor8.uniqueID);
    addActor(actor9.name, actor9.uniqueID);
    addActorToFilm(actor7.uniqueID, fightClub.uniqueID);
    addActorToFilm(actor8.uniqueID, fightClub.uniqueID);
    addActorToFilm(actor9.uniqueID, fightClub.uniqueID);
    
    Actor actor10 = new Actor("Ragner Lothbrok", "A010");
    Actor actor11 = new Actor("Lagertha", "A011");
    Actor actor12 = new Actor("Floki", "A012");
    Film vikings = films.get("F004");
     addActor(actor10.name, actor10.uniqueID);
    addActor(actor11.name, actor11.uniqueID);
    addActor(actor12.name, actor12.uniqueID);
    addActorToFilm(actor10.uniqueID, vikings.uniqueID);
    addActorToFilm(actor11.uniqueID, vikings.uniqueID);
    addActorToFilm(actor12.uniqueID, vikings.uniqueID);
    
    Actor actor13 = new Actor("Frank Castle", "A013");
    Actor actor14 = new Actor("Howard Saint", "A014");
    Actor actor15 = new Actor("Joan", "A015");
    Film punisher = films.get("F005"); 
    addActor(actor13.name, actor13.uniqueID);
    addActor(actor14.name, actor14.uniqueID);
    addActor(actor15.name, actor15.uniqueID);
    addActorToFilm(actor13.uniqueID, punisher.uniqueID);
    addActorToFilm(actor14.uniqueID, punisher.uniqueID);
    addActorToFilm(actor15.uniqueID, punisher.uniqueID);
    
    Actor actor16 = new Actor("Thomas Anderson", "A016");
    Actor actor17 = new Actor("Carrie-Anne ", "A017");
    Actor actor18 = new Actor("Laurence Fishburne", "A018");
    Film theMatrix = films.get("F006");
    addActor(actor16.name, actor16.uniqueID);
    addActor(actor17.name, actor17.uniqueID);
    addActor(actor18.name, actor18.uniqueID);
    addActorToFilm(actor16.uniqueID, theMatrix.uniqueID);
    addActorToFilm(actor17.uniqueID, theMatrix.uniqueID);
    addActorToFilm(actor18.uniqueID, theMatrix.uniqueID);
    
    Actor actor19 = new Actor("Leonardo DiCaprio", "A019");
    Actor actor20 = new Actor("Joseph Gordon-Levitt", "A020");
    Actor actor21 = new Actor("Ellen Page", "A021");
    Film Inception = films.get("F007");
    addActor(actor19.name, actor19.uniqueID);
    addActor(actor20.name, actor20.uniqueID);
    addActor(actor21.name, actor21.uniqueID);
    addActorToFilm(actor19.uniqueID, Inception.uniqueID);
    addActorToFilm(actor20.uniqueID, Inception.uniqueID);
    addActorToFilm(actor21.uniqueID, Inception.uniqueID);
   
    
    Actor actor22 = new Actor("John Travolta", "A022");
    Actor actor23 = new Actor("Samuel L. Jackson", "A023");
    Actor actor24 = new Actor("Uma Thurman ", "A024");
    Film pulpFiction = films.get("F008");
    addActor(actor22.name, actor22.uniqueID);
    addActor(actor23.name, actor23.uniqueID);
    addActor(actor24.name, actor24.uniqueID);
    addActorToFilm(actor22.uniqueID, pulpFiction.uniqueID);
    addActorToFilm(actor23.uniqueID, pulpFiction.uniqueID);
    addActorToFilm(actor24.uniqueID, pulpFiction.uniqueID);
    
    
    Actor actor25 = new Actor("Marlon Brando", "A025");
    Actor actor26 = new Actor("Al Pacino", "A026");
    Actor actor27 = new Actor("James Caan ", "A027");
    Film theGodfather = films.get("F009");
    addActor(actor25.name, actor25.uniqueID);
    addActor(actor26.name, actor26.uniqueID);
    addActor(actor27.name, actor27.uniqueID);
    addActorToFilm(actor25.uniqueID, theGodfather.uniqueID);
    addActorToFilm(actor26.uniqueID, theGodfather.uniqueID);
    addActorToFilm(actor27.uniqueID, theGodfather.uniqueID);
    
   
    Actor actor28 = new Actor("Rancho", "A028");
    Actor actor29 = new Actor("Madhaven", "A029");
    Actor actor30 = new Actor("Sharman Joshi ", "A030");
    Film threeidiots= films.get("F010");
    addActor(actor28.name, actor28.uniqueID);
    addActor(actor29.name, actor29.uniqueID);
    addActor(actor30.name, actor30.uniqueID);
    addActorToFilm(actor28.uniqueID, theGodfather.uniqueID);
    addActorToFilm(actor29.uniqueID, theGodfather.uniqueID);
    addActorToFilm(actor30.uniqueID, theGodfather.uniqueID);
    
    
    
    }
    public void addActor(String name, String id) {
        Actor actor = new Actor(name, id);
        actors.put(id, actor);
    }

    public void addActorToFilm(String actorID, String filmID) {
        Actor actor = actors.get(actorID);
        Film film = films.get(filmID);
        if (actor != null && film != null) {
            actor.addFilm(film);
            film.addActor(actor);
        }
    }

    public Film searchFilm(String name) {
        return films.values().stream()
                .filter(f -> f.name.equalsIgnoreCase(name))
                .findFirst().orElse(null);
    }

    public Actor searchActor(String name) {
        return actors.values().stream()
                .filter(a -> a.name.equalsIgnoreCase(name))
                .findFirst().orElse(null);
    }
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nFilm Management System");
            System.out.println("0. Show film list");
            System.out.println("1. Add Film");
            System.out.println("2. Update Film");
            System.out.println("3. Add Actor");
            System.out.println("4. Look Up Film/Actor");
            System.out.println("5. Revenue Simulation");
            System.out.println("6. Revenue History Retrieval");
            System.out.println("7. Show Popularity Rankings");
            System.out.println("8. Recommended Movies");
            System.out.println("9. Audience Feedback");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 0:
                  
                System.out.println("--- Film List ---");
                for (Film film : films.values()) {
                    System.out.println("Film Name: " + film.name);
                    System.out.println("Genre: " + film.genre);
                    System.out.println("Release Year: " + film.releaseYear);
                    System.out.println("Popularity Score: " + film.popularityScore);
                    System.out.println("Actors: ");
                    for (Actor actor : film.actors) {
                        System.out.println("- " + actor.name);
                    }
                    System.out.println("-------------------------------");
                    }
                break;
                case 1: 
                    System.out.print("Enter film name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter film ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter release year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter popularity score: ");
                    double popularityScore = scanner.nextDouble();
                    scanner.nextLine(); // Enter tuşunu temizlemek için

    // Film ekleme işlemi
    if (films.containsKey(id)) {
        System.out.println("A film with this ID already exists. Please use a unique ID.");
    } else {
        addFilm(name, id, genre, year, popularityScore);
        System.out.println("Film added successfully!");
    }
    break;
                    
                case 2:
    // Films HashMap'inde mevcut ID'leri görmek için ekliyoruz
    System.out.println("Films in system: " + films.keySet());  // Bu satır, sistemdeki tüm film ID'lerini gösterir
                System.out.print("Enter film ID to update: ");
    String updateId = scanner.nextLine().trim();  // ID'yi doğru almak için .trim() kullanıyoruz


    Film film = films.get(updateId); // ID'ye göre film bulunuyor
    if (film != null) {
        System.out.print("Enter new name (leave blank to keep unchanged): ");
        String newName = scanner.nextLine();
        if (!newName.isEmpty()) film.name = newName;

        System.out.print("Enter new genre (leave blank to keep unchanged): ");
        String newGenre = scanner.nextLine();
        if (!newGenre.isEmpty()) film.genre = newGenre;

        System.out.print("Enter new release year (0 to keep unchanged): ");
        int newYear = scanner.nextInt();
        if (newYear != 0) film.releaseYear = newYear;

        System.out.print("Enter new popularity score (0 to keep unchanged): ");
        double newScore = scanner.nextDouble();
        if (newScore != 0) film.popularityScore = newScore;

        System.out.println("Film updated successfully!");
    } else {
        System.out.println("Film not found! Please ensure the film ID is correct.");
    }
    break;
    
                    
               
                
                case 3:
                    System.out.print("Enter actor name: ");
                    String actorName = scanner.nextLine();
                    System.out.print("Enter actor ID: ");
                    String actorId = scanner.nextLine();
                    addActor(actorName, actorId);
                    System.out.println("Actor added successfully!");
                    break;

                case 4:
                   System.out.println("Enter 1 to search for a film or 2 to search for an actor:");
                    int choice1 = scanner.nextInt();
                    scanner.nextLine();  // Enter tuşunu temizlemek için

                     if (choice1 == 1) {
                     System.out.print("Enter film name to search: ");
                     String searchName = scanner.nextLine();
                     searchFilmAndDisplay(searchName);  // Film arama fonksiyonu
                     } else if (choice1 == 2) {
                     System.out.print("Enter actor name to search: ");
                     String searchName = scanner.nextLine();
                     searchActorAndDisplay(searchName);  // Aktör arama fonksiyonu
                    } else {
                    System.out.println("Invalid choice! Please enter 1 for film or 2 for actor.");
                    }
                     break;

                case 5:
                    System.out.print("Enter film ID to simulate revenue: ");
                    String revenueFilmId = scanner.nextLine();
                    Film revenueFilm = films.get(revenueFilmId);
                    if (revenueFilm != null) {
                        System.out.print("Enter number of viewers: ");
                        int viewers = scanner.nextInt();
                        System.out.print("Enter ticket price: ");
                        double ticketPrice = scanner.nextDouble();
                        revenueSimulator.simulateRevenue(revenueFilm, viewers, ticketPrice);
                        System.out.println("Revenue simulated successfully!");
                    } else {
                        System.out.println("Film not found!");
                    }
                    break;

                case 6:
                    System.out.print("Enter number of revenue records to retrieve: ");
                    int records = scanner.nextInt();
                    List<Double> revenueHistory = revenueSimulator.getRevenueHistory(records);
                    System.out.println("Revenue History: " + revenueHistory);
                    break;

                case 7:
                    System.out.println("--- Popularity Rankings ---");
                    for (Film rankedFilm : popularityRankings.rankings) {
                        System.out.println(rankedFilm.name + " | Popularity: " + rankedFilm.popularityScore);
                    }
                    break;

                case 8:
                    System.out.print("Enter genre for recommendations: ");
                    String genre1 = scanner.nextLine();
                    List<Film> recommendedFilms = recommendations.recommendByGenre(genre1, 5);

                    System.out.println("--- Recommended Films ---");
                    for (int i = 0; i < recommendedFilms.size(); i++) {
                    Film film1 = recommendedFilms.get(i);
                      System.out.println("Film " + (i + 1) + ": " + film1.name + " | Genre: " + film1.genre + " | Popularity: " + film1.popularityScore);
                    }
                    break;

                case 9:
                    System.out.print("Enter film ID for feedback: ");
                    String feedbackFilmId = scanner.nextLine();
                    System.out.println("Enter your feedback: ");
                    String feedback = scanner.nextLine();
                    viewerFeedback.addFeedback(feedbackFilmId, feedback);
                    System.out.println("Feedback added successfully!");
                    viewerFeedback.displayFeedback(feedbackFilmId);
                    break;

                case 10:
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public void searchFilmAndDisplay(String searchName) {
    // İlk olarak film araması
    Film foundFilm = searchFilm(searchName);
    if (foundFilm != null) {
        System.out.println("Film Found!");
        System.out.println("Name: " + foundFilm.name);
        System.out.println("Genre: " + foundFilm.genre);
        System.out.println("Release Year: " + foundFilm.releaseYear);
        System.out.println("Popularity Score: " + foundFilm.popularityScore);
        System.out.println("Actors (Top 3): ");
        for (int i = 0; i < Math.min(3, foundFilm.actors.size()); i++) {
            System.out.println("- " + foundFilm.actors.get(i).name);
        }
    } else {
        System.out.println("No matching film found!");
    }

    // Eğer film bulunamazsa, aktör araması yapılacak
    Actor foundActor = searchActor(searchName);
    if (foundActor != null) {
        System.out.println("Actor Found!");
        System.out.println("Name: " + foundActor.name);
        System.out.println("Films: ");
        for (Film film : foundActor.films) {
            System.out.println("- " + film.name + " (" + film.releaseYear + ")");
        }
    } else {
        System.out.println("No matching actor found!");
    }
}
     public void searchActorAndDisplay(String searchName) {
    Actor foundActor = searchActor(searchName);
    if (foundActor != null) {
        System.out.println("Actor Found!");
        System.out.println("Name: " + foundActor.name);
        System.out.println("Films: ");
        for (Film film : foundActor.films) {
            System.out.println("- " + film.name + " (" + film.releaseYear + ")");
        }
    } else {
        System.out.println("No matching actor found!");
    }
}

    public static void main(String[] args) {
        FilmManagementSystem system = new FilmManagementSystem();
         system.addSampleFilms(); 
        system.displayMenu();

        

        // Ticket price
        double ticketPrice = 120.0;

        // Simulate revenue for each film
        Random random = new Random();
        for (Film film : system.films.values()) {
            int viewers = random.nextInt(1500001) + 500000;
            system.revenueSimulator.simulateRevenue(film, viewers, ticketPrice);
            system.popularityRankings.addOrUpdateFilm(film);
            
            
        }

        
    }
    
}
