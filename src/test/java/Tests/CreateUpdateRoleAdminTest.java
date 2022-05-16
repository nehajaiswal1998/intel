package Tests;
import Base.BasePage;
import Pages.CreateRolePage;
import Utilities.AssertionsFunction;
import Utilities.Functions;
import Utilities.LoginUser;
import Utilities.ReadProps;
import org.testng.Assert;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import static Pages.CreateRolePage.*;
@Listeners(Utilities.TestListeners.class)
public class CreateUpdateRoleAdminTest extends BasePage {
    static CreateRolePage CreateRolePageObj;

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
    public void login_with_valid_details() throws Exception {
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        CreateRolePageObj = new CreateRolePage(driver);
        //TC 2.1 Login with Valid Admin details.
        LoginUser.login_users(driver,ReadProps.readAttr("AdminUser"),ReadProps.readAttr("AdminPwd"));
        CreateRolePageObj.clickOnRoleMenu();
        CreateRolePageObj.clickOnCreateRoleButton();

   }
   @Test(priority = 2)
    public void blank_role_name_permission() throws Exception {
        //TC 2.2 Blank RoleName and Permission.
        CreateRolePageObj.clickOnCreateButton();
    }
    @Test(priority = 3)
    public void valid_role_name_blank_permission() throws Exception {
        //TC 2.3 Valid RoleName and Blank Permission.
        CreateRolePageObj.enterNewRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u ran
        CreateRolePageObj.activeOrInactiveRoleButton();
        CreateRolePageObj.clickOnCreateButton();

    }
    @Test(priority = 4)
    public void blank_role_name_valid_permission() throws Exception {
        //TC 2.4 Blank RoleName and Valid Permission.
        driver.navigate().refresh();
        CreateRolePageObj.activeOrInactiveRoleButton();
        CreateRolePageObj.clickOnAddPermissionButton("View Document");
        CreateRolePageObj.SelectViewDocumentPermission();
        CreateRolePageObj.clickOnCreateButton();
        CreateRolePageObj.clickOnCancelButton();


    }
    @Test(priority = 5)
    public void valid_role_and_permission() throws Exception {
        //TC 2.5 Valid Role and Valid Permission.
        driver.navigate().refresh();
        CreateRolePageObj.activeOrInactiveRoleButton();
        CreateRolePageObj.enterNewRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u run
        CreateRolePageObj.clickOnAddPermissionButton("View Document");
        CreateRolePageObj.SelectViewDocumentPermission();
        CreateRolePageObj.clickOnCreateButton();
        String expectedDate = Functions.getCurrentDate();
        System.out.println("expectedDate="+expectedDate);
        System.out.println("driver.findElement(CreatedTime).getText()="+driver.findElement(CreatedTime).getText());

    }
    @Test(priority = 6)
    public void create_role_with_existing_rolename() throws Exception {
        //TC 2.6 Create Role with Existing Role Name.
        CreateRolePageObj.clickOnCreateRoleButton();
        CreateRolePageObj.activeOrInactiveRoleButton();
        CreateRolePageObj.enterExistingRoleNameOrInvalidRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u ran
        CreateRolePageObj.clickOnAddPermissionButton("View Document");
        CreateRolePageObj.SelectViewDocumentPermission();
        CreateRolePageObj.clickOnCreateButton();
        CreateRolePageObj.clickOnCancelButton();
    }
   @Test(priority = 7)
    public void search_created_role() throws Exception {
        //TC 2.7 Search the Created Role or not
        CreateRolePageObj.searchCreatedRole(ReadProps.readAttr("RoleName"));
    }
    @Test(priority = 8)
    public void update_role_with_valid_data() throws Exception {
        //TC 2.8 Update Role with Valid Data.
        CreateRolePageObj.clickOnEditRole();
        CreateRolePageObj.clickOnAddPermissionButton("Update Project");
        CreateRolePageObj.SelectUpdateProject();
        CreateRolePageObj.ClickUpdateBtn();
        String expectedDate = Functions.getCurrentDate();
        // verify Created and Updated Time date diff After Updation
        System.out.println("expectedDate="+expectedDate);
        System.out.println("driver.findElement(UpdatedTime).getText()="+driver.findElement(UpdatedTime).getText());


    }
    @Test(priority = 9)
    public void remove_all_permissions() throws Exception {
        //TC 2.9 Remove All Permissions and Update.
        CreateRolePageObj.clickOnEditRole();
        CreateRolePageObj.ClickRemovePermission();
        CreateRolePageObj.ClickUpdateBtn();
        CreateRolePageObj.clickOnCancelButton();

    }
    @Test(priority = 10)
    public void disable_the_status_of_role_update() throws Exception {
        //TC 2.10 Disable the Status of Role and Update.
        CreateRolePageObj.clickOnEditRole();
        CreateRolePageObj.activeOrInactiveRoleButton();
        CreateRolePageObj.ClickUpdateBtn();

    }
    @Test(priority = 11)
    public void enable_status_role_update() throws Exception {
            //TC 2.11 Enable the Status of Role and Update.
            CreateRolePageObj.clickOnEditRole();
            CreateRolePageObj.activeOrInactiveRoleButton();
            CreateRolePageObj.ClickUpdateBtn();
    }
    @Test(priority = 13)
    public void Creating_role_invalid_data_in_RoleName_Permissions() throws Exception {
        //TC-3.2 Verify the working of admin for Creating role by putting invalid data in Role name, blank Permissions
        CreateRolePageObj.clickOnCreateRoleButton();
        CreateRolePageObj.enterExistingRoleNameOrInvalidRoleName(ReadProps.readAttr("InvalidRoleName"));
        CreateRolePageObj.activeOrInactiveRoleButton();
        CreateRolePageObj.clickOnCreateButton();
        CreateRolePageObj.clickOnCancelButton();
    }
    @Test(priority = 14)
    public void Creating_role_invalid_data_with_disabled_status() throws Exception {
       //TC 3.5 Verify the working of admin for Create role button when user status is disabled
        CreateRolePageObj.enterExistingRoleNameOrInvalidRoleName(ReadProps.readAttr("InvalidRoleName"));
        CreateRolePageObj.clickOnAddPermissionButton("Update User");
        CreateRolePageObj.SelectUpdateUser();
        CreateRolePageObj.activeOrInactiveRoleButton();
        CreateRolePageObj.clickOnCreateButton();
        CreateRolePageObj.clickOnCancelButton();
        driver.navigate().refresh();
    }
    @Test(priority = 15)
    public void Updating_role_invalid_data_RolenamePermissions() throws Exception
    {
        //TC 4.2  Verify the working of admin for Updating the role by putting invalid data in Role name,Permissions
        CreateRolePageObj.enterExistingRoleNameOrInvalidRoleName(ReadProps.readAttr("InvalidRoleName"));
        CreateRolePageObj.clickOnCreateButton();
    }
    @Test(priority = 16)
    public void Sorting_role() throws Exception
    {
        //TC 6.1 Sorting by role, permission,updated,created
        CreateRolePageObj.clickOnRoleMenu();
        CreateRolePageObj.clickOnSortButton();
        LoginUser.logoutUser(driver);

    }


}