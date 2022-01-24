package Tests;

import Base.BasePage;
import Pages.ForgetPwdPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.IOException;

public class ForgetPwdTest extends BasePage {

    @Test(priority = 1)
    public void click_on_cancel_button_on_forgot_password() throws InterruptedException, IOException {
        try {
            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            ForgetPwdPage FwdPwdObj = new ForgetPwdPage(driver);
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            Thread.sleep(2000);
            //12.1 Click on Cancel button on Forgot Password Screen.
            FwdPwdObj.ClickForgetPwdBtn();
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//ForgetPwdScreen.jpg");
            Thread.sleep(2000);
            FwdPwdObj.ClickCancelBtn();
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//CancelLoginScreen.jpg");
            Thread.sleep(2000);
            test.log(LogStatus.INFO, "ForgotPasswordTC1");
            test.log(LogStatus.PASS, "TestPassed");
        } catch (Exception e) {
            test.log(LogStatus.FAIL, e);
        }
    }
    @Test(priority = 2)
    public void first_login_not_done_on_forgot_password() throws InterruptedException, IOException {
        try {
            ForgetPwdPage FwdPwdObj = new ForgetPwdPage(driver);
            //TC 12.2 First Login is not Done By the User.
            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(2000);
            FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("UserEmail"));
            FwdPwdObj.ClickSubmitBtn();
            Thread.sleep(950);
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//FirstLoginNotDone.jpg");
            System.out.println("First login is not done the User");
            Thread.sleep(2000);
            test.log(LogStatus.INFO, "ForgotPasswordTC2");
            test.log(LogStatus.PASS, "TestPassed");
        } catch (Exception e) {
            test.log(LogStatus.FAIL, e);
        }}
}