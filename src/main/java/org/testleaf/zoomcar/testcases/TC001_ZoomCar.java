package org.testleaf.zoomcar.testcases;


import org.testleaf.zoomcar.base.ProjectSpecificMethods;
import org.testleaf.zoomcar.pages.HomePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TC001_ZoomCar extends ProjectSpecificMethods {
	
	@BeforeTest ()
	
	public void setData() {
		excelFileName = "TC001_ZoomCar";
	}
	
	@Test(dataProvider = "fetchData")
	
	public void runTC001(String pickuppoint) throws InterruptedException{
		new HomePage()
		.clickStart()
		.clickThuraipakkam(pickuppoint)
		.clickNext()
		.clickTomorrow()
		.clickNext()
		.clickDone()
		.clickDesort()
		.getFirstCarName();
	}
	

}
