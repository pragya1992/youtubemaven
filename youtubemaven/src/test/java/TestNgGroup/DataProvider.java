package TestNgGroup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider {
@org.testng.annotations.DataProvider

public Object[][]getData(){
	Object[][] a=new Object[3][2];
	a[0][0]="qwe";
	a[0][1]="123";
	
	a[1][0]="qweuyt";
	a[1][1]="123hgf";
	
	a[2][0]="qwepo4";
	a[2][1]="123nm8";
	
	return a;
	
}
@Test(dataProvider="getData")

public void demo(String username,String pwd) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	

	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("username");
	driver.findElement(By.id("pass")).sendKeys("pwd");
	
	
	
}


}
