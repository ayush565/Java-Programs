package java_programs;

import java.util.*;

public class Diamond {
	public static void main(String[] args)
    {
        //final int n = 5;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=s.nextInt();
		s.close();
        for (int i = 1; i <= n; i++)
        {
           
            for (int j = i; j < n; j++) {
                System.out.print(' ');
            }
 
            
            for (int k = 1; k < 2*i; k++) {
                System.out.print('*');
            }
            System.out.print(System.lineSeparator());
        }
 
        for (int i = n - 1; i >= 1; i--)
        {
           
            for (int j = n; j > i; j--) {
                System.out.print(' ');
            }
 
           
            for (int k = 1; k < (i * 2); k++) {
                System.out.print('*');
            }
            System.out.print(System.lineSeparator());
        }
    }
}
