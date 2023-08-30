package Screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazoneScreenshot {
	
	WebDrivermanager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().windows().maximize();
	driver.get("");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	File dest=new File ("./Screeshot/amazon.ping");
	
	FileUtils.copyfile(src,dest);
	

}
