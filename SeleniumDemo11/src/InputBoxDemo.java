import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxDemo  
{

	public static void main(String[] args) 
	{

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com/");
		boolean inputBoxDisplay=driver.findElement(By.xpath("//input[@id='identifierId']")).isDisplayed();
		boolean expectedInputBoxDisplay=true;
		if(inputBoxDisplay==expectedInputBoxDisplay)
		{
			System.out.println("inputbox is displaying");
		}
		else{
			System.out.println("inputbox is not displaying");

		}
		boolean InputBoxEnabled=driver.findElement(By.xpath("//input[@id='identifierId']")).isEnabled();
		boolean expectedInputBoxEnabled=true;
		if(InputBoxEnabled==expectedInputBoxEnabled){
			System.out.println("inputbox is Enabled");
		}
		else{
			System.out.println("inputbox is not enabled");
		}
		String expectedWatermarkData="Email or phone";
		String actualWaterMarkData=driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("aria-label");
		if(actualWaterMarkData.equals(expectedWatermarkData)){
			System.out.println("watermark data is displaying correctly");
		}
		else{
			System.out.println("watermark data is not displaying correctly");

		}
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("RBG technologies");
		String userEnteredData=driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("value");
		System.out.println(userEnteredData);
		driver.findElement(By.xpath("//input[@id='identifierId']")).clear();

	}

}