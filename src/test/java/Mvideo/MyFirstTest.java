package Mvideo;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import org.testng.annotations.Test;



public class MyFirstTest {
	
	
	@Test
	public void GoogleTestVerify() {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://www.google,com/");
		
		System.out.println(d.getTitle());
		d.quit();
	}
  @Test
  public void TitleMatch() {
	  
	  System.out.println("Test 2 Match");
	  Assert.assertTrue(false);
	  
  }
}
