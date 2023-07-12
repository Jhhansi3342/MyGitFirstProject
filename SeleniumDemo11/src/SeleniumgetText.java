
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumgetText {

	public static void main(String[] args) {
		System.setProperty(
				"webdriver.chrome.driver",
				 "c:\\users\\Dell\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com/");
		WebElement element=driver.findElement(By.xpath("input[name=passwd]"));
		String actualData=element.getText();
		String expectedData="to continue to Gmail";
		if(actualData.equals(expectedData)){
			System.out.println("Data is matching");
		}
		else{
			System.out.println("Data is not matching");
			
		}

	}

}
