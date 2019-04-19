package DDT;
import java.io.FileInputStream;
import java.util.List;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

	public class Capture10Link {
		@Test
		public void CaptureLinkFrom() throws Throwable {
			System.setProperty("webdriver.chrome.driver",".\\testData\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.get("https://www.indiabookstore.net/");

			List<WebElement> wbb = d.findElements(By.xpath("//*[@class='categoryBookTitle']"));
			int no = wbb.size();
			String combinedString = "";
			for (int i = 0; i < no; i++)
			{
				String AllLink = wbb.get(i).getText();

				combinedString = combinedString + AllLink + " , ";

				
			}
			String filepath ="./resource/CaptureAllLink.xlsx";
			FileInputStream fi = new FileInputStream(filepath);
			//Workbook wb=workbookfactory
}
}