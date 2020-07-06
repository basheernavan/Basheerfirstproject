package pack2;

public class StringFunctions {
	public static void main(String[] args) {
		String str1 = "the rain have been started";
		//to get the size/length or total numbers of chars;
		int l=str1.length();
		System.out.println("total chars: "+l);
		
		
		//compare: equals,equalsIgnoreCase,contains	
		String str2 = "The rain have been started";
		boolean b1=str1.equals(str2);
		boolean b = str1.equalsIgnoreCase(str2);
		System.out.println(b1);
		System.out.println(b);
		
		System.out.println(str1.contains("been"));
		
		/**
		 * Java it can store the values using the index;
		 * index starts with 0,
		 * last index length-1.
		 */
		//to check the position/index of the character:indexOf
		System.out.println(str1.indexOf('d'));
		System.out.println(str1.indexOf('t'));
		
		//to check the character using the index:
		System.out.println(str1.charAt(25));
		System.out.println(str1.charAt(0));
		
		//split; substring:
		
	}

}
