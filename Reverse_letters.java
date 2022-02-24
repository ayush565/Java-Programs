package java_programs;

import java.util.Scanner;

public class Reverse_letters {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(str);
		s.close();
		int n = str.length();
		char ch[] = str.toCharArray();
		for(int i=0;i<n;i++)
		{
			System.out.print(ch[i]);
		}
		for(int i=0,j=n-1; i<=j; i++,j--)
		{ 
		     char temp = ch[i];
		     ch[i] = ch[j];
		     ch[j] = temp;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(ch[i]);
		}
	}
}
