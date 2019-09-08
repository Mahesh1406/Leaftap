package org.testleaf.leaftaps.testcases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;
//import org.testleaf.leaftaps.pages.CrmSfaHomePage;
import org.testleaf.leaftaps.pages.LoginPage;
import org.testleaf.leaftaps.utils.ReadExcel;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC001_LoginLogout extends ProjectSpecificMethods{
	
	public String excelFileName;
	
	@BeforeTest
	public void setData() {
		excelFileName="TC001";
	}
		
	@Test(dataProvider="fetchData")
	public void runTC001(String username,String password) throws InterruptedException {
		/*LoginPage page = new LoginPage();
		page.enterUsername("");
		page.enterPassword("");
		page.clickLogin();*/	
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCrmSFA();
		//Thread.sleep(3000);
		//.clickLogout();
	}
	@DataProvider(name="fetchData")
	public Object[][] dataCentre() throws IOException {
		return ReadExcel.readData(excelFileName);
	}
	
}







