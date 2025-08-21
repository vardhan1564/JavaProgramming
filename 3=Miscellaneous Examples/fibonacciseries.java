package Miscellaneous_Examples;

import java.util.Scanner;

public class fibonacciseries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=0,b=1,c;
		int n;
		
		System.out.println("Enter number ");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print(a);
			c=a+b;
			a=b;
			b=c;
			
		}
		
		
		System.out.println(b);
		
	}

}
