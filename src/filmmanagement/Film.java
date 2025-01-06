/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filmmanagement;

import java.util.LinkedList;

/**
 *
 * @author Lenovo2
 */
public class Film {
    String name;
    String uniqueID;
    LinkedList<Actor> actors;  // Filmin oyuncularını tutacak liste
    String genre;
    int releaseYear;
    double popularityScore;
    double totalRevenue;

    // Constructor
    public Film(String name, String uniqueID, String genre, int releaseYear,double popularityScore) {
        this.name = name;
        this.uniqueID = uniqueID;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.actors = new LinkedList<>();
        this.popularityScore = popularityScore;
        this.totalRevenue = 0.0;
    }

    // Actor ekleme metodu
    public void addActor(Actor actor) {
        actors.add(actor);  // Filme yeni bir aktör eklenir
    }

    // Film gelirini güncelleme metodu
    public void updateRevenue(double amount) {
        totalRevenue += amount;
    }
    public void updateFilm(String newName, String newGenre, int newReleaseYear, double newPopularityScore) {
    if (newName != null && !newName.isEmpty()) {
        this.name = newName; // Yeni isim varsa, eski ismi değiştir
    }
    if (newGenre != null && !newGenre.isEmpty()) {
        this.genre = newGenre; // Yeni tür varsa, eski türü değiştir
    }
    if (newReleaseYear > 0) {
        this.releaseYear = newReleaseYear; // Yeni yılı varsa, eski yılı değiştir
    }
    if (newPopularityScore >= 0) {
        this.popularityScore = newPopularityScore; // Yeni popülerlik puanı varsa, eski puanı değiştir
    }
}

    @Override
    public String toString() {
        return "Film ID: " + uniqueID + " | Name: " + name + " | Genre: " + genre +
               " | Year: " + releaseYear + " | Popularity: " + popularityScore;
    }
}
