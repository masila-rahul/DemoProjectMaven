package com.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Image {

	
	static WebDriver d;
public static void main(String[] args) {
	
	 WebElement image = d.findElement(By.xpath("//img[contains(@class, 'product-image')]"));

	 // Get the image size before hover
	     Dimension beforeSize = image.getSize();
	     
	     System.out.println("Before Hover - Width: " + beforeSize.getWidth() + ", Height: " + beforeSize.getHeight());

	     // Perform hover action using Actions class
	     Actions actions = new Actions(d);
	     actions.moveToElement(image).pause(Duration.ofSeconds(2)).perform(); // Hover and wait for zoom effect

	     // Get the image size after hover
	     Dimension afterSize = image.getSize();
	     System.out.println("After Hover - Width: " + afterSize.getWidth() + ", Height: " + afterSize.getHeight());

	     // Validate zoom effect
	     if (afterSize.getWidth() > beforeSize.getWidth() && afterSize.getHeight() > beforeSize.getHeight()) {
	         System.out.println("✅ Image zoom functionality is working!");
	     } else {
	         System.out.println("❌ Image zoom is NOT working.");
	     }
    
	     
	  // Get the CSS 'transform' property before hover
	     String beforeTransform = image.getCssValue("transform");
	     System.out.println("Before Hover Transform: " + beforeTransform);

	     // Perform hover
	     actions.moveToElement(image).pause(Duration.ofSeconds(2)).perform();
	     

	     // Get the CSS 'transform' property after hover
	     String afterTransform = image.getCssValue("transform");
	     System.out.println("After Hover Transform: " + afterTransform);

	     // Validate zoom effect
	     if (!beforeTransform.equals(afterTransform)) {
	         System.out.println("✅ Zoom effect is working!");
	     } else {
	         System.out.println("❌ No zoom effect detected.");
	     }
}
}
