/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowelcounterrunner;

/**
 *
 * @author shayla
 */
public class VowelCounterRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(VowelCounter.getNumberString("abcdef"));
        System.out.println(VowelCounter.getNumberString("hhhhhhh"));
        System.out.println(VowelCounter.getNumberString("aaaaaaa"));
        System.out.println(VowelCounter.getNumberString("catpigdatrathogbogfrogmoosegeese"));
        System.out.println(VowelCounter.getNumberString("hhhhhhh1234356HHHHDH"));
        System.out.println(VowelCounter.getNumberString("AEIOUaeiou87878alkjdaslwlejrlajflawjkflwj"));
        System.out.println(VowelCounter.getNumberString(""));
        System.out.println(VowelCounter.getNumberString("x"));
        System.out.println(VowelCounter.getNumberString("e"));
    }

}
