package Pratice;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert2 {

	WebDriver d;
	@BeforeMethod
	public void Lunch() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 d = new ChromeDriver();
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
	}
	@Test(priority=1)
	public void AlertBox() 
	{
		d.get("https://www.w3schools.com/");
		d.manage().window().maximize();
//X-path==//*[@id="mySidenav"]/div/a[48]
		d.findElement(By.xpath("//*[@id='mySidenav']/div/a[48]")).click();
		d.findElement(By.xpath("//*[text()='JS Browser']")).click();
		d.findElement(By.xpath("//a[text()='Popup explained']")).click();
//*[@id="main"]/div[4]/a
		d.findElement(By.xpath("//*[@id='main']/div[4]/a")).click();
// Switch new window
		Set<String> wd = d.getWindowHandles();
		System.out.println(wd.size());
		Iterator<String> wdd = wd.iterator();
		String parent = wdd.next();
		System.out.println(parent);
		String child = wdd.next();
		System.out.println(child);
		d.switchTo().window(child);
		
	    d.switchTo().frame("iframeResult");
	    d.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	    Alert at=d.switchTo().alert();
	    at.accept();
	    d.close();
	    
	}
}
