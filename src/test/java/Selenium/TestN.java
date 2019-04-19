package Selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestN
{
	@BeforeSuite
	public void Runk()
	{
		System.out.println("BS");
	}
	@BeforeTest
	public void  f()
	{
		System.out.println("BT");
	}
	@BeforeClass
	public void Samp()
	{
		System.out.println("BC0");
	}
	@BeforeClass
	public void Samp1()
	{
		System.out.println("BC1");
	}
	@BeforeMethod
	public void sample1()
	{
		System.out.println("BM");
	}
	
	@Test
	public void Aample()	
	{
		System.out.println("Test1");
	}
	@Test
	public void Bample()	
	{
		System.out.println("Test2");
	}
	@Test
	public void Cample()	
	{
		System.out.println("Test3");
	}
	
	@AfterMethod
	public void Sample2()
	{
		System.out.println("AM");
	}

	@AfterClass
	public void Sam()
	{
		System.out.println("AC");
	}
	
	@AfterSuite
	public void Run()
	{
		System.out.println("AS");
	}
	
	@AfterGroups
	public void RunkU()
	{
		System.out.println("AG");
	}
	@AfterTest
	public void mkl()
	{
		System.out.println("AT");
	}
	
	
}
