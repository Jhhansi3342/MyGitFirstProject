package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;

public class TestNGannotationsDemo2 {
  @Test
  public void funA() 
  {
	  System.out.println("funA of TestNGannotationsDemo2");
  }
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("afterMthod of TestNGannotationsDemo2");
  }

  @AfterClass
  public void afterClass()
  {
	  
	  System.out.println("afterclass of TestNGannotationsDemo2");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("afterTest of TestNGannotationsDemo2");
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("aftersuite of TestNGannotationsDemo2");
  }

}
