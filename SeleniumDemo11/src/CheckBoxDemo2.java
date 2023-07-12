import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo2 {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver(); 
         driver.get("https://www.calculator.net/mortgage-calculator.html");	
         WebElement checkBoxDemo2Element = driver.findElement(By.xpath("//*[@id='content']/div[4]/div/table/tbody/tr[6]/td/label/span")); 
         Boolean checkBoxDemo2Diplayed = checkBoxDemo2Element.isDisplayed();
       
         if (checkBoxDemo2Diplayed==true)
        {
        	System.out.println("checkbox demo2 is Displayed");
        	
        }
        else
        {
        	System.out.println("checkbox demo2 is  not Displayed");

		}
        Boolean checkBoxDemo2Enabled= checkBoxDemo2Element.isEnabled();
        if (checkBoxDemo2Enabled == true) 
        {
     		System.out.println("checkbox demo2 is  Enabled");
		}
        else {
     	   System.out.println("checkbox demo2 is not Enabled");
		}
    
   Boolean checkBoxDemo2Selected = checkBoxDemo2Element.isSelected();
  
   if (checkBoxDemo2Selected == true)
   {
		System.out.println("checkbox demo2 is  Selected");

	}
   else 
   {
 		System.out.println("checkbox demo2 is Not Selected");

	  }
   checkBoxDemo2Element.click();
  
	}

}


