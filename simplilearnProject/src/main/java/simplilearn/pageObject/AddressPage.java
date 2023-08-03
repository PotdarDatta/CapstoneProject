package simplilearn.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import simplilearn.AbstractComponents.AbstractComponents;

public class AddressPage extends AbstractComponents {

	public AddressPage(WebDriver driver) {
		super(driver);

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "addressLineOne")
	WebElement addressLineOne;

	@FindBy(id = "addressLineTwo")
	WebElement addressLineTwo;

	@FindBy(id = "city")
	WebElement city;

	@FindBy(id = "postalCode")
	WebElement postalCode;

	@FindBy(id = "state")
	WebElement state;

	@FindBy(id = "country")
	WebElement country;

	@FindBy(name = "_eventId_confirm")
	WebElement nextButton2;
	
	@FindBy(xpath = "//div[@class='text-center']/a")
	WebElement confirmButton;
	
	@FindBy(xpath = "//div[@class=\\\"text-center\\\"]/div/a")
	WebElement loginButton;

	public void AddressLineOne(String AddressLine1) {
		waitForWebElementToAppear(addressLineOne);
		addressLineOne.sendKeys("AddressLine1");

	}

	// addressLineTwo city postalCode state country _eventId_confirm
	public void AddressLineTwo(String AddressLine2) {

		addressLineTwo.sendKeys(AddressLine2);
	}

	public void CityName(String CityName) {

		city.sendKeys(CityName);
	}

	public void PostalCode(String postCode) {
		postalCode.sendKeys(postCode);

	}

	public void StateName(String Statename) {

		state.sendKeys(Statename);

	}

	public void countryName(String countryname) {

		country.sendKeys(countryname);

	}

	public void nextButton2() {

		nextButton2.click();
	}
   
	public void AddressDetails(String AddressLine1,String AddressLine2,String CityName,String postCode,String Statename,String countryname ) {
		addressLineOne.sendKeys(AddressLine1);
		addressLineTwo.sendKeys(AddressLine2);
		city.sendKeys(CityName);
		postalCode.sendKeys(postCode);
		state.sendKeys(Statename);
		country.sendKeys(countryname);
		confirmButton.click();
	}
	
	public LoginPage loginButton() {
		
		loginButton.click();
		
		LoginPage LoginPage = new LoginPage(driver);
		
		return LoginPage;
	}
}
