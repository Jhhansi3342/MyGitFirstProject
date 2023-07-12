import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxloginpage {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		

	}

}
