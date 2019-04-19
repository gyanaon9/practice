package Selenium;
import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

	public class AllvalueDD {

		@Test
		public void m() 
		{

			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			WebDriver d = new ChromeDriver();
//			System.setProperty("webdriver.ie.driver", ".\\Test-out\\IEDriverServer.exe");
//			WebDriver d=new InternetExplorerDriver();
			
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			d.get("https://www.facebook.com/");
		   WebElement wb=d.findElement(By.id("month"));
		   
		    Select sel=new Select(wb);
		    List<WebElement>as=sel.getOptions();
		    int total_dd=as.size();
		    
		    Assert.assertEquals(total_dd, 13);
		    for(int i=0;i<total_dd;i++)
		    {
		    	String a=as.get(i).getText();
		    	System.out.println(a);
		    	
		    }

	}

	}

