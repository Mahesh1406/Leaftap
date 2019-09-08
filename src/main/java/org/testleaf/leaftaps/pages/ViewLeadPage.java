package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {

	public void viewLead() {		
		 String leadid1 = driver.findElementById("viewLead_companyName_sp").getText().replaceAll("\\D", "");
		System.out.println(leadid1);				
		return;	
}
	
	public ViewLeadPage getCompName () {
		String companyname = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(companyname);
		String updatedComp = companyname.replaceAll("[^A-Za-z]", "");
		//System.out.println(updatedComp);
		if (updatedComp.contains(companyname)) {
			System.out.println("updated company name is matched");	
		}
		else {
			System.out.println("updated company name is not matched");
		}
		
		return this;
		
	}
	
	public EditPage clickEditButton() {
		driver.findElementByXPath("//a[text()= 'Edit']").click();	
		return new EditPage();
		
	}
		
}