package java_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove_element_arraylist {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		int n = s.nextInt();
		System.out.println("enter elements in arrayList");
		for(int i=0;i<n;i++)
		{
			int temp = s.nextInt();
			al.add(i,temp);
		}
		System.out.println("the list is:");
		System.out.println(al);
		System.out.println("enter element to be deleted");
		int t = s.nextInt();
		al.remove(t);
		System.out.println("After deleting list:");
		System.out.println(al);
	}
}
