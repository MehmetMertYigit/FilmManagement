/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filmmanagement;

import java.util.ArrayList;
import java.util.List;

public class Recommendations {

    FilmManagementSystem filmSystem;

    public Recommendations(FilmManagementSystem filmSystem) {
        this.filmSystem = filmSystem;
    }

    public List<Film> recommendByGenre(String genre, int limit) {
        List<Film> recommendations = new ArrayList<>();
        for (Film film : filmSystem.films.values()) {
            if (film.genre.equalsIgnoreCase(genre)) {
                recommendations.add(film);
            }
        }
        recommendations.sort((f1, f2) -> Double.compare(f2.popularityScore, f1.popularityScore)); // Sort by popularity
        return recommendations.subList(0, Math.min(limit, recommendations.size()));
    }

    public List<Film> recommendByActor(String actorName, int limit) {
        Actor actor = filmSystem.searchActor(actorName);
        if (actor != null) {
            return actor.films.subList(0, Math.min(limit, actor.films.size()));
        }
        return new ArrayList<>();
    }

    public List<Film> recommendTopFilms(int limit) {
        return filmSystem.popularityRankings.getTopFilms(limit);
    }
}