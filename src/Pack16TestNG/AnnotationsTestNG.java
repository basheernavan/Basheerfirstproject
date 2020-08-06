package Pack16TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTestNG {
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Executing Before Suite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("Executing after suite");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Executing before test or Scenario");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("Executing after test or scenario");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Executing before class");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("Executing after class");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Executing before method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("Executing after method");
	}
	
	@Test(description="this test case is for login")
	public void test1(){
		System.out.println("Executing testng test1 method");
	}
	
	@Test(enabled=false)
	public void test2(){
		System.out.println("Executing testng test2 method");
	}
	
	@Test(description="this test case is for registration")
	public void test3(){
		System.out.println("Executing testng test3 method");
	}
	

}
