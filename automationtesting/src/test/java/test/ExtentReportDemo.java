package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		    
	        // create ExtentReports and attach reporter(s)
	        ExtentReports extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);

	        // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test1 = extent.createTest("Google serach", "Searching in google");
	        
	        WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			test1.log(Status.INFO,"test case is starting");
			driver.get("https://www.google.com");
			
			test1.pass("closing the browser");
			driver.close();
			
			test1.info("test completed");
			extent.flush();

	}

}
