package SeleniumDEMO;
	import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



	public class Alertt {
	
			@Test
			public void m()
			{

				System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
				WebDriver d = new ChromeDriver();
				d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				d.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
				d.findElement(By.xpath("//*[@id='loginbutton']")).click();
			Alert b=d.switchTo().alert();
			String u=b.getText();
           Assert.assertEquals(u, "Enter User ID");
			System.out.println("S");
			}
	}

