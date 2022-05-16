package Tests;
import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.AssertionsFunction;
import Utilities.Functions;
import Utilities.LoginUser;
import Utilities.ReadProps;
import org.testng.annotations.*;

@Listeners(Utilities.TestListeners.class)

public class UpdateUserAdminTest extends BasePage {
        static CreateUserPage UserPageObj1;
        @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }
@AfterClass
    public void cleanUp() throws Exception
    {
    driver.quit();
    }
    @Test(priority = 1)
    public void UpdateUserAdminFlow() throws Exception {
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            Thread.sleep(8000);
            UserPageObj1 = new CreateUserPage(driver);
            //TC 22.1 Admin Login with Valid Credentials.
            LoginUser.login_users(driver, "di-admin@neutrinotechsystems.com", "Nts#admin@123");
            UserPageObj1.clickOnUserMenu();
            UserPageObj1.SearchCreatedUser("Qa User");
            UserPageObj1.selectSearchedUser();
    }
        @Test(priority = 2)
        public void disable_user_update() throws Exception {
                //TC 22.2 Disable User and Update.
                UserPageObj1.ClickOnEnableOrDisableUserSelectionToggle();
                UserPageObj1.clickOnUpdateUserButton();
                UserPageObj1.SearchCreatedUser("Qa User");
                UserPageObj1.selectSearchedUser();
                UserPageObj1.clickOnUpdateUserButton();
        }
        @Test(priority = 3)
        public void enable_user_update() throws Exception
        {
                //TC 22.3 Enable User and Update.
            UserPageObj1.SearchCreatedUser("Qa User");
            UserPageObj1.selectSearchedUser();
            UserPageObj1.ClickOnEnableOrDisableUserSelectionToggle();
            UserPageObj1.clickOnUpdateUserButton();

        }
        @Test(priority = 4)
        public void update_with_blank_name() throws Exception {
                //TC 22.4 Update with Blank Name.
            UserPageObj1.SearchCreatedUser("Qa User");
            UserPageObj1.selectSearchedUser();
            UserPageObj1.clearUserName();
            UserPageObj1.clickOnUpdateUserButton();
            UserPageObj1.ClickOnCancelBtn();


        }
        @Test(priority = 5)
        public void update_with_invalid_username() throws Exception {
                //TC 22.5 Update with Invalid UserName.
                UserPageObj1.SearchCreatedUser("Qa User");
                UserPageObj1.selectSearchedUser();
                UserPageObj1.clearUserName();
                UserPageObj1.EnterNewUserName(ReadProps.readAttr("EnterName"));
                UserPageObj1.clickOnUpdateUserButton();
                UserPageObj1.ClickOnCancelBtn();


        }
        @Test(priority = 6)
        public void update_with_valid_username() throws Exception {
            //TC 22.6 Update with Valid Name.
            UserPageObj1.SearchCreatedUser("Qa User");
            UserPageObj1.selectSearchedUser();
            UserPageObj1.clearUserName();
            UserPageObj1.EnterNewUserName(ReadProps.readAttr("ValidNameUP")); // change name
            UserPageObj1.clickOnUpdateUserButton();

            // Created Updated time diff
            String expectedDate = Functions.getCurrentDate();
            System.out.println("expectedDate="+expectedDate);
            System.out.println(UserPageObj1.getUpdatedTimeAndDate());


        }
    @Test(priority = 7)
        public  void Sorting_User() throws Exception {
            // 22.10 Sorting by Name, email,updated,created time
        UserPageObj1.ClickOnSortUserArrow();
        LoginUser.logoutUser(driver);

        }
    }

