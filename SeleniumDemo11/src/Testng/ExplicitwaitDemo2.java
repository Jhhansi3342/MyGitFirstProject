package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitwaitDemo2 {
	@Test
	public void ExplicitwaitDemoTest2()
	{
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
			WebElement checkbox3g=driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
			checkbox3g.click();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//	WebDriverWait wait = new WebDriverwait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ContentHolder_lbModels_10_D']")));
			
			WebElement model10element=driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_10_D']"));
			model10element.click();
		

}
}
