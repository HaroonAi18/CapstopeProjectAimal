package pageObjectes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.baseC;

public class RetailPageFeatureObjects extends baseC {
	
	public RetailPageFeatureObjects()
	{
		PageFactory.initElements(driver, this);
	}

	//----------------Locators for Retail Page Features login information--------------------
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]")
	private WebElement textToValidate;
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccountButton;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement logInMyAccout;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement inputEmailTexBox;
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement inputPasswordTextBox;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;
	//------------------End of Locators for login feature---------------------------------------
	
	//-----------------locators for second scenario "Register as an Affiliate user with Cheque Payment Method"-----------
	@FindBy(xpath = "//a[contains(text(),'Register for an affiliate account')]")
	private WebElement registerAffiliatedAccount;
	
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyInputBox;
	
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement webSiteInputBox;
	
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxIDInputBox;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[1]/label[1]/input[1]")
	private WebElement chequePaymentMethodBox;
	
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement inputChequeNameBox;
	
	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement aboutUsCheckBox;
	
	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
	private WebElement continueBUttonAffliatedBoxes;
	
	@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement successMessageAffliatedAccount;
	//--------------------End of locators for second scenario register for an affliatiated user-----------------------------
	
	//----------------locators for third scenario  Edit your affiliate information from Cheque payment method to Bank Transfer
	@FindBy(xpath = "//a[contains(text(),'Edit your affiliate information')]")
	private WebElement editAffliateAccountLink;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[3]/label[1]/input[1]")
	private WebElement bankTransferRadioButton;
	
	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankNameTextBox;
	
	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement abaNubmerTextBox;
	
	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCodeTextBox;
	
	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement bankAccountNameTextBox;
	
	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement bankAccountNumberTextBox;
	
	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement continueButtonThirdScenario;
	
	@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement successMessageEditAffliatedUser;
	//----------------------End of Locators for third Scenario------------------------------------------------
	
	//-----------------------Locators for Fourth Scenario Editing Account Information------------------------
	@FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
	private WebElement editAcctInformationLink;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement modifyFirstNameBox;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement modifyLastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement modifyEmail;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement modifyTelephone;
	
	@FindBy(xpath = "//body/div[@id='account-edit']/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
	private WebElement continueButtonFourthScenario;
	
	@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement successMessageFourthScenario;
	//-----------------------End of locators for fourth Scenario-------------------------------------------
	
	//******************************************************************************************
	//******************************************************************************************
	
	//------------------------First Scenario Login on retail page features-----------------------
	public void validateMainPage()
	{
		String text = textToValidate.getText();
		if (text.equalsIgnoreCase("TEST ENVIRONMENT"))
		{
			logger.info("Text Verified user is on the right page. ");
		}
		else
		{
			logger.info("Text is not matching.");
		}
	}
	
	public void clickOnMyAccount()
	{
		myAccountButton.click();
	}
	
	public void clickOnLogInRetailFeatureFirstLogin()
	{
		logInMyAccout.click();
	}
	
	public void enterUsername()
	{
		inputEmailTexBox.sendKeys("Ahmad.sherrif@gmail.com");
	}
	
	public void enterPassword()
	{
		inputPasswordTextBox.sendKeys("Password123@");
	}
	
	public void clickLogInButton()
	{
		loginButton.click();
	}
	//-------------------------End of First Scenario--------------------------------------------------
	
	//-------------------------Second Scenario register account affliated user------------------------
	
	public void clickOnRegisterAffliateAccount()
	{
		registerAffiliatedAccount.click();
	}
	
	public void fileBoxesForAffliateAccountInfo()
	{
		companyInputBox.sendKeys("Alokozay, INC");
		webSiteInputBox.sendKeys("www.alokozay.com");
		taxIDInputBox.sendKeys("1234556");
		chequePaymentMethodBox.click();
		inputChequeNameBox.sendKeys("Ahmadi");
		
	}
	
	public void clickOnAboutUsCheckBox()
	{
		aboutUsCheckBox.click();
	}
	
	public void clcikContinueButton()
	{
		continueBUttonAffliatedBoxes.click();
	}
	
	public void showSuccessMessageAffliateUser()
	{
		successMessageAffliatedAccount.isDisplayed();
		successMessageAffliatedAccount.getText();
	}
	//-----------------------End of Second Scenario--------------------------------------------------------
	
	//-----------------------THird Scenario Edit Affiliated User information with bank information----------
	
	public void clickOnYourAffliatedInformationLink()
	{
		editAffliateAccountLink.click();
	}
	
	public void clickOnBankTransferRadioBUtton()
	{
		bankTransferRadioButton.click();
	}
	
	public void fileBankInformationBoxesThirdScenario()
	{
		bankNameTextBox.sendKeys("AIB Bank");
		abaNubmerTextBox.sendKeys("12345676");
		swiftCodeTextBox.sendKeys("swif conde");
		bankAccountNameTextBox.sendKeys("Harooon AImal");
		bankAccountNumberTextBox.sendKeys("12344444444");
	}
	
	public void clcikContinueThirdScenario()
	{
		continueButtonThirdScenario.click();
	}
	
	public void showSuccessMessageThirdScenario()
	{
		successMessageEditAffliatedUser.isDisplayed();
	}
	//--------------------------End of Third Scenario-------------------------------------------------------------
  
	//---------------------------Fourth Scenario Editing Account Information-------------------------------------
	public void clickEditMyAccountLink()
	{
		editAcctInformationLink.click();
	}
	
	public void modifyInformationBoxes()
	{
		modifyFirstNameBox.clear();
		modifyFirstNameBox.sendKeys("John");
		
		modifyLastName.clear();
		modifyLastName.sendKeys("Devis");
		
		modifyEmail.clear();
		modifyEmail.sendKeys("John.Devis@gmail.com");
		
		modifyTelephone.clear();
		modifyTelephone.sendKeys("000-000-00000");
		
	}
	
	public void clickContinueBUttonFourhtScenario()
	{
		continueButtonFourthScenario.click();
	}
	
	
	public void showSucessMessageFourthScenario()
	{
		successMessageFourthScenario.isDisplayed();
		successMessageFourthScenario.getTagName();
	}
	//---------------------End of Fourth Scenario----------------------------------------------------------------------------
	

}
