package Vanu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateT {

	public static void main(String[] args) {
		
		WebDriver d= new FirefoxDriver();
		d.get("https://www.google.com");
		d.navigate().to("https://www.facbook.com");
		
		d.navigate().back();
		d.getTitle();
		
		d.navigate().forward();
		d.getTitle();
		
		d.navigate().back();
		d.getTitle();

	}

}
