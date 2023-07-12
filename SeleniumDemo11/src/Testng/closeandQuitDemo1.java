package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class closeandQuitDemo1 {
	@Test
	public void closeandQuitTest(){
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/newtours/index.php");
	driver.close();
	driver.quit();
	}
}
