package com.magento.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\lenovo\\eclipse-workspace\\Magento_Project\\src\\test\\java\\com\\magento\\feature\\Magento.feature",
					glue = {"com.magento.steps","com.hooks"}, dryRun = false)
public class Runner {

}
