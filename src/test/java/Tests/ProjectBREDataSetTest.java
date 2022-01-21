package Tests;

import Base.BasePage;
import Pages.ProjectBREDataSetPage;
import Pages.ProjectBREPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class ProjectBREDataSetTest extends BasePage {

    @Test
    public void ProjectBREDataSetFlow() throws InterruptedException, IOException {
        try {
            BasePage.LoginTest();
            Robot r = new Robot();
            ProjectPage ProjectPageObj = new ProjectPage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");
            //Object creation
            ProjectBREDataSetPage ProjectBREDataSetPageObj = new ProjectBREDataSetPage(driver);

            //TC-1.1 BRE Applied to NAME RULE Using DataSet = Fail.
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(3000);
            //Navigate to Project Page.
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("BREProjectNameWithDataSet"));
            Thread.sleep(2000);
            ProjectPageObj.ClickOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnLeadBtn();
            Thread.sleep(2000);
            //Starting Date should be updated in Xpath to Current Date before executing the Script.
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
            ProjectPageObj.SelectDocumentStructureBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStraightThroughProcessBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddTemplateBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnTemplateBtn();
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
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,-1000)", "");
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREDataSetTest//ProjectDetails.jpg");
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,1000)", "");
            Thread.sleep(1000);
            //Navigate to Data Page.
            ProjectPageObj.ClickNextPage();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.ClickOnDataSets();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.ClickOnAddDataSets();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.ClickOnChooseDataSet();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.SelectDataSet();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREDataSetTest//DataSetAdded.jpg");
            Thread.sleep(2000);
            ProjectBREPage ProjectBREPageObj = new ProjectBREPage(driver);
            //Navigate to Rules Page.
            ProjectBREPageObj.ClickOnNextPageButton();
            Thread.sleep(3000);
            ProjectBREPageObj.ClickOnThreeDotsButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnProjectData();
            Thread.sleep(4000);
            ProjectBREPageObj.ClickOnProjectData();
            Thread.sleep(3000);
            ProjectBREPageObj.ClickOnDataSets();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnVariables();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnThreeDotsButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddRulesButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREDataSetTest//AddRule.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnDeleteRulesButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREDataSetTest//DeleteRule.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddRulesButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnExpandFirstRule();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREDataSetTest//ExpandRule.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnContractRuleButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREDataSetTest//ContractRule.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnVisibility();
            Thread.sleep(2000);
            ProjectBREPageObj.DoubleClickOnRule1();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnRule1();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnClearRule1();
            Thread.sleep(1000);
            ProjectBREPageObj.DoubleClickOnRule1Second();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnRule1();
            Thread.sleep(1000);
            ProjectBREPageObj.EnterRuleName("Sample Rule");
            Thread.sleep(1000);
            //Add Condition.
            ProjectBREPageObj.EnterAddNameOfCondition("Name");
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnAddCondition();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnAttributeValue();
            Thread.sleep(1000);
            ProjectBREPageObj.SelectNameAttribute();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnOperator();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.SelectOperatorValueExistsIn();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.ClickOnPredefinedDataSet();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.SelectPredefinedDataSet();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.ClickOnDataSetHeader();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.SelectDataSetHeader();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnSave();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREDataSetTest//ConditionSavedSuccessfully.jpg");
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.ClickOnFirstDataSetBox();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREDataSetTest//FirstConditionBox.jpg");
            Thread.sleep(4000);
//            ProjectBREPageObj.ClickOnCreateProjectButton();
//            Thread.sleep(6000);
//            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ProjectCreatedSuccessfully.jpg");
              driver.close();
            //Document should be uploaded from backend to check the output.
        }
        catch (Exception e) {
            test.log(status.FAIL, e);
        }
    }
}
