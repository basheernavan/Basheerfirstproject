package InterviewPrograms;

import java.util.Scanner;

public class ReverseStringScanner {
	public static void main(String[] args) {
		System.out.println("enter a string/word: ");
		Scanner ip = new Scanner(System.in);
		String str = ip.next();
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}

}
