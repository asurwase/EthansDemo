package MyJenkinsTest;
// class 14 sept , using TestNG to exe the prog
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyJenkinsDemo      // here v r not using main method of java, he we are using maven to exe our prog
// here maven's surefire will compile our prog and not java
{
	@Test   // it is from TestNG, it will exe the prog
	public void VerifyTitle() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();   // it will handle any chrome version
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());
        
		Thread.sleep(5000);
		driver.quit();
	}

}
