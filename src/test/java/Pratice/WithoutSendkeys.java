package Pratice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WithoutSendkeys {
	
	@Test
	public void Without() {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		WebElement wb=d.findElement(By.xpath("//*[@id='email']"));
		
		JavascriptExecutor js=((JavascriptExecutor)d);
		
	     js.executeAsyncScript("arguments[0].value='GRS'",wb);
		
		
		
		
	}

}
