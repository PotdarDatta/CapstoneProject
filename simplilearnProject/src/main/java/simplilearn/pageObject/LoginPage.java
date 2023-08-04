package simplilearn.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import simplilearn.AbstractComponents.AbstractComponents;

public class LoginPage extends AbstractComponents {

	public LoginPage(WebDriver driver) {
		super(driver);
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id ="password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitButtun;
	
	public void userDetails(String userName,String Password) {
		waitForWebElementToAppear(username);
		username.sendKeys(userName);
		password.sendKeys(Password);
		
		
		}
	public void submitButton() {
		
		submitButtun.click();
	}
	
	

}
