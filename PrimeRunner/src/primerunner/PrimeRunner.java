/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerunner;

import static java.lang.System.*;
import java.lang.Math;
/**
 *
 * @author shayla
 */
public class PrimeRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prime test = new Prime(24);
        out.println(test);

        test.setPrime(7);
        out.println(test);

        test.setPrime(100);
        out.println(test);

        test.setPrime(133);
        out.println(test);

        test.setPrime(65536);
        out.println(test);

        test.setPrime(2);
        out.println(test);

        test.setPrime(7334);
        out.println(test);

        test.setPrime(7919);
        out.println(test);

        test.setPrime(1115125003);
        out.println(test);
    }

}
