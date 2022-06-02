package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import corePackage.TestUtil;

public class LoginPage extends TestUtil{
private By primaryLoginBtn=(By.xpath("//li[@class='Login']/a"));
private By Username=( By.xpath("//form[@name='login-form']/div[2] /input"));
private By Password=( By.xpath("//input[@type='password']"));
private By loginButton=(By.xpath("(//button[contains(text(),'Login')])[1]"));
private By primaryHomePage=(By.xpath("//form[@id='search-jobs']/div"));

	public void enterUrl() throws InterruptedException{
		var.get("https://www.naukri.com");
    Thread.sleep(5000);
    }
	public void clickOnPrimaryLogin() throws InterruptedException{
		var.findElement(primaryLoginBtn).click();
		Thread.sleep(5000);
	}
	public void enterUsername() {
		var.findElement( Username).sendKeys("sreddy.beeram@gmail.com");
	}
public void enterPassword() throws InterruptedException {
	var.findElement( Password).sendKeys("Sahithi1@");
	Thread.sleep(6000);
}
public void clickOnLogin() throws InterruptedException {
	var.findElement((loginButton)).click();
	Thread.sleep(4000);
}
public void verifyUserIsOnHomepage() {
	String ExpectedSearcjJobTextv = var.findElement(primaryHomePage).getText();
	Assert.assertEquals(ExpectedSearcjJobTextv, "Search Jobs");
	
}	
   
}

