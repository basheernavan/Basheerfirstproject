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
		
		Set set = hmap.entrySet();
		Iterator iter = set.iterator();
		
		
		
		while(iter.hasNext()){
			Map.Entry mentry = (Entry) iter.next();
			System.out.println("key is : "+ mentry.getKey()+" & Value is: "+mentry.getValue());
		}
		
		
		
		
		
	}
	

}
