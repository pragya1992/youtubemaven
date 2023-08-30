package HandlePopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement course=driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(course).perform();
		driver.findElement(By.xpath("//a[text()='Selenium Training'][1]")).click();
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		driver.switchTo().alert().accept();
	//	driver.switchT().alert().Dis
		
		

	}

}
