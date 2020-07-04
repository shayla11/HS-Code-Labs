/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hextobinaryrunner;

/**
 *
 * @author shayla
 */
public class HexToBinary {

    private char hex;

    public HexToBinary() {

        hex = 0;

    }

    public HexToBinary(char hexNum) {
        hex = hexNum;
    }

    public void setHex(char hexNum) {

        hex = hexNum;
    }

    public String getBinary() {

        switch (hex) {
            case 'A':
                return "1010";
            case 'B':
                return "1011";
            case 'C':
                return "1100";
            case 'D':
                return "1101";
            case 'E':
                return "1110";
            case 'F':
                return "1111";
            default:
                return "ERROR";
        }
    }

    public String toString() {

        return hex + " is " + getBinary() + " in binary!";
    }
}
