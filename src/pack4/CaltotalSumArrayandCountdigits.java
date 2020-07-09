package pack4;

public class CaltotalSumArrayandCountdigits {
	public static void main(String[] args) {
		int a[]=new int[]{23,10,8,9,34,50};
		System.out.println(a.length);
		
		int sum=0;
		for(int i=0;i<=a.length-1;i++){
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		
	}


}
