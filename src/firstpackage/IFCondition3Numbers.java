package firstpackage;
//FInd out the greatest number out of three numbers?
public class IFCondition3Numbers {
	public static void main(String[] args) {
		int a=100;
		int b=30;
		int c=200;
		//&& is the "AND" operator:
		// || is the "OR" operator
		if(a>b && a>c){//if the both conditions are true then only it'll go to if group.
			System.out.println("a is the greatest number: "+a);
		}else if(b>c){
			System.out.println("b is the greatest number: "+b);
		}else{
			System.out.println("c is the greatest number: "+c);
		}		
	}
}
