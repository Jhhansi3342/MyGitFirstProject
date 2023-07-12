package Testng;

public class GenericMethodTest {
	
public void genericMethodTest(){
		
	GenericMethod key = new GenericMethod();
	  key.openBrowser("chrome");//chrome, firefox, edge,
	  key.enterURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    key.enterData("xpath", "//input[@name='username']", "Admin");
    key.enterData("name", "password", "admin123");
    key.clickOnElement("tagName", "button");
    

}
}

