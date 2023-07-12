import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/button/");
		WebElement buttonDemo2Element=driver.findElement(By.xpath("(//input[@type='submit'])"));
		Boolean buttonDemo2ElementDisplayed=buttonDemo2Element.isDisplayed();
		if(buttonDemo2ElementDisplayed==true)
		{
			System.out.println("buttonDemo2Element is Displayed");
		}
		else
		{
			System.out.println("buttonDemo2Element is not Displayed");
		}
		Boolean buttonDemo2ElementEnabled=buttonDemo2Element.isEnabled();
		if(buttonDemo2ElementEnabled==true)
		{
			System.out.println("buttonDemo2Element is Enabled");
		}
		else
		{
			System.out.println("buttonDemo2Element is not Enabled");
		}
		Boolean buttonDemo2ElementSelected=buttonDemo2Element.isSelected();
		if(buttonDemo2ElementSelected==true)
		{
			System.out.println("buttonDemo2Element is selected");
		}
		else
		{
			System.out.println("buttonDemo2Element is not selected");
		}
		buttonDemo2Element.click();
		
		}
		
		

	}


