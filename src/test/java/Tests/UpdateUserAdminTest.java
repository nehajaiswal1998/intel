package Tests;

import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.IOException;

public class UpdateUserAdminTest extends BasePage {
    @Test
    public void UpdateUserAdminFlow() throws InterruptedException, IOException {
        try {
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");
            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            CreateUserPage UserPageObj1 = new CreateUserPage(driver);
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            Thread.sleep(2000);
            //Admin Login
            UserPageObj1.setUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(2000);
            UserPageObj1.setPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(2000);
            UserPageObj1.clickLoginButton();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminUpdateUser//AdminValid.jpg");
            Thread.sleep(2000);
            UserPageObj1.ClickUserBtn();
            Thread.sleep(3000);
            UserPageObj1.SearchCreatedUser(ReadProps.readAttr("AdminUserName"));
            Thread.sleep(2000);
            UserPageObj1.SelectSearchedAdminUser();
            Thread.sleep(2000);
            System.out.println("Clicked edit button");
            UserPageObj1.ClickDisableUser();
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            System.out.println("User updated");
            TakesScreen.takeSnapShot(driver, "test-output//AdminUpdateUser//AdminDisableUserFile.jpg");
            Thread.sleep(2000);
            UserPageObj1.SelectSearchedAdminUser();
            Thread.sleep(2000);
            System.out.println("Clicked edit button");
            UserPageObj1.ClickEnableUser();
            Thread.sleep(2000);
            System.out.println("Enable User");
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            System.out.println("User updated");
            TakesScreen.takeSnapShot(driver, "test-output//AdminUpdateUser//AdminEnableUser.jpg");
            Thread.sleep(2000);

            //Update with Blank name
            UserPageObj1.SelectSearchedAdminUser();
            Thread.sleep(1000);
            UserPageObj1.ClickToClearName();
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminUpdateUser//AdminBlankName.jpg");
            //UserPageObj1.UserBlankAssert();
            Thread.sleep(2000);
            UserPageObj1.ClickOnCancelBtn();
            Thread.sleep(6000);

            //Update with Invalid UserName
            UserPageObj1.SelectSearchedAdminUser();
            Thread.sleep(1000);
            UserPageObj1.ClickToClearName();
            Thread.sleep(2000);
            UserPageObj1.EnterUserName(ReadProps.readAttr("EnterName"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            TakesScreen.takeSnapShot(driver, "test-output//AdminUpdateUser//AdminInvalidCredentials.jpg");
           // UserPageObj1.UserBlankAssert();
            Thread.sleep(2000);
            UserPageObj1.ClickOnCancelBtn();
            Thread.sleep(6000);


            // Update with Valid Name
            UserPageObj1.SelectSearchedAdminUser();
            Thread.sleep(2000);
            UserPageObj1.ClickToClearName();
            Thread.sleep(2000);
            UserPageObj1.EnterUserName(ReadProps.readAttr("ValidNameUP"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminUpdateUser//UpdateWithValid.jpg");
            Thread.sleep(2000);

            // Remove Update for script maintains only
            UserPageObj1.SearchCreatedUser(ReadProps.readAttr("ValidNameUP"));
            Thread.sleep(2000);
            UserPageObj1.SelectUpdatedUser();
            Thread.sleep(1000);
            UserPageObj1.ClickToClearName();
            Thread.sleep(2000);
            UserPageObj1.EnterUserName(ReadProps.readAttr("AdminUserName"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(4000);
            UserPageObj1.LogOut();
            Thread.sleep(4000);
            driver.close();
        } catch (Exception e) {
            test.log(status.FAIL, e);
        }
    }
}
