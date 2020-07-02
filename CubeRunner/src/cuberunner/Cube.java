/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuberunner;

/**
 *
 * @author shayla
 */
public class Cube {

    private int side;
    private int surfaceArea;

    public void setSide(int s) {
        side = s;
    }

    public void calculateSurfaceArea() {
        int step1 = side * side;
        surfaceArea = 6 * step1;
    }

    public void print() {
        System.out.println("The surface area is :: " + surfaceArea);
    }

}
