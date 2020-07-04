/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterrunner;

import java.util.Scanner;
import static java.lang.System.*; 
/**
 *
 * @author shayla
 */
public class MonsterRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //ask for name and size
        out.print("Enter 1st monster's name : ");
        String name = keyboard.next();
        out.print("Enter 1st monster's size : ");
        int size = keyboard.nextInt();
        //instantiate monster one
        Monster bob = new Monster(name, size);
        //ask for name and size
        out.print("Enter 2nd monster's name : ");
        name = keyboard.next();
        out.print("Enter 2nd monster's size : ");
        size = keyboard.nextInt();
        //instantiate monster two
        Monster chicken = new Monster(name, size);

        out.println("\nMonster 1 - " + bob);
        out.println("Monster 2 - " + chicken + "\n");

        if (bob.isBigger(chicken)) {
            out.println("Monster one is bigger than monster two.");
        } else if (bob.isSmaller(chicken)) {
            out.println("Monster one is smaller than monster two.");
        } else {
            out.println("Monster one is the same size as monster two.");
        }

        if (bob.namesTheSame(chicken)) {
            out.println("Monster one does have the name name as Monster two");
        } else {
            out.println("Monster one does not have the name name as Monster two");
        }
    }

}
