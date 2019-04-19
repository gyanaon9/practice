package Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class RightClickOperation {


	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("http:/www.filpkart.com");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
        WebElement wb=d.findElement(By.xpath("//*[@id='container']/div/div/div/div/div[4]/div/div"));
	    Actions act=new Actions( d);
	   // act.contextClick(wb).perform();  This is for_____Right click operation
	    //act.sendKeys("G").perform();
	    
	    //Mouse movement operation
	    act.moveToElement(wb).build().perform();
	    WebElement wb1=d.findElement(By.xpath("//div[text()='Sell on Flipkart']"));
	    wb1.click();
	    System.out.println("Pass");
	//How to perform "Ctrl+A" operation using senhkeys
act.sendKeys(Keys.chord(Keys.CONTROL,"c")).build().perform();


	}
}
