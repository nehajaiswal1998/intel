package Tests;
import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.AssertionsFunction;
import Utilities.Functions;
import Utilities.ReadProps;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

import static Pages.CreateRolePage.errormsg;
import static Pages.CreateRolePage.errormsgBlankDataCreateRoleClick;

@Listeners(Utilities.TestListeners.class)
public class CreateUserPlatformAdminTest extends BasePage {
    static CreateUserPage UserPageObj;

    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }

    @AfterClass(enabled = false)
    public void cleanUp() throws Exception {
        driver.quit();
    }

    @Test(priority = 1)
    public void blank_username_blank_password() throws Exception {
        UserPageObj = new CreateUserPage(driver);
        //TC 5.1 Blank Username and Blank Password.
        UserPageObj.ClickUserBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj.userTabUrl);
        UserPageObj.ClickCreateUserBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj.createUserUrl);
        UserPageObj.ClickCreateBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText(errormsg,errormsgBlankDataCreateRoleClick);
        driver.navigate().refresh();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj.createUserUrl);
    }
    @Test(priority = 2)
    public void valid_username_blank_password() throws Exception {
        //TC 5.2 inValid Username no enter emailId.
        UserPageObj.EnterUserName(ReadProps.readAttr("InvalidUsernameU"));
        Thread.sleep(2000);
        UserPageObj.ClickCreateBtn();
        Thread.sleep(1000);
        AssertionsFunction.verifyElementText(errormsg,errormsgBlankDataCreateRoleClick);
        driver.navigate().refresh();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj.createUserUrl);


    }
    @Test(priority = 3)
    public void blank_username_valid_password() throws Exception {
        //TC 5.3 Blank Username Valid email.
        UserPageObj.EnterEmail(ReadProps.readAttr("InvalidEmailU"));
        Thread.sleep(2000);
        UserPageObj.ClickCreateBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText(errormsg,errormsgBlankDataCreateRoleClick);
        driver.navigate().refresh();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj.createUserUrl);

    }
    @Test(priority = 4)
    public void invalid_username_blank_password() throws Exception {
        //TC 5.4 Invalid UserName Blank Password.
        UserPageObj.EnterUserName(ReadProps.readAttr("InvalidUsernameU"));
        Thread.sleep(2000);
        UserPageObj.ClickCreateBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText(errormsg,errormsgBlankDataCreateRoleClick);
        driver.navigate().refresh();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj.createUserUrl);

    }
    @Test(priority = 5)
    public void blank_username_invalid_password() throws Exception {
        //TC 5.5 Blank UserName Invalid Password.
        UserPageObj.EnterEmail(ReadProps.readAttr("InvalidEmailU"));
        Thread.sleep(2000);
        UserPageObj.ClickCreateBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText(errormsg,errormsgBlankDataCreateRoleClick);
        driver.navigate().refresh();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj.createUserUrl);

    }
    @Test(priority = 6)
    public void invalid_credentials() throws Exception {
        //TC 5.6 Invalid Credentials.
        UserPageObj.EnterUserName(ReadProps.readAttr("InvalidUsernameU"));
        Thread.sleep(2000);
        UserPageObj.EnterEmail(ReadProps.readAttr("InvalidEmailU"));
        Thread.sleep(2000);
        UserPageObj.ClickCreateBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText(errormsg,errormsgBlankDataCreateRoleClick);
        driver.navigate().refresh();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj.createUserUrl);

    }
    @Test(priority = 7)
    public void create_user_with_existing_username_password() throws Exception {
        //TC 5.7 Create User with Existing Username and Password.
        UserPageObj.EnterUserName(ReadProps.readAttr("InvalidUsernameU"));
        Thread.sleep(2000);
        UserPageObj.EnterEmail(ReadProps.readAttr("InvalidEmailU"));
        Thread.sleep(2000);
        //added
        //TC 5.11 Verify the validation of Name textbox & Email ID textbox on New User creation Page.
        Assert.assertTrue(AssertionsFunction.isPresent(UserPageObj.getValidationUserName()));
        UserPageObj.ClickActiveUser();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(UserPageObj.getValidationEmailID()));
        UserPageObj.ClickCreateBtn();
        Thread.sleep(1000);
        AssertionsFunction.verifyElementText(errormsg,errormsgBlankDataCreateRoleClick);
        Thread.sleep(2000);
        UserPageObj.ClickOnCancelBtn();
        Thread.sleep(6000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj.userTabUrl);

    }
    //Creation Of User-Whenever we have to run on new env then these lines are used.
          /*  UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.EnterUserName(ReadProps.readAttr("Username"));
            Thread.sleep(2000);
            UserPageObj.EnterEmail(ReadProps.readAttr("UserEmail"));
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(3000);
            Thread.sleep(2000);
            Thread.sleep(2000);
            UserPageObj.CreateUserAssert();
            Thread.sleep(2000);

          /*  // At the time of create user need to remove comment from assertion.
            //1 AE Admin
            UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.EnterUserName("AE Admin");
            Thread.sleep(2000);
            UserPageObj.EnterEmail("Admin@Test.com");
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);

            // At the time of create user need to remove comment from assertion

          /*
            //2 AE Supervisor
           // UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.EnterUserName("AE Supervisor");
            Thread.sleep(2000);
            UserPageObj.EnterEmail("supervisor@Test.com");
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            Thread.sleep(2000);
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);
            // At the time of create user need to remove comment from assertion
            UserPageObj.CreateTimeAssert();
            Thread.sleep(2000);

            //3 AE Operator
            UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.EnterUserName("AE Operator");
            Thread.sleep(2000);
            UserPageObj.EnterEmail("operator@Test.com");
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            Thread.sleep(2000);
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);
            // At the time of create user need to remove comment from assertion*/


    @Test(priority = 9) // below added
        public void ClickOnCancelbutton_on_User_Creation_Page() throws InterruptedException {
        //TC 5.10 Verify functionality of Cancel button on User Creation Page.
            UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            AssertionsFunction.verifyTargetPageURL(UserPageObj.createUserUrl);
            UserPageObj.ClickOnCancelBtn();
            Thread.sleep(5000);
            AssertionsFunction.verifyTargetPageURL(UserPageObj.userTabUrl);


        }
    @Test(priority = 10)
    public void create_userWith_valid_credential() throws Exception {

        // 5.8 Verify the Users functionality of the Platform Admin to Create User with Valid Details.
        UserPageObj.ClickCreateUserBtn();
        Thread.sleep(2000);
        UserPageObj.EnterUserName(ReadProps.readAttr("UserName")); // change this value
        Thread.sleep(2000);
        UserPageObj.EnterEmail(ReadProps.readAttr("Useremail")); // change this value
        Thread.sleep(2000);
        //TC 5.12 Verify the working of platform admin role for Create user button when"Active User" toggle button is enabled
        UserPageObj.ClickActiveUser();
        Thread.sleep(2000);
        UserPageObj.ClickCreateBtn();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj.userTabUrl);



    }
    @Test(priority = 11)
    public void create_userWith_valid_credential_status_Disabled() throws InterruptedException, IOException {
        //TC 5.13 Verify the working of platform admin role for Create user button when "Active User" toggle button is disabled
        UserPageObj.ClickCreateUserBtn();
        Thread.sleep(2000);
        UserPageObj.EnterUserName(ReadProps.readAttr("UserNameDisabled"));// change this value
        Thread.sleep(2000);
        UserPageObj.EnterEmail(ReadProps.readAttr("UseremailDisabled"));// change this value
        Thread.sleep(2000);
        UserPageObj.ClickCreateBtn();
        Thread.sleep(5000);
        // Verify that created user by platform admin should display in available user list
        Assert.assertTrue(AssertionsFunction.isPresent(UserPageObj.getAdminUserExtraForDisabled()));

    }
    @Test(priority = 12)
    public void search_user() throws Exception {
        //TC 5.8 Search for Created user.
        UserPageObj.ClickUserBtn();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj.userTabUrl);
        UserPageObj.SearchCreatedUser(ReadProps.readAttr("UserNameDisabled"));
        Thread.sleep(2000);
        UserPageObj.SelectSearchedUser();
        Thread.sleep(2000);
        UserPageObj.ClickOnCancelBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj.userTabUrl);
//        UserPageObj.SelectSearchedUser();
//        Thread.sleep(2000);
//        UserPageObj.ClickUpdateUser();
//        Thread.sleep(5000);
//        AssertionsFunction.verifyTargetPageURL(UserPageObj.userTabUrl);
        UserPageObj.LogOut();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj.loginPageUrl);

    }

}


