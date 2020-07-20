package arraylistclasses;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

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
		hashtable.put(null, "firstnullkey");
		
		System.out.println(hashtable.get("2222"));
		
		System.out.println("Direct Hashtable: "+hashtable);
		
		names= hashtable.keys();
		System.out.println("========================While loop==========================");
		while(names.hasMoreElements()){
			key = names.nextElement();
			System.out.println("Key: "+ key+ "& value: "+hashtable.get(key));
		}
		System.out.println("==========================For Loop =====================");
		for(Map.Entry m:hashtable.entrySet()){
			System.out.println(m.getKey()+" == "+m.getValue());
		}
		
	}

}
