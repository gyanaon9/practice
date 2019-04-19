package Pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonLabel {
	


	WebDriver d;
	@BeforeMethod
	public void Lunch() {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		
		@Test
		public void Login() {
        d.get("https://facebook.com/");
        String exeVal="Male";
      
        
        String wb=d.findElement(By.xpath("//*[text()='Female']")).getText();
        String wb1=d.findElement(By.xpath("//*[text()='Male']")).getText();
        
        //System.out.println(q);

        
        if(exeVal==wb)
        {  
        d.findElement(By.xpath("//input[@type='radio'][@value='1']")).click();
        }else if(exeVal==wb1) {
        	d.findElement(By.xpath("//input[@type='radio'][@value='2']")).click();
        }
		
		
}
}