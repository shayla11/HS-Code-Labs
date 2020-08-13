/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxword;

/**
 *
 * @author shayla
 */
import static java.lang.System.*;   //completed

public class BoxWordRunner
{
   public static void main( String args[] )
   {
   BoxWord test = new BoxWord();
   test.setWord("SQUARE");
   out.println(test);
   
   test.setWord("BOX");
   out.println(test);
   
   test.setWord("A");
   out.println(test);
   
   test.setWord("IT");
   out.println(test);
   
   test.setWord("TOAD");
   out.println(test);
   
   test.setWord("MARIOKART");
   out.println(test);
	}
}