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
public class VowelCounter {

    public static String getNumberString(String s) {
        String vowels = "aeiouAEIOU";
        int num = 0;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) >= 0) {
                str = str + num;
                num++;
                if (num == 10) {
                    num = 0;
                }
            } else {
                str += s.charAt(i);
            }
        }

        return str;
    }
}
