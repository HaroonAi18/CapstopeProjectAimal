package stepDefinitions;

import core.baseC;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectes.LaptopsNoteBooksPageObjectss;


public class LabtopAndNoteBook extends baseC {
		
	LaptopsNoteBooksPageObjectss LabtopNoteBook = new LaptopsNoteBooksPageObjectss();
	
	//*******************************************************************************************
	//*******************************************************************************************
	
	
	//-----------First Scenario Adding/Removing From cart step Definition------------------------
	 @Given("User is on Retail website")
	    public void user_is_on_retail_website() throws Throwable {
	     //  String actualPageTitle = driver.getTitle();
	     //  String expectedTitle = "TEK SCHOOL";
	     //  Assert.assertEquals(actualPageTitle, expectedTitle);
	       logger.info("User is on test Envioment");
	    }
	 
	 @When("User click on Laptop &NoteBook tab")
	    public void user_click_on_laptop_notebook_tab() throws Throwable {
	        LabtopNoteBook.clickOnLabtopAndNoteBookNav();
	        logger.info("Verified User is able to click on Labtop and NoteBook Tab");
	    }
	 
	  @And("User click on Show all Laptop &NoteBook option")
	    public void user_click_on_show_all_laptop_notebook_option() throws Throwable {
	        LabtopNoteBook.clickOnAllLabtopAndMacBook();
	        logger.info("User clicked on All Labtopand Notebook options");
	    }
	   
	   @And("User click on MacBook  item")
	    public void user_click_on_macbook_item() throws Throwable {
	        LabtopNoteBook.clickOnMacBookItem();
	        logger.info("User clicked on MacBook item");
	    }
	   
	    @And("User click add to Cart button")
	    public void user_click_add_to_cart_button() throws Throwable {
	        LabtopNoteBook.clickOnAddtoCartButtonMacBook();
	        logger.info("User clciked to addto cart button");
	    }
	   
	    @Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	    public void user_should_see_a_message_success_you_have_added_macbook_to_your_shopping_cart() throws Throwable {
	        LabtopNoteBook.successMessageMacBook();
	        logger.info("User can see the message");
	    }
	    //--Removing--
	    @And("User should see ‘1 tem(s)-602.00’ showed to the cart")
	    public void user_should_see_1_tems60200_showed_to_the_cart() throws Throwable {
	        LabtopNoteBook.confirmingMessageOnCart();
	        logger.info("User can see 620.00 on cart. ");
	    }
	    
	    @And("User click on cart option")
	    public void user_click_on_cart_option() throws Throwable {
	        LabtopNoteBook.clickOnCartOption();
	        logger.info("User clicked on cart option");
	    }
	    
	    @And("user click on red X button to remove the item from cart")
	    public void user_click_on_red_x_button_to_remove_the_item_from_cart() throws Throwable {
	        LabtopNoteBook.xButtonOncartOption();
	        logger.info("User clicked red button to clear the cart");
	    }
	    
	    @Then("item should be removed and cart should show ‘0 item(s)’")
	    public void item_should_be_removed_and_cart_should_show_0_items() throws Throwable {
	        LabtopNoteBook.checkingEmptyCart();
	        logger.info("User cannot see anything on the cart");
	    }
	   //------------------End of First Scenario-------------------------------------------------------
	  
	    //------------------Second scenario product comparison step definitions-------------------------
	  
		  @And("User click on product comparison icon on ‘MacBook’")
		    public void user_click_on_product_comparison_icon_on_macbook() throws Throwable {
		        LabtopNoteBook.clickOnproductCompMacBook();
		        logger.info("User is clicking on macBook item");
		    }
		  @And("User click on product comparison icon on ‘MacBook Air")
		    public void user_click_on_product_comparison_icon_on_macbook_air() throws Throwable {
		        LabtopNoteBook.clickOnproductCompMacBookAir();
		        logger.info("User hit the second items to comapre");
		    }
		  @Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
		    public void user_should_see_a_message_success_you_have_added_macbook_air_to_your_product_comparison() throws Throwable {
		        LabtopNoteBook.showSuccessMessageForBoth();
		        logger.info("Both product has added to compare");
		    }
	   
		   @And("User click on Product comparison link")
		    public void user_click_on_product_comparison_link() throws Throwable {
		       	LabtopNoteBook.clickOnProductComparisonLink();
		       	logger.info("User click on product comariosn link.");
		    }
	   
		   @Then("User should see Product Comparison Chart")
		    public void user_should_see_product_comparison_chart() throws Throwable {
		       	LabtopNoteBook.showProductComparisonChart();
		       	logger.info("User can see both carts to compare");
		    }
		   	//------------------End of Step Definition for second scenario comparing two items----------------------------
		   
		   //------------------Third Scenario Adding an Item to Wish List-------------------------------------------------

			  @And("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
			    public void user_click_on_heart_icon_to_add_sony_vaio_laptop_to_wish_list() throws Throwable {
			        LabtopNoteBook.clickOnHeartIconWishList();
			        logger.info("User click on herat icon");
			    }
			  
			    @Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
			    public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() throws Throwable {
			        LabtopNoteBook.showSuccessMessageWishList();
			        logger.info("User can see the meessage.");
			    }
			  //----------------------End of Third Scenario Step Definitions adding item to wihs list-----------------------------
			  //----------------------Fourth Scenario Confirming price MacBookPro ITem ==> Step Definitions-----------------------

				  @And("User click on ‘MacBook Pro’ item")
				    public void user_click_on_macbook_pro_item() throws Throwable {
				        LabtopNoteBook.clickOnMacBookProItemPrice();
				        logger.info("User clicked on the macBooook Proc item ");
				    }
				  
				    @Then("User should see  ‘$2,000.00’ price tag is present on UI.")
				    public void user_should_see_200000_price_tag_is_present_on_ui() throws Throwable {
				        LabtopNoteBook.showRightPriceUI();
				        logger.info("Verified 200000 is presented.");
				    }
			 //----------------------End of Fourth Scenario----------------------------------------------------------------------
				  
				  		  
				  
	   
}