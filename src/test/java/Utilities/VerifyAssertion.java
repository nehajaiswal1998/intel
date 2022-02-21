package Utilities;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.xml.sax.Locator;

public class VerifyAssertion extends BasePage {

    public void verify_assert_equal(String expectedValue, By element_Locator)
    {
        String actualValue= driver.findElement(element_Locator).getText();
        Assert.assertEquals(actualValue,expectedValue);
    }

    public void verify_assertequal_withtrim(String expectedValue, By element_Locator)
    {
        String[] Value = driver.findElement(element_Locator).getText().split(" ");
        String actualValue = Value[1].trim();
        Assert.assertNotEquals(actualValue, expectedValue);
    }


    public void  verify_assertequal_hover(String expectedValue, By element_Locator)
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(element_Locator);
        action.moveToElement(element).build().perform();
        String actualvalue = driver.findElement(element_Locator).getText();
        Assert.assertEquals(actualvalue, expectedValue);
    }






}
