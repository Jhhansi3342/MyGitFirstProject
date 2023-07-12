package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class  softAssertioDem2 {
  @Test
  public void funA() 
  {
	  System.out.println("funA of  softAssertioDem2");
	  
	  String expectedData="RBG";
	  String actualData="RBG";
	  Assert.assertEquals(actualData,expectedData, "Data is not matching");
	  System.out.println("funA Done");
	  
  }
  @Test
  public void funB() 
  {
	  System.out.println("funB of  softAssertioDem2");
	  
	  String expectedData="RBG";
	  String actualData="RBG";
	  Assert.assertEquals(actualData,expectedData, "Data is matching");
	  System.out.println("funB Done");
	  
  }
}
