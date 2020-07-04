/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterrunner;

/**
 *
 * @author shayla
 */
public class Monster {

    private String name;
    private int howBig;

    public Monster() {
        name = "";
        howBig = 0;
    }

    public Monster(String n, int size) {
        name = n;
        howBig = size;
    }

    public String getName() {
        return name;
    }

    public int getHowBig() {
        return howBig;
    }

    public boolean isBigger(Monster other) {
        return this.howBig > other.howBig;
    }

    public boolean isSmaller(Monster other) {

        return this.howBig < other.howBig;
    }

    public boolean namesTheSame(Monster other) {
        return this.name.equals(other.name);
    }

    public String toString() {
        return name + " " + howBig;
    }
}
