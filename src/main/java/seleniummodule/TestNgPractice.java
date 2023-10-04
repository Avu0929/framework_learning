package seleniummodule;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgPractice {
	
	@Test
	public void method1() {
		
		System.out.println("Method1");
		
	}
	
	@Test(priority=-1)
	public void method2() {
		System.out.println("method2");
	}
	
	@BeforeSuite
	public  void method3() {
		System.out.println("BeforeSuit");
	}
	
	@AfterSuite
	public  void method4() {
		System.out.println("Aftersuit");
	}
	
	@BeforeClass
	public  void Method5() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public  void method6() {
		System.out.println("AfterClass");
	}
	
	@BeforeTest
	public  void method7() {
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public void method8() {
		System.out.println("AfterTest");
	}
	
	@BeforeMethod
	public void method9() {
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod()
	public void method10(){
		System.out.println("AfterMethod");
	}

}
