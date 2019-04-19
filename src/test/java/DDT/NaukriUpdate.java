package DDT;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NaukriUpdate {

     @Test
    public void t1() throws InterruptedException {
         System.out.println("Update Naukri profile");
         
         System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.get("https://www.naukri.com/");
      //   driver.findElement(By.cssSelector("html body div div img")).sendKeys(Keys.chord(Keys.ALT, Keys.F4));
         Thread.sleep(1000);
         driver.manage().window().maximize();
       
         driver.findElement(By.xpath("//*[text()='Login']")).click();
       Set<String>a= driver.getWindowHandles();
       System.out.println(a.size());

         driver.findElement(By.xpath("//*[@name='email']")).sendKeys("Gyanaon9@gmail.com");
         driver.findElement(By.xpath("//*[@id='pLogin']")).sendKeys("grs@@@86");
         driver.findElement(By.xpath("//*[@value='Login']")).click();

         WebElement ele=driver.findElement(By.xpath("//div[text()='My Naukri']"));
         WebElement Element1=driver.findElement(By.xpath("//*[text()='Edit Profile']"));
         System.out.println("Click on MY_Nukri");
         Thread.sleep(4000);
       Actions act=new Actions(driver);
       act.moveToElement(ele).perform();
       Element1.click();
      
   
        // Perform the click operation that opens new window
    //   JavascriptExecutor js = (JavascriptExecutor) driver;
      // js.executeScript("window.scrollBy(0,1000)");


       System.out.println(a.size());

         driver.findElement(By.xpath("//span[text()='Resume Headline']/following-sibling::span")).click();
         ////span[text()='Resume Headline']/../span[2]
         //span[contains(text(),'Headline')]/../span[@class='edit icon']
         //span[text()='Resume Headline']/../span[2]
        
         
        driver.findElement(By.xpath("//a[@class='cancelLayer']/../button")).click();
      //  driver.findElement(By.xpath("//*[@class='row']/div/a/following-sibling::button[1]")).click();

         //Close the new window
       //  driver.close();


     }
}
