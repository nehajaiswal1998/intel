package Tests;

import Base.BasePage;
import Pages.DocumentPage;
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
public class ProjectFlowSemiStructureTest extends BasePage{
    @Test
    public void ProjectFlowSemiStructure() throws Exception {

            BasePage.LoginTest();
            Robot r = new Robot();
            ProjectPage ProjectPageObj = new ProjectPage(driver);
            DocumentPage DocPageObj = new DocumentPage(driver);
            test.log(LogStatus.INFO, "ProjectFlowSemiStructure");
            test.log(LogStatus.PASS, "TestPassed");

            //TC 17.1 Checking all the functionalities on the Project Page.
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("SemiStructuredProjectName1"));
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
            ProjectPageObj.SelectOnSemiStructure();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStraightThroughProcessBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
            Thread.sleep(2000);

            //TC 17.2 Checking Delete Attribute.
            ProjectPageObj.ClickOnDeleteAttributeFieldName();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowSemi-Structured//DeletedFieldNameAttribute.jpg");
            Thread.sleep(2000);

            //TC 17.3 Verify Create Project without Role.
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnCreate();
            ProjectPageObj.VerifyAssertForRole();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowSemi-Structured//RolesEmpty.jpg");
            Thread.sleep(2000);
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSelectRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddUserBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSelectUserBtn();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);

            //17.4 Navigate Next to Data Page and Rules Page and Back also.
            ProjectPageObj.ClickNextPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowSemi-Structured//DataPage.jpg");
            Thread.sleep(1000);
            ProjectPageObj.ClickRulesPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowSemi-Structured//RulesPage.jpg");
            Thread.sleep(4000);
            ProjectPageObj.ClickBackRulePage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowSemi-Structured//BackRulePage.jpg");
            ProjectPageObj.CLickBackDataPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowSemi-Structured//BackDataPage.jpg");

            //TC 17.5 Verify Create Project.
            ProjectPageObj.ClickOnCreate();
            Thread.sleep(9000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowSemi-Structured//ProjectCreatedSuccess.jpg");
            driver.close();
    }
}