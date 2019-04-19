package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplaed {
	
	
	@Test
	public void m() {
//		
//		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
//		WebDriver d = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("https:www.google.com/");
		Boolean isDisplay=d.findElement(By.xpath("//input[@name='btnI']")).isDisplayed();

		Boolean isEnable=d.findElement(By.xpath("//input[@name='btnI']")).isEnabled();
		
		
		if(isDisplay) {
			
			System.out.println("Element is displayed");
		}else {
			System.out.println("Not isplayed");
		}
if(isEnable) {
			
			System.out.println("Element is Enable");
		}else {
			System.out.println("Not enable");
		}
	}

}
