package com.hooks;

import com.demo.Magento_Project.Base_Class;

import io.cucumber.java.Before;

public class Hooks extends Base_Class {

	@Before("@signIn")
	public void openBrowser() {
		Browser_launch("edge");
		Url("https://magento.softwaretestingboard.com/");
	}
}
