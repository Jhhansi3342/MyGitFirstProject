import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo3 {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver(); 
	
         driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
         
        WebElement checkBoxDemo3Element = driver.findElement(By.xpath("(//input[@type='checkbox'[3]"));
        
        Boolean checkBoxDemo3ElementDisplayed = checkBoxDemo3Element.isDisplayed();
        if (checkBoxDemo3ElementDisplayed==true)
        {
			System.out.println("checkBox Demo3 Element is Displayed");
		}
        else 
        {
			System.out.println("checkBox Demo3 Element is not Displayed");

		}
     Boolean checkBoxDemo3ElementEnabled= checkBoxDemo3Element.isEnabled();
     if (checkBoxDemo3ElementEnabled==true) 
     
    	 {
 			System.out.println("checkBox Demo3 Element is Enabled");
 		}
         else 
         {
			System.out.println("checkBox Demo3 Element is not Enabled");
 		}
    
     Boolean checkBoxDemo3ElementSlected = checkBoxDemo3Element.isSelected();
     
     if (checkBoxDemo3ElementSlected==true) 
         
	 {
			System.out.println("checkBox Demo3 Element is Selected");
		}
     else 
     {
			System.out.println("checkBox Demo3 Element is not Selected");

			
		}
     checkBoxDemo3Element.click();
    
	}
	}



