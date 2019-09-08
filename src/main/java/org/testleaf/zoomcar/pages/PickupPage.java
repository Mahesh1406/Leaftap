package org.testleaf.zoomcar.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testleaf.zoomcar.base.ProjectSpecificMethods;

public class PickupPage extends ProjectSpecificMethods {
	
	public PickupPage clickTomorrow() {
//		6. Specify the Start Date as tomorrow Date
		Date date = new Date();
		//System.out.println(date);
		//Get only the date (and not month, year, time etc)
		DateFormat sdf = new SimpleDateFormat("dd");		 
		// Get today's date
		String today = sdf.format(date);
		// Convert to integer and add 1 to it  18')
		int tomorrow = Integer.parseInt(today)+1;
	//	String dt = ""+tomorrow+"";
		//System.out.println(dt);
		// Print tomorrow's date
		//System.out.println("Tomorrow Date"+tomorrow);
		driver.findElementByXPath("//div[contains(text(),'"+tomorrow+"')]").click();
		return this;
	}

	public DropoffPage clickNext() {
		driver.findElementByXPath("//button[text()='Next']").click();
		return new DropoffPage();
	}
}
