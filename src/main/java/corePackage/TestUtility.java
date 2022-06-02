package corePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUtility {
	public static WebDriver var;
	public void initiateBrowser() throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver",
				"F:\\\\Chrome Driver\\\\chromedriver.exe");
		var=new  ChromeDriver();
		var.manage().window().maximize();
		var.get("https://www.naukri.com");
		Thread.sleep(5000);
		
	
	}

	}


