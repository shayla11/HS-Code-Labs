/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starrunner;

import static java.lang.System.*;

public class StarsandStripes {
   public StarsandStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
   out.println("********************");
   }

   public void printTwentyDashes()
   {
   out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
   out.println("\n");
   
   }
   
   public void printASmallBox()
   {	
   printTwentyDashes();
   printTwentyStars();
   printTwentyDashes();
   printTwentyStars();
   printTwentyDashes();
   printTwentyStars();
   printTwentyDashes();
   }
 
   public void printABigBox()
   { 
   printASmallBox();
   printASmallBox();	
   }   
}