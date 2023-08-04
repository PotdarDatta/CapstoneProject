package simplilearn.tests;

import org.testng.annotations.Test;

import simplilearn.pageObject.LoginPage;
import simplilearn.pageObject.PaymentPage;
import simplilearn.testsComponents.BaseTest;

public class AddToCartScenario extends BaseTest{
	
	@Test
	public void userAddToCart () {
		
		LoginPage LoginPage =  LandingPage.loginbutton();
		
		LoginPage.userDetails("Datta21@gmail.com", "Datta@123");
		LoginPage.submitButton();
		LandingPage.viewProductbutton();
		LandingPage.AddToCartButton1();
		LandingPage.checkoutButton();
		PaymentPage PaymentPage = LandingPage.selectbutton();
		PaymentPage.cardDetail("342347633249", "12", "2030", "223");
		PaymentPage.continueShoopingButton();
		
		}
	@Test
	public void userAddMultipleToCard() {
		LoginPage LoginPage =  LandingPage.loginbutton();
		LoginPage.userDetails("Datta21@gmail.com", "Datta@123");
		LoginPage.submitButton();
		LandingPage.viewProductbutton();
		LandingPage.AddToCartButton1();
		LandingPage.addAnotherProduct();
		LandingPage.checkoutButton();
		PaymentPage PaymentPage = LandingPage.selectbutton();
		PaymentPage.cardDetail("342347633249", "12", "2030", "223");
		PaymentPage.continueShoopingButton();
		
		
	}

}
