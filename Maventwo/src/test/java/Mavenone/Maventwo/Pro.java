package Mavenone.Maventwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Pro {
	
	
	
	
	static WebDriver driver;
	
	@BeforeClass
	public static void browser()
	{
		  driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority = 1)
	public static void username()
	{
	WebElement uname = driver.findElement(By.xpath(".//*[@id='email']"));
	uname.sendKeys("fff");
	}
	
	@Test(priority = 2)
	public static void password()
	{
	WebElement pwd = driver.findElement(By.xpath(".//*[@id='pass']"));
	pwd.sendKeys("sdfff");
	}
	
	@Test(priority = 3)
	public static void login()
	{
	WebElement log = driver.findElement(By.xpath(".//*[@id='u_0_2']"));
	log.click();
	}

}
