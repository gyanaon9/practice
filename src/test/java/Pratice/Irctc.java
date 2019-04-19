package Pratice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Test-out\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.irctc.co.in/nget/train-search");	
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id='loginText']")).click();
		d.getTitle();
		Set<String> wd = d.getWindowHandles();
		System.out.println(wd.size());
		Iterator<String> wdd = wd.iterator();
		String parent = wdd.next();
		System.out.println(parent);
		String child = wdd.next();
		System.out.println(child);
		d.switchTo().window(child);
		d.getTitle();
	}

}
