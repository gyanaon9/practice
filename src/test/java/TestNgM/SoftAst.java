package TestNgM;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAst {

	@Test
	public void verify()
	{
		System.out.println("Step-1");
		System.out.println("Step-2");
	//Here we Create object using  "SoftAssert"
		SoftAssert d=new SoftAssert();
		d.assertEquals(12, 13);
		System.out.println("Step-3");
		d.assertAll();
	
	}
	@Test
	public void HardAseert()
	{
		System.out.println("Step-4");
		System.out.println("Step-5");
		Assert.assertEquals("A", "B");
		System.out.println("step-6");
}
	@Test
	public void Verifyy()
	{
		System.out.println("Step-1000");
	}
}

