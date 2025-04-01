package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
	
	WebDriver dr;
	
	@FindBy(xpath="(//a[text()='Create an Account'])[1]")
	private WebElement createAccountBtn;

	@FindBy(id="firstname")
	private WebElement firstName;
	
	@FindBy(id ="lastname")
	private WebElement lastName;
	
	@FindBy(id ="email_address")
	private WebElement Email;
	
	@FindBy(id = "password")
	private  WebElement passWord;
	
	@FindBy(id="password-confirmation")
	private WebElement cPassword;
	
	@FindBy(xpath="//span[text()='Create an Account']")
	private  WebElement CreateBtn ;
	
	@FindBy(xpath="//div[contains(@class, 'message-success') and contains(@class, 'success')]")
	private  WebElement confirmMessage;
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement dashboardHeader;


	public WebElement getCreateAccountBtn() {
		return createAccountBtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getcPassword() {
		return cPassword;
	}

	public WebElement getCreateBtn() {
		return CreateBtn;
	}

	public WebElement getConfirmMessage() {
		return confirmMessage;
	}

	public WebElement getDashboardHeader() {
		return dashboardHeader;
	}
	
	public CreateAccount(WebDriver driver) {
		this.dr = driver;
		PageFactory.initElements(dr, this);
	}
}
