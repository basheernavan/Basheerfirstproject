package constructors;
//creating parameter constructor:
public class ParamConstructor {
	int custId;
	String custName;
	public ParamConstructor(int id, String name){
		this.custId=id;
		this.custName=name;		
	}
	
	public void loandetails(){
		System.out.println("Loan process details with cust id:  "+custId);
		System.out.println("Customer Name: "+custName);
		System.out.println("As per your account details you are eligible for loan");
	}
	
	public void insuranceDetails(){
		System.out.println("insurance Details: ");
		System.out.println("Customer id: "+custId);
		System.out.println("Customer Name: "+custName);
		System.out.println("As per your account maintainance you are eligible for Insurance");
	}
	

}
