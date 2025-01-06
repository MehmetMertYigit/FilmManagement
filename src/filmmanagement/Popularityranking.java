/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filmmanagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author Lenovo2
 */
public class Popularityranking {
     PriorityQueue<Film> rankings;

    public Popularityranking() {
        rankings = new PriorityQueue<>((f1, f2) -> {
            if (f2.totalRevenue == f1.totalRevenue) {
                return f2.releaseYear - f1.releaseYear;
            }
            return Double.compare(f2.totalRevenue, f1.totalRevenue);
        });
    }

    public void addOrUpdateFilm(Film film) {
        rankings.remove(film);
        rankings.add(film);
    }

    public List<Film> getTopFilms(int n) {
        List<Film> topFilms = new ArrayList<>();
        Iterator<Film> iterator = rankings.iterator();
        while (iterator.hasNext() && n-- > 0) {
            topFilms.add(iterator.next());
        }
        return topFilms;
    }
    
}
