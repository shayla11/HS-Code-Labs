/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hextobinaryrunner;

import static java.lang.System.*;
import java.util.Scanner;

/**
 *
 * @author shayla
 */
public class HexToBinaryRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HexToBinary test = new HexToBinary();
        Scanner stupid = new Scanner(System.in);

        System.out.print("Enter a letter :: ");
        char hexy = stupid.next().charAt(0);
        test.setHex(hexy);
        //hexy = hexy.toUpperCase();
        //test.getBinary();
        //test.toString();
        System.out.println(test);
    }

}
