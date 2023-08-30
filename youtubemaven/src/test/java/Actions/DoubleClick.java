package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.id("email"));
		
		email.sendKeys("pragya");
		
		email.clear();
		
		WebElement Login=driver.findElement(By.xpath("//button[@value='1']"));;
		Login.submit();
		
		
		

	}

}
