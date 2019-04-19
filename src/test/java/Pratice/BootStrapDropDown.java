package Pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootStrapDropDown {
	
	@Test
	public void Mukesh() {
		

		System.setProperty("webdriver.chrome.driver", ".\\Test-out\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id='menu1']")).click();
		List<WebElement>dd_menu=d.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		
		for(int i=0;i<dd_menu.size();i++)
		{
			
	     WebElement wb=dd_menu.get(i);
	     //String data=wb.getText();
	         String inner=wb.getAttribute("innerHTML");
	         System.out.println(inner);
	     
		}
		
		
	}

}
