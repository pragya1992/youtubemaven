package TestNGParallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossbrowserAmazone {
	@Parameters({"browsername"})	
@Test
public void amazone(String browser) {
	WebDriver driver;
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
	}
	
	driver.manage().window().maximize();
	driver.get("https://www.amazone.in/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.close();
}
}
