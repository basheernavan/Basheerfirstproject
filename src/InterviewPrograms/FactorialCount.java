package InterviewPrograms;
//Print/calculate 5! total value?
//5! = 5*4*3*2*1 = 120
/**
total = 1*5
total = 5*4
total = 20*3
total = 60*2
total = 120*1
total = 120
 *
 *
 *1. Calculate array total or sum;
 int[] sum = new int{23,10,8,9,34,50}
 */
public class FactorialCount {
	public static void main(String[] args) {
		int f=7;
		int total=1;
		for(int i=f;i>=1;i--){
			total =total*i;				
		}
		System.out.println(total);	
		
	}

}
