package pageObjectes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.baseC;

public class SoftwarePageObject extends baseC {

	public SoftwarePageObject()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	private WebElement ContinueButton;
	
}
