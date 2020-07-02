/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberverifyrunner;

/**
 *
 * @author shayla
 */
public class NumberVerify {

    public static boolean isOdd(int num) {
        if (num % 2 == 1) {
            return true;
        }
        return false;

    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;

    }
}
