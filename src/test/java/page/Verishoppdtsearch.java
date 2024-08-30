package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Verishoppdtsearch {
	
	WebDriver driver;
	
	By searcharea=By.xpath("/html/body/div[1]/div/div[1]/header/div[2]/div/div/div/div[4]/div/div/div/div[1]/input");
	By searchicon=By.xpath("/html/body/div[1]/div/div[1]/header/div[2]/div/div/div/div[4]/div/div/div/div[1]/div");
	//By close=By.xpath("/html/body/div[66]/div/div[2]/div/div/div/div/div/button/svg");
	By img=By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div/a/div/img");
	By size=By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[3]/div[3]/div/a[4]");
	By bag=By.xpath("//*[@id=\"main-content\"]/div/div[1]/div[3]/div[4]/div/div[1]/button");
	By cart=By.xpath("/html/body/div[1]/div/div[1]/header/div[2]/div/div/div/div[5]/div/button[3]");
	//By removebutton=By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]");
	//By checkoutbutton=By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[2]/div/div[4]/button");
	public Verishoppdtsearch(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void pdtsearch()
	{
		driver.findElement(searcharea).sendKeys("baggy jeans");
	}
	
	public void iconclick()
	{
		driver.findElement(searchicon).click();
	}
	/*public void closebox()
	{
		driver.findElement(close).click();
	}*/
	public void imgclick()
	{
		driver.findElement(img).click();
	}
	public void sizeselect()
	{
		driver.findElement(size).click();
	}
	public void addtobag()
	{
		driver.findElement(bag).click();
	}
	
	public void cartview()
	{
		driver.findElement(cart).click();
	}
	/*public void check()
	{
		driver.findElement(checkoutbutton).click();
	}*/


	
	
	
}
