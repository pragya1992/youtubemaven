package TestNgGroup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assersion {
	
	public class Annotation {
		
		WebDriver driver;
		@BeforeMethod
		public void openApp() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		
		
		}
		
		@Test
		
		public void login() {

			WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
			String title=driver.getTitle();
			
			//HARD ASSERT: static stop the execusion
			//ASSERT.assertEquals(title,"asdf");
			
			//SOFTASSERT // need to create obj will not stop excution
			SoftAssert s=new SoftAssert();
			s.assertEquals(title, "asdf");
			
			System.out.println(driver.getCurrentUrl());
			
		}
	@AfterMethod
	public void close() {
		driver.close();
	}
	}

}
