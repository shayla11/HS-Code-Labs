/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagerunner;

/**
 *
 * @author shayla
 */
public class Average {

    private double one, two, average;

    public void setNums(double num1, double num2) {
        one = num1;
        two = num2;
    }

    public void average() {
        double summy = one + two;
        average = summy / 2;

    }

    public void print() {
        System.out.println(one + " + " + two + " has an average of " + average);
    }

}
