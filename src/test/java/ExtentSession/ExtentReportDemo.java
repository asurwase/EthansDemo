package ExtentSession;
//class 8 sept , maven project 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo
{

	public static void main(String[] args) 
	{
		// this line will chedk the chroms exe vwesion and according to that it will access the version from maven repository
		WebDriverManager.chromedriver().setup();   // it will handle any chrome version
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
	}

}
