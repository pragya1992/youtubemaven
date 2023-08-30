package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTypes {

	public static void main(String[] args)throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
				email.sendKeys("pragya");
				email.clear();
				WebElement login =driver.findElement(By.xpath("id=\"u_0_5_FV\"']"))	;
				login.submit();
				
		Thread.sleep(6000);

	}

}
