package stepDefinitions;

import core.baseC;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectes.RetailPageFeatureObjects;


public class RetailPage extends baseC {
		
	RetailPageFeatureObjects RetailLogin = new RetailPageFeatureObjects();
	
	//----------------Beginning of Step Definitions Background Informations-----------------------------------
    @Given("User is on Retail website")
    public void user_is_on_retail_website() throws Throwable {
        RetailLogin.validateMainPage();
        logger.info("Home Page Verified");
    }
	
    @And("User click  on MyAccount")
    public void user_click_on_myaccount() throws Throwable {
        RetailLogin.clickOnMyAccount();
        logger.info("User has clikcked on my Accoutn");
    }
    
    @When("User click on Login")
    public void user_click_on_login() throws Throwable {
        RetailLogin.clickOnLogInRetailFeatureFirstLogin();
        logger.info("User lgoin to singin page");
    }
	
    @And("User enter username ‘userName’ and password 'password’")
    public void user_enter_username_username_and_password_password() throws Throwable {
        RetailLogin.enterUsername();
        RetailLogin.enterPassword();
        logger.info("User successfully entered both usernaem and pjasword. ");
    }
    
    @And("User click on Login button")
    public void user_click_on_login_button() throws Throwable {
        RetailLogin.clickLogInButton();
        logger.info("User can hit the login Buttton");
    }
    
    @Then("User should be logged in to MyAccount dashboard")
    public void user_should_be_logged_in_to_myaccount_dashboard() throws Throwable {
        
    }
    //-----------------End of Step Definitions for First Scenario----------------------------
    
    
    //-----------------Second Scenario register for an affliate account---------------------
    @When("User click on ‘Register for an Affiliate Account’ link")
    public void user_click_on_register_for_an_affiliate_account_link() throws Throwable {
        RetailLogin.clickOnRegisterAffliateAccount();
        logger.info("User clicke on here");
        
    }
    
    @And("User fill affiliate form with below information")
    public void user_fill_affiliate_form_with_below_information() throws Throwable {
        RetailLogin.fileBoxesForAffliateAccountInfo();
        logger.info("User has succesfully enter company name, website, tax ID, payment method and agreeed wiht us");
    }
    
    @And("User check on About us check box")
    public void user_check_on_about_us_check_box() throws Throwable {
        RetailLogin.clickOnAboutUsCheckBox();
        logger.info("User check about us box");
    }
    
    @And("User click on Continue button")
    public void user_click_on_continue_button() throws Throwable {
    	RetailLogin.clcikContinueButton();
    	logger.info("User successfully hit continue button");
    }
    
    @Then("User should see a success message")
    public void user_should_see_a_success_message() throws Throwable {
        RetailLogin.showSuccessMessageAffliateUser();
        logger.info("Verified message user sees the meessage");
    }
    //--------------------End of step Definitions for second Scenario----------------------------
    
    
    //--------------------Third Scenario Edit payment information--------------------------------
    @When("User click on ‘Edit your affiliate informationlink")
    public void user_click_on_edit_your_affiliate_informationlink() throws Throwable {
        RetailLogin.clickOnYourAffliatedInformationLink();
        logger.info("User clicked on edit your affliated inromation");
    }
    
    @And("user click on Bank Transfer radio button")
    public void user_click_on_bank_transfer_radio_button() throws Throwable {
        RetailLogin.clickOnBankTransferRadioBUtton();
        logger.info("Verified user click on bank transfer radio burron");
    }
    
    @And("User fill Bank information with below information")
    public void user_fill_bank_information_with_below_information() throws Throwable {
        RetailLogin.fileBankInformationBoxesThirdScenario();
        logger.info("Verified User SUcessfully filled bank informaltino");
    }
    
    @And("User click on Continue button ")
    public void user_click_on_continue_button_thirdScenario() throws Throwable {
        RetailLogin.clcikContinueThirdScenario();
        logger.info("Verified user coninture with inforanntion");
    }
    
    @Then("User should see a success message")
    public void user_should_see_a_success_message_ThirdScenario() throws Throwable {
        RetailLogin.showSuccessMessageThirdScenario();
        logger.info("Verified Uaer can see the message.");
    }
    //-------------------End of THrid Schenario Eding paument informatino affliated regierse-------------------
    
    @When("User click on ‘Edit your account information’ link")
    public void user_click_on_edit_your_account_information_link() throws Throwable {
        RetailLogin.clickEditMyAccountLink();
        logger.info("User click on Edit your account informatino link. ");
    }
    
    @And("User modify below information first naem last name email telephoen")
    public void user_modify_below_information() throws Throwable {
        RetailLogin.modifyInformationBoxes();
        logger.info("Verified user modified fisrt name last name email and telephoen. ");
    }
    
    @And("User click on continue button")
    public void user_click_on_continue_button_Fourth_Scenario() throws Throwable {
        RetailLogin.clickContinueBUttonFourhtScenario();
        logger.info("Verified user successfully hit continue button. ");
    }
    
    @Then("User should see a message ‘Success: Your account has been successfully updated.’")
    public void user_should_see_a_message_success_your_account_has_been_successfully_updated() throws Throwable {
        RetailLogin.showSucessMessageFourthScenario();
        logger.info("Verified the account information has sucessfully updated. ");
    }
    //-----------------------End of Fourth Scenario modifying account information-------------------------------
    
    

}
