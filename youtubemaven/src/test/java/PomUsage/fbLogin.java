package PomUsage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.FbLoginpage;

public class fbLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		FbLoginpage fbLogin=new FbLoginpage(driver);
		fbLogin.emailTextField("pragya");
		fbLogin.passwordTextField("123");
		fbLogin.loginButton(); 

	}

}
