package Mvideo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ElementClick3 {

	
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://login.yahoo.com/");
		
		d.findElement(By.xpath("//*[@id='persistent']")).click();
		//Actions act=new Actions(d);
		//act.moveToElement(d.findElement(By.xpath("//*[@id='persistent']"))).click().build().perform();
	}
}
