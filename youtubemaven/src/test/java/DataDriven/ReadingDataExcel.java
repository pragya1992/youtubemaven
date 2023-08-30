package DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit; 
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingDataExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\java\\DataDriven\\PropertiesDatadriven.java");
	//Dependency
		Workbook wb=WorkbookFactory.create(fis);
		
		String url=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		
		String title=driver.getTitle();
		
		wb.getSheet("Sheet1").createRow(5).createCell(0).setCellValue(title);
		FileOutputStream fos=new FileOutputStream(".\\");
		wb.write(fos);
	}

}
