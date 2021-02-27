package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.loginPage;

public class loginTests {
	 @Test
	 
	 public void testLogin() throws InterruptedException{
		 String url = "https://yazmin1234.talentlms.com/index";
		 System.setProperty("webdriver.chrome.driver","C:/WebDriver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get(url);
		 
		 String user ="yazminr";
		 String password ="123456";
		 
		 loginPage LoginPage = new loginPage(driver);
		 
		 LoginPage.doLogin(user, password);
		 
	 }
	

}
