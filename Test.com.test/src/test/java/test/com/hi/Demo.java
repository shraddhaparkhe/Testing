package test.com.hi;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
@Test
     public void demo1() {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("hello world");
	}
	
	@BeforeTest
	public void login8()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void login6() {
		System.out.println("After Test");
	}
	
	@BeforeSuite
	public void login9()
	{
		System.out.println("My first Suite");
	}
	@AfterSuite
	public void login10() {
		System.out.println("After Suite");
	}
	
	@BeforeClass
	public void login()
	{
		System.out.println("My first method class");
	}
	@AfterClass
	public void login4() {
		System.out.println("After class");
	}
@Test
 public void login1() {
	System.out.println("Help");
	
}
@Test
public void login2() {
	System.out.println("Secure");
}
}
