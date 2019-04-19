package Vanu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton {
	
	@Test
	public void RadioButtonXXX() {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://jqueryui.com/checkboxradio/");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.switchTo().frame(d.findElement(By.className("demo-frame")));
		d.findElement(By.xpath("//*[@class='ui-checkboxradio-icon-space']/..")).click();;
	String className=d.findElement(By.xpath("//*[@class='widget']/fieldset/label[@for='radio-1']")).getAttribute("class");
	System.out.println(className);
	if(className.contains("ui-checkboxradio-checked ui-state-active")) {
		Assert.assertTrue(true,"Test Verift Radiobutton ic PASS");
	}
	else {
		Assert.assertTrue(false,"Test Verift Radiobutton ic PASS");
	}
		
	}

}
