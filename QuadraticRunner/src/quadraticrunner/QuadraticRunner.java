/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticrunner;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

/**
 *
 * @author shayla
 */
public class QuadraticRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a ::  ");
        int quada = keyboard.nextInt();

        System.out.print("Enter b ::  ");
        int quadb = keyboard.nextInt();

        System.out.print("Enter c ::  ");
        int quadc = keyboard.nextInt();

        Quadratic test = new Quadratic(quada, quadb, quadc);
        // test.setEquation(a,b,c);
        test.calcRoots();
        test.print();
    }

}
