package junitannotations;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitAnnotations {
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Executing before class");
	}
	
	@AfterClass
	public static void afterclass(){
		System.out.println("Executing After class");
	}
	
	
	@Test
	public void test1(){
		System.out.println("Executing JUnit test1");
	}
	
	@Test
	public void test2(){
		System.out.println("Executing JUnit test2");
	}
	
	@Test
	public void test3(){
		System.out.println("Executing JUnit test3");
	}

	@Ignore
	public void test4(){
		System.out.println("Executing JUnit test4");
	}
	
	@Before
	public void before(){
		System.out.println("Executing before Method");
	}
	
	@After
	public void after(){
		System.out.println("Executing after Method");
	}

}
