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
public class AverageRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Average test = new Average();
      test.setNums(5,5);
      test.average();
      test.print();
      System.out.println();
      
      test.setNums(90,100.0);
      test.average();
      test.print();
      System.out.println();
      
      test.setNums(100,85.8);
      test.average();
      test.print();
      System.out.println();
      
      test.setNums(-100,55);
      test.average();
      test.print();
      System.out.println();
      
      test.setNums(15236,5642);
      test.average();
      test.print();
      System.out.println();
      
      test.setNums(55,16);
      test.average();
      test.print();
      System.out.println();    }
    
}
