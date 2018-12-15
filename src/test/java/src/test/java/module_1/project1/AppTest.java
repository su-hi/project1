package src.test.java.module_1.project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
 
{
WebDriver driver;
	
	@BeforeTest
	public void beforeTest(){
		driver= new FirefoxDriver(); 
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//a
	@Test
	public void test(){
		boolean signIn= driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span")).isDisplayed();
		boolean orders= driver.findElement(By.xpath(".//*[@id='nav-orders']/span[2]")).isDisplayed();
		boolean tryPrime= driver.findElement(By.xpath(".//*[@id='nav-link-prime']/span[2]")).isDisplayed();
		boolean cart= driver.findElement(By.xpath(".//*[@id='nav-cart']")).isDisplayed();
	
		System.out.println(signIn);
		System.out.println(orders);
		System.out.println(tryPrime);
		System.out.println(cart);
	}
	
	@AfterTest
	public void afterTest(){
		driver.quit();
	}
}
