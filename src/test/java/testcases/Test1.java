package testcases;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import base.BaseTest;
import page_objects.InstagramLoginObjects;
import page_objects.ZohoLoginPageObjects;

public class Test1 extends BaseTest {

	@Test(retryAnalyzer = listeners.RetryAnalyzer_FailureTests.class)
	public void ZohoLoginPage() {
		d.navigate().to(prop.getProperty("testurl")); //getting prop value from config.prop
		d.manage().window().maximize();
		ZohoLoginPageObjects o1 = new ZohoLoginPageObjects(d);
		try {
			o1.signIn("rahul@gmail.com");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void InstaLoginPage() {	
		d.navigate().to(prop.getProperty("testurl2"));
		InstagramLoginObjects o1 = new InstagramLoginObjects(d);
		try {
			o1.userLogin("rahul", "12345");
		//	WebElement x = o1.userName ;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
