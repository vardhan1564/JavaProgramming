package Number_Systems;

import java.util.Scanner;

public class FactorsofNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Enter number");
		n=sc.nextInt();
		
		
		
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
				System.out.print(i+ " ");
			}
		}
		
	}
}
