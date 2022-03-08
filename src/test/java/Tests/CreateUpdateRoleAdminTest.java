package Tests;
import Base.BasePage;
import Pages.CreateRolePage;
import Utilities.AssertionsFunction;
import Utilities.Functions;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

import static Pages.CreateRolePage.*;


@Listeners(Utilities.TestListeners.class)
public class CreateUpdateRoleAdminTest extends BasePage {
    static CreateRolePage CreateRolePageObj;

    public CreateUpdateRoleAdminTest() throws IOException {
    }

    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
    public void login_with_valid_details() throws Exception {
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        Thread.sleep(9000);
        CreateRolePageObj = new CreateRolePage(driver);
        //TC 2.1 Login with Valid Admin details.
        CreateRolePageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
        Thread.sleep(1000);
        CreateRolePageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
        Thread.sleep(1000);
        CreateRolePageObj.ClickLoginButton();
        Thread.sleep(8000);
        AssertionsFunction.verifyTargetPageURL(homepage_url);
        CreateRolePageObj.ClickRoleManagementBtn();
        Thread.sleep(6000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);

    }
    @Test(priority = 2)
    public void blank_role_name_permission() throws Exception {
        //TC 2.2 Blank RoleName and Permission.
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText(errormsg,errormsgBlankDataCreateRoleClick);
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);


    }
    @Test(priority = 3)
    public void valid_role_name_blank_permission() throws Exception {
        //TC 2.3 Valid RoleName and Blank Permission.
        CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u ran
        Thread.sleep(2000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText(errormsg,errormsgBlankDataCreateRoleClick);
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);

    }
    @Test(priority = 4)
    public void blank_role_name_valid_permission() throws Exception {
        //TC 2.4 Blank RoleName and Valid Permission.
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.SelectViewDocumentPermission();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText(errormsg,errormsgBlankDataCreateRoleClick);
        CreateRolePageObj.ClickCancelButton();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);


    }
    @Test(priority = 5)
    public void valid_role_and_permission() throws Exception {
        //TC 2.5 Valid Role and Valid Permission.
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u run
        Thread.sleep(2000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.ClickProcessDocPermission();
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getProcessDocumentPermission()));
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);

    }
    @Test(priority = 6)
    public void create_role_with_existing_rolename() throws Exception {
        //TC 2.6 Create Role with Existing Role Name.
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u ran
        Thread.sleep(2000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.ClickProcessDocPermission();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getProcessDocumentPermission()));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getroleExist_errormsg()));
        CreateRolePageObj.ClickCancelButton();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
    }
    @Test(priority = 7) // below not excute
    public void search_created_role() throws Exception {
        //TC 2.7 Search the Created Role or not
        CreateRolePageObj.SearchCreatedRole(ReadProps.readAttr("RoleName"));//Change everytime before u ran
        Thread.sleep(3000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getCreatedRole()));

    }
    @Test(priority = 8)
    public void update_role_with_valid_data() throws Exception {
        //TC 2.8 Update Role with Valid Data.
        CreateRolePageObj.ClickEditRole();
        Thread.sleep(5000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.ClickProcessDocPermission();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getProcessDocumentPermission()));
        CreateRolePageObj.SelectViewDocumentPermission();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);

    }
    @Test(priority = 9)
    public void remove_all_permissions() throws Exception {
        //TC 2.9 Remove All Permissions and Update.
        CreateRolePageObj.ClickEditRole();
        Thread.sleep(3000);
        CreateRolePageObj.ClickRemovePermission();
        Thread.sleep(2000);
        CreateRolePageObj.ClickUpdateBtn();
        AssertionsFunction.verifyElementText(errormsg,errormsgBlankDataCreateRoleClick);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCancelButton();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
        Thread.sleep(1000);

    }
    @Test(priority = 10)
    public void disable_the_status_of_role_update() throws Exception {
        //TC 2.10 Disable the Status of Role and Update.
        CreateRolePageObj.ClickEditRole();
        Thread.sleep(5000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
        Thread.sleep(2000);

    }
    @Test(priority = 11)
    public void enable_status_role_update() throws Exception {
            //TC 2.11 Enable the Status of Role and Update.
            CreateRolePageObj.ClickEditRole();//Change This
            Thread.sleep(5000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(2000);
            CreateRolePageObj.ClickUpdateBtn();
            Thread.sleep(4000);
            CreateRolePageObj.ClickLogout();
            Thread.sleep(4000);
            AssertionsFunction.verifyTargetPageURL(loginPage_url);

    }
}