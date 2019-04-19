package Naveen;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadProperties {
	static WebDriver d;
	@Test
	public void t1() throws Throwable
	{

		Properties prop=new Properties();
		FileInputStream Fi=new FileInputStream("F:\\WorkSpace\\Selenium\\src\\Naveen\\config.properties");
		prop.load(Fi);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String URL=prop.getProperty("url");
		
		String B=prop.getProperty("browser");
		if(B.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\Test-out\\IEDriverServer.exe");
               d=new ChromeDriver();
	}
	else    if(B.equals("firefox")) {
        	 d=new FirefoxDriver();

	}
		d.get(URL);
		d.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
		d.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
		d.findElement(By.xpath(prop.getProperty("cityname_xpath"))).sendKeys(prop.getProperty("city"));
	}
}
