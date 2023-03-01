package test.com.hi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Launch {
	@Test
	
	
public void launch1 ()
	{
		System.setProperty("webdriver.chromedriver","D:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//launch browser the browser
		//click search 
	//	driver.findElement(By.className("\"gLFyf\"\r\n"+ "")).click();
		driver.findElement(By.className("gLFyf")).sendKeys("shraddha parkhe");
		driver.findElement(By.cssSelector(".WggQGd > span")).click();
	    System.out.println("Sucess");
	 
	    driver.close();
	  }
	}

	

