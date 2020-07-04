/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcdrunner;
import static java.lang.System.*;           

/**
 *
 * @author shayla
 */
public class GCDRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GCD test = new GCD();
        test.setNums(5, 25);
        out.println(test);

        test.setNums(4, 400);
        out.println(test);

        test.setNums(8, 80);
        out.println(test);
        test.setNums(15, 45);
        out.println(test);
        test.setNums(6, 66);
        out.println(test);
        test.setNums(9, 9);
        out.println(test);
        test.setNums(3, 543);
        out.println(test);
    }

}
