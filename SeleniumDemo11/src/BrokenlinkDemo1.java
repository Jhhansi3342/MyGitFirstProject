import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenlinkDemo1 {
	@Test
	public void BrokenlinkTest() throws IOException
	{
	 WebDriver driver =new ChromeDriver();
	 driver.get("file:///C:/Users/Dell/Downloads/BrokenLink1.html");
	WebElement link= driver.findElement(By.xpath("//a[text()='RBG technologies']"));
	
	String attributevalue=link.getAttribute("href");
	
	URL url=new URL("https://rbgtechnologies.com/");
	
	HttpURLConnection conncet=(HttpURLConnection)url.openConnection();
	conncet.connect();
	int responsecode=conncet.getResponseCode();
	System.out.println(responsecode);
 

	}

}
