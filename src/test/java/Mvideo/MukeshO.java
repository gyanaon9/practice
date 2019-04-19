package Mvideo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class MukeshO {
	
	WebDriver d;
	@Test
	public void startApp()
	{

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		String currentURl=d.getCurrentUrl();
		Assert.assertTrue(currentURl.contains("auth/login"));
		System.out.println("PASS");
	}
	   @Test(dependsOnMethods="startApp")
	   public void loginApp()
	   {
		   d.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("user");
		   d.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("1234");   
		   d.findElement(By.xpath("//*[@id='btnLogin']")).click();
	   }
	   @Test(dependsOnMethods="loginApp")
	   public void logOutApp() throws InterruptedException
	   {
		   Thread.sleep(2000);
		   d.findElement(By.xpath("//*[@id='welcome']")).click();
		   d.findElement(By.xpath("//*[text()='Logout']")).click();
		   
		  Boolean status=  d.findElement(By.xpath("//*[@id='txtUsername']")).isDisplayed();
		  Assert.assertTrue(status);
	   }
	   @AfterClass
	   public void close()
	   {
		   d.quit();
		   System.out.println("Cloase browser...");

   }
}
