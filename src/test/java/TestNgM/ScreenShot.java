package TestNgM;	


import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScreenShot {

	static WebDriver d;
	@Test
	public  void TakeScreenShotWebDriver() throws Throwable
	{

		System.setProperty("webdriver.gecko.driver", ".\\Test-out\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.facebook.com/");
		System.out.println(d.getTitle());
		ttakesScreenshot("log in or sign up");
		
	}
		
		public static void ttakesScreenshot(String filename) throws IOException
		{
		File fi=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
			//FileUtils.copyFile(fi, new File("F:\\WorkSpace\\Selenium\\src\\ScreenShot"+filename+".jpg"));
		
		}
		
		
		
		
	}


