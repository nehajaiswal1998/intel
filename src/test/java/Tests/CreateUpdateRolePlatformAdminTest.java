package Tests;
import Base.BasePage;
import Pages.CreateRolePage;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import org.testng.Assert;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

import static Pages.CreateRolePage.*;
import static Pages.CreateRolePage.errormsgBlankDataCreateRoleClick;

@Listeners(Utilities.TestListeners.class)
public class CreateUpdateRolePlatformAdminTest extends BasePage
{
    static CreateRolePage CreateRolePageObj ;

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
    public void create_role_with_blank_rolename_permission() throws Exception {
        CreateRolePageObj = new CreateRolePage(driver);
        Thread.sleep(2000);
        CreateRolePageObj.ClickRoleManagementBtn();
        Thread.sleep(6000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);

        //TC 3.1 Create Role with Blank RoleName and Permission.
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText(errormsg,errormsgBlankDataCreateRoleClick);
        driver.navigate().refresh();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
    }
    @Test(priority = 2)
    public void create_role_with_valid_rolename_blank_permission() throws Exception {
        //TC 3.2 Create Role with Valid RoleName and Blank Permission.
        CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleNamePA"));//Change everytime before u ran
        Thread.sleep(2000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText(errormsg,errormsgBlankDataCreateRoleClick);
        driver.navigate().refresh();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
    }
    @Test(priority = 3)
    public void create_role_with_blank_rolename_valid_permission() throws Exception {
        //TC 3.3 Create Role with Blank RoleName and Valid Permission.
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(4000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.SelectViewDocumentPermission();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getViewDocumentPermission()));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText(errormsg,errormsgBlankDataCreateRoleClick);
        CreateRolePageObj.ClickCancelButton();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
    }
         /*   // Create AE admin role
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("AdminRole"));
            Thread.sleep(4000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(2000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            CreateRolePageObj.SelectCreateUserPermission();
            Thread.sleep(1000);
            CreateRolePageObj.SelectCreateProject();
            Thread.sleep(1000);
            CreateRolePageObj.SelectViewUser();
            Thread.sleep(1000);
            CreateRolePageObj.SelectUpdateRole();
            Thread.sleep(1000);
            CreateRolePageObj.SelectViewRole();
            Thread.sleep(1000);
            CreateRolePageObj.SelectUpdateProject();
            Thread.sleep(1000);
            CreateRolePageObj.SelectUpdateUser();
            Thread.sleep(1000);
            CreateRolePageObj.SelectCreateTemplate();
            Thread.sleep(1000);
            CreateRolePageObj.SelectCreateRole();
            Thread.sleep(1000);
            CreateRolePageObj.SelectViewAnalytics();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(3000);
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(4000);
*/

    // Create AE supervisor Role
        /*    CreateRolePageObj.EnterRoleName(ReadProps.readAttr("SupervisorRole"));
            Thread.sleep(4000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(4000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            CreateRolePageObj.SelectViewDocumentPermission();
            Thread.sleep(1000);
            CreateRolePageObj.SelectCreateTemplate();
            Thread.sleep(1000);
            CreateRolePageObj.ClickProcessDocPermission();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(3000);
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(4000);*/

    /* //Create AE Operator Role
     CreateRolePageObj.EnterRoleName(ReadProps.readAttr("OperatorRole"));
     Thread.sleep(4000);
     CreateRolePageObj.ClickActiveRole();
     Thread.sleep(4000);
     CreateRolePageObj.AddPermissionPlusBtn();
     Thread.sleep(4000);
     CreateRolePageObj.SelectViewDocumentPermission();
     Thread.sleep(1000);
     CreateRolePageObj.ClickProcessDocPermission();
     Thread.sleep(2000);
     r.keyPress(KeyEvent.VK_ESCAPE);
     Thread.sleep(3000);
     CreateRolePageObj.ClickCreateButton();
     Thread.sleep(4000);*/
    @Test(priority = 4)
    public void create_role_with_valid_rolename_permission() throws Exception {
        //TC 3.4 Create Role with Valid Role Name and Permission.
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleNamePA"));//Change everytime before u ran
        Thread.sleep(2000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.SelectViewDocumentPermission();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getViewDocumentPermission()));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(5000);
    }
    @Test(priority = 5)
    public void create_role_with_existing_name() throws Exception {
        //TC 3.5 Create Role with Existing Name.
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleNamePA"));
        Thread.sleep(2000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.SelectViewDocumentPermission();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getViewDocumentPermission()));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(4000);
        CreateRolePageObj.ClickCancelButton();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
    }
    @Test(priority = 6)
    public void search_created_role() throws Exception {
        //TC 3.6 Search the Created Role.
        CreateRolePageObj.SearchCreatedRole(ReadProps.readAttr("RoleNamePA"));
        Thread.sleep(3000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getSearch_created_role_element()));
    }
    @Test(priority = 7) // added
    public void ClickOnCancelBtnOn_RoleUpdation() throws InterruptedException {
        //3.15 Verify functionality of Cancel button on Role Updation Page.
        CreateRolePageObj.ClickEditRole1();
        Thread.sleep(5000);
        CreateRolePageObj.ClickCancelButton();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
    }

    @Test(priority = 8)
    public void update_role_with_valid_data() throws Exception {
        //TC 3.7 Update Role with Valid Data.
        CreateRolePageObj.ClickEditRole1();
        Thread.sleep(5000);
        CreateRolePageObj.ClickRemovePermission();
        Thread.sleep(2000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.ClickProcessDocPermission();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getViewApiConfig()));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
    }
    @Test(priority = 9)
    public void remove_all_permissions_update() throws Exception {
        //TC 3.8 Remove all Permissions and Update.
        CreateRolePageObj.ClickEditRole1();
        Thread.sleep(5000);
        CreateRolePageObj.ClickRemovePermission();
        Thread.sleep(2000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText(errormsg,errormsgBlankDataCreateRoleClick);
        CreateRolePageObj.ClickCancelButton();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
    }
    @Test(priority = 10)
    public void adding_new_permission() throws InterruptedException, AWTException {
        //
        CreateRolePageObj.ClickEditRole1();
        Thread.sleep(5000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.ClickViewApiConfig();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getProcessDocumentPermission()));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
    }
    @Test(priority = 11)
    public void disable_status_role_update() throws Exception {
        //TC 3.9 Disable Status of Role and Update.
        CreateRolePageObj.ClickEditRole1();
        Thread.sleep(5000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);

    }
    @Test(priority = 12)
    public void enable_status_role_update() throws Exception {
        //TC 3.10 Enable the Status of Role and Update.
        CreateRolePageObj.ClickEditRole1();
        Thread.sleep(5000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
       }
    @Test(priority = 13)
    public void  CreateRole_with_Valid_Rolename_Valid_Permission_with_Active() throws InterruptedException, IOException, AWTException {
        //TC 3.2 Verify the Roles functionality of the Platform Admin to Create Role with  Valid Rolename and Valid Permission with Active.
        Thread.sleep(4000);
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleNamePAA"));//Change everytime before u ran
        Thread.sleep(2000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.SelectViewDocumentPermission();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getViewDocumentPermission()));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(6000);
    }
    @Test(priority = 14)
    public void ClickOn_Cancel_button_on_Role_Creation_Page() throws InterruptedException {
        //TC 3.7  Verify functionality of Cancel button on Role Creation Page.
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.ClickCancelButton();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
    }
    @Test(priority = 15)
    public void validation_Role_Name_New_Role_creation_Page() throws InterruptedException, IOException, AWTException {
        //TC 3.8 Verify the validation of Role Name textbox on New Role creation Page.
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.EnterRoleName(ReadProps.readAttr("InvalidRoleName"));
        Thread.sleep(2000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(1000);
        //
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getvalidationMsg()));
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.SelectViewDocumentPermission();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getViewDocumentPermission()));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(1000);
        AssertionsFunction.verifyElementText(errormsg,errormsgBlankDataCreateRoleClick);
        CreateRolePageObj.ClickCancelButton();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
    }
    @Test(priority = 16)
    public void Creating_role_with_invalid_data() throws InterruptedException, IOException, AWTException {
        //3.14 Verify the working of platform admin for Creating role by putting invalid data.
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.EnterRoleName(ReadProps.readAttr("InvalidRoleName"));
        Thread.sleep(2000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(1000);
        AssertionsFunction.verifyElementText(errormsg,errormsgBlankDataCreateRoleClick);
        CreateRolePageObj.ClickCancelButton();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
        CreateRolePageObj.ClickLogout();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(loginPage_url);
    }
}