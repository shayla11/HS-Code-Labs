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
public class CircleRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Circle test = new Circle();
      test.setRadius(7.5);
      test.calculateArea();
      test.print();
      System.out.println();
      
      test.setRadius(10);
      test.calculateArea();
      test.print();
      System.out.println();
      
      test.setRadius(72.534);
      test.calculateArea();
      test.print();
      System.out.println();
      
      test.setRadius(55);
      test.calculateArea();
      test.print();
      System.out.println();
      
      test.setRadius(101);
      test.calculateArea();
      test.print();
      System.out.println();
      
      test.setRadius(99.952);
      test.calculateArea();
      test.print();
      System.out.println();    }
    
}
