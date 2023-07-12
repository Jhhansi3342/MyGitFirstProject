package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class TestNGannotationsDemo3 {
  @Test
  public void funB()
  {
	  System.out.println("funB of TestNGannotationsDemo3");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("beforeMethod of TestNGannotationsDemo3");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("beforeclass of TestNGannotationsDemo3");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("beforeTest of TestNGannotationsDemo3");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("beforesuite of TestNGannotationsDemo3");
  }

}
