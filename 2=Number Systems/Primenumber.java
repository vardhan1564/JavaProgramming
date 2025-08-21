package Number_Systems;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int count=0;
		
		System.out.println("Enter number ");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println(n+ " is prime ");
		}
		else {
			System.out.println(n+ " is not prime ");
		}
		
	}
}
