package Tests;

import Base.BasePage;
import Pages.LoginPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
@Listeners(Utilities.TestListeners.class)
public class ProjectFlowMedicalChart extends BasePage {

    @Test
    public void ProjectFlow() throws InterruptedException, IOException {
        try {

            BasePage.LoginTest();
            Robot r = new Robot();
            ProjectPage ProjectPageObj = new ProjectPage(driver);
            test.log(LogStatus.INFO, "ProjectFlowMedicalChart");
            test.log(LogStatus.PASS, "TestPassed");

            //TC 16.1 Checking all the functionalities on the Project Page Platform Admin.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(6000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("MedicalChartProjectName1"));//change this name in Obj file.
            Thread.sleep(2000);
            ProjectPageObj.ClickOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStartDateBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectStartDateBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEndDate();
            Thread.sleep(2000);
            ProjectPageObj.SelectEndDate();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentStructureBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectDocumentStructureMedicalBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(2000);

            //TC 16.2 Verify Create Project without Entities and Role.
            ProjectPageObj.ClickOnCreate();
            ProjectPageObj.VerifyAssertForEntities();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowMedicalChart//ErrorEntites.jpg");
            Thread.sleep(2000);

            //TC 16.3 Verify Create Project with Entities and without Role
            ProjectPageObj.ClickOnAddEntity();
            Thread.sleep(2000);
            ProjectPageObj.SelectPatientGraphics();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddEntity();
            Thread.sleep(2000);
            ProjectPageObj.SelectChronicConditions();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnCreate();
            ProjectPageObj.VerifyAssertForRole();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowMedicalChart//ErrorRole.jpg");
            Thread.sleep(2000);

            //TC 16.4 Verify Create Project without User.
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSelectRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnCreate();
            ProjectPageObj.VerifyAssertForUser();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowMedicalChart//ErrorUser.jpg");

            //TC 16.5 Verify Add User.
            ProjectPageObj.ClickOnAddUserBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSelectUserBtn();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);

            //16.6 Navigate Next to Data Page and Rules Page and Back also.
            ProjectPageObj.ClickNextPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowMedicalChart//DataPage.jpg");
            Thread.sleep(1000);
            ProjectPageObj.ClickRulesPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowMedicalChart//RulesPage.jpg");
            Thread.sleep(4000);
            ProjectPageObj.ClickBackRulePage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowMedicalChart//BackRulePage.jpg");
            ProjectPageObj.CLickBackDataPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowMedicalChart//BackDataPage.jpg");

            //TC 16.7 Verify Create Project with Valid Details.
            ProjectPageObj.ClickOnCreate();
            Thread.sleep(9000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowMedicalChart//ProjectCreatedSuccess.jpg");
            driver.close();
        } catch (Exception e) {
            test.log(LogStatus.FAIL, e);
        }

    }
}