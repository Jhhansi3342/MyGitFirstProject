package Testng;

import org.testng.annotations.Test;

public class TestNGGroupDemo1 {
	 @Test(groups="sanity")
	  public void funA() 
	 {
		  System.out.println("funA of TestcasesgroupsDemo1");
	  }
	 
	  @Test(groups="sanity")
	  public void funB()
	  {
		  System.out.println("funB of TestcasesgroupsDemo1");
	  }
	  
	  @Test(groups="regression")
	  public void funC()
	  {
		  System.out.println("funC of TestcasesgroupsDemo1");
	  }
	  
	  @Test(groups="regression")
	  public void funD()
	  {
		  System.out.println("funD of TestcasesgroupsDemo1");
	  }
	}
