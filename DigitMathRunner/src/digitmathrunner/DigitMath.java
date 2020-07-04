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
public class DigitMath {

    private int number;
    private int count;
    private int s;
    private int sum;
    private int input;
    private double average;

    public DigitMath() {
        number = 0;
        sum = 0;
        count = 0;
        input = 0;
    }

    public DigitMath(int s) {
        number = s;
        input = s;
    }

    public void setNums(int s) {
        number = s;
        input = s;
    }

    public int sumDigits() {
        int sum = 0;
        while (input > 0) {
            sum += input % 10;
            input /= 10;
        }
        return sum;
    }

    public int countDigits() {
        count = (int) (Math.log10(number) + 1);
        return count;
    }

    public double averageDigits() {
        double average = sum / count;
        return average;
    }

    public int output() {
        System.out.println("" + String.format("%01d", number) + " has " + countDigits() + " digits.\n");
        return number;
    }
}
