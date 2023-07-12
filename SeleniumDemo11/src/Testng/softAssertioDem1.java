package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class softAssertioDem1 {
  @Test
  public void funA() {
	  System.out.println("FunA of softAssertioDem1 ");
	  
	  softAssert sAssert=new 
	  Assert.assertEquals("RBG","RBG");
	  System.out.println("testcase1 Done");
	   

	  Assert.assertEquals("RBG","Technologies");
	  System.out.println("testcase2 Done");
	  
	  Assert.assertNotEquals("RBG","Technologies");
	  System.out.println("testcase3 Done");
	  
	  Assert.assertEquals("RBG","RBG");
	  System.out.println("testcase4 Done");
	  
	  sAssert.asserAll("RBG","Technologies");
	   

	   


}
  }

