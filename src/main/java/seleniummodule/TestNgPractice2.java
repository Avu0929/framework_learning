package seleniummodule;

import org.testng.annotations.Test;

public class TestNgPractice2 {
	
//	@Test
//	public static void method1() {
//		System.out.println("method1 of second class");
//	}
//	
//	@Test(priority=1)
//	public void method() {
//		System.out.println("i am priority");
//	}


	 @Test(groups="Sanity")
	 public void method1() {
	  
	  System.out.println("hello");
	 }
	 
	 @Test(groups={"Regression","Sanity"})
	 public void method2() {
	  
	  System.out.println("hello1");
	 }
	 
	 
	 
	   @Test
	 public void method3() {
	  
	  System.out.println("hello2");
	 }
}
