package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertinDemo1 {
  @Test
  public void funA()
  {
	  System.out.println("funA of HardAssertinDemo1");
	  String expectedData="RBG ";
	  String actualData="RBG";
	  Assert.assertEquals(expectedData,actualData );
	  System.out.println("funA Done");
  }


@Test
public void funB()
{
	  System.out.println("funB of HardAssertinDemo1");
	  String expectedData="RBG ";
	  String actualData="RBG Technoligies";
	  Assert.assertEquals(expectedData,actualData );
	  System.out.println("funB Done");
}

@Test
public void funC()
{
	  System.out.println("funC of HardAssertinDemo1");
	  String expectedData="RBG ";
	  String actualData="Technoligies";
	  Assert.assertNotEquals(expectedData,actualData );
	  System.out.println("funC Done");
}
@Test
public void funD()
{
	  System.out.println("funD of HardAssertinDemo1");
	  String expectedData="RBG ";
	  String actualData="Technoligies";
	  Assert.assertNotEquals(expectedData,actualData );
	  System.out.println("funD Done");
}
@Test
public void funE()
{
	  System.out.println("funE of HardAssertinDemo1");
	  Assert.assertTrue(true);
	  System.out.println("funE Done");
}
@Test
public void funF()
{
	  System.out.println("funF of HardAssertinDemo1");
	  Assert.assertFalse(false);
	  System.out.println("funF Done");
}
@Test
public void funG()
{
	  System.out.println("funG of HardAssertinDemo1");
	  Assert.assertFalse(false);
	  System.out.println("funG Done");
}
@Test
public void funH()
{
	  System.out.println("funH of HardAssertinDemo1");
	  Assert.assertTrue(true);
	  System.out.println("funH Done");
}
}


