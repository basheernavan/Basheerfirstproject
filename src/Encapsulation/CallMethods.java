package Encapsulation;

public class CallMethods {
	public static void main(String[] args) {
		NewEncapsulation emp = new NewEncapsulation();
		
		//Call the Setter methods for Employee
		emp.setEmpid(123);
		emp.setEmpName("Basheer");
		emp.setEmpSal(100000);
		
		//call the Getter methods for Employee:
		System.out.println("Get the Employee id: "+emp.getEmpid());
		System.out.println("Get the Employee Name: "+emp.getEmpName());
		System.out.println("Get the Employee Salary: "+emp.getEmpSal());
		
	}

}
