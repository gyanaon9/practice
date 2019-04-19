package Mvideo;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

import Selenium.Testng;

public class TestNgFailed {
	
	public static void main(String[] args) {
		
		TestNG runner =new TestNG();
		List<String>list=new ArrayList<String>();
		list.add("D:\\WorkSpaceN\\Selenium\\test-output\\testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();
	}

}
