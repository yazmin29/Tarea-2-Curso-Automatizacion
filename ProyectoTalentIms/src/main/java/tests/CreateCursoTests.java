package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Pages.CreateCursoPages;
import Pages.loginPage;

public class CreateCursoTests {
	@Test
	 
	 public void testCreateCurso() throws InterruptedException{
		 String url = "https://yazmin1234.talentlms.com/dashboard/welcome";
		 System.setProperty("webdriver.chrome.driver","C:/WebDriver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get(url);
		 
		 CreateCursoPages  createCursoPage= new  CreateCursoPages(driver);
		 String user ="yazminr";
		 String password ="123456";
		 
		 
		 loginPage LoginPage = new loginPage(driver);
		 
		 LoginPage.doLogin(user, password);
		 
		 createCursoPage.doCreateCurso();
		 
	}

}
