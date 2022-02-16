package pageObjectes;



import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




import core.baseC;

public class DesktopPageObject extends baseC {
	
	
	
	public DesktopPageObject()
	{
		PageFactory.initElements(driver, this);
	}
	
	//scrolling.
	JavascriptExecutor js = (JavascriptExecutor) driver;
	

	
	//--------------Page Links Header---------------------------
	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement HomePageTextValidating;
	
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement DesktopLink;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktop;
	
	@FindBy(tagName = "a")
	private List <WebElement> deskTopUIElementWithAtag;
	
	@FindBy(xpath = "//div[contains(text(),'Showing 1 to 12 of 12 (1 Pages)')]")
	private WebElement showingAllItemsText;
	
	@FindBy(id = "list-view")
	private WebElement ListView;
	
	@FindBy(id = "grid-view")
	private WebElement GridView;
	
	//------------Refine Search Elements------------------------
	@FindBy(xpath = "//*[@id=\'content\']/div[2]/div/ul/li[1]/a")
	private WebElement PCsearchRefine;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[2]/div/ul/li[2]/a")
	private WebElement MACsearchRefine;
	
	//----------------------Body----------------------------------
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[1]/div/div[2]/div[1]/h4/a")
	private WebElement AppleCinema;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[2]/div/div[2]/div[1]/h4/a")
	private WebElement CanonEOSD;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[3]/div/div[2]/div[1]/h4/a")
	private WebElement HpLp;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[4]/div/div[2]/div[1]/h4/a")
	private WebElement HTCTouchHD;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[5]/div/div[2]/div[1]/h4/a")
	private WebElement iphone;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[6]/div/div[2]/div[1]/h4/a")
	private WebElement ipod;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[7]/div/div[2]/div[1]/h4/a")
	private WebElement Macbook;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[8]/div/div[2]/div[1]/h4/a")
	private WebElement MacbookAir;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[9]/div/div[2]/div[1]/h4/a")
	private WebElement PalmTreoPro;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[10]/div/div[2]/div[1]/h4/a")
	private WebElement Product8;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[11]/div/div[2]/div[1]/h4/a")
	private WebElement SamsungSyncMaster;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[12]/div/div[2]/div[1]/h4/a")
	private WebElement sonyVaio;
	
	//---------------Adding HP LP3065 to the cart Web Elements locators---------
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement AddHPLP3065toCart;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement HPQtyBox;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement HPAddtoCartFinal;
	
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement successMessageHPLaptop;
	
	
	//---------------Adding Cannon EOS 5D to Cart Scenario------------------------
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement AddCannonEOSToCart;
	
	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement colorDropDown;
	
	@FindBy(xpath = "//option[contains(text(),'Red')]")
	private WebElement redCanon;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement CannonQty;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButn;
	
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement successMessageCanon;
	
	
	//--------------------Review to Cannon Camera---------------------
	@FindBy(xpath = "//a[contains(text(),'Write a review')]")
	private WebElement WriteAReview;
	
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement InputNameReview;
	
	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement writeReviewBox;
	
	@FindBy(xpath = "//*[@id=\'form-review\']/div[4]/div/label")
	private WebElement ratingHeader;
	
	@FindBy(xpath = "//*[@id=\'form-review\']/div[4]/div/input[1]")
	private WebElement rating1;
	
	@FindBy(xpath = "//*[@id=\'form-review\']/div[4]/div/input[2]")
	private WebElement rating2;
	
	@FindBy(xpath = "//*[@id=\'form-review\']/div[4]/div/input[3]")
	private WebElement rating3;
	
	@FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[4]")
	private WebElement rating4;
	
	@FindBy(xpath = "//*[@id=\'form-review\']/div[4]/div/input[5]")
	private WebElement rating5;
	
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement ContinueBtn;
	
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]")
	private WebElement thankYouMessageReview;
	
	
	//------------------------------------------------------------------------------------
	//-------------------Verifying All items in Desktop First Scenario--------------------
	public void validateHomePage()
	{
		String text = HomePageTextValidating.getText();
		if(text.equalsIgnoreCase("TEST ENVIRONMENT"))
		{
			logger.info("Validated User in on Test Envionment");
		}
		else
		{
			logger.info("User isn not in test envioment.");
		}
	}
	
	public void ClickOnDesktopOnNav()
	{
		DesktopLink.click();
	}
	
	public void ClickOnShowAllDesktop()
	{
		showAllDesktop.click();
	}
	
	//Confirming Elements in Desktop page.
	public boolean confirmAllItemArePresent()
	{
		js.executeScript("argument[0].scrollIntoView", showingAllItemsText);
		if(showingAllItemsText.isDisplayed())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	//---------------End of First Scenario-------------------------------------
	//---------------Second Scenario adding HPLP to cart-----------------------
	
	public void AddHPLPtoCart()
	{
		AddHPLP3065toCart.click();
	}
	
	public void selectQuantity()
	{
		HPQtyBox.sendKeys("1");
		HPQtyBox.click();
	}
	
	public void addToCartFinal()
	{
		HPAddtoCartFinal.click();
	}
	
	public void successMessageHPLP()
	{
		successMessageHPLaptop.isDisplayed();
		successMessageHPLaptop.getText();
		
	}
	//---------------End of Second Scenario---------------------------------------
	//---------------Third Scenario Adding Cannon EOP to Cart--------------------
	public void addCanonEOS5DtoCart()
	{
		AddCannonEOSToCart.click();
	}
	
	public void selectCanonColor()
	{
		colorDropDown.click();
		redCanon.click();
	}
	
	public void selectCanonQty()
	{
		CannonQty.click();
	}
	
	public void canonAddToCartBtn()
	{
		addToCartButn.click();
	}
	
	public void canonSuccessMessage()
	{
		successMessageCanon.isDisplayed();
		successMessageCanon.getText();
	}
	//--------------End of Third Scenario------------------------------------------
	//--------------Last Adding A Review to Canon Camera--------------------------
	public void clickOnWriteAReview()
	{
		WriteAReview.click();
	}
	
	public void fillReviewForm()
	{
		InputNameReview.sendKeys("Haroon Emran");
		writeReviewBox.sendKeys("Canon Camera is the best Camera of All time. I bought one years ago and it is still rocking");
		rating4.click();
	}
	
	public void reviewContinueButton()
	{
		ContinueBtn.click();
	}
	
	public void thankYouMessage()
	{
		thankYouMessageReview.isDisplayed();
		thankYouMessageReview.getText();
	}
	//--------------------End of Last Scenario adding a Review----------------------
	
	
}
