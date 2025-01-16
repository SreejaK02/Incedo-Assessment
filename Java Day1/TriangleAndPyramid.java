package src;

import java.util.Scanner;

public class TriangleAndPyramid {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		for(int i=n;i>1;i++) {
			for(int j=n;j<=n-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
}
