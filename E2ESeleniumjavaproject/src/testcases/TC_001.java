package testcases;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC_001 {

	@Test
	public void testcase() {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("hello");
		driver.findElement(By.id("pass")).sendKeys("test");
		driver.close();
	}
}
