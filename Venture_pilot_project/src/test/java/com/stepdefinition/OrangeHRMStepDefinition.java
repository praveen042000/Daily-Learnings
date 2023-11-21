package com.stepdefinition;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.actions.AdminActions;
import com.actions.AdminUserAction;
import com.actions.MyinfoActions;
import com.actions.LoginActions;
import com.actions.OrganisationtActions;
import com.actions.SkillActions;
//import com.actions.AdminActions;
import com.actions.TimeActions;
import com.utility.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMStepDefinition  {
	 public WebDriver driver= null;
	LoginActions logact = new LoginActions(); 
	AdminActions ADac = new AdminActions();
	OrganisationtActions OrgAc = new OrganisationtActions();
	TimeActions TiAct = new TimeActions();
	MyinfoActions Bilac = new MyinfoActions();
	SkillActions skilac = new SkillActions();
	AdminUserAction Aduser = new AdminUserAction();
	

	public OrangeHRMStepDefinition() {
	}
	@Given("User is on the orangehrm.com homepage")
	public void user_is_on_the_orangehrm_com_homepage() {
	   System.out.println("1");
	   String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		HelperClass.driver.get(url);
		System.out.println("1");
	}

	@When("User enters the valid username and password")
	public void user_enters_the_valid_username_and_password() {
		System.out.println("2");
		logact.loginAccount("admin", "admin123");
		System.out.println("2");
		
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		System.out.println("3");
		logact.clickLoginButton();
//		System.out.println("3");
	}

	@Then("User sees the login successful message")
	public void user_sees_the_login_successful_message() {
		Assert.assertTrue(logact.getVerifyText().contains("Dashboard"));
		System.out.println("4");
	}

	@When("User enters the invalid username {string}")
	public void user_enters_the_invalid_username(String string) {
		System.out.println("5");
		logact.username(string);
	}

	@When("User enters the invalid password {string}")
	public void user_enters_the_invalid_password(String string) {
		System.out.println("6");
		logact.password(string);
	}

	@Then("Login is unsuccessful with error messages")
	public void login_is_unsuccessful_with_error_messages() {
		System.out.println("7");
		Assert.assertTrue(logact.getErrorText().contains("Invalid credentials"));
	}
	@When("user selects the time feature")
	public void user_selects_the_time_feature() {
		TiAct.clickTimeButton();
		System.out.println("8");
	   
	}

	@When("user selects the projectinfo category")
	public void user_selects_the_projectinfo_category() {
	   TiAct.clickProjectInfo();
	   System.out.println("9");
	}

	@When("user selects the customer option")
	public void user_selects_the_customer_option() {
	   TiAct.selectCustomer();
	   System.out.println("10");
	}

	@When("user clicks the add button")
	public void user_clicks_the_add_button() {
	    TiAct.clickaddbutton();
	    System.out.println("11");
	}

	@When("user adds the addcustomer name, description, and clicks the save button")
	public void user_adds_the_addcustomer_name_description_and_clicks_the_save_button() {
	    TiAct.AddEmployee("AAAAAAAApraveen", "Welcome");
	    TiAct.savebutton();
	    System.out.println("12");
	}

	@Then("user sees the added customer details")
	public void user_sees_the_added_customer_details() {
//		Assert.assertTrue(TiAct.getVerifydiscription().contains("welcome"));
		  Assert.assertTrue(TiAct.getverifyerror().contains("Already exists"));
		  System.out.println("13");

	}
	@When("User clicks admin feature")
	public void user_clicks_admin_feature() {
		OrgAc.getAdmin();
		System.out.println("14");
	}

	@When("user selects Organization category")
	public void user_selects_organization_category() {
		OrgAc.getOrganization();
		System.out.println("15");
	}

	@When("User selects Structure in organaization category")
	public void user_selects_structure_in_organaization_category() {
		OrgAc.getStructure();
		System.out.println("16");
	}

	@When("User enables Edit function")
	public void user_enables_edit_function() {
	    OrgAc.getEdit();
	    System.out.println("17");
	}

	@When("User clicks Add button")
	public void user_clicks_add_button() {
	   OrgAc.getAdd();
	   System.out.println("18");
	}

	@When("User enters unit identification number,name,description")
	public void user_enters_unit_identification_number_name_description() {
	    OrgAc.StructureEnter("001","praveen","IT");
	    System.out.println("19");
	}

	@When("user clicks save")
	public void user_clicks_save() {
		OrgAc.getSave();
		System.out.println("20");
	}

	@Then("User should be able to see structure added sucessfully")
	public void user_should_be_able_to_see_structure_added_sucessfully() {
//		Assert.assertEquals(OrgAc.getAssertJob(),"Employment Status");
		System.out.println("21");
	    }

	@When("user select the qualification category")
	public void user_select_the_qualification_category() {
		skilac.clickqualificationButton();
	    
	}
	@When("user select the add skills category")
	public void user_select_the_add_skills_category() {
		skilac.clickskillButton();
		skilac.clickskilladdButton();
	   
	}
	@When("user enter the skill name and typedescription cliked save button")
	public void user_enter_the_skill_name_and_typedescription_cliked_save_button() {
		skilac.addskilldetails("AAAAaaaaaAc+++", "welcome");
		skilac.clickskilladdButton();  
	}
	@Then("user is able to see the added skilled details")
	public void user_is_able_to_see_the_added_skilled_details() {
		Assert.assertEquals(skilac.getVerifyTextskill(),"Skills");
	  
	}

	@When("User selects Job")
	public void user_selects_job() {
		ADac.getJob();
	  
	}

	@When("User selects Employee Status")
	public void user_selects_employee_status() {
	   ADac.getEmployeestatus();
	}

	@When("User Clicks on Add button")
	public void user_clicks_on_add_button() {
	   ADac.getAddButton();
	}

	@When("User Enters the Employee Status")
	public void user_enters_the_employee_status() {
	    ADac.setUserStatus("Akash9");
	}

	@When("User Clicks on Save button")
	public void user_clicks_on_save_button() {
	   ADac.getSaveButton();
	}

	@Then("User Recevices Successfully Saved message")
	public void user_recevices_successfully_saved_message() {
		ADac.getAssertStatus();
	}
	@When("User the enters the username to Search")
	public void user_the_enters_the_username_to_search() {
	   Aduser.setUsername("Admin");
	}

	@When("User the Clciks the savebutton")
	public void user_the_clciks_the_savebutton() {
		Aduser.getUmSaveButton();
	}

	@Then("User is Checking the Status of user is Enabled or not")
	public void user_is_checking_the_status_of_user_is_enabled_or_not() {
	    Aduser.getEnable();
	}
	@When("user clicks the Myinfo category")
	public void user_clicks_the_myinfo_category() throws InterruptedException {
		Bilac.getmyinfo();
	    
	}

	@When("user enters the firstname, lastname, and nickname")
	public void user_enters_the_firstname_lastname_and_nickname() throws InterruptedException, AWTException {
//		Bilac.ClearInput();
	   Bilac.myinfoname("Praveen", "Kumar", "mk");
	   
	}

	@When("user enters the employeeid, otherid, Driver's License Number, License Expiry Date, SSN Number, and SIN Number")
	public void user_enters_the_employeeid_otherid_driver_s_license_number_license_expiry_date_ssn_number_and_sin_number() throws AWTException {
		Bilac.mydetails("Es6504", "007", "Dl5645", "2023-02-02", "89784", "67568");
	   
	}

	@When("user enters the select the value of Nationality, Marital Status, Date of Birth, and Gender")
	public void user_enters_the_select_the_value_of_nationality_marital_status_date_of_birth_and_gender() throws InterruptedException, AWTException {
		Bilac.natilityclick();
		Bilac.MaritalStatus();
		Bilac.dateOfBirthClick("2023-02-02");
	  
	}

	@When("user clicks the save button")
	public void user_clicks_the_save_button() throws InterruptedException {	
		Bilac.getmysave();
	}

	@When("user selects the blood group")
	public void user_selects_the_blood_group() {
	Bilac.mybloodgroup();
	}

	@When("user clicks the bloodgroup save button")
	public void user_clicks_the_bloodgroup_save_button() throws InterruptedException, AWTException {
		Bilac.mybloodgroup();
		Bilac.addfile();
		Bilac.comment("welcome");
		Bilac.addfilesave();
	  
	}

	@Then("user is able to see the edited details")
	public void user_is_able_to_see_the_edited_details() {
		String verify = Bilac.myinfoverify();
		Assert.assertTrue(verify.contains("Praveen"));
	    
	}




}
