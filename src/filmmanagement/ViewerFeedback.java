/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filmmanagement;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ViewerFeedback {

    private HashMap<String, List<String>> feedbackMap;

    public ViewerFeedback() {
        this.feedbackMap = new HashMap<>();
    }

    public void addFeedback(String filmID, String feedback) {
        feedbackMap.putIfAbsent(filmID, new LinkedList<>());
        feedbackMap.get(filmID).add(feedback);
    }

    public List<String> getFeedback(String filmID) {
        return feedbackMap.getOrDefault(filmID, new LinkedList<>());
    }

    public void displayFeedback(String filmID) {
        List<String> feedbacks = getFeedback(filmID);
        if (feedbacks.isEmpty()) {
            System.out.println("No feedback available for this film.");
        } else {
            System.out.println("Feedback for Film ID: " + filmID);
            for (String feedback : feedbacks) {
                System.out.println("- " + feedback);
            }
        }
    }
}

