package pageObjectes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.baseC;

public class HomePagePageObjects extends baseC {

	public HomePagePageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------------Locators for First Scenario Verifying currency value change------------------------
	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement textToValidate;
	
	@FindBy(xpath = "//span[contains(text(),'Currency')]")
	private WebElement currencyButton;
	
	@FindBy(xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement euroCurrencyFromDropDown;
	
	@FindBy(xpath = "//strong[contains(text(),'€')]")
	private WebElement euroSelected;
	//---------------------End of locators for first scenario---------------------------------------------
	
	//---------------------Locators for second scenario checking empty shopping cart----------------------
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement emptyingShopingCart;
	
	@FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement emptyShoppingCartMessage;
	
	//****************************************************************************************************
	//****************************************************************************************************
	
	//---------------First Scenario verifying currency methods--------------------------------------------
	public void homePageValidation()
	{
		String text = textToValidate.getText();
		if(text.equalsIgnoreCase("TEST ENVIRONMENT"))
		{
			logger.info("Verified! User is in the correct webste");
		}
		else
		{
			logger.info("Failed! User is in the wrong website");
		}
	}
	
	public void clickOnCurrencyTab()
	{
		currencyButton.click();
	}
	
	public void clickOnEuroCurrency()
	{
		euroCurrencyFromDropDown.click();
	}
	
	public void confirmingChanginCurrency()
	{
		euroSelected.getText();
	}
	
	//--------------End of Methods for first Scenario---------------------------------------------------------
	
	//--------------Second Scenario Methods checking empty cart-----------------------------------------------
	public void clickOnShoppingCart()
	{
		emptyingShopingCart.click();
	}
	
	public void sucessMessageEmptySopingCart()
	{
		emptyShoppingCartMessage.getText();
	}
	//------------End of scecond Scenario checking empty shooping cart----------------------------------------
	
	
}
