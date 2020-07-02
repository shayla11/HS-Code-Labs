/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberverifyrunner;

import static java.lang.System.*;
import java.util.Scanner;

/**
 *
 * @author shayla
 */
public class NumberVerifyRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //add in input
        System.out.print(" Enter a whole number :: ");
        int num = keyboard.nextInt();
        System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
        System.out.println(num + " is even :: " + NumberVerify.isEven(num));
    }

}
