package Mvideo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebtableAll {
	
	@Test
	public void DatePickDemo() {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
     String BeforeXpath="//*[@id='customers']/tbody/tr[";
     String AfterXpath="]/td[1]";
     
     for(int i=2;i<=7;i++)
     {
    	 String ActualXpath=BeforeXpath+i+AfterXpath;
    	 WebElement element=d.findElement(By.xpath(ActualXpath));
    	 System.out.println(element.getText());
     }
}
}