import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinksDemo2 {
	
	 @Test
		public void LinksDemoTest()
		{
			
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Dell/Downloads/link2.html");
			WebElement link driver.findElement(By.xpath("//a[@text='RBG technoligies']"));
			String attributevalue=link.getAttribute("href");
			
			if(!attributevalue.equals(""))
			{
				System.out.println("link is working fine");
			}
			else
			{
				System.out.println("link is not working fine");	
			}
			
		
		}

	}


}
