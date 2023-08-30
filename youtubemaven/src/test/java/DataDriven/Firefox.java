package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox {
public static void main(String[] args) throws IOException {
		
		//create an obj or prop
		Properties p=new Properties();
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\java\\DataDriven\\PropertiesDatadriven.java");
		
		p.load(fis);
		
		String url=p.getProperty("url");
		
		String brow=p.getProperty("browser");
		
		WebDriver driver;
				if(brow.equals("chrome")) {
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
				}
				else {
					WebDriverManager.firefoxdriver().setup();
					driver=new FirefoxDriver();
				}
				}
		 driver.get(url);
	//	driver.manage().window().maximize();
         //driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//	driver.get(url);

}


