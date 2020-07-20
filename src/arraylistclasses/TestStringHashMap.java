package arraylistclasses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestStringHashMap {
	
	public static void main(String[] args) {
		HashMap<String, String> hmap = new HashMap<String, String>();
		hmap.put("1111", "Govardhan");
		hmap.put("2222", "Basheer");
		hmap.put("3333", "Gowtham");
		hmap.put("4444", "Bittu");
		hmap.put(null, "testingnullkey");
		hmap.put("5555", null);
		hmap.put("6666", null);
		hmap.put("7777", null);
		hmap.put("", "emptykey");
		
		System.out.println(hmap);
		
		Set set = hmap.entrySet();
		Iterator iter = set.iterator();
		
		
		System.out.println("================================HashMap===========================");
		while(iter.hasNext()){
			Map.Entry mentry = (Entry) iter.next();
			System.out.println("key is : "+ mentry.getKey()+" & Value is: "+mentry.getValue());
		}
		
		System.out.println("============================For Loop==============================");
		for(Map.Entry map:hmap.entrySet()){
			System.out.println("Key is: "+map.getKey()+" get value: "+map.getValue());
		}
		
	}	

}
