package Mvideo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderr {
	
  @DataProvider
 public Object[][] testData(){
	  
	  Object[][] data= new Object[2][2];
	  
	  data[0][0]="test1";
	  data[0][1]="test2";
	  data[1][0]="test3";
	  data[1][1]="test4";
	  
	  return data;
  }
  @Test(dataProvider="testData")
  public void test(String s1,String s2) {
	  
	
	
	System.out.println(s1+"________"+s2);
	WebDriver d=new FirefoxDriver();
	d.get("http://www.google.com/");
}

}