package com.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLocators {
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']//child::li[@class='oxd-topbar-body-nav-tab --parent --visited']//following-sibling::li[@class='oxd-topbar-body-nav-tab --parent'][1]")
	public WebElement Job;
	
	@FindBy(xpath = "//a[text()='Employment Status']")
	public WebElement EmploymentStatus;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement AddButton;
	
	@FindBy(xpath ="//div[@class='oxd-input-group__label-wrapper']//following-sibling::div//child::input[@class='oxd-input oxd-input--active']")
	public WebElement AddEmpDetails;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement SaveButton;
	
	@FindBy(xpath = "//h6[text()='Employment Status']")//span[@class='oxd-topbar-header-breadcrumb']
	public WebElement AssertJob;

}
