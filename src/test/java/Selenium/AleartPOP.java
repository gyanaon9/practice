package Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class AleartPOP {
	
	@Test 
	public void m(){
		
		

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			d.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
			d.findElement(By.xpath("//*[@id='alert']")).click();
			Alert b=d.switchTo().alert();
			String data=b.getText();
			System.out.println(data);

		}

	}

