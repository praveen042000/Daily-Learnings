package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SkillLocators {
	@FindBy(xpath = "//span[text()='Admin']")
    public WebElement Admin;

    @FindBy(xpath = "(//li[@class='oxd-topbar-body-nav-tab --parent']//span)[3]")
    public WebElement qulification;
    @FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li[1]")
    public WebElement skill;
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement addskillbutton;
    @FindBy(xpath = "//div[@class='oxd-input-group__label-wrapper']//following-sibling::div//child::input[@class='oxd-input oxd-input--active']")
    public WebElement addskillname;
    @FindBy(xpath = "//textarea[contains(@class,'oxd-textarea oxd-textarea--active')]")
    public WebElement addskilldescription;
    @FindBy(xpath = "//button[contains(@class,'oxd-button oxd-button--medium')]/following-sibling::button[1]")
    public WebElement skillsavebutton;
    @FindBy(xpath ="//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	public WebElement AdSort;

}
