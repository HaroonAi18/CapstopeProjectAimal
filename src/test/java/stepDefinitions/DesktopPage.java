package stepDefinitions;



import org.junit.Assert;

import core.baseC;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectes.DesktopPageObject;

public class DesktopPage extends baseC {
		
	
	 DesktopPageObject DeskPage = new DesktopPageObject();
	
//--------------First Scenario verifying Desktop items--------------------	
	 @Given("User is on Retail website")
	    public void user_is_on_retail_website() throws Throwable {
			DeskPage.validateHomePage();
			logger.info("User successfully Landed on Test Environment");
		}
	 
	  @When("User click on Desktops tab")
	    public void user_click_on_desktops_tab() throws Throwable {
		    DeskPage.ClickOnDesktopOnNav();
		    logger.info("User is able to click on desktop link on top");
	    }
	    
	  @And("User click on Show all desktops")
	    public void user_click_on_show_all_desktops() throws Throwable {
		  	DeskPage.ClickOnShowAllDesktop();
		  	logger.info("User can easily can click on all show desktop");
	    }
	  
	  @Then("User should see all items are present in Desktop page")
	    public void user_should_see_all_items_are_present_in_desktop_page() throws Throwable {
	       	Assert.assertTrue(DeskPage.confirmAllItemArePresent());
	        logger.info("Yes, All Items are presented at Desktop Page.");
	    }
//----------------End of First Scenario--------------------------------------	 
//----------------Second scenario Adding HP LP to Cart-----------------------
	  
	  @And("User click  ADD TO CART option on ‘HP LP3065’ item")
	    public void user_click_add_to_cart_option_on_hp_lp3065_item() throws Throwable {
	        DeskPage.AddHPLPtoCart();
	        logger.info("User is able to add this item to the cart");
	    }
	  
	  @And("User select quantity 1")
	    public void user_select_quantity_1_HP() throws Throwable {
	        DeskPage.selectQuantity();
	        logger.info("User slected 1 as quantity");
	    }
	  
	  @And("User click add to Cart button")
	    public void user_click_add_to_cart_button() throws Throwable {
	        DeskPage.addToCartFinal();
	        logger.info("Verified User is able to add item to the cart for check out.");
	    }
	  
	  @Then("User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’")
	    public void user_should_see_a_message_success_you_have_added_hp_lp_3065_to_your_shopping_cart() throws Throwable {
	       	DeskPage.successMessageHPLP();
	        logger.info("User is able to see success message.");
	    }


//----------End of second scenario step definition-------------------------------
//----------Third scenario step definition adding Cannon EOS 5D to Cart----------
		  
	  @And("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	    public void user_click_add_to_cart_option_on_canon_eos_5d_item() throws Throwable {
	        DeskPage.addCanonEOS5DtoCart();
	        logger.info("Verified user added Cannon Camera to cart");
	    }
	  
	  @And("User select color from dropdown ‘Red’")
	    public void user_select_color_from_dropdown_red() throws Throwable {
	        DeskPage.selectCanonColor();
	        logger.info("Verified User selected red as desired color");
	    }
	  
	  @And("User select quantity 1 ")
	    public void user_select_quantity_1_Canon() throws Throwable {
	        DeskPage.selectCanonQty();
	        logger.info("Verified User select One Camera");
	    }
	  
	  @And("User click add to Cart button ")
	    public void user_click_add_to_cart_button_Canon() throws Throwable {
	        DeskPage.canonAddToCartBtn();
	        logger.info("Verified User selected Add to Cart Button");
	    }
	  
	  @Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	    public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() throws Throwable {
	        DeskPage.canonSuccessMessage();
	    }
//--------------End of Third Scenario step definition---------------------------
//--------------Last Scenario step Definition for adding review-----------------
    
	  @And("User click on write a review link")
	    public void user_click_on_write_a_review_link() throws Throwable {
	        DeskPage.clickOnWriteAReview();
	        logger.info("Verified User Clicked On Write A Review");
	    }
	  
	    @And("user fill the review information with below information")
	    public void user_fill_the_review_information_with_below_information() throws Throwable {
	    	DeskPage.fillReviewForm();
	    	logger.info("Verified User has Filled the Review Form");
	    	
	    }
	    
	    @And("User click on Continue Button")
	    public void user_click_on_continue_button() throws Throwable {
	        DeskPage.reviewContinueButton();
	        logger.info("Verified user clicked on Continue Button");
	    }
	    
	    @Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.")
	    public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() throws Throwable {
	        DeskPage.thankYouMessage();
	        logger.info("Success! Thank You Message is appearing");
	    }
//------------------End of Step Definitions for Desktop Features----------------------
	 
}