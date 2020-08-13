/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxword;
import static java.lang.System.*;

class BoxWord
{
   private String word;

	public BoxWord()
	{
		word="";
	}

	public BoxWord(String s)
	{
   word = s;
	}

	public void setWord(String w)
	{
   word=w;
	}

	public String toString()
	{
   
      if(word.length() == 1)
         return word + "\n";
      out.println(word);
      String numberofspaces = "";
      String spaces=" ";
      
      
      for(int s=0; s<=word.length()-3; s++)
       {
         numberofspaces = numberofspaces + spaces;  
         
       }
		String output="";
      int FIRSTWORD = 1;
      int SECONDWORD = 2;
      int length = word.length();
      for(int i=0; i<word.length()-2; i++)
         {
         out.println(word.substring(FIRSTWORD,FIRSTWORD+1)+ numberofspaces + word.substring(length-SECONDWORD,length-(SECONDWORD-1)));//-SECONDWORD,length-SECONDWORD-1));
         FIRSTWORD = FIRSTWORD+1;
         SECONDWORD = SECONDWORD+1;
         }
         
         int BACKWARD = 1;
         
     for(int i = word.length() - 1; i >= 0; --i)
         {
         out.print(word.charAt(i));
         }
         
      
     
      
      
		return "\n";
	}
}
