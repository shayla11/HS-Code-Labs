/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticrunner;

/**
 *
 * @author shayla
 */
public class Quadratic {

    private int a, b, c;
    private double rootOne;
    private double rootTwo;

    public Quadratic() {
        a = 0;
        b = 0;
        c = 0;

    }

    public Quadratic(int quada, int quadb, int quadc) {
        a = quada;
        b = quadb;
        c = quadc;

    }

    public void setEquation(int quada, int quadb, int quadc) {

        a = quada;
        b = quadb;
        c = quadc;

    }

    public void calcRoots() {
        double inside = (b * b) - (4 * a * c);

        rootOne = (-b + Math.sqrt(inside)) / (2 * a);
        rootTwo = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);

    }

    public void print() {
        System.out.println("rootone :: " + (String.format("%.2f", rootOne)) + "\nroottwo :: " + (String.format("%.2f", rootTwo)));

    }

}
