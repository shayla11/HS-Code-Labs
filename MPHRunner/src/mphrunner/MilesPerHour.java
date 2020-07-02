/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mphrunner;

/**
 *
 * @author shayla
 */
public class MilesPerHour {

    private int distance, hours, minutes;
    private double mph;

    public MilesPerHour() {
        setNums(0, 0, 0);
        mph = 0.0;
    }

    public MilesPerHour(int dist, int hrs, int mins) {
        distance = dist;
        hours = hrs;
        minutes = mins;

    }

    public void setNums(int dist, int hrs, int mins) {
        distance = dist;
        hours = hrs;
        minutes = mins;

    }

    public void calcMPH() {
        double time = hours + (minutes / 60);

        mph = distance / time;

    }

    public void print() {

        System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + (String.format("%.0f", mph)) + " MPH.");

    }
}
