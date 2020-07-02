/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumrunner;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

public class SumRunner {
	public static void main( String[] args ) {
   
      
      Sum test = new Sum();
		test.setNums(5,5);
		test.sum();
		test.print();
      System.out.println();

		test.setNums(90,100.0);
		test.sum();
		test.print();
      System.out.println();
      
      		
		//add more test cases	
      
      test.setNums(100.5,85.8);
		test.sum();
		test.print();
      System.out.println();
      
      test.setNums(-100,55);
		test.sum();
		test.print();
      System.out.println();	
      
      test.setNums(15236,5642);
		test.sum();
		test.print();
      System.out.println();
      
      test.setNums(1000,555);
		test.sum();
		test.print();
      System.out.println();
	}
}