package java_programs;

import java.util.Scanner;

public class Mirror_arrray {
	static boolean Mirror(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[arr[i]] != i)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = s.nextInt();
		System.out.println("Enter elements of array");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = s.nextInt();
		}
		s.close();
		boolean m = Mirror(arr);
		if(m)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
