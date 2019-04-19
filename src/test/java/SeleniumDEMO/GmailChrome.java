package SeleniumDEMO;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class GmailChrome {
	
	@Test
	public void Ram() throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://gmail.com/");
		d.findElement(By.id("identifierId")).sendKeys("gyanaranjan.grs9@gmail.com");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		d.findElement(By.name("password")).sendKeys("grs@@@00");
		Thread.sleep(500);
		d.findElement(By.xpath("//span[text()='Next']")).click();
		
		//logout
	   	d.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a")).click();
		d.findElement(By.xpath("//*[text()='Sign out']")).click();

	}

}
