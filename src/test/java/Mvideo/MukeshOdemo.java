package Mvideo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MukeshOdemo {
	
	@Test
	public void StartApp()
	{
		Assert.assertEquals(12, 13);
		System.out.println("Start App");
	}
	//alwaysRun=true_______________________________________
	@Test(dependsOnMethods=("StartApp"),alwaysRun=true)
	public void LoginApp()
	{
		System.out.println("Login App");
	}
	@Test(dependsOnMethods="LoginApp")
	public void LogoutApp()
	{
		System.out.println("Logout App");
	}
	
}
