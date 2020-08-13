/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangletworunner;

/**
 *
 * @author shayla
 */
import static java.lang.System.*;

public class TriangleTwo
{
   private int size;
   private String letter;

	public TriangleTwo()
	{
   size = 0;
	}

	public TriangleTwo( String let, int sz)
	{
   letter = let;
   size = sz-1;
	}

	public void setTriangle(int count, String let)
	{
   /*int j = size;
   int i =size;
   while(j>=0)
     {
      while(i>=0)
      {
      out.println();
      i = i-1;
      }
      out.println("\n");
      j = j-1;
     }*/
	}

	public String getLetter()
	{
		return "#";
	}

	public String toString()
	{
   out.println();
   int i =0;
   int j =0;
   int changer = 0;
      for (i=0; i<=size; i++)
         {
            for (j=changer; j<=size; j++)
            {
            out.print(letter);
            }
            changer = changer + 1;
            out.println();
         }
      
      
      
      return "";
      
     }


		//return size + letter;
	}