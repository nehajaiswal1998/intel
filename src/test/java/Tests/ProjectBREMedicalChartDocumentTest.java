package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectBREMedicalChartDocumentPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;

@Listeners(Utilities.TestListeners.class)
public class ProjectBREMedicalChartDocumentTest extends BasePage {

    @Test
    public void ProjectBREMedicalChartDocumentFlow() throws Exception {
            BasePage.LoginTest();
            //Object Creation.
            ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
            test.log(LogStatus.INFO, "ProjectBREMedicalChartDocument");
            test.log(LogStatus.PASS, "TestPassed");
            DocumentPage DocPageObj = new DocumentPage(driver);
            DocPageObj.ClickDocumentBtn();
            Thread.sleep(6000);
            //TC 1 Verifying the Save Draft option for Patient Demographics.
            DocPageObj.ClickDropDownBtn();
            Thread.sleep(2000);
            //Search Medical Chart Project.
            DocPageObj.ClickSearchProject(ReadProps.readAttr("MedicalChartProjectName"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//ProjectSearch.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickSelectMedicalChartProject();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//ProjectSelected.jpg");
            Thread.sleep(1000);
            //Open Ready Document.
            ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//ViewReadyDocument.jpg");
            Thread.sleep(1000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//ViewChartData.jpg");
            Thread.sleep(2000);
            //Clear the Address.
            ProjectBREMedicalChartDocumentPageObj.ClickOnClearAddress();
            Thread.sleep(2000);
            //Enter New Address.
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterAddress(ReadProps.readAttr("BREAddress"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//AddressEntered.jpg");
            Thread.sleep(2000);
            //Click on Save Draft.
            ProjectBREMedicalChartDocumentPageObj.ClickOnSaveDraft();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//AddressSavedSuccessfully.jpg");
            Thread.sleep(2000);
            //Open the Same Ready document.
            ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//OpenReadyDocument.jpg");
            Thread.sleep(1000);
            //Verify the Saved Data.
            ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//OpenChartData.jpg");
            Thread.sleep(2000);

            //TC 2 Verifying the Save Draft Option for Chronic Conditions.
            ProjectBREMedicalChartDocumentPageObj.ClickOnChronicConditions();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnAddChronicCondition();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//ChronicCondition.jpg");
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnCancelChronicCondition();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//CancelChronicCondition.jpg");
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnAddChronicCondition();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterNPI(ReadProps.readAttr("NPINumber"));
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterPhysicianName(ReadProps.readAttr("PhysicianName"));
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterStarDate(ReadProps.readAttr("StartDate"));//Change this Date
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterEndDate(ReadProps.readAttr("EndDate"));//Change this Date
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//ChronicConditionDetails.jpg");
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnSaveChronicCondition();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//ChronicConditionSavedSuccessfully.jpg");
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnAddedChronicCondition();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//ChronicConditionExpanded.jpg");
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnEditChronicCondition();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//ChronicConditionEditView.jpg");
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnSaveEditEncounterDetails();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//SaveEditEncounterDetails.jpg");
            Thread.sleep(1000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnAddedChronicCondition();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnEditChronicCondition();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnCancelEditEncounterDetails();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//CancelEditEncounterDetails.jpg");
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//AddDiagnosisDetails.jpg");
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnDeleteChronicCondition();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest//DeleteChronicCondition.jpg");
            Thread.sleep(2000);
            driver.close();
    }
}

