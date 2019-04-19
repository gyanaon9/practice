package Pratice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert1 {


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
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		d.manage().window().maximize();
		d.switchTo().frame("iframeResult");
		d.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Alert at=d.switchTo().alert();
		at.accept();
		d.close();
	}
	@Test(priority=2)
	public void ConMsg() throws InterruptedException
	{
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		d.manage().window().maximize();
		d.switchTo().frame("iframeResult");
		d.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Alert at=d.switchTo().alert();
		Thread.sleep(2000);
		at.dismiss();
	}
	@Test(priority=3)
	public void PromptBox() throws InterruptedException
	{
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		d.manage().window().maximize();
		d.switchTo().frame("iframeResult");
		d.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Alert at=d.switchTo().alert();
		at.sendKeys("GRS");

		Thread.sleep(2000);
		at.accept();
		String data=d.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(data);
	}
}