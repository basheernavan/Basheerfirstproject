package pack4;
//Split a string into words and print one by one word?
/**
 * the rain have been started
 * the
 * rain
 * have
 * been
 *started
 */
public class SplitFunction {
	public static void main(String[] args) {
		String str="the rain have been started";
		//cut/split the string
		String[] s = str.split(" ");//after splitting the string we are 
									//getting multiple string, then storing in an array
		System.out.println(s);
		for(int i=0;i<=s.length-1;i++){//using the for loop we are printing one by one by one
			System.out.println(s[i]);
		}
	}

}
