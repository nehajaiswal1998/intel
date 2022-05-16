package Tests;
import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.AssertionsFunction;
import Utilities.Functions;
import Utilities.LoginUser;
import Utilities.ReadProps;
import com.google.cloud.storage.Acl;
import org.testng.Assert;
import org.testng.annotations.*;

import static Pages.CreateRolePage.*;

@Listeners(Utilities.TestListeners.class)

public class CreateUserAdminTest extends BasePage {
        static CreateUserPage UserPageObj;
        @BeforeClass
    public void driverinit() throws Exception {
        BasePage.driverInit();
    }
   @AfterClass
    public void cleanUp() throws Exception
    {
    driver.quit();
    }
    @Test(priority = 1)
    public void valid_login_with_admin_credentials() throws Exception {
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            UserPageObj = new CreateUserPage(driver);
            //TC 4.1 Valid Login with Admin credentials.
            LoginUser.login_users(driver, "di-admin@neutrinotechsystems.com", "Nts#admin@123");
            UserPageObj.ProfileIconClick();


    }
     @Test(priority = 2)
        public void create_user_with_blank_data() throws Exception {
                //TC 4.2 Create User with Blank data.
                UserPageObj.clickOnUserMenu();
                UserPageObj.ClickCreateUserBtn();
                UserPageObj.ClickCreateBtn();
                UserPageObj.ClickOnCancelBtn();
        }
      @Test(priority = 3)
        public void create_user_with_valid_data() throws Exception {
                //TC 4.3 Create User with Valid data.
                UserPageObj.ClickCreateUserBtn();
                UserPageObj.EnterNewUserName(ReadProps.readAttr("AdminUsername"));
                UserPageObj.EnterEmail(ReadProps.readAttr("AdminEmailID"));
                UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
                UserPageObj.ClickCreateBtn();
                //4.8 Verify that created user by admin should display in available user list

    }
       @Test(priority = 4)
        public void create_user_with_invalid_data() throws Exception {
           //TC 4.4 Create user with Invalid data.
           UserPageObj.ClickCreateUserBtn();
           UserPageObj.EnterNewUserName(ReadProps.readAttr("InvalidUsernameU"));
           UserPageObj.EnterEmail(ReadProps.readAttr("InvalidEmailU"));
           UserPageObj.ClickCreateBtn();
           UserPageObj.ClickOnCancelBtn();

        }
        @Test(priority = 5)
        public void disable_user() throws Exception {
                //TC 4.5 Disable user.
                UserPageObj.SearchCreatedUser(ReadProps.readAttr("AdminUsername"));
               UserPageObj.selectSearchedUser();
                UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
                UserPageObj.clickOnUpdateUserButton();

        }
        @Test(priority = 6)
        public void enable_disabled_user() throws Exception {
            //TC 4.6 Enable the Disabled user.
            UserPageObj.SearchCreatedUser(ReadProps.readAttr("AdminUsername"));
            UserPageObj.selectSearchedUser();
            UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
            UserPageObj.clickOnUpdateUserButton();
        }
    @Test(priority = 7)
    public void create_user_with_valid_data_status_disabled() throws Exception {
            //4.7 Verify the working of admin role for Create user button when user status is disabled
        UserPageObj.ClickCreateUserBtn();
        UserPageObj.EnterNewUserName(ReadProps.readAttr("AdminUsername"));
        UserPageObj.EnterEmail(ReadProps.readAttr("AdminEmailID"));
        UserPageObj.ClickCreateBtn();
        //4.8 Verify that created user by admin should display in available user list

    }
   }