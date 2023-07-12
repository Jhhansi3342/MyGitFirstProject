package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitwaitDemo1 {
	@Test
	public void ImplicitwaitDemoTest(){
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement checkbox=driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		checkbox.click();
		WebElement model10element=driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_10_D']"));
		model10element.click();
		WebElement checkboxbluetooth= driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_Bluetooth_D']"));
	    checkboxbluetooth.click();
		WebElement model11element=driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_11_D']"));
		model11element.click();
	
		
		
	}

}
