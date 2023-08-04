package simplilearn.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import simplilearn.AbstractComponents.AbstractComponents;

public class PaymentPage extends AbstractComponents {

	public PaymentPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='cardNumber']")
	WebElement cardNumer;
	
	@FindBy(xpath = "//input[@id='expityMonth']")
	WebElement expityMonth;
	
	@FindBy(xpath = "//input[@id='expityYear']")
	WebElement expityYear;
	
	@FindBy(xpath = "//input[@id='cvCode']")
	WebElement cvCode;
	
	@FindBy(xpath = "//a[@role='button']")
	WebElement payButton;
	
	@FindBy(xpath = "//a[@class='btn btn-lg btn-warning']")
	WebElement continueshoppingButton;
	
	public void cardDetail(String cardnumber,String expitymonth,String expityyear,String cvcode ) {
		cardNumer.sendKeys(cardnumber);
		expityMonth.sendKeys(expitymonth);
		expityYear.sendKeys(expityyear);
		cvCode.sendKeys(cvcode);
		payButton.click();;
		
		}
	public void continueShoopingButton() {
		waitForWebElementToClickable(continueshoppingButton);
		continueshoppingButton.click();
		
	}
	
	

}
