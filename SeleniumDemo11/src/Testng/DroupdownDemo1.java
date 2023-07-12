package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DroupdownDemo1 {
	@Test
  public void DroupdownDemoTest(){
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	 WebElement droupdown= driver.findElement(By.xpath("//select[@name='toMonth']"));
	 Select select= new Select(droupdown);
	 select.selectByIndex(2);
	 select.selectByVisibleText("January");
	 select.selectByValue("11");
  }
}
