package org.testleaf.leaftaps.testcases;

import org.testng.annotations.Test;
import java.io.IOException;

//import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testleaf.leaftaps.pages.CrmSfaHomePage;
import org.testleaf.leaftaps.pages.ViewLeadPage;
import org.testleaf.leaftaps.utils.ReadExcel;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC002_CreateLead  {
	
	public String excelFileName;
	
	@BeforeTest
	public void setData() {
		excelFileName = "TC002";
	}
			
	@Test(dependsOnMethods="org.testleaf.leaftaps.testcases.TC001_LoginLogout.runTC001", dataProvider="fetchData")//,alwaysRun=true))
	
	//dataProvider="fetchData", 
	public void runTC002(String CompName, String Fname, String Sname,String source, String MarktCompg, String Pnumber, String Emailid)  {	
	new CrmSfaHomePage()
	.clickLeads()
	.clickCreateLead()
	.enterCompanyname(CompName)
	.enterForename(Fname)
	.enterSurname(Sname)
	.selectSource(source)
	.selectMarketingCompaign(MarktCompg)
	.addPhoneNumber(Pnumber)
	.addEmailID(Emailid)		
	.clickSubmitButton()
	.viewLead();
	new ViewLeadPage()
	.clickEditButton();	
	}

	@DataProvider(name="fetchData")
	public Object[][] dataCentre() throws IOException {
		return ReadExcel.readData(excelFileName);
	
	}
}
