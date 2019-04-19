package InterviewR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	
	@Parameters({"username","psw"})
	@Test
	public void LoginVerification(String username,String psw) {
		

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		d.findElement(By.xpath("//*[@id='pass']']")).sendKeys(psw);
		d.findElement(By.xpath("//*[@type='submit']")).click();
		
		
		
	}

}
