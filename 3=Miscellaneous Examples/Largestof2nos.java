package Miscellaneous_Examples;

import java.util.Scanner;

public class Largestof2nos {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter a ");
		a=sc.nextInt();
		
		System.out.println("Enter b ");
		b=sc.nextInt();
		
		if(a>b) {
			System.out.println("A is Greater ");
		}
		else {
			System.out.println("B is Greater ");
		}
	}

}
