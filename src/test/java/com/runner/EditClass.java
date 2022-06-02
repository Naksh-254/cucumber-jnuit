package com.runner;

import org.junit.Assert;
import org.openqa.selenium.By;

import corePackage.TestUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditClass extends TestUtility {
	@When("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	 var.findElement(By.xpath("//li[@class='Login']/a")).click();
	 Thread.sleep(5000);
	}



	@Then("user entered user name")

	public void user_entered_user_name() throws InterruptedException {
		var.findElement( By.xpath("//form[@name='login-form']/div[2] /input")).sendKeys("sreddy.beeram@gmail.com");
	}
	@Then("user entered password")
	public void user_entered_password( ) throws InterruptedException {
		var.findElement( By.xpath("//input[@type='password']")).sendKeys("Sahithi1@");
		Thread.sleep(5000);
		
	}
	@Then("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		var.findElement(By.xpath("//form[@id='search-jobs']/div")).click();
	}
	@Then("verify user is on home page")
	public void verify_user_is_on_home_page() {
		String ExpectedSearcjJobTextv = var.findElement(By.xpath("//form[@id='search-jobs']/div")).getText();
		Assert.assertEquals(ExpectedSearcjJobTextv, "Search Jobs");
		
	   
	}
	
	@Given("Verify user is on homepage")
	public void verify_user_is_on_homepage() throws InterruptedException {
		var.findElement((By.xpath("//form[@id='search-jobs']/div")));
		   Thread.sleep(5000);
	   
	   
	}
	@Then("user clicks on update profile")
	public void user_clicks_on_update_profile() {
		var.findElement(By.xpath("//div[@class='mb10']")).click();
	  
	}
	@Then("user clicks on update resume")
	public void user_clicks_on_update_resume() throws InterruptedException {
		var.findElement(By.xpath("//div[@class='uploadContainer']")).click();
		Thread.sleep(5000);
		    }
	@When("user clicks on keyskills")
	public void user_clicks_on_keyskills() {
		var.findElement(By.xpath("//div[@class='keySkills']/div/div/div/span[2]")).click();
	   }
	@Then("user enters the keyskills")
	public void user_enters_the_keyskills() throws InterruptedException {
		var.findElement(By.xpath("//input[@id='keySkillSugg']")).sendKeys("Dashboards");
		Thread.sleep(5000);
	    }
	@Then("user clicks on save")
	public void user_clicks_on_save() {
		var.findElement(By.xpath("//button[@id='saveKeySkills']")).click();
	   
	}
}
