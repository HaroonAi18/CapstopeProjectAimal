package pageObjectes;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.baseC;

public class ComponentsPageObject extends baseC {
	
	
	public ComponentsPageObject()
	{
		PageFactory.initElements(driver, this);
	}
	
	//-----------Refine Search Elements----------------------
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement MiceandTrackballs;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	private WebElement MonitorRefineSearch;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	private WebElement Prineters;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")
	private WebElement Scanners;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")
	private WebElement WebCameras;
	
	
	
	
	
	
}
