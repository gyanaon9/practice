package WindowHanle;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class Practice1 {

			public static void main(String[] args) {

WebDriver driver;
		        driver = new FirefoxDriver();
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

		        // Store and Print the name of the First window on the console

		        String handle= driver.getWindowHandle();

		        System.out.println(handle);

		        // Click on the Button "New Message Window"

		        driver.findElement(By.xpath("//*[@id='button1']")).click();

		        // Store and Print the name of all the windows open	              

		        Set handles = driver.getWindowHandles();

		        System.out.println(handles);

		        // Pass a window handle to the other window

		        for (String handle1 : driver.getWindowHandles()) {

		        	System.out.println(handle1);

		        	driver.switchTo().window(handle1);

		        	}

		        // Closing Pop Up window

		        driver.close();

		        // Close Original window

		        driver.quit();

		}

	}
