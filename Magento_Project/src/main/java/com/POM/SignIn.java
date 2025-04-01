package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	
	WebDriver dd;
	
	@FindBy(xpath="(//a[normalize-space()='Sign In'])[1]")
	private WebElement signIn;
	
	
	@FindBy(id ="email")
	private WebElement userName;
	
	
	@FindBy(id ="pass")
	private WebElement passWord;
	
	
	@FindBy(xpath = "(//span[text()='Sign In'])[1]")
	private WebElement signInBtn;

	public WebElement getUserName() {
		return userName;
	}


	public WebElement getPassWord() {
		return passWord;
	}


	public WebElement getSignInBtn() {
		return signInBtn;
	}
	
	public WebElement getSignIn() {
		return signIn;
	}
	
	public SignIn(WebDriver d) {
		this.dd =d;
		PageFactory.initElements(dd, this);
	}


}
