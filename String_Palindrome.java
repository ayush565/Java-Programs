package java_programs;

import java.util.*;

public class String_Palindrome {
	public static void main(String args[])
	   {
	      Scanner s = new Scanner(System.in);
	      System.out.println("Enter a string:");
	      String str, rev = "";
	      str = s.nextLine();
	      s.close();
	      int len = str.length();
	 
	      for ( int i = len - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	 
	   }
}
