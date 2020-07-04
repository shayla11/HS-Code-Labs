/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcdrunner;

/**
 *
 * @author shayla
 */
public class GCD {

    private int one, two;

    public GCD() {
    }

    public GCD(int numOne, int numTwo) {
        one = numOne;
        two = numTwo;
    }

    public void setNums(int numOne, int numTwo) {
        one = numOne;
        two = numTwo;
    }

    public long getGCD() {
        long gcd = 0;
        for (int i = 1; i <= Math.min(one, two); i++) {
            if (one % i == 0 && two % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public String toString() {
        return "The GCD of " + one + " and " + two + " is " + getGCD() + "\n";
    }
}
