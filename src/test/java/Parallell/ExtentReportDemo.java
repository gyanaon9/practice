package Parallell;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
	
	public static void main(String[] args) {
		

	    ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Report/extentReport.html");
	    

	    ExtentReports extent = new ExtentReports();
	    
	    extent.attachReporter(reporter);
	    
	    ExtentTest test=extent.createTest("Google search Test One","This is the test to validate gogle functionality");
	

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
       test.log(Status.INFO, "Starting test case");
		driver.get("http://www.google.com");
       test.pass("Navigate to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
       
       test.pass("Enter into the Searche Content");
		driver.findElement(By.name("btnK")).click();

       test.pass("Enter into the click button");
		
		driver.close();
		
		test.pass("Test completed");
		
		extent.flush();
		
	}

}
