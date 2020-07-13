package practice;

import java.util.Scanner;

public class countscannerFactorial {
	public static void main(String[] args) {
		System.out.print("Please enter a number:");
		int total=1;
		Scanner ip = new Scanner(System.in);
		int f=ip.nextInt();
		for (int i = f; i>=1; i--) {
		total = total*i;
	
			
	}
	System.out.println(total);
	
}
}

