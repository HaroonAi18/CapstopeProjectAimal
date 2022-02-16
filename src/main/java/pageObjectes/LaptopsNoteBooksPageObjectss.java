package pageObjectes;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import core.baseC;

public class LaptopsNoteBooksPageObjectss extends baseC {
	
	
	public LaptopsNoteBooksPageObjectss()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[1]/div/div[2]/div[1]/h4/a")
	private WebElement HPLP3065;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[2]/div/div[2]/div[1]/h4/a")
	private WebElement MacBook;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[3]/div/div[2]/div[1]/h4/a")
	private WebElement MacBookAIr;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[4]/div/div[2]/div[1]/h4/a")
	private WebElement MacBookPro;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[5]/div/div[2]/div[1]/h4/a")
	private WebElement SonyVaio;
	
	//---------------Locators for Add and Remove MacBook From cart--------------------------------
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement LaptopAndNoteBookLinkNav;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement ShowAllLabtopAndNoteBookOptoin;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]")
	private WebElement clickOnMacbook;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement clcikAddtoCartMacBook;
	
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement successMessageMacBook;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartTextMacBook;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/div[1]/button[1]")
	private WebElement checkCartForMacBookButton;
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]")
	private WebElement RemoveMacBookButton;
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]")
	private WebElement checkingTextForZero;
	//-----------------------------------------------------------------------------------------------
	
	//-----------------Locators for Product Comparison-----------------------------------------------
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]/i[1]")
	private WebElement productComparisonMacBook;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[3]/i[1]")
	private WebElement productComparisonMacBookAir;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement successMessageForBothComparison;
	
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement productComparisonLink;
	
	@FindBy(xpath = "//strong[contains(text(),'Product Details')]")
	private WebElement productComparisonChart;
	//---------------------------------------------------------------------------------------------------
	
	//----------------Locators For Adding an Item to WishList-------------------------------------------
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[5]/div[1]/div[2]/div[2]/button[2]/i[1]")
	private WebElement hearIconOnSony;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement sucessMessageWishList;
	//---------------------------------------------------------------------------------------------------
	//----------------Locators for Fourth Scenario Validating the price of Mac Book----------------------
	@FindBy(xpath = "//a[contains(text(),'MacBook Pro')]")
	private WebElement MacBookProItem;
	
	@FindBy(xpath = "//h2[contains(text(),'$2,000.00')]")
	private WebElement priceTagForMacBookPro;
	
	
	//**************************************************************************************************
	//**************************************************************************************************
	
	//----------------First Scenario Adding and Removing MacBook to the Cart-----------------------------
	//--First Adding--
	public void clickOnLabtopAndNoteBookNav()
	{
		LaptopAndNoteBookLinkNav.click();
	}
	
	public void clickOnAllLabtopAndMacBook()
	{
		ShowAllLabtopAndNoteBookOptoin.click();
	}
	
	public void clickOnMacBookItem()
	{
		clickOnMacbook.click();
	}
	
	public void clickOnAddtoCartButtonMacBook()
	{
		clcikAddtoCartMacBook.click();
	}
	
	public void successMessageMacBook()
	{
		successMessageMacBook.isDisplayed();
		successMessageMacBook.getText();
	}
	//--Removing--
	public void confirmingMessageOnCart()
	{
		cartTextMacBook.isDisplayed();
	}
	
	public void clickOnCartOption()
	{
		checkCartForMacBookButton.click();
	}
	
	public void xButtonOncartOption()
	{
		RemoveMacBookButton.click();
	}
	
	public void checkingEmptyCart()
	{
		checkingTextForZero.isDisplayed();
	}
	//-----------End of Scenario----------------------------------------------------------------------
	//-----------Second Scenario product comparison---------------------------------------------------
	public void clickOnproductCompMacBook()
	{
		productComparisonMacBook.click();
	}
	
	public void clickOnproductCompMacBookAir()
	{
		productComparisonMacBookAir.click();
	}
	
	public void showSuccessMessageForBoth()
	{
		successMessageForBothComparison.isDisplayed();
		successMessageForBothComparison.getText();
	}
	
	public void clickOnProductComparisonLink()
	{
		productComparisonLink.click();
	}
	
	public void showProductComparisonChart()
	{
		productComparisonChart.isDisplayed();
	}
	
	//-------------End of Second scenario-----------------------------------------------------------
	//-------------Third Scenario Adding an Item to wish List---------------------------------------
	
	public void clickOnHeartIconWishList()
	{
		hearIconOnSony.click();
	}
	
	public void showSuccessMessageWishList()
	{
		sucessMessageWishList.click();
	}
	//--------------End of third Scenario Adding Item to Wish list0----------------------------------
	//--------------Fourth Scenario Validating Mac Book Pro price------------------------------------
	
	public void clickOnMacBookProItemPrice()
	{
		MacBookProItem.click();
	}
	
	public void showRightPriceUI()
	{
		priceTagForMacBookPro.isDisplayed();
		priceTagForMacBookPro.getText();
	}
	//----------------End of Last Scenario for Labtop and NoteBook Features---------------------------
	
	
	
	
	
	
	
	
	
}
