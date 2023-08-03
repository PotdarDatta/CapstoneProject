package simplilearn.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import simplilearn.AbstractComponents.AbstractComponents;

public class LandingPage extends AbstractComponents {

	private WebDriver driver;

	public LandingPage(WebDriver driver) {
        super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath = "//a[normalize-space()='Sign Up']")
	WebElement signUpButton;
	
	
	

	public void Goto() {
		
		driver.get("http://localhost:8080/medicare/");
	}
	
	public signInPage signUpClick() {
		waitForWebElementToAppear(signUpButton);
		signUpButton.click();
		signInPage signInPage =new signInPage(driver);
		return signInPage;
		
		}
	
	

}
