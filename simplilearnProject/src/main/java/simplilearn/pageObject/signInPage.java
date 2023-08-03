package simplilearn.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import simplilearn.AbstractComponents.AbstractComponents;

public class signInPage extends AbstractComponents {

	public signInPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "firstName")
	WebElement firstName;

	@FindBy(id = "lastName")
	WebElement lastName;

	@FindBy(id = "email")
	WebElement email;

	@FindBy(id = "contactNumber")
	WebElement contactNumber;

	// password confirmPassword role1 _eventId_billing
	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "confirmPassword")
	WebElement confirmPassword;

	@FindBy(id = "role1")
	WebElement radioButton;

	@FindBy(name = "_eventId_billing")
	WebElement NextButtun1st;
	
	@FindBy(id = "role2")
	WebElement supplierButton;

	public void firstname(String firstN) {
    waitForWebElementToAppear(firstName);
		firstName.sendKeys(firstN);

	}

	public void lastName(String lastname) {

		lastName.sendKeys(lastname);

	}

	public void email(String Email) {

		email.sendKeys(Email);

	}

	public void contactNumber(String MobNumber) {

		contactNumber.sendKeys(MobNumber);

	}

	public void password(String pass) {

		password.sendKeys(pass);

	}

	public void confirmPassword(String confirmPass) {

		confirmPassword.sendKeys(confirmPass);

	}

	public void radioButton() {

		radioButton.click();

	}

	public AddressPage NextButtun1st() {

		
		NextButtun1st.click();
		AddressPage addressPage =new AddressPage(driver);
		
		return addressPage;
		

	}
	
	public void customerDetails(String firstN,String lastname,String Email,String MobNumber ) {
		
		waitForWebElementToAppear(firstName);
		firstName.sendKeys(firstN);

		lastName.sendKeys(lastname);
		email.sendKeys(Email);
		contactNumber.sendKeys(MobNumber);
	
		
	}
	
	public void supplierButton() {
		
		supplierButton.click();
		
	}
}
