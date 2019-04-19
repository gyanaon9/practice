package Naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameter {

	WebDriver d;
	@Parameters("browser")
	@Test(priority=1)
	public void LunchCRM(String browser) 
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
		d=new FirefoxDriver();
	}else if(browser.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", ".\\Test-out\\chromedriver.exe");
		d=new ChromeDriver();
	}else if(browser.equalsIgnoreCase("ie"))
	{
		System.setProperty("webdriver.ie.driver", ".\\Test-out\\IEDriverServer.exe");
		WebDriver d=new InternetExplorerDriver();
	}
		d.manage().window().maximize();
		d.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		//System.out.println(d.getTitle());
		//d.quit();
	}
	
	@Parameters({"username","password"})
	@Test(priority=2)
	public void LoginTest(String username,String password) {
		d.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(username);
		d.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password);
		d.findElement(By.id("btnLogin")).click();
	
		
	}
}
