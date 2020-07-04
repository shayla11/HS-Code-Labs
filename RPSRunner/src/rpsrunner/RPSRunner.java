/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsrunner;
import java.util.Scanner;
import static java.lang.System.*; 
/**
 *
 * @author shayla
 */
public class RPSRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char response;

        //add in a do while loop after you get the basics up and running
        String answer = "Y";

        while (answer.equals("Y")) {

            out.print("Rock-Paper-Scissors - pick your weapon[R,P,S](type a capital letter) :: ");
            String pC = keyboard.next();
            //read in the player value

            RockPaperScissors game = new RockPaperScissors();
            game.setPlayers(pC);
            out.println(game);
            out.print("Do you want to play again? (type 'Y' or 'N') :: ");
            answer = keyboard.next();
            String yes = "Y";

            // while(answer.equals("yes"))
            //  {
            //   out.print("Rock-Paper-Scissors - pick your weapon[R,P,S] :: ");
            //   String pC2 = keyboard.next();
            //   out.println(game);
            //  }
        }
    }

}
