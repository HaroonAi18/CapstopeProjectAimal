package utilities;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import core.baseC;

public class Utility extends baseC {

	public static void compareText(String actualText, String expectedText)
	{
		if(actualText.equalsIgnoreCase(expectedText))
		{
			System.out.println("Sucess Text is matching with the expected textg");
		}
		else
		{
			System.out.println("Failed Wrong expected text");
		}
	}
	
	
	
	//Methods for taking screen shots
	public static void takeScreenShot(String fileName) throws IOException
	{
		String path = "C:\\Users\\Mharo\\eclipse-workspaceVersion2\\CapstoneProject\\output";
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(path +fileName+ ".png"));
	}
	
	//JavaScript Executor methods
	public static void clickWithJSE(WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	//To highlight element
	public static void highlighteelementbackground(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.background='yellow'", element);
	}
	
	//Scroll with JS
	
	public static void scrollDownPage()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	// how to send keys with JSExecutor
	public static void sendKeys(WebElement element, String value) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + value + "'", element);
	}
}
