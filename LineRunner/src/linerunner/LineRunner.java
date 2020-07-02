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
public class LineRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Line test = new Line();
      
      test.setCoordinates(1,9,14,2);
      test.calculateSlope();
      test.print();
      //System.out.println();
      
      test.setCoordinates(1,7,18,3);
      test.calculateSlope();
      test.print();
      //System.out.println();
      
      test.setCoordinates(6,4,2,2);
      test.calculateSlope();
      test.print();
      //System.out.println();
      
      test.setCoordinates(4,4,5,3);
      test.calculateSlope();
      test.print();
      //System.out.println();
      
      test.setCoordinates(3,5,6,-3);
      test.calculateSlope();
      test.print();
      //System.out.println();    }
    
}}
