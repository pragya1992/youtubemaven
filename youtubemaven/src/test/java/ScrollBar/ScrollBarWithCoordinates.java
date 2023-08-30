package ScrollBar;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;

public class ScrollBarWithCoordinates {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeout().implicitlywait(10,TimeUnit.SECONDS);
	driver.get("https://demoapp.skillrary.com/");
	//address of career
	
	
	WebElement career=driver.findElement(By.xpath("//a[text()='Career']"));
     Point point=career.getLocation();
	 
        int x=point.getX();
         int y=point.getY();

JavaScriptExecuter js=(JavascriptExecuter)driver;

js.executeScript("window.scrollBy("+x+","+y+")");
Tread.sleep(5000);
js.executeScript("arguments[0].click();",career);
}
}
