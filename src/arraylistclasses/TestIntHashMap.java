package arraylistclasses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestIntHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer,String >();
		hmap.put(11, "aaaa");
		hmap.put(22, "bbbb");
		hmap.put(33, "cccc");
		hmap.put(44, "dddd");
		hmap.put(55, "eeee");
		hmap.put(66, "ffff");
		
		Set set = hmap.entrySet();
		Iterator iter = set.iterator();
		
		while(iter.hasNext()){
			Map.Entry map = (Entry) iter.next();
			System.out.println("Key is: "+map.getKey()+ "==  Value is: "+map.getValue());
		}
		
		
	}
}
