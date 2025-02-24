package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InstagramLoginObjects {

	WebDriver d ;
	public InstagramLoginObjects(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d, this);
	}
	
	//using page factory model
	
	@FindBy(xpath="//input[@name='username']") public WebElement userName;
	@FindBy(xpath="//input[@name='password']") public WebElement userPassword;
	@FindBy(xpath="//button[@type='submit']") public WebElement userLogin;
	
	public void userLogin(String us, String pas) throws InterruptedException {
		Thread.sleep(2000);
		userName.sendKeys(us);
		Thread.sleep(2000);
		userPassword.sendKeys(pas);
		Thread.sleep(2000);
		Assert.assertFalse(userLogin.isEnabled(),"enabled");
	
	//	userLogin.click();
	}
}
