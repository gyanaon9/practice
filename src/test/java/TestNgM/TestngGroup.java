package TestNgM;

import org.testng.annotations.Test;

public class TestngGroup {
	
	  @Test(groups= {"A"})
	    public void f1()
	    {
	    	System.out.println("New1");
	    }
	  @Test(groups= {"c"})
	    public void f2()
	    {
	    	System.out.println("New2");
	    }
	  @Test(groups= {"A"})
	    public void f3()
	    {
	    	System.out.println("New3");
	    }
	  @Test(groups= {"c"})
	    public void f4()
	    {
	    	System.out.println("New4");
	    }

}
