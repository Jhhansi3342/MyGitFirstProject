import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");   
        WebDriver driver=new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.get("http://gmail.com");
        

	}

}
