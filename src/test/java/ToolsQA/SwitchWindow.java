package ToolsQA;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWindow {
	
	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		
		d.get("http://toolsqa.com/automation-practice-switch-windows/");
		d.manage().window().maximize();
		String ow=d.getWindowHandle();
		System.out.println("OriginalWindow="+ow);
		d.findElement(By.xpath("//*[@id='button1']")).click();
		
		
		
		Set<String> wd = d.getWindowHandles();
		System.out.println(wd.size());
		Iterator<String> wdd = wd.iterator();
		String parent = wdd.next();
		System.out.println(parent);
		String child = wdd.next();
		System.out.println(child);
		d.switchTo().window(child);
		String data=d.findElement(By.xpath("//div[text()='Author']")).getText();
		System.out.println(data);
		
	}

}
