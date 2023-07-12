package testngwithselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class findelementandfindelementsdemo1 {

 @Test
 public void findelementandfindelementsdemoTest1()
 {
	 WebDriver driver= new ChromeDriver();
	// WebElement driver.findElement(By.id("RBG"));
	WebElementlists=driver.findElement(By.id("RBG"));
	int elementsCount=lists.size();
	System.out.println("elementsCount :"+elementsCount);
	 System.out.println("Done");
	}
 }
.