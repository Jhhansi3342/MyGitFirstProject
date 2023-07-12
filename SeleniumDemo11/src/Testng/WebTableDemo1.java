package Testng;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo1 {

	@Test
	public void WebTableDemo1Test()
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/2013/09/test.html");
		List<WebElement> rowlistCount= driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr"));
		int count=rowlistCount.size();
		System.out.println("row size is :"+rowlistCount);
		
		List<WebElement> columnslistCountList= driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td"));
		int Columncount=columnslistCountList.size();
		System.out.println("columns size is :"+Columncount);
		
		String xPath1="//[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[";
		String xPath2="]/td[";
		String xPath3="]";
		
		for(int j=1;j<Columncount;j++)
		{
			System.out.println("xpath :"+xPath1+i+xPath2+j+xPath3);
			String cellData=driver.findElement(By.xpath(xPath1+i+xPath2+j+xPath3)).getText();
			System.out.println(cellData);
		}
	}


}
