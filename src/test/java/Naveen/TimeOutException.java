package Naveen;

import org.testng.annotations.Test;

public class TimeOutException {
	
	@Test(timeOut=2000)
	public void infintLoop()
	{
		int i=1;
		while(true){
			i++;
			
		
		System.out.print(i+"\t");
	}
	}
}
