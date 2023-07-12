import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonDemo2 {
	@Test
	public void radiobuttonTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.findElement(By.xpath("(//input[@type='radio')[4]")).click();
		
	}

}
