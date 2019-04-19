package Mvideo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Webtable {
	
	@Test
	public void DatePickDemo() {
		

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.redbus.in/");
		d.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();
		
         String date=d.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']//td[6]")).getText();
		System.out.println(date);
		
		
			}

}