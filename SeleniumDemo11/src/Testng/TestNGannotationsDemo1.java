package Testng;

import org.testng.annotations.Test;

import TestNGDemo2.AfterSuite;
import TestNGDemo2.AfterTest;
import TestNGDemo2.BeforeSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestNGannotationsDemo1 {
	 @Test
	  public void funA()
	  {
		  System.out.println("funA of TestNGAnnotationsDemo1");
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  System.out.println("beforeMethod of TestNGAnnotationsDemo1");

	  }

	  @AfterMethod
	  public void afterMethod()
	  {
		  System.out.println("afterMethod of TestNGAnnotationsDemo1");

	  }

	  @BeforeClass
	  public void beforeClass()
	  {
		  System.out.println("beforeClass of TestNGAnnotationsDemo1");

	  }

	  @AfterClass
	  public void afterClass()
	  {
		  System.out.println("afterClass of TestNGAnnotationsDemo1");

	  }

	  @BeforeTest
	  public void beforeTest()
	  {
		  System.out.println("beforeTest of TestNGAnnotationsDemo1");

	  }

	  @org.testng.annotations.AfterTest
	  public void afterTest() 
	  {
		  System.out.println("afterTest of TestNGAnnotationsDemo1");

	  }

	  @BeforeSuite
	  public void beforeSuite()
	  {
		  System.out.println("beforeSuite of TestNGAnnotationsDemo1");

	  }

	  @AfterSuite
	  public void afterSuite() 
	  {
		  System.out.println("afterSuite of TestNGAnnotationsDemo1");
	  }


}
