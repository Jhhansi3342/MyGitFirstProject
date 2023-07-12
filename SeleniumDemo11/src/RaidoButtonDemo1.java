import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RaidoButtonDemo1
{

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		 
         driver.get("https://demo.guru99.com/test/newtours/reservation.php");
         WebElement radioButtonDemo1 = driver.findElement(By.xpath("//input[@type='radio'and@value='oneway']"));
  
         Boolean radioButtonDemo1Displayed = radioButtonDemo1.isDisplayed();
   if (radioButtonDemo1Displayed==true) 
   {
   System.out.println("oneway radioButton Demo1 is Displayed ");	
}
   else {
	   System.out.println("oneway radioButton Demo1 is not Displayed ");	

}
   Boolean radioButtonDemo1Enabled = radioButtonDemo1.isEnabled();
   if (radioButtonDemo1Enabled==true) 
   {
   System.out.println("oneway radioButton Demo1 is Enabled ");	
}
   else {
	   System.out.println("oneway radioButton Demo1 is not Enabled ");	

}
   Boolean radioButtonDemo1Selected= radioButtonDemo1.isSelected();
   if (radioButtonDemo1Selected==true) 
   {
   System.out.println("oneway radioButton Demo1 is Selected ");	
}
   else {
	   System.out.println("oneway radioButton Demo1 is not Selected ");	

}
   radioButtonDemo1.click();
   
   Boolean radioButtonDemo1selected = radioButtonDemo1.isSelected();

   if (radioButtonDemo1selected == true) 
   {
   System.out.println("oneway radioButton Demo1 is Selected");	
}
   else 
   {
	   System.out.println("oneway radioButton Demo1 is not Selected");	

}
}
}
