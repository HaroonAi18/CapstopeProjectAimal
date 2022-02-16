package pageObjectes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.baseC;

public class Mp3PlayersPageObject extends baseC {

	
	public Mp3PlayersPageObject()
	{
		PageFactory.initElements(driver, this);
	}
	
	//-------------First column Refine test locators---------------
	@FindBy(xpath = "//*[@id=\'content\']/div[2]/div[1]/ul/li[1]/a")
	private WebElement test11;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[2]/div[1]/ul/li[2]/a")
	private WebElement test12;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[2]/div[1]/ul/li[3]/a")
	private WebElement test15;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[2]/div[1]/ul/li[4]/a")
	private WebElement test16;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[2]/div[1]/ul/li[5]/a")
	private WebElement test17;
	
	//-------------Column Two Refine test locators-----------------
	@FindBy(xpath = "//*[@id=\'content\']/div[2]/div[2]/ul/li[1]/a")
	private WebElement test18;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[2]/div[2]/ul/li[2]/a")
	private WebElement test19;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[2]/div[2]/ul/li[3]/a")
	private WebElement test20;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[2]/div[2]/ul/li[4]/a")
	private WebElement test21;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[2]/div[2]/ul/li[5]/a")
	private WebElement test22;
	
	//-------------Column Three Refine test locators-----------------
	@FindBy(xpath = "//*[@id=\'content\']/div[2]/div[3]/ul/li[1]/a")
	private WebElement test23;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[2]/div[3]/ul/li[2]/a")
	private WebElement test24;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[2]/div[3]/ul/li[3]/a")
	private WebElement test4;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[2]/div[3]/ul/li[4]/a")
	private WebElement test5;	
	
	@FindBy(xpath = "//*[@id=\'content\']/div[2]/div[3]/ul/li[5]/a")
	private WebElement test6;
	
	//---------------------Products---------------------------------
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[1]/div/div[2]/div[1]/h4/a")
	private WebElement ipodClassic;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[2]/div/div[2]/div[1]/h4/a")
	private WebElement ipodNano;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[3]/div/div[2]/div[1]/h4/a")
	private WebElement ipodshuffle;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[4]/div/div[2]/div[1]/h4/a")
	private WebElement ipadTouch;
	
}
