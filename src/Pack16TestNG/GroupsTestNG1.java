package Pack16TestNG;

import org.testng.annotations.Test;

public class GroupsTestNG1 {
	@Test(groups={"sanity","admin"})
	public void test1(){
		System.out.println("Executing testng test1");
	}
	
	@Test(groups={"regression","admin"})
	public void test2(){
		System.out.println("Executing testng test2");
	}
	
	@Test(groups="regression")
	public void test3(){
		System.out.println("Executing testng test3");
	}
	
	@Test(groups={"sanity","admin"})
	public void test4(){
		System.out.println("Executing testng test4");
	}
	

}
