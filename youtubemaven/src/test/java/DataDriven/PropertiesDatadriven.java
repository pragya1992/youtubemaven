package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesDatadriven {
	
	public static void main(String[] args) throws IOException {
		
		//create an obj or prop
		Properties p=new Properties();
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\java\\DataDriven\\PropertiesDatadriven.java");
		
		p.load(fis);
		
		String url=p.getProperty("url");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		
		
		
		
		
		
	}

}
