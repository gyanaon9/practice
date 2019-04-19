package Mvideo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SslCertificate {
 
	@Test
	public void m() {


		// Create object of DesiredCapabilities class
		DesiredCapabilities cap=new DesiredCapabilities();

		// Set ACCEPT_SSL_CERTS  variable to true
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		


		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		  ChromeDriver d=new ChromeDriver(cap);
		  d.get("https://www.cacert.org/");
//HOW TO HANDLE UNTRUSTED SSL CERTIFICATE in browser


	}

}
