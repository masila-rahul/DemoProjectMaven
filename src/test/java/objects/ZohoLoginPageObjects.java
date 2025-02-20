package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ZohoLoginPageObjects {
	//initialising web driver by creating objects
	WebDriver d ;
	public ZohoLoginPageObjects(WebDriver d) {
		this.d=d;
	}
	
	//by using page object model
	By signIn = By.xpath("//a[@class='zgh-login'][normalize-space()='Sign In']");
	By userName = By.id("login_id");
	By next_button = By.id("nextbtn");
	By aseert_true = By.xpath("//div[@id='enableforgot']//span[@id='blueforgotpassword']");
	
	public void signIn(String us) throws InterruptedException {
		d.findElement(signIn).click();
		Thread.sleep(2000);
		d.findElement(userName).sendKeys(us);
		Thread.sleep(2000);
		d.findElement(next_button).click();
		Thread.sleep(2000);
		Assert.assertEquals("Forgot Password?",d.findElement(aseert_true).getText());
	}

}
