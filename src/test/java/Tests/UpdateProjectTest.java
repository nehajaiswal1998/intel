package Tests;

import Base.BasePage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class UpdateProjectTest extends BasePage{

        @Test
        public void UpdateProjectFlow() throws InterruptedException, IOException {
            try {

                BasePage.LoginTest();
                Robot r = new Robot();
                Thread.sleep(9000);
                ProjectPage ProjectPageObj = new ProjectPage(driver);
                test.log(status.INFO, "TestInformation");
                test.log(status.PASS, "TestPassed");
                // 5 Verify the working of platform Admin for  Updating Project by entering Valid Data
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(5000);
                ProjectPageObj.SearchProject();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnLeadBtn();
                Thread.sleep(2000);
                ProjectPageObj.SelectOnLeadSampleBtn();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnProcessingEngineBtn();
                Thread.sleep(4000);
                ProjectPageObj.SelectOnProcessingEngineLowBtn();
                Thread.sleep(2000);
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//Lead&ProcessingEngine.jpg");
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(5000);

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
                Thread.sleep(6000);
                ProjectPageObj.ClickOnProcessingEngineBtn();
                Thread.sleep(4000);
                ProjectPageObj.SelectOnProcessingEngineBtn();
                Thread.sleep(4000);
                TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//Lead.jpg");
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(3000);

                //Verify the working of platform admin for Update Project button  when role and user status is disabled
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
                Thread.sleep(5000);

                // User Disable
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

                //  Verify that all Disabled roles are not displayed in add role list while updating a project by platform admin
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
                Thread.sleep(1000);
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(4000);

                // User status is enabled
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
                Thread.sleep(3000);
                System.out.println("User updated");

                //Verify the working of platform admin for Update Project button  when role and user status is enabled
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProject();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnRolesBtn();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnRoleUserDisableEnable();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(2000);

              //  Verify that all enabled roles are displayed in add role list while updating a project by platform admin
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProject();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnLeadBtn();
                Thread.sleep(4000);
                ProjectPageObj.SelectOnLeadAdminBtn();
                TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//Userdisplayedinlead.jpg");
                Thread.sleep(4000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(2000);

                //Verify that while updating project user should not able to add user when role is disabled for project
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

                //Verify that while updating project role should not have an empty user
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
                ProjectPageObj.ClickOnUpdateProject();
                TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//EmptyUser.jpg");
                ProjectPageObj.VerifyAssertForUser();
                Thread.sleep(2000);
                System.out.println("empty user");
                ProjectPageObj.ClickOnCancelProject();
                Thread.sleep(4000);
                ProjectPageObj.ClickLogout();
                driver.navigate().refresh();

                // Creation of Project By admin
                // Create Project
                ProjectPageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
                Thread.sleep(2000);
                ProjectPageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
                Thread.sleep(2000);
                ProjectPageObj.ClickLoginButton();
                Thread.sleep(12000);

                // 5 Verify the working of  admin for  Updating project by putting valid data
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(5000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnLeadBtn();
                Thread.sleep(4000);
                ProjectPageObj.SelectOnLeadSampleBtn();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnProcessingEngineBtn();
                Thread.sleep(4000);
                ProjectPageObj.SelectOnProcessingEngineLowBtn();
                Thread.sleep(3000);
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//Lead&ProcessingEngine.jpg");
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(2000);

                //to maintain script
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnLeadBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickSearchLead("admin@test.com");
                Thread.sleep(2000);
                ProjectPageObj.SelectOnLeadAdminBtn();
                Thread.sleep(6000);
                ProjectPageObj.ClickOnProcessingEngineBtn();
                Thread.sleep(4000);
                ProjectPageObj.SelectOnProcessingEngineBtn();
                Thread.sleep(4000);
                TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//Lead.jpg");
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(3000);

                //Verify the working of admin for Update Project button  when role and user status is disabled
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnRolesBtn();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnRoleUserDisableEnable();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(2000);

                // User Disable
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

                //  Verify that all Disabled roles are not displayed in add role list while updating a project by admin
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnLeadBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickSearchLead("admin@test.com");
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//UserNotDisplayed.jpg");
                ProjectPageObj.ClearSearchLead();
                Thread.sleep(2000);
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(4000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(2000);

                // User status is enabled
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

                //Verify the working of  admin for Update Project button  when role and user status is enabled
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnRolesBtn();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnRoleUserDisableEnable();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(2000);

                //  Verify that all enabled roles are displayed in add role list while updating a project by platform admin
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnLeadBtn();
                Thread.sleep(4000);
                ProjectPageObj.SelectOnLeadAdminBtn();
                Thread.sleep(4000);
                TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//Userdisplayedinlead.jpg");
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(2000);

                //Verify that while updating project user should not able to add user when role is disabled for project
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
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

                //Verify that while updating project role should not have an empty user
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnRolesBtn();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnAddRoleBtn();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnSelectSupervisorRoleBtn();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnUpdateProject();
                TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//EmptyUser.jpg");

                ProjectPageObj.VerifyAssertForUser();
                Thread.sleep(2000);
                System.out.println("empty user");
                ProjectPageObj.ClickOnCancelProject();
                Thread.sleep(4000);

              // Verify that project status is disabled for admin when the action checkbox  of the status is false
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnStatusBtn();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//DisableProjectStatus.jpg");
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(2000);

                // Verify that project status is enabled for admin when the action checkbox  of the status is True
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnStatusBtn();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//ProjectUpdate//EnableProjectStatus.jpg");
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickLogout();
                ProjectPageObj.SoftAssertAll();
                Thread.sleep(4000);
                driver.close();
            } catch (Exception e) {
                test.log(status.FAIL, e);
            }

        }
    }


