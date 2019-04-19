package Mvideo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenWebElements1 {
	
	@Test
	public void hidden() {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		d.manage().window().maximize();
		//Here 4 button used single name butin selenium if call that name it always call the 1st element
	d.findElement(By.name("lang")).click();
		
	}

}
