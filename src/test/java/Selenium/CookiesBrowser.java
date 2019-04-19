package Selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CookiesBrowser {

	@Test
	public void Cookies() {
		WebDriver d=new FirefoxDriver();
		
		d.get("https://www.amazon.com/");
		Set<Cookie>c=d.manage().getCookies();
		
		System.out.println("Size of the Cookies="+c.size());
		
		
		for(Cookie cc:c)
		{
		System.out.println(	(cc.getName())+"-----"+cc.getValue());
		}
		d.manage().deleteAllCookies();
		System.out.println("Size of the Cookies="+c.size());
	}
}
