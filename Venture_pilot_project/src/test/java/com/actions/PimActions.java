package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.PimLocators;
import com.utility.HelperClass;

public class PimActions {
	PimLocators pimlac;
	public PimActions() {
		this.pimlac = new PimLocators();
		PageFactory.initElements(HelperClass.getDriver(), pimlac);
	}
	public void pimclick() {
		pimlac.pim.click();
	}
	
	public void addemployeecategory() throws InterruptedException {
		Thread.sleep(3000);
		pimlac.addemployee.click();
	}
	public void firstname(String firstname)
	{
		pimlac.firstname.sendKeys(firstname);
	}
	public void lastname(String lastname)
	{
		pimlac.lastname.sendKeys(lastname);
	}
	
	
	public void namedetails(String firstname, String lastname) throws InterruptedException {
		Thread.sleep(3000);
		firstname(firstname);
		lastname(lastname);
	}
	public void enable() {
		pimlac.enablebutton.click();
	}
	public void username(String username)
	{
		pimlac.username.sendKeys(username);
	}
	public void password(String password)
	{
		pimlac.password.sendKeys(password);
	}
	public void cpassword(String cpassword)
	{
		pimlac.confirmpassword.sendKeys(cpassword);
	}
	
	
	public void userdetails(String username, String password,String cpassword ) throws InterruptedException {
		Thread.sleep(3000);
		username(username);
		password(password);
		cpassword(cpassword);
	}
	public void pimsave() {
		pimlac.savebutton.click();
	}
	public String pimverify() throws InterruptedException {
		Thread.sleep(3000);
		return pimlac.verfiyuser.getText();
	}
	
}
