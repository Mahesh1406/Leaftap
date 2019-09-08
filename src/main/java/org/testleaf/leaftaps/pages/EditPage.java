package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class EditPage extends ProjectSpecificMethods {
	
	public EditPage clear () {
		driver.findElementById("updateLeadForm_companyName").clear();
		return this;
	}
	
	public EditPage changeCompanyName(String CompName) {
		driver.findElementById("updateLeadForm_companyName").sendKeys(CompName);
		return this;
	}
	
	public ViewLeadPage clickUpdate () {
		driver.findElementByXPath("//input[@name='submitButton']").click();
		return new ViewLeadPage();
	}
	
	
	
	
}










