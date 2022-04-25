package Tests;
import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectBREMedicalChartDocumentPage;
import Utilities.AssertionsFunction;
import Utilities.LoginUser;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

@Listeners(Utilities.TestListeners.class)

public class ProjectBREMedicalChartDocumentTest extends BasePage {
    public static ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj;
    public DocumentPage DocPageObj;

    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        // BasePage.LoginTest();
    }

    @AfterClass(enabled = false)
    public void cleanUp() throws Exception {
        driver.quit();
    }

    @Test(priority = 1)
    public void verify_edit_address_save_draft_Patient_Demographics() throws Exception {

        LoginUser.login_users(driver, "pratiksha.bagal@neutrinotechlabs.com", "Pratiksha@12");
        Thread.sleep(9000);
        DocPageObj = new DocumentPage(driver);
        ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
        Thread.sleep(5000);
        DocPageObj.ClickDocumentBtn();
        Thread.sleep(6000);
        //AssertionsFunction.verifyTargetPageURL(DocPageObj.DocTabUrl);

        // TC 1 Verifying the Save Draft option for Patient Demographics.
        DocPageObj.ClickDropDownBtn();
        Thread.sleep(2000);
        //Search Medical Chart Project.

        DocPageObj.ClickSelectMedicalChartProject();
        Thread.sleep(2000);

        //Open Ready Document.
        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(8000);
        //AssertionsFunction.verifyTargetPageURL(DocPageObj.ClickOnReadyDocumentUrl);
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
        //AssertionsFunction.verifyTargetPageURL(DocPageObj.DocTabUrl);
    }

    @Test(priority = 2)
    public void verify_add_encounter_click_on_cancel() throws InterruptedException, IOException {
        // 2 Verify the Saved Data.
        //Open the Same Ready document.
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(8000);
//        AssertionsFunction.verifyTargetPageURL(DocPageObj.ClickOnReadyDocumentUrl);

        // 2.1 verify add encounter click on cancel
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnAddEncounter();
        Thread.sleep(1000);
        Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getnpnNum()));
        ProjectBREMedicalChartDocumentPageObj.clickOnCancelAddEncounter();
        Thread.sleep(3000);
    }

    @Test(priority = 3)
    public void verify_without_entring_encounter_details_click_on_save() throws InterruptedException, IOException {
        //2.2 verify without entring encounter details click on  save
        ProjectBREMedicalChartDocumentPageObj.clickOnAddEncounter();
        Thread.sleep(1000);
        Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getnpnNum()));
        ProjectBREMedicalChartDocumentPageObj.clickOnSaveDiagonis(); //(need assertion For error msg)
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.clickOnCancelAddEncounter();
        Thread.sleep(3000);
    }

    @Test(priority = 4)
    public void verify_add_encounter_details_with_data_n_click_on_save() throws InterruptedException, IOException {
        // 2.3 verify add encounter details with data n click on save
        ProjectBREMedicalChartDocumentPageObj.clickOnAddEncounter();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnEnterNPI(ReadProps.readAttr("NPINumber"));
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterPhysicianName(ReadProps.readAttr("PhysicianName"));
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterStarDate(ReadProps.readAttr("StartDate"));//Change this Date
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterEndDate(ReadProps.readAttr("EndDate"));//Change this Date
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnSaveDiagonis();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter();
        Thread.sleep(1000);
    }

    @Test(priority = 5)
    public void verify_Without_entering_details_of_HCC_click_on_save() throws InterruptedException, IOException {
        //2.4 verify  Without entering details of HCC click on save (-ve)
        ProjectBREMedicalChartDocumentPageObj.clickOnAddHCCorNonHCCplusBtn();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnsaveBtnHCC();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.clickOnCancelHCC();
        Thread.sleep(3000);


        //2.5 verify   entering details of HCC click on save (+ve)
        ProjectBREMedicalChartDocumentPageObj.clickOnAddHCCorNonHCCplusBtn();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.enterPageNum(ReadProps.readAttr("PageNum"));
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.selectCommentDropdown();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnAddICD();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.enterICDCode(ReadProps.readAttr("ICD"));
        Thread.sleep(7000);
        Actions actions = new Actions(driver);
        WebElement subMenu = driver.findElement(By.xpath("//*[text()=' Description ']//following::span[3]"));//To mouseover on sub menu
        actions.moveToElement(subMenu);//build()- used to compile all the actions into a single step
        actions.click().build().perform();
        Thread.sleep(5000);
        ProjectBREMedicalChartDocumentPageObj.enterHCC(ReadProps.readAttr("HCC"));
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnsaveBtnHCC();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnSaveDraft();
        Thread.sleep(5000);


    }

    @Test(priority = 6)
    public void verifyeditEncounterDetails() throws InterruptedException, IOException {
        // TC 3 verify edit encounter Details n save draft

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
        Thread.sleep(5000);
    }

    @Test(priority = 7)
    public void verifyDeletandsaveEncounterDetails() throws InterruptedException, IOException {
        // TC 4 verify Delete existing Details and save draft
        // (verify again)

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
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(DocPageObj.DocTabUrl);
    }

//    // cardwise Document

    @Test(priority = 8)
    public void verify_System_should_be_able_to_retrieve_the_ICD_codes_for_the_captured_diseases() throws InterruptedException, IOException {
        //IN-156 System should be able to retrieve the ICD codes for the captured diseases.
        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(8000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter();
        Thread.sleep(1000);
        Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getcreatedICD()));
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter();
        driver.navigate().back();

    }


    @Test(priority = 9)
    public void Click_On_ItemPer_Page() throws Exception {
        ////IN-413 Document Navigation Page- Server side pagination and Analytics Change- UI side change
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnItemPerPage();
        driver.navigate().refresh();
        Thread.sleep(3000);


    }

    @Test(priority = 10)
    public void Check_Email_Field() throws Exception {

        //IN-406 Post-processing requirements for the validation type "E-Mail"-JAVA side changes
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(8000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnPatientDemography();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.getcreatedEmail();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent((ProjectBREMedicalChartDocumentPageObj.getcreatedEmail())));
        driver.navigate().back();
        Thread.sleep(8000);
    }


    @Test(priority = 11)
    public void check_cancel_button() throws Exception {


        //Search Medical Chart Project.

        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.getCancelButton();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent((ProjectBREMedicalChartDocumentPageObj.getCancelButton())));
        driver.navigate().back();
        Thread.sleep(3000);
    }

    @Test(priority = 12)
    public void without_adding_comment() throws Exception {
        //IN 626 Comments are mandatory at the diagnosis level, if the comments have not been provided for the valid(enabled) disease, under that circumstances, the medical charts should not be allowed to get submitted
        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnMedicalProjectChartData();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnTopEncounterDetail();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnAddEncounterButton();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnSave();
        // need add assertion for error msg
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);

    }

    @Test(priority = 13)
    public void System_should_open_rejected_document() throws Exception {
        //IN-492 Rejected medical charts not loading
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnrejectedDocument();
        Thread.sleep(5000);
        ProjectBREMedicalChartDocumentPageObj.clickOnImagename();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(8000);

    }


}







