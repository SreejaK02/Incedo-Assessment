package Day1Java;

import java.util.Scanner;

public class TriangleAndPyramid {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=0; j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		obj.close();	
	}

}
