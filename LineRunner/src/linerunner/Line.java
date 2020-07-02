/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linerunner;

/**
 *
 * @author shayla
 */
public class Line {

    private int xOne, yOne, xTwo, yTwo;
    private double slope;

    public void Line(int x1, int y1, int x2, int y2) {

        xOne = x1;
        xTwo = x2;
        yOne = y1;
        yTwo = y2;

    }

    public void setCoordinates(int x1, int y1, int x2, int y2) {
        xOne = x1;
        xTwo = x2;
        yOne = y1;
        yTwo = y2;

    }

    public void calculateSlope() {

        double numerator = yTwo - yOne;
        double denominator = xTwo - xOne;

        slope = numerator / denominator;

    }

    public void print() {

        System.out.println("The slope of these coordinates is " + (String.format("%.2f", slope)));

    }

}
