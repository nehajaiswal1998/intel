package Utilities;
//import Pages.CreateRolePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import Pages.CreateRolePage;
import java.io.IOException;

import static Pages.CreateRolePage.errormsg;

public class verifyAssertions
{
    WebDriver driver;
    public verifyAssertions(WebDriver driver) throws IOException {
        this.driver = driver;
    }
    public void  verify_webpage_url(String exp_url)
    {
        String actual_url= driver.getCurrentUrl();
        Assert.assertEquals(actual_url,exp_url);
    }

    public void verify_error_message(String exp_value,  By errormsgBlankDataCreateRoleClick)
    {
        String act_value=driver.findElement(errormsgBlankDataCreateRoleClick).getText();
         Assert.assertEquals(exp_value,act_value);
    }

     public void verify_error_message_Existing_role(String exp_value,By errormsg_roleExist_CreateRoleClick)
     {
         String act_value=driver.findElement(errormsg_roleExist_CreateRoleClick).getText();
         String very_act=act_value.substring(20);
         Assert.assertEquals(exp_value,act_value);

     }
    public void verifyAdminProfile(String exp,By act )
    {
        String act_value=driver.findElement(act).getText();
        Assert.assertEquals(exp,act_value);

    }
}
