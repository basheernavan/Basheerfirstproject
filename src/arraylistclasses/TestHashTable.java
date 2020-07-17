package arraylistclasses;

import java.util.Enumeration;
import java.util.Hashtable;

public class TestHashTable {
	
	public static void main(String[] args) {
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		
		Enumeration<String> names;
		String key;
		
		hashtable.put("1111", "Ravi");
		hashtable.put("2222", "Basheer");
		hashtable.put("3333", "Govardhan");
		hashtable.put("4444", "Gowtham");
		hashtable.put("5555", "Abhijith");
		
		System.out.println(hashtable.get("2222"));
		
		names= hashtable.keys();
		
		while(names.hasMoreElements()){
			key = names.nextElement();
			System.out.println("Key: "+ key+ "& value: "+hashtable.get(key));
		}
		
	}

}
