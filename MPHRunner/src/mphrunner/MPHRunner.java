/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mphrunner;

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;
/**
 *
 * @author shayla
 */
public class MPHRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(in);

        out.print("Enter the distance :: ");
        int dist = keyboard.nextInt();

        out.print("Enter the hours :: ");
        int hrs = keyboard.nextInt();

        out.print("Enter the minutes :: ");
        int mins = keyboard.nextInt();

        MilesPerHour test = new MilesPerHour(dist, hrs, mins);
        test.calcMPH();
        test.print();
    }

}
