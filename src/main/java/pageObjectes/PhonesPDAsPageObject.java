package pageObjectes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.baseC;

public class PhonesPDAsPageObject extends baseC {

	
	public PhonesPDAsPageObject()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'HTC Touch HD')]")
	private WebElement HTCtouchHD;
	
	@FindBy(xpath = "//a[contains(text(),'iPhone')]")
	private WebElement iphone;
	
	@FindBy(xpath = "//a[contains(text(),'Palm Treo Pro')]")
	private WebElement PalmTreoPro;
	
}

