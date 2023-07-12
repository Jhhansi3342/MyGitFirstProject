import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InpuboxDemo2
{

	public static void main(String[] args) 
	{

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com/");
		WebElement inputBox=driver.findElement(By.xpath("//input[@id='identifierId']"));
		boolean inputBoxDisplay=inputBox.isDisplayed();
		System.out.println(inputBoxDisplay);
		boolean expectedInputBoxDisplay=true;
		if(inputBoxDisplay==expectedInputBoxDisplay)
		{
			System.out.println("+inputbox is displaying");
		}
		else{
			System.out.println("+inputbox is not displaying");

		}
		boolean InputBoxEnabled=inputBox.isEnabled();
		System.out.println(InputBoxEnabled);
		boolean expectedInputBoxEnabled=true;
		if(InputBoxEnabled==expectedInputBoxEnabled){
			System.out.println("inputbox is Enabled");
		}
		else{
			System.out.println("+inputbox is not enabled");
		}
		String expectedWatermarkData="Email or phone";
		String actualWaterMarkData=inputBox.getAttribute("aria-label");
		System.out.println(actualWaterMarkData);
		if(actualWaterMarkData.equals(expectedWatermarkData))
		{
			System.out.println("+watermark data is displaying correctly");
		}
		else{
			System.out.println("+watermark data is not displaying correctly");

		}
		inputBox.sendKeys("RBG technologies");
		String userEnteredData=inputBox.getAttribute("value");
		System.out.println(userEnteredData);
		inputBox.clear();

	}

}
