package Encapsulation;

public class TestEncapsulation {

	private int accountno;
	private String custName;
	private int custAge;
	
	//Implementing the Setter methods:
	public void setAccountNo(int acNo){
		this.accountno=acNo;
	}
	
	public void setCustName(String cName){
		this.custName=cName;
	}
	
	public void setCustAge(int cAge){
		this.custAge=cAge;
	}
	
	//implementing the getter methods 
	public int getAccountNo(){
		return accountno;		
	}
	
	public String getCustName(){
		return custName;		
	}
	
	public int getCustAge(){
		return custAge;		
	}
	
	
	
	
	

}
