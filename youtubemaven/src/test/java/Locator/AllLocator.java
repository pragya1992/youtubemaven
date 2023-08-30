package Locator;

import java.io.InterruptedIOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLocator {

	public static void main(String[] args)throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("pragya");
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back(); 
		driver.navigate().refresh();
		driver.navigate().forward();
		//driver.findElement(By.partialLinkText(" password?")).click();
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("pragya");
		//All the links
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		
		for(WebElement Alllink:Links) {
			System.out.println(Alllink.getText());
		}
		
		
	}

	private static void backbard() {
		// TODO Auto-generated method stub
		
	}

}
