package InterviewR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IsDisplay {
	
	WebDriver d;
	@BeforeMethod
	public void LunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
       d=new ChromeDriver();	
       d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void Display() {
		
		d.get("https://google.com/");
		boolean LinkP=d.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
		
		System.out.println(LinkP);   //true
		
		if(LinkP==true) {
			
			System.out.println("LinkPage is Display= true");
		}else {
			System.out.println("LinkPage is Not Display= Filed");
//1.isDisplay is applicable for All the element available on webpage
//2.isEnabled() is the method used to verify if the web element is enabled or disabled within the web page.
//3. isEnabled() is primarily used with buttons Only.
//4.isSelected is used  to verfiy that partcular is selected or not i.e DD,radio button,checkBox 		
		
		
		
		
		}
	}

}
