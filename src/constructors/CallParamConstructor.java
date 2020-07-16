package constructors;

public class CallParamConstructor {
	
	public static void main(String[] args) {
		ParamConstructor cust1 = new ParamConstructor(12345, "Govardhan");
		cust1.loandetails();
		cust1.insuranceDetails();
		
		ParamConstructor cust2 = new ParamConstructor(6789, "Basheer");
		cust2.insuranceDetails();
		
		ParamConstructor cust3 = new ParamConstructor(5678, "Ramesh");
		cust3.loandetails();
		
	}

}
