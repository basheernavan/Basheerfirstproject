
package Encapsulation;

public class NewEncapsulation {
	//To implement getter and setter methods shortcut: 
		//Right click and select source --> Generate Getter and Setter methods
	private int empid;	
	private String empName;
	private int empSal;
	//Implement the Setter methods for Employee
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
	//Implement the Getter methods for Employee
	public int getEmpid() {
		return empid;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpSal() {
		return empSal;
	}	
	

}
