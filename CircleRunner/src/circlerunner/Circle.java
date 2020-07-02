/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlerunner;

/**
 *
 * @author shayla
 */
public class Circle {

    private double radius;
    private double area;

    public void setRadius(double rad) {
        radius = rad;
    }

    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    public void print() {
        System.out.println("The area is :: " + (String.format("%.4f", area)));
    }

}
