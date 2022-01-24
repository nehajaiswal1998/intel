package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ProjectFlowFreeFormTest extends BasePage {

    @Test
    public void FreeFormProjectFlow(){

        try {

            BasePage.LoginTest();
            Robot r = new Robot();
            ProjectPage ProjectPageObj = new ProjectPage(driver);
            DocumentPage DocPageObj = new DocumentPage(driver);
            test.log(LogStatus.INFO, "FreeFormProject");
            test.log(LogStatus.PASS, "TestPassed");

            //TC 15.1 Verify Create Project without adding the Attributes and Role.
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(5000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("FreeFormProjectName1"));
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
            ProjectPageObj.SelectOnFreeFormStructure();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStraightThroughProcessBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnCreate();
            ProjectPageObj.VerifyAssertForBlank();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowFree-Form//ErrorAttribute.jpg");
            Thread.sleep(3000);

            //TC 15.2 Verify Create Project without adding the Role.
            ProjectPageObj.ClickOnAddFieldBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectFieldValue();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowFree-Form//FieldValueSelected.jpg");
            Thread.sleep(4000);
            ProjectPageObj.ClickOnCreate();
            ProjectPageObj.VerifyAssertForRole();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowFree-Form//ErrorRole.jpg");
            Thread.sleep(2000);

            //TC 15.3 Verify Create Project without adding the User.
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSelectRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnCreate();
            ProjectPageObj.VerifyAssertForUser();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowFree-Form//ErrorUser.jpg");
            Thread.sleep(2000);

            //TC 15.4 Verify Add User.
            ProjectPageObj.ClickOnAddUserBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSelectUserBtn();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(3000);

            //TC 15.5 Navigate Next to Data Page and Rules Page and Back to Project Page.
            ProjectPageObj.ClickNextPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowFree-Form//DataPage.jpg");
            Thread.sleep(1000);
            ProjectPageObj.ClickRulesPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowFree-Form//RulesPage.jpg");
            Thread.sleep(4000);
            ProjectPageObj.ClickBackRulePage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowFree-Form//BackRulepage.jpg");
            ProjectPageObj.CLickBackDataPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowFree-Form//BackDatapage.jpg");

            //TC 15.6 Verify Create Project with Valid Details.
            ProjectPageObj.ClickOnCreate();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowFree-Form//PleaseAddAttributes.jpg");
            Thread.sleep(9000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowFree-Form//ProjectCreatedSuccess.jpg");
            driver.close();
        }

        catch (Exception e) {
            test.log(LogStatus.FAIL, e);
        }}
}