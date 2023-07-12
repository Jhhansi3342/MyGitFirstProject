import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinksDemo1 {
	 @Test
	public void LinksDemoTest()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Downloads/link.html");
		 Link<WebElement >driver1.findElement(By.xpath("//a[@text='RBG technoligies']"));
		String attributevalue=Link.getAttribute("href");
		
		if(!attributevalue.equals(""))
		{
			System.out.println("link is working fine");
		}
		else
		{
			System.out.println("link is not working fine");	
		}
		
	
	}

	private void findElement(By xpath) {
		// TODO Auto-generated method stub
		
	}

}
