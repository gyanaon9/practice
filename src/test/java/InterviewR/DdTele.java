package InterviewR;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DdTele {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https:www.facebook.com/");
		
		String exeVal="Feb";
	    boolean flag = false;
	    WebElement wb=d.findElement(By.xpath("//select[@title='Month']"));
	                     
	    Select sel=new Select(wb);
	    List<WebElement>st=sel.getOptions();
	    for(int i=0;i<st.size();i++)
	    {
	    	String actVal=st.get(i).getText();
             sel.selectByVisibleText(exeVal);
            flag=true;
            break;
	    }
	    if(flag) {
	    	System.out.println(exeVal+" Pass");
	    }else {
	    	System.out.println("not");
	    
	    }
	}

}

//Assert.assertEquals("actVal, exeVal","invalid message is not verify=fail");
//System.out.println("88888");