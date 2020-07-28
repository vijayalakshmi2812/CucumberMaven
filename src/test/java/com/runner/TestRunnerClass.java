package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "C:\\Users\\User\\eclipse-workspace\\CucumberMaven\\src\\test\\resources\\features\\LoginPage.feature" },
                glue = {"com.stepdefinition"},
                monochrome=true,dryRun=false,
                plugin="pretty")
public class TestRunnerClass {
	

}
