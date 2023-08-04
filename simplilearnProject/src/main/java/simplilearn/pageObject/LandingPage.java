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

	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement loginButton;

	@FindBy(xpath = "//li[@id='listProducts']/a")
	WebElement viewProductButton;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/a[2]/span[1]")
	WebElement AddTocartButton1;

	@FindBy(xpath = "//a[@class='btn btn-success btn-block']")
	WebElement checkoutbutton;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement selectButton;
	
	@FindBy(xpath = "//a[@class='btn btn-warning']")
	WebElement backbutton;
	
	@FindBy(xpath = "//tbody/tr[2]/td[6]/a[2]/span[1]")
	WebElement addproduct;

	public void Goto() {

		driver.get("http://localhost:7171/medicare/");
	}

	public signInPage signUpClick() {
		waitForWebElementToAppear(signUpButton);
		signUpButton.click();
		signInPage signInPage = new signInPage(driver);
		return signInPage;

	}

	public LoginPage loginbutton() {
		waitForWebElementToAppear(loginButton);

		loginButton.click();
		LoginPage loginPage = new LoginPage(driver);
		return loginPage;
	}

	public void viewProductbutton() {
		waitForWebElementToClickable(viewProductButton);
		viewProductButton.click();
	}

	public void AddToCartButton1() {
		waitForWebElementToClickable(AddTocartButton1);
		AddTocartButton1.click();
	}

	public void checkoutButton() {
		waitForWebElementToClickable(checkoutbutton);
		checkoutbutton.click();
	}
	public PaymentPage selectbutton() {
    waitForWebElementToClickable(selectButton);
   
		selectButton.click();
		PaymentPage paymentPage = new PaymentPage(driver);
		return paymentPage;
	}
	public void addAnotherProduct() {
		waitForWebElementToClickable(backbutton);
		backbutton.click();
		waitForWebElementToClickable(addproduct);
		addproduct.click();
		
		
	}

}
