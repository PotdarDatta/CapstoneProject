package simplilearn.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import simplilearn.pageObject.AddressPage;
import simplilearn.pageObject.LandingPage;
import simplilearn.pageObject.LoginPage;
import simplilearn.pageObject.signInPage;
import simplilearn.testsComponents.BaseTest;

public class loginValidation extends BaseTest {

	@Test
	public void userLogin() throws IOException {
            
		
		 signInPage signInPage  = LandingPage.signUpClick(); 
		 signInPage.customerDetails("Datta", "potdar", "Datta73@gmail.com", "7066401400");
		 signInPage.password("Datta@123");
		 signInPage.confirmPassword("Datta@123");
		 AddressPage AddressPage =  signInPage.NextButtun1st();
		 
		 AddressPage.AddressDetails("AdarshNagar", "sahydri colony", "Pune", "411015", "maharashtra", "India");
		 AddressPage.nextButton2();
		 LoginPage LoginPage =  AddressPage.loginButton();
		 LoginPage.userDetails("Datta73@gmail.com", "Datta@123");
		 LoginPage.submitButton();
		 
		 
		  
	}
	
	/*@Test
	public void supplierLogin() throws IOException {

		 LandingPage landingPage =  launchApplication();
		 signInPage signInPage  = landingPage.signUpClick(); 
		 signInPage.customerDetails("Datta", "potdar", "Datta73", "7066401400");
		 signInPage.password("Datta@123");
		 signInPage.confirmPassword("Datta@123");
		 signInPage.supplierButton();
		 signInPage.NextButtun1st();
		 
		
		 
	}*/
	
	
	
	
	
	

}
