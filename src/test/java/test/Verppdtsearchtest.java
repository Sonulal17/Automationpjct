package test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Verishoppdtsearch;

public class Verppdtsearchtest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.verishop.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void test1() throws InterruptedException, IOException
	{
		Verishoppdtsearch ob=new Verishoppdtsearch(driver);
		Thread.sleep(3000);
		ob.pdtsearch();
		ob.iconclick();
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div/a/div/img")));
	    //ob.closebox();
		ob.imgclick();
		driver.manage();
		Thread.sleep(2000);
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[3]/div[3]/div/a[4]")));
		ob.sizeselect();
		Thread.sleep(2000);
		ob.addtobag();
		//driver.navigate().back();
		Thread.sleep(9000);
		ob.cartview();
		Thread.sleep(2000);
		
		
		//scroll down to the bottom
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)", "3000");
		//driver.navigate().back();
		
		
		//ob.check();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(5000);
		
		
		//screenshot
		WebElement abtElement=driver.findElement(By.xpath("//*[@id=\"page-root\"]/div[2]/div/div/div[1]/div[2]/div/div/div[2]/div[1]/a"));
		File src1=abtElement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./Demo//aboutelement.png"));
		
		driver.navigate().back();
		driver.navigate().back();
		
		
		//response code
		
		 String url = "https://www.verishop.com/";
		 URL ob1=new URL(url);
			
			HttpURLConnection con=(HttpURLConnection) ob1.openConnection();
			int code=con.getResponseCode();
			System.out.println("The url is " + code);
			con.connect();
			
			if(con.getResponseCode()==200)
			{
				System.out.println("valid url");
			}
			else
			{
				System.out.println("invalid url");
			}
		
	}

}
