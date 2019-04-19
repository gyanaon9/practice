package DDT;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NukriMore {

	WebDriver d;
	String url;
	@BeforeMethod
	public void Lunchbrower()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
        d = new ChromeDriver();
		url="https://www.naukri.com/";
	}
	@Test
	public  void aTest() throws Throwable
	{
		d.get(url);

		Thread.sleep(2000);
		Actions act=new Actions(d);
		act.moveToElement(d.findElement(By.xpath("//div[text()='More']"))).click();
		act.build().perform();
		System.out.println("Click more");
		Thread.sleep(2000);
		//click on MCA
		d.findElement(By.xpath("//a[@title='MBA']")).click();
		System.out.println("Click MCA");
		
		Set<String>wd=d.getWindowHandles();
		System.out.println(wd.size());
	}

}
