package Miscellaneous_Examples;

import java.util.Scanner;

public class Swap2nos {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter a ");
		a=sc.nextInt();
		
		System.out.println("Enter b ");
		b=sc.nextInt();
		
		System.out.println("Before Swap");
		System.out.println("a" +a);
		System.out.println("b="+b);
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swap");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
	}

}
