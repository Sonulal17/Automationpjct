package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Verishoplogin;
import page.Verisignin;

public class Verishoplogintest {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.verishop.com/login?redirectUrl=/");
	}
	
	@Test
	
	public void logintest() throws InterruptedException
	{
		Verishoplogin ob =new Verishoplogin(driver);
		ob.setvalues("sonulalns@gmail.com", "S@1704#a");
	    ob.Verogin();
		//driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}
	
	@Test
	
	public void signuptest() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/form/div[1]/a")).click();
		Thread.sleep(6000);
		Verisignin ob=new Verisignin(driver);
		ob.setvalues("sonulalns@gmail.com", "S@1704#a");
		ob.signup();
		
		//title verification
		
		String Exp="Sign up | Verishop";
		String actual=driver.getTitle();
		System.out.println(Exp);
		System.out.println(actual);
		Assert.assertEquals(Exp, actual);
		
		
		
		
	}
}
