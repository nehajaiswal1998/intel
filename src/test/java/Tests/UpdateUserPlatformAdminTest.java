package Tests;

import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import org.testng.annotations.*;

@Listeners(Utilities.TestListeners.class)

public class UpdateUserPlatformAdminTest extends BasePage {
    static CreateUserPage UserPageObj1;

    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }

    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }

    @Test(priority = 1)
    public void update_user_enable_disable() throws Exception {
        UserPageObj1 = new CreateUserPage(driver);
        UserPageObj1.ClickUserBtn();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);
        //TC 23.1 Update User enable, disable.
        UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username"));
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(CreateUserPage.UserCreated);
        Thread.sleep(1000);
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(1000);
        UserPageObj1.ClickDisableUser();
        Thread.sleep(2000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);
        UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username"));
        Thread.sleep(1000);
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(1000);
        UserPageObj1.ClickEnableUser();
        Thread.sleep(2000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(10000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);
        Thread.sleep(2000);

    }

    @Test(priority = 2)
    public void blank_name_valid_password() throws Exception {
        //TC 23.2 Blank Name and Valid Password.
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(1000);
        UserPageObj1.ClickToClearName();
        Thread.sleep(2000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(100);
        AssertionsFunction.verifyElementText(UserPageObj1.errmsg, UserPageObj1.errmsgBlankDataCreateRoleClick);
        Thread.sleep(5000);
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(10000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);

    }

    @Test(priority = 3)
    public void blank_username_invalid_password() throws Exception {
        //TC 23.3 Blank UserName and Invalid Password.
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(1000);
        UserPageObj1.ClickToClearName();
        Thread.sleep(2000);
        UserPageObj1.ClearPassword();
        Thread.sleep(3000);
        UserPageObj1.EnterPassword(ReadProps.readAttr("pwd"));
        Thread.sleep(2000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText(UserPageObj1.errmsg, UserPageObj1.errmsgBlankDataCreateRoleClick);
        Thread.sleep(5000);
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);
        Thread.sleep(1000);

    }

    @Test(priority = 4)
    public void invalid_name_blank_password() throws Exception {
        //TC 23.4 Invalid Name Blank Password.
        UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username"));
        Thread.sleep(2000);
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(1000);
        UserPageObj1.ClickToClearName();
        Thread.sleep(2000);
        UserPageObj1.EnterUserName(ReadProps.readAttr("EnterName"));
        Thread.sleep(2000);
        UserPageObj1.ClearPassword();
        Thread.sleep(3000);
        UserPageObj1.ClickUpdateUser();
        AssertionsFunction.verifyElementText(UserPageObj1.errmsg, UserPageObj1.errmsgBlankDataCreateRoleClick);
        Thread.sleep(5000);
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(10000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);
        Thread.sleep(1000);

    }

    @Test(priority = 5)
    public void blank_username_blank_password() throws Exception {
        //TC 23.5 Blank UserName Blank Password.
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(3000);
        UserPageObj1.ClickToClearName();
        Thread.sleep(3000);
        UserPageObj1.ClearPassword();
        Thread.sleep(3000);
        UserPageObj1.ClickUpdateUser();
        AssertionsFunction.verifyElementText(UserPageObj1.errmsg, UserPageObj1.errmsgBlankDataCreateRoleClick);
        Thread.sleep(2000);
       // AssertionsFunction.verifyElementPresent(CreateUserPage.ErrMsgName);
        Thread.sleep(1000);
        //AssertionsFunction.verifyElementPresent(CreateUserPage.ErrMsgPWD);
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);

    }

    @Test(priority = 6)
    public void invalid_username_invalid_password() throws Exception {
        //TC 23.6 Invalid UserName Invalid Password.
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(1000);
        UserPageObj1.ClickToClearName();
        Thread.sleep(3000);
        UserPageObj1.EnterUserName(ReadProps.readAttr("EnterName"));
        Thread.sleep(2000);
        UserPageObj1.ClearPassword();
        Thread.sleep(2000);
        UserPageObj1.EnterPassword(ReadProps.readAttr("pwd"));
        Thread.sleep(2000);
        UserPageObj1.ClickUpdateUser();
        AssertionsFunction.verifyElementText(UserPageObj1.errmsg, UserPageObj1.errmsgBlankDataCreateRoleClick);
        Thread.sleep(2000);
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(10000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);
        Thread.sleep(1000);

    }

    @Test(priority = 7)
    public void valid_name_and_blank_password() throws Exception {
        //TC 23.7 Valid Name and Blank password.//Not showing error by Automation
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(4000);
        UserPageObj1.ClearPassword();
        Thread.sleep(6000);

        UserPageObj1.ClickUpdateUser();
        Thread.sleep(2000);
        // AssertionsFunction.verifyElementText(UserPageObj1.errmsg,UserPageObj1.errmsgBlankDataCreateRoleClick);
        Thread.sleep(4000);
        //  UserPageObj1.ClickOnCancelBtn();
        //   Thread.sleep(10000);

    }


    @Test(priority = 8)
    public void password_field_contains_alphabet_digit_special_char() throws Exception {
        //TC 23.9 The password field should only contain alphabets, digits, and special characters.
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(1000);
        UserPageObj1.ClearPassword();
        Thread.sleep(3000);
        UserPageObj1.EnterPassword(ReadProps.readAttr("SpecialCharPwd"));
        Thread.sleep(2000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(10000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);

    }

    @Test(priority = 9)
    public void password_field_must_have_at_least_one_upper_lower_alphabet() throws Exception {
        //TC 23.10 The password field must have at least 1 uppercase and 1 lowercase alphabet.
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(2000);
        UserPageObj1.ClearPassword();
        Thread.sleep(3000);
        UserPageObj1.EnterPassword(ReadProps.readAttr("UpperLowerCasePwd"));
        Thread.sleep(2000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(10000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);

    }

    @Test(priority = 10)
    public void password_field_must_have_length_to_be_minimum_eight() throws Exception {
        //TC 23.11 The password field length has to be minimum 8.
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(2000);
        UserPageObj1.ClearPassword();
        Thread.sleep(3000);
        UserPageObj1.EnterPassword(ReadProps.readAttr("UpperLowerCasePwd"));
        Thread.sleep(2000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(10000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);


    }

    @Test(priority = 11)
    public void password_field_length_max_length_twelve() throws Exception {
        //TC 23.12 The password field length has to be maximum 12.
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(2000);
        UserPageObj1.ClearPassword();
        Thread.sleep(3000);
        UserPageObj1.EnterPassword(ReadProps.readAttr("MaxLimit"));
        Thread.sleep(2000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(10000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);


    }

    @Test(priority = 12)
    public void only_alphabets() throws Exception {
        //TC 23.13 Only Alphabets.
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(2000);
        UserPageObj1.ClearPassword();
        Thread.sleep(3000);
        UserPageObj1.EnterPassword(ReadProps.readAttr("OnlyAlphabets"));
        Thread.sleep(3000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(3000);
        Thread.sleep(10000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);

    }

    @Test(priority = 13)

    public void password_field_onlyDigits() throws Exception {

        //Only Digits
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(1000);
        UserPageObj1.ClearPassword();
        Thread.sleep(3000);
        UserPageObj1.EnterPassword(ReadProps.readAttr("OnlyDigits"));
        Thread.sleep(2000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText(UserPageObj1.errmsg, UserPageObj1.errmsgBlankDataCreateRoleClick);
        Thread.sleep(2000);
       // AssertionsFunction.verifyElementPresent(CreateUserPage.ErrMsgOnlyDigitsPWD);
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(3000);
    }

    @Test(priority = 14)

    public void password_field_onlySpecialCharectors() throws Exception {

        //Only SpecialCharacter
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(1000);
        UserPageObj1.ClearPassword();
        Thread.sleep(2000);
        UserPageObj1.EnterPassword(ReadProps.readAttr("OnlySpecialChar"));
        Thread.sleep(2000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(3000);
        AssertionsFunction.verifyElementPresent(CreateUserPage.ErrMsgPWD);
        Thread.sleep(1000);
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(4000);

    }


    @Test(priority = 15)

    public void password_field_onlyUpperCase() throws Exception {


        //Only UpperCase
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(1000);
        UserPageObj1.ClearPassword();
        Thread.sleep(3000);
        UserPageObj1.EnterPassword(ReadProps.readAttr("OnlyUpperCase"));
        Thread.sleep(2000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(CreateUserPage.ErrMsgOnlyUpperCaseChar);
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(4000);

    }

    @Test(priority = 16)

    public void password_field_onlyLowerCase() throws Exception {

        //Only LowerCase
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(1000);
        UserPageObj1.ClearPassword();
        Thread.sleep(3000);
        UserPageObj1.EnterPassword(ReadProps.readAttr("OnlyLowerCase"));
        Thread.sleep(2000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(CreateUserPage.ErrMsgOnlylowerCaseChar);
        Thread.sleep(2000);
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(4000);
    }

    @Test(priority = 17)

    public void password_field_LessThan8CharLimit() throws Exception {


        // Only LessLowerLimit  less than minimum password length 7
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(1000);
        UserPageObj1.ClearPassword();
        Thread.sleep(3000);
        UserPageObj1.EnterPassword(ReadProps.readAttr("LessLowerLimit"));
        Thread.sleep(2000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(CreateUserPage.ErrMsgLwrLimitPWD);
        Thread.sleep(2000);

    }

    @Test(priority = 18)
    public void cancelUpdate() throws Exception {
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(6000);
    }


    @Test(priority = 19)
    public void userUpdateValidData() throws Exception {


        //Valid Update scenario required
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(3000);
        UserPageObj1.ClickToClearName();
        Thread.sleep(5000);
        UserPageObj1.EnterUserName(ReadProps.readAttr("ValidNameUP"));
        Thread.sleep(2000);
        UserPageObj1.ClearPassword();
        Thread.sleep(2000);
        UserPageObj1.EnterPassword(ReadProps.readAttr("ValidPWDUP"));
        Thread.sleep(2000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(6000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);
        Thread.sleep(2000);
        AssertionsFunction.verifyElementTextWithTrim(ReadProps.readAttr("ValidNameUP"), CreateUserPage.UserCreated);
        Thread.sleep(4000);

        //Remove update for script maintained only
        UserPageObj1.SearchCreatedUser(ReadProps.readAttr("ValidNameUP"));
        Thread.sleep(2000);
        UserPageObj1.SelectUpdatedUser();
        Thread.sleep(1000);
        UserPageObj1.ClickToClearName();
        Thread.sleep(2000);
        UserPageObj1.EnterUserName(ReadProps.readAttr("Username"));
        Thread.sleep(2000);
        UserPageObj1.ClearPassword();
        Thread.sleep(2000);
        UserPageObj1.EnterPassword(ReadProps.readAttr("ValidPWD"));
        Thread.sleep(2000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(4000);
        AssertionsFunction.verifyElementCreatedUpdatedTimeUpdated(CreateUserPage.UserUpdatedTime, CreateUserPage.UserCreatedTime);
        Thread.sleep(2000);
        UserPageObj1.LogOut();

    }

}

