import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo2A {

	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver(); 
         driver.get("https://www.calculator.net/mortgage-calculator.html");	
         WebElement checkBoxDemo2AElement = driver.findElement(By.xpath("//*[@id='caddoptional']")); 
         WebElement checkBoxDemo2ADisplayedElement =driver.findElement(By.xpath("(//span[@class='cbmark']"));
       
         Boolean checkBoxDemo2ADisplayed = checkBoxDemo2ADisplayedElement.isDisplayed();
         
       
         if (checkBoxDemo2ADisplayed==true)
        {
        	System.out.println("checkbox demo2A is   Displayed");

		}
         else
         {
         	System.out.println("checkbox demo2A is  not Displayed");

		}
         
        Boolean checkBoxDemo2AEnabled = checkBoxDemo2AElement.isEnabled();
       
        if (checkBoxDemo2ADisplayed == true) 
        {
     		System.out.println("checkbox demo2A is  Enabled");
		}
        else {
     	   System.out.println("checkbox demo2A is not Enabled");
		}
    
   Boolean checkBoxDemo2ASelected = checkBoxDemo2AElement.isSelected();
  
   if (checkBoxDemo2ASelected == true)
   {
		System.out.println("checkbox demo2A is  Selected");

	}
   else 
   {
 		System.out.println("checkbox demo2A is Not Selected");

	  }
  
   checkBoxDemo2ADisplayedElement.click();
   
   Boolean checkBoxDemo2ASelected1 = checkBoxDemo2AElement.isSelected();
   
   if (checkBoxDemo2ASelected1 == true)
   {
		System.out.println("checkbox demo2A is  Selected");

	}
   else 
   {
 		System.out.println("checkbox demo2A is Not Selected");

	  }
	}

}

