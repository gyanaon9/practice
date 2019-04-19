package TestNgM;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertionn {
	
	@Test
	public void test1()
	{
		System.out.println("TestCase 2 started");
		Assert.assertEquals(12, 13,"raise bug to developer");
		System.out.println("TestCase 2 completed");
	}
	@Test
	public void test2()
	{
		System.out.println("TestCase 3 started");
		Assert.assertEquals("Hello","Hello","if Word doesn't match please raise a bug");
		System.out.println("TestCase 3 completed");
	}
	@Test
	public void test3()
	{
		String str="GRS at jspur";
		Assert.assertTrue(str.contains("at"), "Names not matching");
	}
	@Test
	public void test4()
	{
		
		Assert.assertTrue(false);
	}
}
