package arraylistclasses;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleArrayList {
	public static void main(String[] args) {
		ArrayList<String> alist= new ArrayList<String>();
		alist.add("ravi");
		alist.add("Ramesh");
		alist.add("Raju");
		alist.add("Abhijith");
		alist.add("Gowtham");
		
		System.out.println(alist);
		
		alist.remove("Raju");
		
		System.out.println(alist);
		alist.remove(0);
		System.out.println(alist);
		
		alist.add("Basheer");
		System.out.println(alist);
		
		System.out.println("Index of Gowtham: "+alist.indexOf("Gowtham"));
		alist.remove(3);
		System.out.println(alist);
		
		
	}

}
