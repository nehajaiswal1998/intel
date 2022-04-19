package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Custome_Wait 
{
	public static void wait(WebDriver driver,WebElement element)
	{
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(element));

	}

}
