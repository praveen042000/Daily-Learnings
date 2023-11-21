package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.SkillLocators;
import com.utility.HelperClass;

public class SkillActions {
	SkillLocators skiloc;
	public SkillActions() {
		this.skiloc = new SkillLocators();
		PageFactory.initElements(HelperClass.getDriver(), skiloc);
	}
	
	public void clickqualificationButton() {
		skiloc.qulification.click();
	}
	public void clickskillButton() {
		skiloc.skill.click();
	}
	public void clickskilladdButton() {
		skiloc.addskillbutton.click();
	}
	public void setaddskill(String addskill) {
		skiloc.addskillname.sendKeys(addskill);
	}
	public void setaddskilldescription(String addskilldescription) {
		skiloc.addskilldescription.sendKeys(addskilldescription);
	}
	
	public void clickskillsaveButton() {
		skiloc.skillsavebutton.click();
	}
	
	public void addskilldetails(String addskill, String addskilldescription) {
		setaddskill(addskill);
		setaddskilldescription(addskilldescription);
	}
	public String getVerifyTextskill() {
		return skiloc.AdSort.getText();
	}
	
}
