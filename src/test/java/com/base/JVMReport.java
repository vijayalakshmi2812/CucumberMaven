package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
  public static void generateJVMReport(String jsonFile) {
	//location of JVM report store
	File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
	//configuration
	Configuration con=new Configuration(loc,"Facebook Automation");
	con.addClassifications("Browser name", "chrome");
	con.addClassifications("Browser version", "83");
	con.addClassifications("OS", "Windows 10");
	con.addClassifications("OS size", "64");
	con.addClassifications("Testing", "Regression");
	
	List <String>jsonFiles = new ArrayList<String>();
	jsonFiles.add(jsonFile);
	
	//report builder
	ReportBuilder builder=new ReportBuilder(jsonFiles,con);
	//generate
	builder.generateReports();

}
}
