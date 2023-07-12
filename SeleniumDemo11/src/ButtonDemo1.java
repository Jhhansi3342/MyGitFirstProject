import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo1    
{

	public static void main(String[] args)
	{
		 WebDriver driver=new ChromeDriver();
	        driver.get("http://facebook.com");	
	       WebElement loginButton = driver.findElement(By.xpath("// button[@name='login']"));
	      Boolean loginButtonDisplay= loginButton.isDisplayed();
	      if(loginButtonDisplay==true)
	      {
	    	  System.out.println("login Button is Displayed");
	    	  
	      }
	      else
	      {
	    	  System.out.println("login Buttonis not Displayed");
		}
	     Boolean loginButtonenable = loginButton.isEnabled();
	     if(loginButtonenable==true)
	     {
	    	 System.out.println("login Button is Enabled");
	    	 
	     }
	      else
	      {
	    	  System.out.println("login Buttonis not Enabled");
		}
	     
	    String actulButtonName = loginButton.getText();
	   
	    String expectedButtonName = "Log In";
	    if(actulButtonName.equals(expectedButtonName))
	    {
	    	System.out.println("expectedButtonNameis displayed");
	    }
	    else
	    {

	    	System.out.println("expectedButtonName is  not displayed");
		}
	   loginButton.click();
		}
}
