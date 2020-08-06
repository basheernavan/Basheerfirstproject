package Pack16TestNG;

import org.testng.annotations.Test;

public class ExecutionOnPriorityBased {
	
	@Test(priority=5)
	public void maruthi(){
		System.out.println("Executing testng maruti");
	}
	
	
	@Test(priority=1)
	public void google(){
		System.out.println("Executing testng google");
	}
	
	@Test(priority=2)
	public void mycar(){
		System.out.println("Executing testng mycar");
	}
	
	@Test(priority=3)
	public void rolesRoys(){
		System.out.println("Executing testng rolesRoys");
	}
	
	@Test(priority=4)
	public void audi(){
		System.out.println("Executing testng audi");
	}
	
	

}
