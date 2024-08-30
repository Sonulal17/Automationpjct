package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Verishoplogin {
	
	WebDriver driver;
	By eemail=By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/div/form/label[1]/div[2]/input");
	By epassword=By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/div/form/label[2]/div[2]/input");
	By login=By.xpath("/html/body/div[1]/div/div/div/div[1]/div/form/button");
			
	
	
	public Verishoplogin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email,String password)
	{
		driver.findElement(eemail).sendKeys(email);
		driver.findElement(epassword).sendKeys(password);
	}
	
	public  void Verogin()
	{
		driver.findElement(login).click();
	}
}
