package Tests;

import Base.BasePage;
import Pages.ForgetPwdPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.IOException;

public class ForgetPwdTest extends BasePage {

    @Test
    public void ForgotPwdFlow() throws InterruptedException, IOException {
        try {
            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            ForgetPwdPage FwdPwdObj = new ForgetPwdPage(driver);
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            Thread.sleep(2000);

            //2.1 Click on Cancel button on Forgot Password Screen.
            FwdPwdObj.ClickForgetPwdBtn();
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//ForgetPwdScreen.jpg");
            Thread.sleep(2000);
            FwdPwdObj.ClickCancelBtn();
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//CancelLoginScreen.jpg");
            Thread.sleep(2000);

            //TC 2.2 First Login is not Done By the User.
            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(2000);
            FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("UserEmail"));
            FwdPwdObj.ClickSubmitBtn();
            Thread.sleep(950);
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//FirstLoginNotDone.jpg");
            System.out.println("First login is not done the User");
            Thread.sleep(2000);

            //TC 2.3 Invalid EmailID.
            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(2000);
            FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("Invalid1"));
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//InvalidEmailID.jpg");
            FwdPwdObj.VerifyAssertEmailID();
            System.out.println("Please Check Email Id");
            FwdPwdObj.ClickCancelBtn();
            Thread.sleep(2000);

            //2.4 User Does not Exist
            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(2000);
            FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("Invalid2"));
            Thread.sleep(3000);
            FwdPwdObj.ClickSubmitBtn();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//UserDoesn'tExist.jpg");
            System.out.println("User Does not Exist");
            FwdPwdObj.ClickCancelBtn();
            Thread.sleep(2000);

            //TC 2.5 Disable user
            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(2000);
            FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("DisabledUser"));
            Thread.sleep(1000);
            FwdPwdObj.ClickSubmitBtn();
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//DisableUser.jpg");
            System.out.println("User is inactive. Please contact Administration");
            Thread.sleep(2000);
            FwdPwdObj.ClickCancelBtn();
            Thread.sleep(4000);
            driver.close();
        }
        catch (Exception e) {
        }

    }
}
