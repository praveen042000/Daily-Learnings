package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.LeaveLocators;
import com.utility.HelperClass;

public class LeaveActions {
	
	LeaveLocators levloc;
	public LeaveActions() {
		this.levloc = new LeaveLocators();
		PageFactory.initElements(HelperClass.getDriver(), levloc);
	}
	
	public void leavetype() {
		levloc.leavetype.click();
	}
	public void configure() throws InterruptedException {
		Thread.sleep(3000);
		levloc.configure.click();
		levloc.leaveformat.click();
		Thread.sleep(3000);
		levloc.leaveadd.click();
	}
	public void setLeavename(String Leavename)throws InterruptedException {
		Thread.sleep(3000);
		levloc.leavename.sendKeys(Leavename);
		levloc.entitlement.click();
		levloc.saveclick.click();
    }
	public void saveclick() {
		levloc.saveclick.click();
	}
	public String  getverifyleave()throws InterruptedException {
		Thread.sleep(3000);
		return levloc.verifysavemessage.getText();
	}


}
