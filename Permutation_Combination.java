package java_programs;

import java.util.*;

public class Permutation_Combination {
	
	public static int factorial(int n) 
	{
        int fact = 1;
        for (int i = 1; i <= n; i++) 
        {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        int n, r;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n = s.nextInt();

        System.out.println("Enter the value of r : ");
        r = s.nextInt();
        s.close();
        int ncr = (factorial(n) / (factorial(n - r) * factorial(r)));

        int npr = (factorial(n) / (factorial(n - r)));

        System.out.println("nPr is : " + npr);
        System.out.println("nCr is : " + ncr);
    }
}
