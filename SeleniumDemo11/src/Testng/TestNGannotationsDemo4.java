package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGannotationsDemo4 {
  @Test
  public void funC()
  {
	  System.out.println("funC of TestNGannotationsDemo4");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("beforeMetod of TestNGannotationsDemo4");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("afterMethod of TestNGannotationsDemo4");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("beforeclass of TestNGannotationsDemo4");
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("afterclass of TestNGannotationsDemo4");
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("beforeTest of TestNGannotationsDemo4");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("afterTest of TestNGannotationsDemo4");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("beforeSuite of TestNGannotationsDemo4");
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("aftersuite of TestNGannotationsDemo4");
  }

}
