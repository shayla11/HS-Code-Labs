/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerunner;

/**
 *
 * @author shayla
 */
public class Prime {

    private int number;

    public Prime() {

    }

    public Prime(int num) {
        number = num;
    }

    public void setPrime(int num) {
        number = num;

    }

    public boolean isPrime() {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if ((number % i == 0)) {
                return true;
            }
        }

        return false;
    }

    public String toString() {

        if (!isPrime()) {
            return (number + " is prime.\n");
        } else {
            return (number + " is not prime.\n");
        }

        //return output;
    }
}
