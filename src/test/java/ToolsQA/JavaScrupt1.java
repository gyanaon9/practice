package ToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScrupt1 {

	@Test
	public void Ram()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Test-out\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://facebook.com/");	
		
		JavascriptExecutor web=(JavascriptExecutor)d;
		web.executeScript("document.getElementById('email').setAttribute('value','gyanaranjan.grs9@gmail.com')");
		web.executeScript("document.getElementById('pass').setAttribute('value','grs@@@86')");
		web.executeScript("arguments[0].click();",d.findElement(By.xpath("//input[@data-testide='royal_login_button']")));
		
	
	}}