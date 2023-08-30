package WebElements;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GettingType {

	

		public static void main(String[] args)throws Throwable {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
			org.openqa.selenium.Point coOrdinates=email.getLocation();
			
			System.out.println("x and y coordinates");
			System.out.println(coOrdinates.getX());
			System.out.println(coOrdinates.getY());
Dimension size=email.getSize();
System.out.println("Dimension");
System.out.println(size.getWidth());
System.out.println(size.getHeight());

	}

}
