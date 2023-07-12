package Testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
@Test
public class GenericMethod
{	
	WebDriver driver;
	  public void  openBrowser(String browserName)
	  {
		  if(browserName.equalsIgnoreCase("chrome"))
		  {
			 driver= new ChromeDriver();
			 driver.manage().window().maximize();
		  }
		  else  if(browserName.equalsIgnoreCase("firefox"))
		  {
			  driver=new FirefoxDriver();
		  }
	  }
	 
	  public void enterURL(String url)
	  {
			driver.get(url);
	  }
		
		
		public void enterData(String locatorType, String locatorValue,String data)
		{
			WebElement element=null;
		    if(locatorType.equals("id"))
		    {
		    	element= driver.findElement(By.id(locatorValue));
		    }
		    else if(locatorType.equals("xpath"))
		    {
		    	element = driver.findElement(By.xpath(locatorValue));
		    }
		        element.sendKeys(data);
		    
		
		public void clickOnElement(String locatorType, String locatorValue)
		{
			WebElement element=null;
			
			if(locatorType.equals("id"))
			{
				 element = driver.findElement(By.id(locatorValue));
			}
			else if(locatorType.equals("xpath"))
			{
				 element = driver.findElement(By.xpath(locatorValue));
			}
			element.click();
		    
		
		}
		
	  }


		