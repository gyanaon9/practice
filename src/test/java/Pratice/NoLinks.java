package Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class NoLinks {
	
	@Test
	public void links()
	{

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://google.com/");
		d.manage().window().maximize();
		  List<WebElement>lt= d.findElements(By.tagName("//a")); //By.xpath
		  System.out.println(lt.size());
d.quit();
	}

}
