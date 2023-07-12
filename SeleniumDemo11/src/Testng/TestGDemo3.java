package Testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestGDemo3 {
  @Test
  public void funA() {
	  System.out.println("funA of TestGDemo3");
  }
  @Test
  public void funB() {
	  System.out.println(0/0);
  }
  @Test
  public void funC() throws Exception {
	  System.out.println("funC of TestGDemo3");
	  //throw new Exception();
	  throw new SkipException("TestNG SkipException");
  }
  @Test(enabled=false)
  public void funD() {
	  System.out.println("funD of TestGDemo3");
  }
}
