package InterviewPrograms;
//Print a string in the reverse order:
//Selenium : muineles
public class ReverseString {
	public static void main(String[] args) {
		String str="seleniumautomation";
		System.out.println("Total size of String: "+str.length());
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
		
	}

}
