package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampleTest {
	

	WebDriver driver;
	

	@BeforeTest
	public void browserOpen() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}
	
	@Test
	public void testing() throws InterruptedException {
		
		WebElement search = driver.findElement(By.xpath("//input[@class='search-keyword']"));
		
		search.sendKeys("C");
		
		Thread.sleep(3000);
		
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
		
		
		



}
