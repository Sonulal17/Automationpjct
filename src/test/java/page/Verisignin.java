package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Verisignin {
	
	WebDriver driver;
	
	By vsignup=By.xpath("/html/body/div[1]/div/div/div/div[1]/div/form/div[1]/a");
	By vemail=By.xpath("/html/body/div[1]/div/div/div/div[1]/div/form/div[1]/label[1]/div[2]/input");
	By vpswd=By.xpath("/html/body/div[1]/div/div/div/div[1]/div/form/div[1]/label[2]/div[2]/input");
	By signupbutton=By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/div/form/button");
	
	public Verisignin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void setvalues(String email,String pswd)
	{
		driver.findElement(vemail).sendKeys(email);
		driver.findElement(vpswd).sendKeys(pswd);
	}
	
	public void signup()
	{
		driver.findElement(signupbutton).click();
	}

}

