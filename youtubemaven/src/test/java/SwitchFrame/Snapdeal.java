package SwitchFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	private static final java.util.concurrent.TimeUnit TimeUnit = null;

	public static void main(String[] args) throws
	InterruptedException 
	{
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.snapdeal.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit);
	
	WebElement login = 
	driver.findElement(By.xpath("//span[text()='Sign In']"));
	
	Actions a = new Actions(driver);
	a.moveToElement(login).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='login']")).
	click();
	driver.switchTo().frame(0);
	driver.findElement(By.id("userName")).sendKeys("sasi");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//i[@class='sdicon sd-icon-delete-sign fnt-22']")).click();
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	driver.findElement(By.id("inputValEnter")).sendKeys("phone");
	
	Thread.sleep(3000);
	driver.close();
	}
}
