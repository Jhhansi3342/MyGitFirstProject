package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LabelDemo5 {
	

	@Test
	public void LabelTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");
		WebElement label=driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span"));
		driver.switchTo().frame(0);
		//String actualText=LabelTest.getText();
		String expectedText="Saturday, 3 january 2015";
		//System.out.println(actualText);
		
		Assert.assertEquals(expectedText, expectedText,"Data is not matching" );
		//
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@name='Town']")).sendKeys("Hydrabad");
		//String actualData=driver.gettext.getAttribute("Hydradad");
		String expectedData="Hydradad";
		Assert.assertEquals(expectedText, expectedText,"Data is not matching" );
		System.out.println("actualData:"+expectedText);
		
		
	}
	}


