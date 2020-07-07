package pack4;

public class TwoDimArrays {
	public static void main(String[] args) {
		//declare 3*3 array:
		int[][] a=new int[3][3];//size declaration:
		
		//row1 values declaration:
		a[0][0]=23;
		a[0][1]=33;
		a[0][2]=44;
		
		//row2 values declaration:
		a[1][0]=55;
		a[1][1]=66;
		a[1][2]=77;
		
		//row3 values declaration:
		a[2][0]=88;
		a[2][1]=99;
		a[2][2]=11;
		
		//use the values like below:
		System.out.println(a[1][0]);
		System.out.println(a[1][1]+a[2][0]);
		
	}

}
