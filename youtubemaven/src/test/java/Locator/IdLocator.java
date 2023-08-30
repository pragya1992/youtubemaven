package Locator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdLocator {

	public static void main(String[] args)throws Throwable  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		Thread.sleep(6000);
		for(WebElement allLinks:links) {
		System.out.println(allLinks.getText());
		}
		
		

	}

}
