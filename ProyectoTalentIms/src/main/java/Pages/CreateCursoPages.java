package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCursoPages {
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div/div[2]/div[4]/a/div")
	WebElement btnAdministrador;
	
	@FindBy(xpath = "//*[@id=\"tl-admin-courses\"]/div/div[1]/a")
	WebElement btnCreateCurso;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/div[2]/div/div/div[1]/div")
	WebElement btnAgregarCurso;
	
	@FindBy(name = "name")
	WebElement nameField;
	
	@FindBy(xpath = "//*[@id=\"select2-drop\"]")
	WebElement categoryField;
	
	
	@FindBy(name = "description")
	WebElement descripcionField;
	
	@FindBy(name = "status")
	WebElement statusField;
	
	@FindBy(name = "course_code")
	WebElement codeField;
	
	@FindBy(name = "price")
	WebElement priceField;
	
	@FindBy(xpath = "//*[@id=\"control-group-intro-video-url\"]/div[1]/div/div/a[1]")
	WebElement youtubeField;
	
	@FindBy(name = "intro_video_url")
	WebElement videoUrlField;
	
	@FindBy(name = "time_limit")
	WebElement timeLimitField;
	
	@FindBy(xpath = "//*[@id=\"select2-drop\"]")
	WebElement certificationField;
	
	@FindBy(xpath = "//*[@id=\"select2-drop\"]")
	WebElement levelField;
	
	@FindBy(xpath = "//*[@id=\"2062075501\"]")
	WebElement submitCursoField;
	
	
	WebDriver driver;
	
public CreateCursoPages(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

public void doCreateCurso() {
	
	
	btnAdministrador.click();
	btnCreateCurso.click();
	btnAgregarCurso.click();
}
	
	
}
