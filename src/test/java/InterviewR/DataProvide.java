package InterviewR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {

	@Test(dataProvider="Duser")
	public void m(String username,String psw) throws Throwable {


		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		d.findElement(By.xpath("//*[@id='pass']")).sendKeys(psw);
		d.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println(d.getTitle());
		d.quit();
	}
	@DataProvider(name="Duser")
	public Object[][] Dataprovider(){

		Object [][]data=new Object[2][2];

		data[0][0]="gyanaranjan.grs9@gmail.com";
		data[0][1]="868688";
		data[1][0]="abhipsamohanty91@gmail.com";
		data[1][1]="868686";
		//data[2][1]
		//data[2][2]
		return data;

	}


}
