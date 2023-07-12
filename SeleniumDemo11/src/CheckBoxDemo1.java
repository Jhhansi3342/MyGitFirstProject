import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo1 {


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		WebElement CheckBoxDemo1Element=driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		Boolean CheckBoxDemo1ElementDisplayed=CheckBoxDemo1Element.isDisplayed();
		if(CheckBoxDemo1ElementDisplayed==true)
		{
			System.out.println("CheckBoxDemo1 is Displayed");
		}
		else
		{
			System.out.println("CheckBoxDemo1 is not Displayed");
		}
		Boolean CheckBoxDemo1ElementEnabled=CheckBoxDemo1Element.isEnabled();
		if(CheckBoxDemo1ElementEnabled==true)
		{
			System.out.println("CheckBoxDemo1 is Enabled");
		}
		else
		{
			System.out.println("CheckBoxDemo1 is not Enabled");
		}
		Boolean CheckBoxDemo1Elementselected=CheckBoxDemo1Element.isSelected();
		if(CheckBoxDemo1ElementEnabled==true)
		{
			System.out.println("CheckBoxDemo1 is selected");
		}
		else
		{
			System.out.println("CheckBoxDemo1 is not selected");
		}
		CheckBoxDemo1Element.click();
		
	}

}
