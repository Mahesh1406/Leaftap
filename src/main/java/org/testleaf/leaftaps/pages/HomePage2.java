package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class HomePage2 extends ProjectSpecificMethods {

		public CrmSfaHomePage clickCrmSFA () {
			driver.findElementByLinkText("CRM/SFA").click();
			return new CrmSfaHomePage();
			
		}
	
	/*public LoginPage clickLogout() {
	driver.findElementByClassName("decorativeSubmit").click();
	return new LoginPage();
}*/

}










