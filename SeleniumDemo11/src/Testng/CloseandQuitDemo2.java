package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseandQuitDemo2 {
	@Test
	public void CloseandQuitDemoTest() throws InterruptedException{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		WebElement element=driver.findElement(By.xpath("//a[@aria-label='Learn more about using Guest mode'"));
		element.click();
		Thread.sleep(0);
		driver.close();
		
	}

}
