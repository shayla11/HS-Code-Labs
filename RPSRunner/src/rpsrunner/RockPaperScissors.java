/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsrunner;

/**
 *
 * @author shayla
 */
public class RockPaperScissors {

    private String playChoice;
    private String compChoice;

    public RockPaperScissors() {
        playChoice = "";
        compChoice = "";
    }

    public RockPaperScissors(String player) {
        player = "";
    }

    public void setPlayers(String player) {
        playChoice = player;
    }

    public String determineWinner() {
        int c = (int) (Math.random() * 3 + 1);
        if (c == 1) {
            compChoice = "R";
        }
        if (c == 2) {
            compChoice = "P";
        }
        if (c == 3) {
            compChoice = "S";
        }

        String winner = "";

        if (compChoice.equals(playChoice)) {
            winner = "\nPlayer had " + playChoice + "\nComputer had " + compChoice + "\n!Draw Game!\n";
        }
        if (compChoice.equals("R") && playChoice.equals("P")) {
            winner = "\nPlayer had " + playChoice + "\nComputer had " + compChoice + "\n!Player wins <<Paper Covers Rock>>!\n";
        }
        if (compChoice.equals("R") && playChoice.equals("S")) {
            winner = "\nPlayer had " + playChoice + "\nComputer had " + compChoice + "\n!Computer wins <<Rock Break Scissors>>!\n";
        }
        if (compChoice.equals("P") && playChoice.equals("R")) {
            winner = "\nPlayer had " + playChoice + "\nComputer had " + compChoice + "\n!Computer wins <<Paper Covers Rock>>!\n";
        }
        if (compChoice.equals("P") && playChoice.equals("S")) {
            winner = "\nPlayer had " + playChoice + "\nComputer had " + compChoice + "\n!Player wins <<Scissors Cut Paper>>!\n";
        }
        if (compChoice.equals("S") && playChoice.equals("R")) {
            winner = "\nPlayer had " + playChoice + "\nComputer had " + compChoice + "\n!Player wins <<Rock Breaks Scissors>>!\n";
        }
        if (compChoice.equals("S") && playChoice.equals("P")) {
            winner = "\nPlayer had " + playChoice + "\nComputer had " + compChoice + "\n!Computer wins <<Scissors Cut Paper>>!\n";
        }

        return winner;

    }

    public String toString() {
        String output = determineWinner();
        return output;
    }
}
