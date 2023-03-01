package test.com.hi;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo3 {
	 @Test
	  public void f() {
		  System.out.print("Test");
	  }
	 @AfterSuite
	  public void beforeMethod() {
		  System.out.print("After Suite");
	  }

	  @BeforeSuite
	  public void afterMethod() {
		  System.out.println("Before Suite");
	  }
	@Test
	    public void g() {
		System.out.println("Test2");
	}
	}



