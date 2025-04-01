package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOut {
	
	WebDriver d;
	
	@FindBy(xpath = "(//span[@role='button'])[1]")
	private WebElement btn ;
	
	@FindBy(xpath ="(//a[normalize-space()='Sign Out'])[1]")
	private WebElement signOut;
	
	
	public WebElement getBtn() {
		return btn;
	}

	public WebElement getSignOut() {
		return signOut;
	}
	
	
	
	public SignOut(WebDriver d2) {
		this.d = d2;
		PageFactory.initElements(d, this);
	}


}
