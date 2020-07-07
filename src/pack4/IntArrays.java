package pack4;
/**
 * Array: it can store same data type multiple values;
 * 1. It can store the values using the index.
 * 2. Index starts with 0 
 * 3. Index ends with length-1.
 *
 */
public class IntArrays {
	public static void main(String[] args) {
		int a[] = new int[5];//declaration of an array or size declaration of array.
		
		//values declaration:
		a[0] =12;
		a[1] =23;
		a[2] =33;
		a[3] =56;
		a[4] =76;
		
		System.out.println(a[2]);
		System.out.println(a[4]);
		System.out.println(a[1]+a[3]);
		
	}
	

}
