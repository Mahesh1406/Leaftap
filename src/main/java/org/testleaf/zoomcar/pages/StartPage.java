package org.testleaf.zoomcar.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testleaf.zoomcar.base.ProjectSpecificMethods;

public class StartPage extends ProjectSpecificMethods {
	
	public StartPage clickThuraipakkam (String pickuppoint) {
		List<WebElement> pp = driver.findElementsByXPath("//div[@class='items']");
		int size = pp.size();
		//String X = "";
		for (int i=1; i<=size; i++) {
			String value = driver.findElementByXPath("//div[text()='Popular Pick-up points']/following-sibling::div["+i+"]").getText();
			if (value.contains(pickuppoint)) {
				driver.findElementByXPath("//div[text()='Popular Pick-up points']/following-sibling::div["+i+"]").click();
			}
		}
		return this;
	}

	public PickupPage clickNext() {
		driver.findElementByXPath("//button[text()='Next']").click();
		return new PickupPage();
	}
}
