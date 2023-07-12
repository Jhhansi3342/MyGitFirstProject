package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class orengeLoginTest {
	
	 @Test(dataProvider = "setData")
	    public void orangeLoginTest(String username, String password) throws InterruptedException 
	    {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // Replace with the actual URL of the web page
	        Thread.sleep(5000);
	        
	        WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']")); // Replace with the actual ID of the username field
	        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']")); // Replace with the actual ID of the password field


	        usernameField.sendKeys(username);
	        passwordField.sendKeys(password);

	  
	        driver.quit();
	    }

	@DataProvider
	public Object[][] setData()
	{
	    

	    Object[][] o1 = new Object[4][2];
	    
	    o1[0][0] = "Lakshmi devi";
	    o1[0][1] = "venkataramudu";
	    
	    o1[1][0] = "RBG Technologies";
	    o1[1][1] = "Selenium";
	    
	    o1[2][0] = "lakshmi devi";
	    o1[2][1] = "venkataramudu";
	    
	    o1[3][0] = "Bhargavi";
	    o1[3][1] = "jhansi";
	    
	    
	    return o1;
	}

}
