package InterviewR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel {

		//how to data parameter through testng.xml file to a test case?
			WebDriver driver;
			@Parameters("browser")
			@BeforeClass
			public void setup(String browser) {
				if(browser.equalsIgnoreCase("firefox")){
					
						WebDriverManager.firefoxdriver().setup();
						driver=new FirefoxDriver();
				}
				else if(browser.equalsIgnoreCase("ie")){
					System.setProperty("webdriver.ie.driver", ".\\Test-out\\IEDriverServer.exe");
        		       driver=new InternetExplorerDriver();
        		       
				}else if(browser.equalsIgnoreCase("chrome")) {

					System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
					  driver=new ChromeDriver();
				}
			}
			@Test
			public void myTest(){
				driver.get("https://www.google.com/");
				driver.close();

		}
		}