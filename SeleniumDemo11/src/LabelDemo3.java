import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LabelDemo3 {
	
	 @Test
		public void LabelTestTest() throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.meghanabus.in/index.html");
			WebElement label=driver.findElement(By.xpath("//a[@title='Manage Bookings']"));
			label.click();
			Thread.sleep(4000);
			WebElement label2=driver.findElement(By.xpath("//button[text='search']"));
			label2.click();
			String alertText=driver.switchTo().alert().getText();
			System.out.println("alertText :"+alertText);
			driver.switchTo().alert().accept();
			String lable3=driver.findElement(By.xpath("//span[text()='please enter the details for print, update, cancel and pre/postpone Ticket.'")).getText();
		    Thread.sleep(4000);
		    }
		  	
		}



}
