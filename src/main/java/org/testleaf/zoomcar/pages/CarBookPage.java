package org.testleaf.zoomcar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testleaf.zoomcar.base.ProjectSpecificMethods;

public class CarBookPage extends ProjectSpecificMethods {

	public CarBookPage clickDesort () throws InterruptedException {
//		driver.findElementByXPath("//div[text()=' Price: High to Low ']").click();
		Thread.sleep(3000);		
/*		try {
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	//	WebDriverWait wait = new WebDriverWait(driver, 30);
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()=' Price: High to Low ']")));
		driver.findElementByXPath("//div[text()=' Price: High to Low ']").click();
		return this;
	}
	
	public CarBookPage getFirstCarName() {
		driver.findElementByXPath("(//button[@name='book-now'])[1]").click();
		return this;
	} 
}
