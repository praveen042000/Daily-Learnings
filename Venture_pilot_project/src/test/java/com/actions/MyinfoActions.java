package com.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.locators.MyinfoLocators;
//import com.locators.BillingLocators;
import com.utility.HelperClass;

public class MyinfoActions {
	MyinfoLocators bill ;
	public MyinfoActions() {
		this.bill = new MyinfoLocators();
		PageFactory.initElements(HelperClass.getDriver(), bill);
		
	}
	public void getmyinfo()  {
		bill.myinfo.click();
	}
	public void RobotClass() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
	      robot.keyPress(KeyEvent.VK_A);
	      robot.keyRelease(KeyEvent.VK_A);
	      robot.keyRelease(KeyEvent.VK_CONTROL);
	      robot.keyPress(KeyEvent.VK_BACK_SPACE);
	      robot.keyRelease(KeyEvent.VK_BACK_SPACE);
	}
	public void setFirstName(String FirstName) throws InterruptedException, AWTException {
		Thread.sleep(3000);
		bill.FirstName.click();		
		RobotClass();
		bill.FirstName.click();		
		RobotClass();
		bill.FirstName.click();		
		RobotClass();
		bill.FirstName.sendKeys(FirstName);
		
		
	}
	
	public void setLastName(String LastName) throws AWTException {
		
		bill.LasttName.click();
		RobotClass();
		bill.LasttName.sendKeys(LastName);
	}
//	public void setnickName(String nickName) throws AWTException {
//		bill.nickName.click();
//		RobotClass();
//		bill.nickName.sendKeys(nickName);
//	}
	public void setemployeeid(String employeeid) throws AWTException {
		bill.employeeid.click();
		RobotClass();
		bill.employeeid.sendKeys(employeeid);
	}
	public void setotherid(String otherid) throws AWTException {
		bill.otherid.click();
		RobotClass();
		bill.otherid.sendKeys(otherid);
	}
	public void setlicencenumber(String licencenumber) throws AWTException {
		bill.Licencenumber.click();
		RobotClass();
		bill.Licencenumber.sendKeys(licencenumber);
	
	}
	public void setExpirydate(String Expirydate) throws AWTException {
		bill.ExpiryDate.click();
		RobotClass();
		bill.ExpiryDate.sendKeys(Expirydate);
	
	}
//	public void setssnnumber(String ssnnumber) throws AWTException {
//		bill.ssnnumber.sendKeys(ssnnumber);
//		RobotClass();
//		bill.ssnnumber.sendKeys(ssnnumber);
//	
//	}
//	public void setsinnumber(String sinnumber) throws AWTException {
////		bill.ssnnumber.click();
//		RobotClass();
//		bill.ssnnumber.sendKeys(sinnumber);
//	
//	}
	public void getmysave() throws InterruptedException  {
		bill.infosave.click();	
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.infosave));	
		HelperClass.getDriver().navigate().refresh();
	}
	public void myinfoname(String FirstName, String LastName, String nickName ) throws InterruptedException, AWTException {
		
		setFirstName(FirstName);
		setLastName(LastName);
//		setnickName(nickName);
}
	public void mydetails(String employeeid,String otherid,String licencenumber,String Expirydate,String ssnnumber,String sinnumber) throws AWTException {
		setemployeeid(employeeid);
		setotherid(otherid);
		setlicencenumber(licencenumber);
		setExpirydate(Expirydate);
//		setssnnumber(ssnnumber);
//		setsinnumber(sinnumber);
	}
	public void natilityclick() throws InterruptedException {
		bill.nationality.click();
	HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.nationality));		
		bill.nationality.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
	}
	
	public void MaritalStatus() {
		bill.maritalstatus.click();
bill.maritalstatus.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	}
	public String getsucessfull() {
		String Vtext =  bill.savedsucessfully.getText();
		return Vtext;
	}
	
	
	
	 public void dateOfBirthClick(String dateOfBirth) throws AWTException {
	        bill.dateofbrith.click();
	        RobotClass();
	        bill.dateofbrith.sendKeys(dateOfBirth);
	    }
//	 public void miltaryservice(String country) throws AWTException {
//		 bill.miltaryservice.click();
//		 RobotClass();
//		 bill.miltaryservice.sendKeys(country);
//	 }
	 
	 public String myinfoverify() {
		 return bill.myinfoverify.getText();
		 
	 }
	 
	 public void mybloodgroup() {
		 bill.bloodgroup.click();
		 bill.bloodgroup.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		 bill.bloodgroupsave.click();
		 
	 }
	 public void addfile() throws InterruptedException, AWTException {
		 bill.addfile.click();
		 bill.browser.click();
		 Thread.sleep(3000);
		 Robot rb = new Robot();	
		 // copying File path to Clipboard
	    StringSelection str = new StringSelection("D:\\Downloads\\1234.pdf");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	
	    // release Contol+V for pasting,
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	 }
	 public void comment(String comment) throws InterruptedException {
		 Thread.sleep(3000);
		 bill.comment.sendKeys(comment);	
		 
	 }
	 public void addfilesave() {
		bill.filebrowsersave.click(); 
	 }
}
