package java_programs;

import java.util.*;

public class Inverse_matrix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n ,m;
		System.out.println("Enter the size of row and column of matrix");
		n = s.nextInt();
		m = s.nextInt();
		int[][] mat = new int[n][m];
		System.out.println("Original matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				mat[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(mat[j][i]+" ");
			}
			System.out.println();
		}
	}
}
