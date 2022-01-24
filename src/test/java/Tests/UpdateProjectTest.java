package Tests;

import Base.BasePage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
@Listeners(Utilities.TestListeners.class)
public class UpdateProjectTest extends BasePage{

    @Test
    public void UpdateProjectFlow() throws InterruptedException, IOException {
        try {

            BasePage.LoginTest();
            Robot r = new Robot();
            ProjectPage ProjectPageObj = new ProjectPage(driver);
            test.log(LogStatus.INFO, "UpdateProject");
            test.log(LogStatus.PASS, "TestPassed");

            //TC 21.1 Verify the working of Platform Admin for  Updating Project by entering Valid Data.
            ProjectPageObj.SearchProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnLeadSampleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProcessingEngineBtn();
            Thread.sleep(1000);
            ProjectPageObj.SelectOnProcessingEngineLowBtn();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//UpdateProjectPageDetails.jpg");
            ProjectPageObj.ClickOnUpdateProject();
            Thread.sleep(4000);

            //To maintain script
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(5000);
            ProjectPageObj.SearchProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickSearchLead("admin@test.com");
            Thread.sleep(2000);
            ProjectPageObj.SelectOnLeadAdminBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnProcessingEngineBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//Lead.jpg");
            ProjectPageObj.ClickOnUpdateProject();
            Thread.sleep(4000);

            //TC 21.2 Verify the working of Platform Admin for Update Project button when Role and User Status is Disabled.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnRoleUserDisableEnable();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnUpdateProject();
            Thread.sleep(4000);

            //User Disable.
            ProjectPageObj.ClickUserBtn();
            Thread.sleep(3000);
            ProjectPageObj.SearchCreatedUser(ReadProps.readAttr("AdminRole"));
            Thread.sleep(2000);
            ProjectPageObj.SelectSearchedUser();
            Thread.sleep(1000);
            System.out.println("Clicked edit button");
            ProjectPageObj.ClickDisableUser();
            Thread.sleep(2000);
            ProjectPageObj.ClickUpdateUser();
            Thread.sleep(2000);
            System.out.println("User updated disable");

            //TC 21.3 Verify that all Disabled roles are not displayed in add role list while updating a project by Platform Admin.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(5000);
            ProjectPageObj.SearchProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickSearchLead("admin@test.com");
            TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//UserNotDisplayed.jpg");
            Thread.sleep(2000);
            ProjectPageObj.ClearSearchLead();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);
            ProjectPageObj.ClickOnUpdateProject();
            Thread.sleep(4000);

            //User status is enabled.
            ProjectPageObj.ClickUserBtn();
            Thread.sleep(3000);
            ProjectPageObj.SearchCreatedUser(ReadProps.readAttr("AdminRole"));
            Thread.sleep(2000);
            ProjectPageObj.SelectSearchedUser();
            Thread.sleep(1000);
            System.out.println("Clicked edit button");
            ProjectPageObj.ClickDisableUser();
            System.out.println("Clicked on Disabled button");
            Thread.sleep(2000);
            ProjectPageObj.ClickUpdateUser();
            Thread.sleep(3000);
            System.out.println("User Updated");

            //TC 21.4 Verify the working of Platform Admin for Update Project button  when role and user status is enabled.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(3000);
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnRoleUserDisableEnable();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnUpdateProject();
            Thread.sleep(4000);

            //TC 21.5 Verify that all enabled roles are displayed in add role list while updating a project by Platform Admin.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(3000);
            ProjectPageObj.ClickOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnLeadAdminBtn();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//UserDisplayedInLead.jpg");
            Thread.sleep(2000);
            ProjectPageObj.ClickOnUpdateProject();
            Thread.sleep(4000);

            //TC 21.6 Verify that while updating project user should not able to add user when role is disabled for project.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchProject();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnAddRoleBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnSelectSupervisorRoleBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnSupervisorRoleDisable();
            Thread.sleep(3000);
            ProjectPageObj.ClickOnAddUser();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//AESupervisorRoleDisabled.jpg");
            ProjectPageObj.VerifyAssertForRoleDisable();
            Thread.sleep(2000);
            System.out.println("AE supervisor role is disable");
            ProjectPageObj.ClickOnCancelProject();
            Thread.sleep(4000);

            //TC 21.7 Verify that while updating project Role should not have an empty user.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchProject();
            Thread.sleep(3000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(3000);
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSelectSupervisorRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnUpdateProject();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//EmptyUser.jpg");
            ProjectPageObj.VerifyAssertForUser();
            Thread.sleep(4000);
            System.out.println("empty user");
            ProjectPageObj.ClickOnCancelProject();
            Thread.sleep(4000);
            ProjectPageObj.ClickLogout();
            Thread.sleep(3000);

            //Creation of Project By admin.
            ProjectPageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(2000);
            ProjectPageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(2000);
            ProjectPageObj.ClickLoginButton();
            Thread.sleep(6000);

            //TC 21.8 Verify the working of  Admin for Updating project by entering valid data.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchProjectAdmin();
            Thread.sleep(5000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnLeadSampleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnProcessingEngineLowBtn();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//Lead&ProcessingEngine.jpg");
            ProjectPageObj.ClickOnUpdateProject();
            Thread.sleep(4000);

            //To maintain script.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchProjectAdmin();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickSearchLead("admin@test.com");
            Thread.sleep(2000);
            ProjectPageObj.SelectOnLeadAdminBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnProcessingEngineBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//Lead.jpg");
            ProjectPageObj.ClickOnUpdateProject();
            Thread.sleep(4000);

            //TC 21.9 Verify the working of Admin for Update Project button  when role and user status is Disabled.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchProjectAdmin();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnRoleUserDisableEnable();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnUpdateProject();
            Thread.sleep(4000);

            //User Disable.
            ProjectPageObj.ClickUserBtn();
            Thread.sleep(3000);
            ProjectPageObj.SearchCreatedUser(ReadProps.readAttr("AdminRole"));
            Thread.sleep(2000);
            ProjectPageObj.SelectSearchedUser();
            Thread.sleep(1000);
            System.out.println("Clicked edit button");
            ProjectPageObj.ClickDisableUser();
            Thread.sleep(2000);
            ProjectPageObj.ClickUpdateUser();
            Thread.sleep(2000);
            System.out.println("User updated disable ");

            //TC 21.10 Verify that all Disabled roles are not displayed in add role list while updating a project by Admin.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchProjectAdmin();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickSearchLead("admin@test.com");
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//UserNotDisplayed.jpg");
            ProjectPageObj.ClearSearchLead();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);
            ProjectPageObj.ClickOnUpdateProject();
            Thread.sleep(4000);

            //User status is enabled
            ProjectPageObj.ClickUserBtn();
            Thread.sleep(3000);
            ProjectPageObj.SearchCreatedUser(ReadProps.readAttr("AdminRole"));
            Thread.sleep(2000);
            ProjectPageObj.SelectSearchedUser();
            Thread.sleep(1000);
            System.out.println("Clicked edit button");
            ProjectPageObj.ClickDisableUser();
            Thread.sleep(2000);
            ProjectPageObj.ClickUpdateUser();
            Thread.sleep(2000);
            System.out.println("User updated");

            //TC 21.11 Verify the working of Admin for Update Project button  when role and user status is enabled.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchProjectAdmin();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnRoleUserDisableEnable();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnUpdateProject();
            Thread.sleep(4000);

            //TC 21.12 Verify that all enabled roles are displayed in add role list while updating a project by Platform Admin.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchProjectAdmin();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnLeadAdminBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//UserDisplayedInLead.jpg");
            ProjectPageObj.ClickOnUpdateProject();
            Thread.sleep(4000);

            //TC 21.13 Verify that while updating project user should not able to add user when role is disabled for project for Supervisor.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchProjectAdmin();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSelectSupervisorRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSupervisorRoleDisable();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddUser();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//AESupervisorRoleDisabled.jpg");
            ProjectPageObj.VerifyAssertForRoleDisable();
            Thread.sleep(2000);
            System.out.println("AE supervisor role is disable");
            ProjectPageObj.ClickOnCancelProject();
            Thread.sleep(4000);

            //TC 21.14 Verify that while updating project role should not have an empty user for Supervisor.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchProjectAdmin();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSelectSupervisorRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnUpdateProject();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//EmptyUser.jpg");
            ProjectPageObj.VerifyAssertForUser();
            Thread.sleep(4000);
            System.out.println("empty user");
            ProjectPageObj.ClickOnCancelProject();
            Thread.sleep(5000);

            //TC 21.15 Verify that project status is disabled for admin when the action checkbox  of the status is false.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchProjectAdmin();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//DisableProjectStatus.jpg");
            ProjectPageObj.ClickOnUpdateProject();
            Thread.sleep(4000);

            //TC 21.16 Verify that project status is enabled for admin when the action checkbox  of the status is True.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchProjectAdmin();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//EnableProjectStatus.jpg");
            ProjectPageObj.ClickOnUpdateProject();
            Thread.sleep(4000);
            ProjectPageObj.ClickLogout();
            Thread.sleep(4000);
            driver.close();
        } catch (Exception e) {
            test.log(LogStatus.FAIL, e);
        }

    }
}


