package Miscellaneous_Examples;

import java.util.Scanner;

public class Largestof3nos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Enter a ");
		a=sc.nextInt();
		
		System.out.println("Enter b ");
		b=sc.nextInt();
		
		System.out.println("Enter c ");
		c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("A is Greater ");
		}
		else if(b>a && b>c) {
			System.out.println("B is Greater ");
		}
		else {
			System.out.println("c is Greater ");
		}
	}
}
