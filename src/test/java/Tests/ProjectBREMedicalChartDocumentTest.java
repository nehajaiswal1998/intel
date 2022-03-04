package Tests;
import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectBREMedicalChartDocumentPage;
import Utilities.Functions;
import Utilities.ReadProps;
import Utilities.verifyAssertions;
import org.testng.Assert;
import org.testng.annotations.*;
@Listeners(Utilities.TestListeners.class)

public class ProjectBREMedicalChartDocumentTest extends BasePage {
        static  ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj;
        static verifyAssertions verifyAssertionsobj;
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
    public void verify_save_draft_option_for_patient_demographics() throws Exception {
            //Object Creation.
            ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
            DocumentPage DocPageObj = new DocumentPage(driver);
            verifyAssertionsobj=new verifyAssertions(driver);
            DocPageObj.ClickDocumentBtn();
            Thread.sleep(6000);
            verifyAssertionsobj.verify_webpage_url(DocPageObj.DocTabUrl);
            //TC 1 Verifying the Save Draft option for Patient Demographics.
            DocPageObj.ClickDropDownBtn();
            Thread.sleep(2000);
            //Search Medical Chart Project.
            DocPageObj.ClickSearchProject(ReadProps.readAttr("MedicalChartProjectName"));
            Thread.sleep(2000);
            DocPageObj.ClickSelectMedicalChartProject();
            Thread.sleep(2000);
            //Open Ready Document.
            ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
            Thread.sleep(8000);
            verifyAssertionsobj.verify_webpage_url(DocPageObj.ClickOnReadyDocumentUrl);
            ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
            Thread.sleep(2000);
            Assert.assertTrue(Functions.isElementPresent(DocPageObj.getpatientDemographics()));
            //Clear the Address.
            ProjectBREMedicalChartDocumentPageObj.ClickOnClearAddress();
            Thread.sleep(2000);
            //Enter New Address.
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterAddress(ReadProps.readAttr("BREAddress"));
            Thread.sleep(2000);
            //Click on Save Draft.
            ProjectBREMedicalChartDocumentPageObj.ClickOnSaveDraft();
            Thread.sleep(6000);
            verifyAssertionsobj.verify_webpage_url(DocPageObj.DocTabUrl);
            //Open the Same Ready document.
            ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
            Thread.sleep(8000);
            verifyAssertionsobj.verify_webpage_url(DocPageObj.ClickOnReadyDocumentUrl);
            //Verify the Saved Data.
            ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
            Thread.sleep(2000);
    }
        @Test(priority = 2)
        public void verify_save_draft_option_for_chronic_conditions() throws Exception {
            //TC 2 Verifying the Save Draft Option for Chronic Conditions.
            ProjectBREMedicalChartDocumentPageObj.ClickOnChronicConditions();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnAddChronicCondition();
            Thread.sleep(2000);
            Assert.assertTrue(Functions.isElementPresent(ProjectBREMedicalChartDocumentPageObj.getnpnNum()));
            ProjectBREMedicalChartDocumentPageObj.ClickOnCancelChronicCondition();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnAddChronicCondition();
            Thread.sleep(2000);
            Assert.assertTrue(Functions.isElementPresent(ProjectBREMedicalChartDocumentPageObj.getnpnNum()));
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterNPI(ReadProps.readAttr("NPINumber"));
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterPhysicianName(ReadProps.readAttr("PhysicianName"));
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterStarDate(ReadProps.readAttr("StartDate"));//Change this Date
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterEndDate(ReadProps.readAttr("EndDate"));//Change this Date
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnSaveChronicCondition();
            Thread.sleep(4000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnendDate();
            Thread.sleep(1000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnEditChronicCondition();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnSaveEditEncounterDetails();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnAddedChronicCondition();
            Thread.sleep(2000);
            Assert.assertTrue(Functions.isElementPresent(ProjectBREMedicalChartDocumentPageObj.getnpnNum()));
            ProjectBREMedicalChartDocumentPageObj.ClickOnCancelEditEncounterDetails();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnendDate();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnDeleteChronicCondition();
            Thread.sleep(2000);
            Assert.assertFalse(Functions.isElementPresent(ProjectBREMedicalChartDocumentPageObj.getendDate()));

    }
}