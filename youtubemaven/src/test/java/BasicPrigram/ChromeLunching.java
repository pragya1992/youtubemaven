package BasicPrigram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLunching {

	public static void main(String[] args)throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.facebook.com/");
		System.out.println("driver.get title");
		System.out.println("driver.getcurrentUrl()");*/
		driver.get("");		
		Thread.sleep(2000);
		driver.close();
		}

}
