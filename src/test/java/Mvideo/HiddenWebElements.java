package Mvideo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenWebElements {
	
	@Test
	public void hidden() {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		d.manage().window().maximize();
	List<WebElement>radio=d.findElements(By.xpath("//input[@id='male']"));
	
	System.out.println("Total radio button="+radio.size());
	
	for(int i=0;i<radio.size();i++)
	{
		
		int x=radio.get(i).getLocation().getX();
	if(x!=0)
	{
		radio.get(i).click();
		break;
	}
	}
		
	}

}
