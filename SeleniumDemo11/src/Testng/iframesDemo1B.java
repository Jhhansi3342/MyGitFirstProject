package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframesDemo1B {
	@Test
	public void iframesDemo1BTest(){
		
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Downloads/Iframe1%20(1).html");
		
		driver.switchTo().frame("iframe_a");
		
		WebElement iframeAText=driver.findElement(By.xpath("//span[text()='Saturday, 31 January 2015']"));
		String iframeATextActual=iframeAText.getText();
		
		System.out.println(iframeATextActual);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iframe_b");
		
		WebElement userNameElement=driver.findElement(By.xpath("//input[@name='userName']"));
		 userNameElement.sendKeys(iframeATextActual);
		
		
	}

}
