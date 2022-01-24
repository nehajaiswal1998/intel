package Tests;
import Base.BasePage;
import Pages.ProjectFlowStructuredPage1;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;
@Listeners(Utilities.TestListeners.class)
public class ProjectFlowStructuredTest1 extends BasePage {
    @BeforeTest
    public void login() {
        try {
            BasePage.LoginTest();
        } catch (Exception e) {
            test.log(LogStatus.FAIL, e);
        }}
    @Test(priority = 1)
    public void disable_active_project_on_Project_page() throws InterruptedException, IOException {
        try {
            ProjectFlowStructuredPage1 ProjectPageObj = new ProjectFlowStructuredPage1(driver);
            //TC 1.1 Disable Project.
            ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("StructuredProjectName1"));
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructuredTest1//SearchProject.jpg");
            Thread.sleep(1000);
            ProjectPageObj.ClickEditProjectBtn();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructuredTest1//EditProject.jpg");
            Thread.sleep(1000);
            ProjectPageObj.ClickDisableProjectBtn();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructuredTest1//DisableProject.jpg");
            Thread.sleep(1000);
            ProjectPageObj.ClickUpdateBtn();
            Thread.sleep(6000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructuredTest1//DisabledProjectSuccessfully.jpg");
            Thread.sleep(1000);
            ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("StructuredProjectName1"));
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructuredTest1//SearchDisabledProjectCardView.jpg");
            Thread.sleep(1000);
            ProjectPageObj.ClearSearch();
            Thread.sleep(2000);
            test.log(LogStatus.INFO, "ProjectStructuredTC1");
            test.log(LogStatus.PASS, "TestPassed");
        } catch (Exception e) {
            test.log(LogStatus.FAIL, e);
        }}
    @Test(priority = 2)
    public void verify_disabled_project_on_Project_page() throws InterruptedException, IOException {
        try {
            //TC 1.2 Verify Disable Project in List View.
            ProjectFlowStructuredPage1 ProjectPageObj = new ProjectFlowStructuredPage1(driver);
            ProjectPageObj.TableStructure();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructuredTest1//ListView.jpg");
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("StructuredProjectName1"));
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructuredTest1//SearchDisabledProject.jpg");
            Thread.sleep(1000);
            ProjectPageObj.ClickEditProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickEnableProjectBtn();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructuredTest1//EnableProject.jpg");
            Thread.sleep(1000);
            ProjectPageObj.ClickUpdateBtn();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructuredTest1//EnabledProjectSuccessfully.jpg");
            Thread.sleep(1000);
            test.log(LogStatus.INFO, "ProjectStructuredTC2");
            test.log(LogStatus.PASS, "TestPassed");
            driver.close();
        } catch (Exception e) {
            test.log(LogStatus.FAIL, e);
        }}}