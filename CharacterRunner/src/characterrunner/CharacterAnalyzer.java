/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterrunner;

import static java.lang.System.*;
import java.util.Scanner;
/**
 *
 * @author shayla
 */
public class CharacterAnalyzer {

    private char theChar;

    public CharacterAnalyzer() {
        theChar = 0;
    }

    public CharacterAnalyzer(char c) {
        theChar = c;
    }

    public void setChar(char c) {

    }

    public char getChar() {
        int ascii = (int) theChar;

        return theChar;
    }

    public boolean isUpper() {

        //int ascii = (int)theChar;
        //out.println(ascii);
        int yess = (int) theChar;
        if (yess >= 65 && yess <= 90) {
            out.println("h");
            return true;
        }
        return false;
    }

    public boolean isLower() {
        int yess = (int) theChar;
        if (yess >= 97 && yess <= 122) {
            return true;
        }
        return false;
    }

    public boolean isNumber() {
        int yess = (int) theChar;
        if (yess >= 48 && yess <= 57) {
            out.println("h");
            return true;
        } else {
            return false;
        }
    }

    public int getASCII() {
        int ascii = (int) theChar;
        return ascii;
    }

    public String toString() {
        int ascii = (int) theChar;

        int yess = (int) theChar;
        if (yess >= 48 && yess <= 57) {
            return getChar() + " is a number." + " ASCII == " + getASCII() + "\n";
        }
        if (yess >= 97 && yess <= 122) {
            return getChar() + " is a lowercase letter. " + "ASCII == " + getASCII() + "\n";
        }
        if (yess >= 65 && yess <= 90) {
            return getChar() + " is a uppercase letter. " + "ASCII == " + getASCII() + "\n";
        }

        return "Sorry, please enter a single letter of the alphabet or a number between 0 - 9";

    }
}
