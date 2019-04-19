package TestNG;
import org.testng.annotations.Test;

	public class TestNg1 {
		@Test(priority=3,description="Last_Time")
		public void TestFB1()
		{
			System.out.println("FB is working as expected");
		}
		@Test(priority=2,description="S_Time")
		public void TestFB()
		{
			System.out.println("Login is working as expected");
		}
		@Test(priority=1,description="first_Time")
		public void TestFB2()
		{
			System.out.println("Logout is working as expected");
		}

	}

