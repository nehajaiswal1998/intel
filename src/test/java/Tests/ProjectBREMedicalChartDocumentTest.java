package Tests;
import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectBREMedicalChartDocumentPage;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

@Listeners(Utilities.TestListeners.class)

public class ProjectBREMedicalChartDocumentTest extends BasePage {
        static  ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj;
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
            DocPageObj.ClickDocumentBtn();
            Thread.sleep(6000);
            AssertionsFunction.verifyTargetPageURL(DocPageObj.DocTabUrl);

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
            AssertionsFunction.verifyTargetPageURL(DocPageObj.ClickOnReadyDocumentUrl);
            ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
            Thread.sleep(2000);
            Assert.assertTrue(AssertionsFunction.isPresent(DocPageObj.getpatientDemographics()));
            //Clear the Address.
            ProjectBREMedicalChartDocumentPageObj.ClickOnClearAddress();
            Thread.sleep(2000);
            //Enter New Address.
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterAddress(ReadProps.readAttr("BREAddress"));
            Thread.sleep(2000);
            //Click on Save Draft.
            ProjectBREMedicalChartDocumentPageObj.ClickOnSaveDraft();
            Thread.sleep(6000);
            AssertionsFunction.verifyTargetPageURL(DocPageObj.DocTabUrl);

            //Open the Same Ready document.
            ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
            Thread.sleep(8000);
            AssertionsFunction.verifyTargetPageURL(DocPageObj.ClickOnReadyDocumentUrl);
            //Verify the Saved Data.
            ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
            Thread.sleep(2000);
    }
     //   @Test(priority = 2)
        public void verify_save_draft_option_for_chronic_conditions() throws Exception {
            //TC 2 Verifying the Save Draft Option for Chronic Conditions.
            ProjectBREMedicalChartDocumentPageObj.ClickOnDiagnosisTab();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnAddChronicCondition();
            Thread.sleep(2000);
            Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getnpnNum()));
            ProjectBREMedicalChartDocumentPageObj.ClickOnCancelChronicCondition();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnAddChronicCondition();
            Thread.sleep(2000);
            Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getnpnNum()));
            ProjectBREMedicalChartDocumentPageObj.clickOnEnterNPI(ReadProps.readAttr("NPINumber"));
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterPhysicianName(ReadProps.readAttr("PhysicianName"));
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterStarDate(ReadProps.readAttr("StartDate"));//Change this Date
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterEndDate(ReadProps.readAttr("EndDate"));//Change this Date
            Thread.sleep(2000);
            //ProjectBREMedicalChartDocumentPageObj.ClickOnSaveChronicCondition();

            Thread.sleep(4000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnendDate();
            Thread.sleep(1000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnEditChronicCondition();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnSaveEditEncounterDetails();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnAddedChronicCondition();
            Thread.sleep(2000);
            Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getnpnNum()));
            ProjectBREMedicalChartDocumentPageObj.ClickOnCancelEditEncounterDetails();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnendDate();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnDeleteChronicCondition();
            Thread.sleep(2000);
            Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getendDate()));
    }
    @Test(priority = 2)
    public void verify_save_draft_option_for_DignosisHCC() throws Exception {
        //TC  Verifying the Save Draft Option for verify_save_draft_option_for_DignosisHCC
        // 1.Action->Chart Data->Diagnosis->click on plus button->Add encounter details->HCC Details->save draft
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnAddEncounter();
        Thread.sleep(1000);
        Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getnpnNum()));
        ProjectBREMedicalChartDocumentPageObj.clickOnCancelAddEncounter();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.clickOnAddEncounter();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnEnterNPI(ReadProps.readAttr("NPINumber"));
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterPhysicianName(ReadProps.readAttr("PhysicianName"));
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterStarDate(ReadProps.readAttr("StartDate"));//Change this Date
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterEndDate(ReadProps.readAttr("EndDate"));//Change this Date
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnSaveDiagonis();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnAddHCCorNonHCCplusBtn();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.enterDiagnosisForHCC(ReadProps.readAttr("Diagnosis"));
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.enterPageNum(ReadProps.readAttr("PageNum"));
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.selectCommentDropdown();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnAddICD();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.enterICDCode(ReadProps.readAttr("ICD"));
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.selectICDDisciptionDropdown();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.enterHCC(ReadProps.readAttr("HCC"));
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnsaveBtnHCC();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnSaveDraft();
        Thread.sleep(5000);
    }

    @Test(priority = 3)
 public void verifyemptyEncounterDetailsSaveDraft() throws InterruptedException {
        //verify empty Encounter Details and save draft
     // 6.Action->Chart Data->Diagnosis->Empty details and click on save draft
     ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
     Thread.sleep(8000);
     ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
     Thread.sleep(2000);
     ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
     Thread.sleep(2000);
     ProjectBREMedicalChartDocumentPageObj.clickOnAddEncounter();
     Thread.sleep(1000);
     Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getnpnNum()));
     ProjectBREMedicalChartDocumentPageObj.clickOnSaveDiagonis();
     Thread.sleep(2000);
     ProjectBREMedicalChartDocumentPageObj.clickOnCancelAddEncounter();
     Thread.sleep(3000);
     ProjectBREMedicalChartDocumentPageObj.ClickOnSaveDraft();
     Thread.sleep(5000);

    }
    @Test(priority = 4)
    public void verifyeditEncounterDetails() throws InterruptedException, IOException {
        //verify edit encounter Details n save draft
        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(8000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnEditEncounterDetails();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clearNPINUM();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnEnterNPI(ReadProps.readAttr("EditNPINumber"));
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clearPhysicianName();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterPhysicianName(ReadProps.readAttr("EditPhysicianName"));
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnSaveDiagonis();
        Thread.sleep(4000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnSaveDraft();
        Thread.sleep(4000);

    }
    @Test(priority = 5)
    public void verifyDeletandsaveEncounterDetails() throws InterruptedException, IOException {
        // verify Delete existing Details and save draft
        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(8000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnEditEncounterDetails();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clearNPINUM();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clearPhysicianName();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnSaveDiagonis();
        Thread.sleep(4000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnSaveDraft();
    }


    // @Test(priority = 6)
    public void verify_save_draft_option_for_Dignosis_NonHCC() throws Exception {
        Thread.sleep(4000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(8000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnAddEncounter();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnEnterNPI(ReadProps.readAttr("NPINumber"));
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterPhysicianName(ReadProps.readAttr("PhysicianName"));
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterStarDate(ReadProps.readAttr("StartDate"));//Change this Date
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterEndDate(ReadProps.readAttr("EndDate"));//Change this Date
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnSaveDiagonis();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnAddHCCorNonHCCplusBtn();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnNonHCC();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.addDiagnosisNonHCC(ReadProps.readAttr("Diagnosis"));
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.enterPageNumNonHCC(ReadProps.readAttr("PageNum"));
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnCommentNonHCC();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnSaveDraft();
        Thread.sleep(4000);
    }




    }