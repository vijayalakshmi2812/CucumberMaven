package com.stepdefinition;

import org.resources.GenerateExtendReport;

import com.base.LibGlobal;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
public class Hooks extends GenerateExtendReport {
    @Before
    public void beforeScenario() {
    	startReport("C:\\Users\\User\\eclipse-workspace\\CucumberMaven\\target\\adactin_extentreport.html");
    	
    	//getDriverCloud();
		//getDriver();
        //loadUrl("http://adactinhotelapp.com/");
	}
    @After
    public void afterscenario(Scenario scenario) {
    	System.out.println("Done");
    	generateTest(scenario);
    	tearDown();
		//System.out.println("Afetr Scenarios");
        //if(sc.isFailed())
        //{
       // 	sc.embed(screenshot(), "image/png");
        //}
        
	}
}
