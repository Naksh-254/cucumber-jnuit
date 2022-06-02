package pages;

import org.openqa.selenium.By;

import corePackage.TestUtil;

public class EditProfilePage extends TestUtil {
	private By editProfile=(By.xpath("//a[@title='Edit Profile']"));
	private By resumepdate=(By.xpath("//input[@id='attachCV']"));
 
	public void userIsOnHomepage() {
		
	}
	public void user_clik_on_edit_profiles() throws InterruptedException {
		var.findElement(editProfile).click();		
	    Thread.sleep(4000);
	}
	public void user_clik_on_a_resumeupdate() throws InterruptedException {
		var.findElement(resumepdate).sendKeys("G:\\Resumes related\\resume.docx");
		Thread.sleep(5000);
}
}
