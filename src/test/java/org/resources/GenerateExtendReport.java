package org.resources;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import cucumber.api.Result.Type;
import cucumber.api.Scenario;



public class GenerateExtendReport {
	public static ExtentHtmlReporter htmlReport;
	public static ExtentReports report;
	public static void startReport(String location) {
          htmlReport=new ExtentHtmlReporter(location);
          htmlReport.config().setDocumentTitle("Adactin_extendreport");
          htmlReport.config().setReportName("Registration");
          htmlReport.config().setTheme(Theme.STANDARD);
          
          report=new ExtentReports();
          report.attachReporter(htmlReport);
          report.setSystemInfo("BrowserName","chrome");
          report.setSystemInfo("OS version", "83");
          report.setSystemInfo("Environment", "QA");
          report.setSystemInfo("sprint", "18");
	}
	public static void generateTest(Scenario s) {
		String scenarioName= s.getName();
		Type st = s.getStatus();
		switch(st)
		{
		case PASSED:
			 report.createTest(scenarioName).pass("Scenario_passed");
			 break;
		case FAILED:
			report.createTest(scenarioName).fail("Scenario_Failed");
			break;
		default:
			report.createTest(scenarioName).skip("Scenario_skipped");
			break;
		}
		
		}
	public static void tearDown() {
		report.flush();

	}
}
	


