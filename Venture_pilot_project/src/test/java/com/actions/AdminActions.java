package com.actions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.AdminLocators;
import com.utility.HelperClass;

public class AdminActions {
	AdminLocators myinfolc ;
	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(20));
	public AdminActions() {
		this.myinfolc = new AdminLocators();
		PageFactory.initElements(HelperClass.getDriver(), myinfolc);
		
	}
	public void getJob() {
		myinfolc.Job.click();
	
	}
	public void getEmployeestatus() {
		myinfolc.EmploymentStatus.click();
	}
	public void getAddButton() {
		myinfolc.AddButton.click();
	}
	public void setUserStatus(String Status) {
		myinfolc.AddEmpDetails.sendKeys(Status);
	}
	public void getSaveButton() {
		myinfolc.SaveButton.click();
	}
	public void getAssertStatus() {
		wait.until(ExpectedConditions.visibilityOf(myinfolc.AssertJob));
		Assert.assertEquals(myinfolc.AssertJob.getText(),"Employment Status");
		System.out.println("Successfully Saved");
		
		
	}
}
