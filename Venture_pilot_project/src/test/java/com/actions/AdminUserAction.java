package com.actions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.locators.AdminUserLocator;
import com.utility.HelperClass;

public class AdminUserAction {

		AdminUserLocator Loc;
		
		public AdminUserAction(){
			Loc = new AdminUserLocator();
			PageFactory.initElements(HelperClass.getDriver(),Loc);
		}
		
		public void setUsername(String details) {
			Loc.UmUsername.sendKeys(details); 
		}
		public void getUmSaveButton() {
			Loc.UmSaveButton.click();
		}
		public void getEnable() {
			Assert.assertEquals(Loc.UmEnable.getText(),"Enabled");
			System.out.println("Admin is Enabled");
			
		}

}
