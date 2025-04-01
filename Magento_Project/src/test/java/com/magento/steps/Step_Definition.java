package com.magento.steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import com.POM.CreateAccount;
import com.POM.SignIn;
import com.POM.SignOut;
import com.demo.Magento_Project.Base_Class;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Step_Definition extends Base_Class {

	public static CreateAccount ca;
	public static SignOut so;
	public static SignIn si;
	
	@Given("I am on the Magento homepage")
	public void i_am_on_the_magento_homepage() {
		Browser_launch("chrome");
		Url("https://magento.softwaretestingboard.com/");
	}
	
	@When("I click on the Create an Account link")
	public void i_click_on_the_create_an_account_link() {
	     ca = new CreateAccount(d);
	    click(ca.getCreateAccountBtn());
	}
	
	@When("I enter the following details:")
	public void i_enter_the_following_details(DataTable data) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	   List<Map<String, String>> map = data.asMaps();
	   
	   String fName = map.get(0).get("First Name");
	   String lName = map.get(0).get("Last Name");
	   String email = map.get(0).get("Email");
	   String pass = map.get(0).get("Password");
	   String cPass = map.get(0).get("Confirm Password");
	   
	   sendkeys(ca.getFirstName(),fName);
	   sendkeys(ca.getLastName(), lName);
	   sendkeys(ca.getEmail(),email);
	   sendkeys(ca.getPassWord(), pass);
	   sendkeys(ca.getcPassword(), cPass);
	}
	@When("I click on the Create an Account button")
	public void i_click_on_the_create_an_account_button() {
	  click(ca.getCreateBtn());
	}
	@Then("I should see a confirmation message Thank you for registering with Main Website Store")
	public void i_should_see_a_confirmation_message_thank_you_for_registering_with_main_website_store() {
	         boolean contains = ca.getConfirmMessage().getText().contains("Thank you for registering with Main Website Store");
	         System.out.println(contains);
	         Assert.assertTrue(contains);
	}
	@Then("I should be redirected to the My Account dashboard")
	public void i_should_be_redirected_to_the_my_account_dashboard() {	
        boolean page = ca.getDashboardHeader().getText().equals("My Account");
        System.out.println(page);
        Assert.assertTrue(page);
	}
	
	
	// signIn process
	@Given("I am click the sign out and click the sign in button")
	public void i_am_click_the_sign_out_and_click_the_sign_in_button() {
		so = new SignOut(d);
		  click(so.getBtn());  
		  click(so.getSignOut());
		  
	}

	@Given("I am click the click the sign in button")
	public void i_am_click_the_click_the_sign_in_button() {
		 si = new SignIn(d);
		click(si.getSignIn());
		
	}


	@When("I enter a valid email {string}")
	public void i_enter_a_valid_email(String username) {
		sendkeys(si.getUserName(), username);
	}

	@When("I enter a valid password {string}")
	public void i_enter_a_valid_password(String password) {
		sendkeys(si.getPassWord(), password);
	}

	@When("I click on the Sign In button")
	public void i_click_on_the_sign_in_button() {
		click(si.getSignInBtn());
	}

	
}
