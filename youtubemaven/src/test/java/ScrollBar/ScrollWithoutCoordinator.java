package ScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollWithoutCoordinator<JavascriptExecuter> {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	//address of career
	WebElement career=driver.findElement(By.xpath("//a[text()='Career']"));
	//downcasting
	JavascriptExecuter js=(JavascriptExecuter)driver;
	
	js.executeScript("arguments[0].scrollIntoView()",career);
	
	js.executeScript("arguments[0].click();",career);

}
}