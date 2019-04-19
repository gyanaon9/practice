package SeleniumDEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Chrome {
	
	@Test
	public void Ram()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://in.yahoo.com/");	
		d.findElement(By.xpath("//*[@id='bottombar-mail-count']/../span")).click();
		
		
//		System.setProperty("webdriver.gecko.driver", ".\\Test-out\\geckodriver.exe");
//		WebDriver d=new FirefoxDriver();
//		d.get("https://gmail.com/");
	}
}
