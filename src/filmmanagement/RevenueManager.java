/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filmmanagement;


import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author Lenovo2
 */
public class RevenueManager {
     private List<Double> revenueHistory;

    public RevenueManager() {
        revenueHistory = new LinkedList<>();
    }

    public void simulateRevenue(Film film, int viewers, double ticketPrice) {
        double revenue = viewers * ticketPrice;
        film.updateRevenue(revenue);
        revenueHistory.add(revenue);
    }

    public List<Double> getRevenueHistory(int numberOfRecords) {
        int start = Math.max(0, revenueHistory.size() - numberOfRecords);
        return revenueHistory.subList(start, revenueHistory.size());
    }
}