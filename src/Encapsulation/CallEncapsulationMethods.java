package Encapsulation;

public class CallEncapsulationMethods {
	public static void main(String[] args) {
		TestEncapsulation cust = new TestEncapsulation();
		//passing customer details: here using setter methods
		cust.setAccountNo(12345);
		cust.setCustName("Govardhan");
		cust.setCustAge(35);
		
		//getting customer details: here using getter methods
		System.out.println("Customer Account Number is: "+cust.getAccountNo());
		System.out.println("Customer Name is: "+cust.getCustName());
		System.out.println("Customer Age is: "+cust.getCustAge());
		
		
		
	}

}
