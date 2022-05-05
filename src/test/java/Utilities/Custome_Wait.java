package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Custome_Wait 
{
	public static void wait(WebDriver driver,WebElement element)
	{
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(element));

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

}
