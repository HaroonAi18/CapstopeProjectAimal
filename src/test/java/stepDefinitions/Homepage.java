
package stepDefinitions;

import core.baseC;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectes.HomePagePageObjects;


public class Homepage extends baseC {
	
	HomePagePageObjects HomePage = new HomePagePageObjects();
	
	//---------------------Step Definitions for first scenario selecting euro currency-------------------------------
    @Given("User is on Retail website")
    public void user_is_on_retail_website() throws Throwable {
    	HomePage.homePageValidation();
    	logger.info("Verified user is on the test enviroment");  
    }
    
    @When("User click on Currency")
    public void user_click_on_currency() throws Throwable {
        HomePage.clickOnCurrencyTab();
        logger.info("User click  on the euro currency");
    }
	
    @And("User Chose Euro from dropdown")
    public void user_chose_euro_from_dropdown() throws Throwable {
        HomePage.clickOnEuroCurrency();
        logger.info("Verfied User click on Euro CUrrency form menu");
    }
	
    @Then("currency value should change to Euro")
    public void currency_value_should_change_to_euro() throws Throwable {
        HomePage.confirmingChanginCurrency();
        logger.info("Successfully user change currency to euro");
    }
	//-----------------------------End of first scenario-----------------------------------------------------------------
    
    
    //----------------------------Second Scenario Step Definitions checking empty cart-----------------------------------
    
    
    @When("User click on shopping cart")
    public void user_click_on_shopping_cart() throws Throwable {
        HomePage.clickOnShoppingCart();
        logger.info("User has clicked on shoping cart button.");
    }
    
    @Then("“Your shopping cart is empty!” message should display")
    public void your_shopping_cart_is_empty_message_should_display() throws Throwable {
        HomePage.sucessMessageEmptySopingCart();
        logger.info("Verified Shoping Cart is empty ");
    }
    //----------------------------End of Second Scenario---------------------------------------------------------------------
    
    
}
