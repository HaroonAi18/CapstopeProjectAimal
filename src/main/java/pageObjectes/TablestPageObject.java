package pageObjectes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.baseC;

public class TablestPageObject extends baseC {
	
	public TablestPageObject()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Samsung Galaxy Tab 10.1')]")
	private WebElement SamsungGalaxyTab;
	
	
}
