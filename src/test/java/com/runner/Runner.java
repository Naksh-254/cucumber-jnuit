package com.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "." }, glue = { "com.stepDefinitions" }, tags = "@tag1", dryRun = false, plugin = {
		"html", "html:target/cucumber.html" })
public class Runner {

	@AfterClass
	public static void setup() {

		// Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
		// Reporter.setSystemInfo("Test User", System.getProperty("user.name"));

	Reporter.setSystemInfo("User Name", "AJ");
	Reporter.setSystemInfo("Application Name", "Test App ");
	Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
	Reporter.setSystemInfo("Environment", "Production");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");

	}
}
