package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssselectorLocator {

	
		public static void main(String[] args)throws Throwable  {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Pragya.jain");
			Thread.sleep(5000);
	}

}
