package InterviewPrograms;

import java.util.Scanner;

public class FractorialCountScanner {
	public static void main(String[] args) {
		System.out.println("Please enter a number: ");
		int total = 1;
		@SuppressWarnings("resource")
		Scanner ip = new Scanner(System.in);
		
		int f= ip.nextInt();
		for(int i=f;i>=1;i--){
			total = total*i;
			
		}
		System.out.println(total);
	}

}
