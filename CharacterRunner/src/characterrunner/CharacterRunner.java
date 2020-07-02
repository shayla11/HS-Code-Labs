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
public class CharacterRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		out.println(test);    }
    
}
