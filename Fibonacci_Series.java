package java_programs;

import java.util.*;

public class Fibonacci_Series {
	public static void main(String[] args) 
	{
		  int length;
		  Scanner sc = new Scanner(System.in); 

		  System.out.print("Please enter length: ");
		  length = sc.nextInt();
		  sc.close();
		  int[] num = new int[length];
		  
		  num[0] = 0;		
		  num[1] = 1;
		  
		  for (int i = 2; i < length; i++) {
		   num[i] = num[i - 1] + num[i - 2];
		  }

		  System.out.println("Fibonacci Series: ");
		  for (int i = 0; i < length; i++) 
		  {
			  System.out.print(num[i] + " ");
		  }
	}
}
