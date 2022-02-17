package java_programs;

import java.util.*;

public class Factorial {
	public static void main(String args[])
	{  
		  Scanner s = new Scanner(System.in);
		  int fact=1; 
		  System.out.println("Enter the number");
		  int number = s.nextInt();  
		  s.close();
		  if(number==0)
		  {
			  System.out.println("1");
		  }else {
		  for(int i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }
	}
}
