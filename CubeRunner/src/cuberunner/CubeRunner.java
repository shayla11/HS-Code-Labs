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
public class CubeRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cube test = new Cube();
        test.setSide(112);
        test.calculateSurfaceArea();
        test.print();
        System.out.println();

        test.setSide(4);
        test.calculateSurfaceArea();
        test.print();
        System.out.println();

        test.setSide(33);
        test.calculateSurfaceArea();
        test.print();
        System.out.println();

        test.setSide(50);
        test.calculateSurfaceArea();
        test.print();
        System.out.println();

        test.setSide(5);
        test.calculateSurfaceArea();
        test.print();
        System.out.println();

        test.setSide(19);
        test.calculateSurfaceArea();
        test.print();
        System.out.println();
    }

}
