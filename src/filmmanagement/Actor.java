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
public class Actor {
    String name;
    String uniqueID;
    LinkedList<Film> films;

    public Actor(String name, String uniqueID) {
        this.name = name;
        this.uniqueID = uniqueID;
        this.films = new LinkedList<>();
    }

    public void addFilm(Film film) {
        films.add(film);
    }
     @Override
    public String toString() {
        return "Actor ID: " + uniqueID + "\n" +
               "Name: " + name + "\n" +
               "Films: " + films;  // Aktörün oynadığı filmler listelenir
    }
}
