package src;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		for(int i=n2;i<n;i++) {
			sum=n1+n2;
			System.out.print(sum+" ");
			n1=n2;
			n2=sum;
		}
		
	}

}
