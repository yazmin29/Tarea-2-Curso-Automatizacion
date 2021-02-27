package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	@FindBy(name = "login")
	WebElement userField;

	@FindBy(name = "password")
	WebElement passwordField;

	@FindBy(name = "submit")
	WebElement btnSubmitLogin;
	
	WebDriver driver;
	
	public loginPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void doLogin(String user, String password) {
		userField.sendKeys(user);
		passwordField.sendKeys(password);
		btnSubmitLogin.click();
		
	}
}
