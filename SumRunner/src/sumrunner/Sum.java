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

public class Sum
{
    private double one, two, sum;

    public void setNums(double num1, double num2) {
        one = num1;
        two = num2;
    }

    public void sum( ) {
        sum = one+two;
    }

    public void print( ) {
        System.out.println(String.format("%.1f",one)+ " + " + (String.format("%.1f",two)+ " == " + (String.format("%.2f",sum))));
   }
}
