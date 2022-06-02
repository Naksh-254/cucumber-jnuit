package com.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import corePackage.TestUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDef extends TestUtility{
	
	

@When("user is on login page")
public void user_is_on_login_page() throws InterruptedException {
 
   
}



@Then("user entered user name")

public void user_entered_user_name() throws InterruptedException {
	
}
@Then("user entered password")
public void user_entered_password( ) {
	
	
}
@Then("user click on login button")
public void user_click_on_login_button() throws InterruptedException {
	
}
@Then("verify user is on home page")
public void verify_user_is_on_home_page() {
	String ExpectedSearcjJobTextv = var.findElement(By.xpath("//form[@id='search-jobs']/div")).getText();
	Assert.assertEquals(ExpectedSearcjJobTextv, "Search Jobs");
	
   
}
@Then("user entered {string} user name")
public void user_entered_user_name(String username) throws InterruptedException {
	Thread.sleep(3000);
	var.findElement( By.xpath("//form[@name='login-form']/div[2] /input")).sendKeys(username);
	
}
@Then("user entered {string} password")
public void user_entered_password(String password) {
	var.findElement( By.xpath("//input[@type='password']")).sendKeys(password);  
}

@Then("verify status of the login functionality {string}")
public void verify_status_of_the_login_functionality(String status) throws InterruptedException {
	Thread.sleep(3000);
 
	if(status.equals("pass")) {
		String ExpectedSearcjJobTextv = var.findElement(By.xpath("//form[@id='search-jobs']/div")).getText();
		Assert.assertEquals(ExpectedSearcjJobTextv, "Search Jobs");
		
	}
	else if(status.equals("fail")){
		boolean flag = false;
		String ExpectedInvalidErrortext = var.findElement(By.xpath("(//div[@class='login-layer']/form/div)[1]")).getText();
		if(ExpectedInvalidErrortext.equals("Invalid details. Please check the Email ID - Password combination.")) {
			flag = true;
			Assert.assertTrue("status did not match", flag);
		}
	}
		
}

}