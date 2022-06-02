package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import corePackage.TestUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends TestUtility{
	
	@Before
	public void initiateBrowser1() throws InterruptedException {
		TestUtility T=new TestUtility();
		T.initiateBrowser();
	}
	@After
	public void CloseBrowser(Scenario scenario) throws IOException {
		String filePath = null;
		
			System.out.println("nsvigsted to dscejjksdn");
			/*
			 * File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 * String fileName =
			 * System.getProperty("user.dir")+"\\target\\Screenshot\\test.png"; File
			 * CurrentDir = new File(fileName); System.out.println("CurrentDir"+CurrentDir);
			 * FileUtils.copyFile(file,CurrentDir);
			 */
			byte[] x = ((TakesScreenshot)var).getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(x, "image/png", "test");
			
			//scenario.attach(data, "image/png", "My screenshot");
			 
		
		//Reporter.addScreenCaptureFromPath(fileName);
		
		
	}
}
