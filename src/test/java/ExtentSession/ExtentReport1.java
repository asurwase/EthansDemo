package ExtentSession;

// class 14 sept/ creation of extent reports for test cases

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport1 {

	public static void main(String[] args) {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\JavaPractice\\Batch.html");  // giving path for file
		ExtentReports report = new ExtentReports();  //creating the reporter on browser, the full page which we c.its a class
		report.attachReporter(htmlReporter);  // attaching the file created in 'c' drive
		// report.createTest("verify_login" , "user able to login");
		
		ExtentTest logger = report.createTest("verify_login" , "user able to login");
		logger.log(Status.PASS, "username entered is correct");
		logger.log(Status.PASS, "password entered is correct");
		logger.log(Status.FAIL, "unable to click on login");
		logger.log(Status.PASS, "user exists");

		report.flush();  //it will make sure that all logs "steps" above will go into report

	}

}
