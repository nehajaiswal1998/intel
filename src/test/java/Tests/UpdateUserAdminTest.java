package Tests;
import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.AssertionsFunction;
import Utilities.Functions;
import Utilities.ReadProps;
import org.testng.annotations.*;
import static Pages.CreateUserPage.UpdatedTimeUser_Admin;

@Listeners(Utilities.TestListeners.class)

public class UpdateUserAdminTest extends BasePage {
        static CreateUserPage UserPageObj1;
        @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
    public void UpdateUserAdminFlow() throws Exception {
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            Thread.sleep(8000);
            UserPageObj1 = new CreateUserPage(driver);
            //TC 22.1 Admin Login with Valid Credentials.
            UserPageObj1.setUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(2000);
            UserPageObj1.setPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(2000);
            UserPageObj1.clickLoginButton();
            Thread.sleep(8000);
            AssertionsFunction.verifyTargetPageURL(UserPageObj1.loginHoempPageUrl);
            UserPageObj1.ClickUserBtn();
            Thread.sleep(3000);
            AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);
            Thread.sleep(3000);
            UserPageObj1.selectSearchedUser();
            Thread.sleep(2000);
    }
        @Test(priority = 2)
        public void disable_user_update() throws Exception {
                //TC 22.2 Disable User and Update.
                UserPageObj1.ClickDisableUser();
                Thread.sleep(2000);
                UserPageObj1.ClickUpdateUser();
                Thread.sleep(3000);
                AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);
                UserPageObj1.selectSearchedUser();
                Thread.sleep(2000);
        }
        @Test(priority = 3)
        public void enable_user_update() throws Exception {
                //TC 22.3 Enable User and Update.
                UserPageObj1.ClickEnableUser();
                Thread.sleep(2000);
                UserPageObj1.ClickUpdateUser();
                Thread.sleep(3000);
                AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);

        }
        @Test(priority = 4)
        public void update_with_blank_name() throws Exception {
                //TC 22.4 Update with Blank Name.
                UserPageObj1.selectSearchedUser();
                Thread.sleep(2000);
                UserPageObj1.ClickToClearName();
                Thread.sleep(2000);
                UserPageObj1.ClickUpdateUser();
                Thread.sleep(1000);
                AssertionsFunction.verifyElementText(UserPageObj1.errmsg,UserPageObj1.errmsgBlankDataCreateRoleClick);
                UserPageObj1.ClickOnCancelBtn();
                Thread.sleep(6000);
                AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);

        }
        @Test(priority = 5)
        public void update_with_invalid_username() throws Exception {
                //TC 22.5 Update with Invalid UserName.
                UserPageObj1.selectSearchedUser();
                Thread.sleep(1000);
                UserPageObj1.ClickToClearName();
                Thread.sleep(2000);
                UserPageObj1.EnterNewUserName(ReadProps.readAttr("EnterName"));
                Thread.sleep(2000);
                UserPageObj1.ClickUpdateUser();
                Thread.sleep(1000);
                AssertionsFunction.verifyElementText(UserPageObj1.errmsg,UserPageObj1.errmsgBlankDataCreateRoleClick);
                UserPageObj1.ClickOnCancelBtn();
                Thread.sleep(6000);
                AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);

        }
        @Test(priority = 6)
        public void update_with_valid_username() throws Exception {
            //TC 22.6 Update with Valid Name.
            UserPageObj1.selectSearchedUser();
            Thread.sleep(2000);
            UserPageObj1.ClickToClearName();
            Thread.sleep(2000);
            UserPageObj1.EnterNewUserName(ReadProps.readAttr("ValidNameUP")); // change name
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();

            // Created Updated time diff
            String expectedDate = Functions.getCurrentDate();
            Thread.sleep(6000);
            AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);
            System.out.println("expectedDate="+expectedDate);
            System.out.println("driver.findElement(UpdatedTimeUser_Admin).getText()="+driver.findElement(UpdatedTimeUser_Admin).getText());


        }
    @Test(priority = 7)
        public  void Sorting_User() throws Exception {
            // 22.10 Sorting by Name, email,updated,created time

            UserPageObj1.ClickOnSortUser();
            Thread.sleep(2000);

            UserPageObj1.LogOut();
            Thread.sleep(4000);
            AssertionsFunction.verifyTargetPageURL(UserPageObj1.loginPageUrl);

        }
    }

