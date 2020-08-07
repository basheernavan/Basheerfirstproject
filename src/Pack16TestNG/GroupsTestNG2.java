package Pack16TestNG;

import org.testng.annotations.Test;

public class GroupsTestNG2 {
	@Test(description="sample test case login",groups={"sanity","domains"})
	public void test5(){
		System.out.println("Executing testng test5");
	}
	
	@Test(description="sample test case regression",groups={"regression","admin"})
	public void test6(){
		System.out.println("Executing testng test6");
	}
	
	@Test(description="sample test case sanity",groups={"domains","admin"})
	public void test7(){
		System.out.println("Executing testng test7");
	}
	
	@Test(groups="sanity")
	public void test8(){
		System.out.println("Executing testng test8");
	}
	

}
