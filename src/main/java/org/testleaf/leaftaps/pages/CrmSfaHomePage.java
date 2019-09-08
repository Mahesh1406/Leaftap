package org.testleaf.leaftaps.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class CrmSfaHomePage extends ProjectSpecificMethods {
	
	public CrmSfaHomePage clickLeads() {
		driver.findElementByLinkText("Leads").click();
		return this;
	}
	
	public CrmSfaHomePage clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return this;
	}
	
	public CrmSfaHomePage enterCompanyname (String compName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(compName);
		return this;
	}
	
	public CrmSfaHomePage enterForename (String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		return this;
	}
	
	public CrmSfaHomePage enterSurname (String Sname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(Sname);
		return this;
	}
	
	public CrmSfaHomePage selectSource (String source) {
		WebElement ele = driver.findElementById("createLeadForm_dataSourceId");
		Select sel = new Select(ele);
		List<WebElement> list = sel.getOptions();
		int size = list.size();
		for (int i=1; i<size; i++) {
		if (list.get(i).getText().contains(source)) {
			sel.selectByIndex(i);
		}	
		}
		return this;
		
	}
	
	public CrmSfaHomePage selectMarketingCompaign (String MarktCompg) {
		WebElement ele1 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select SC2 = new Select(ele1);
		//SC2.selectByValue(MarktComp);
		List<WebElement> options = SC2.getOptions();
		int len = options.size();
		for (int j=1; j<len; j++) {
			if (options.get(j).getText().contains(MarktCompg)) {
				SC2.selectByIndex(j);
			}	
			}
			return this;
	}
	
	public CrmSfaHomePage addPhoneNumber (String pnumber) {
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(""+pnumber+"");
		return this;
	}
	
	public CrmSfaHomePage addEmailID(String EmailID) {
		driver.findElementById("createLeadForm_primaryEmail").sendKeys(EmailID);
		return this;
	}
		
	public ViewLeadPage clickSubmitButton () {
		driver.findElementByName("submitButton").click();
		return new ViewLeadPage();
	}
	
	
/*	public void runEditLead () throws InterruptedException {
		///startApp();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("IBM");
		driver.findElementById("createLeadForm_firstName").sendKeys("Mahesh");
		driver.findElementById("createLeadForm_lastName").sendKeys("Rajagopal");
		// Using Index under Drop down
		WebElement ele = driver.findElementById("createLeadForm_dataSourceId");
		Select sel = new Select(ele);
		sel.selectByIndex(8);
		// Using Options under Drowdown
		WebElement ele1 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select SC2 = new Select(ele1);
		List<WebElement> options = SC2.getOptions();
		SC2.selectByIndex(options.size()-2);
		//Adding Phone Number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9999912345");
		//Adding Email Id
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("test@email.com");
		driver.findElementByName("submitButton").click();
		//Click Leads link
		driver.findElementByLinkText("Leads").click();
		//Click Find leads
		driver.findElementByLinkText("Find Leads").click();
		//Click email
		driver.findElementByLinkText("Email").click();
		//Enter emailId
		driver.findElementByName("emailAddress").sendKeys("test@email.com");
		//Click Find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Add Sleep 5000 ms
		Thread.sleep(3000);
		//Click on first resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		//Verify title of the page
		String title = driver.findElementByXPath("//div[@id='sectionHeaderTitle_leads']").getText();
		System.out.println(title);
		if (title.equals("View Lead")) {
			System.out.println("title is matched");
		}
		else {
			System.out.println("title is not matched");
		}
		//Click Edit
		driver.findElementByXPath("//a[text()= 'Edit']").click();	
		//Change the company name
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("TestLeaf");
		//Click Update
		driver.findElementByXPath("//input[@name='submitButton']").click();
		//Confirm the changed company name appears
		String companyname = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(companyname);
		String updatedComp = companyname.replaceAll("[^A-Za-z]", "");
		//System.out.println(updatedComp);
		if (updatedComp.equals("TestLeaf")) {
			System.out.println("updated company name is matched");	
		}
		else {
			System.out.println("updated company name is not matched");
		}
		//Close the browser (Do not log out)
	//	driver.close();
	}*/
	
}
