/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitmathrunner;

/**
 *
 * @author shayla
 */
public class DigitMathRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DigitMath test = new DigitMath();
        test.setNums(234);
        test.output();

        test.setNums(10000);
        test.output();

        test.setNums(111);
        test.output();

        test.setNums(9005);
        test.output();

        test.setNums(84645);
        test.output();
    }

}
