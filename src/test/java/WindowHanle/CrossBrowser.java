package WindowHanle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver d;
	@Parameters("browser")
	@Test
	public void Verifypagetittle(String browser) 
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
		System.out.println(d.getTitle());
		d.quit();
	}

}
