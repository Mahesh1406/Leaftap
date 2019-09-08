package org.testleaf.leaftaps.testcases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testleaf.leaftaps.pages.EditPage;
import org.testleaf.leaftaps.utils.ReadExcel;
//import org.testleaf.leaftaps.pages.CrmSfaHomePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC003_EditLead {
	
	public String excelFileName;
	
	@BeforeTest
	public void setData() {
		excelFileName="TC003";
	}

	@Test(dependsOnMethods="org.testleaf.leaftaps.testcases.TC002_CreateLead.runTC002", dataProvider="fetchData")
	
	
	public void runTC003(String CompName) {
		new EditPage()
		.clear()
		.changeCompanyName(CompName)
		.clickUpdate()
		.getCompName();
	}
	
	@DataProvider(name="fetchData")
	public Object[][] dataCentre() throws IOException {
		return ReadExcel.readData(excelFileName);
	
	}
	
}







