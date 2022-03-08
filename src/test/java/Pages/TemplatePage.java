package Pages;

import Utilities.AssertionsFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TemplatePage   {
    WebDriver driver = null;


    By TemplateBtn = By.xpath("//i[@aria-describedby='cdk-describedby-message-4']");
    By UploadTemplate = By.xpath("//*[contains (text(),'Upload Template')]");
    By CreateTemplate = By.xpath("//span[contains(text(),'Create Template')]");
    By CancelCreateTemplate = By.xpath("//*[@id='close-modal']/span[1]/mat-icon");
    By TemplateName = By.xpath("//*[@data-placeholder='Template Name']");
    By ChooseFile = By.xpath("//*[@id='faxDetailModal']/div/div/div[2]/div/form/div/input");
    By CloseBtn = By.xpath("//*[@id='close-modal']/span[1]/mat-icon");
    By SearchTemplate = By.xpath("//*[@data-placeholder='Search']");
    By ExpandTemplate = By.xpath("//tbody/tr[1]/td[1]");
    By ExpandTemplateMore = By.xpath("//td[contains(text(),'AutoSampleMPTemp')]");
    By Cancel = By.xpath("//span[contains(text(),' Cancel ')]");
    By TemplateDataInfo = By.xpath("//td[contains(text(),'Template1')]");
    By TemplateDataInfo1 = By.xpath("//td[contains(text(),'Sample-page1')]");
    By TemplateDelete = By.xpath("//table[@matsortdirection='desc']/tbody/tr[2]/td/div/div/table/tbody/tr[1]/td[6]/button[2]");
    By ConfirmDeleteTemplate = By.xpath("//*[contains(text(),'Confirm')]");
    By TemplateOnGrid = By.xpath("//thead/tr[1]/th[1]/div[1]/div[1]");
    By ZoomInIcon = By.xpath("//button[@mattooltip='Zoom In']");
    By ZoomOutIcon = By.xpath("//button[@mattooltip='Zoom Out']");
    By CropDragIcon = By.xpath("//button[@class='mat-focus-indicator mat-tooltip-trigger mx-1 mat-mini-fab mat-button-base mat-primary']/span[1]/mat-icon[1]");
    By FieldName = By.xpath("//input[@formcontrolname='attributeName']");
    By MapButton = By.xpath("//*[contains(text(),'Map')]");
    By MapErrorMsg = By.xpath("//*[text()=' Please select the portion on image for which the field name and validations have been given. ']");
    By SaveDraft = By.xpath("//span[contains(text(),'Save Draft')]");
    By CompleteTraining = By.xpath("//*[contains(text(),'Complete Training')]");
    By ClickClassification = By.xpath("//*[@id='docClassificationField']");
    By SelectClassification = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/mat-option[1]/span[1]");
    By ClickValidation = By.xpath("//*[@formcontrolname='validation']");
    By SelectValidation = By.xpath("//span[contains(text(),' Name ')]");
    By CancelTraining = By.xpath("//div[@class='tr-button white_bg']/button[3]");
    By NavigateNext = By.xpath("//*[contains(text(),'navigate_next')]");
    By NavigateBack = By.xpath("//*[contains(text(),'navigate_before')]");
    By TrainingStatus = By.xpath("//tbody/tr[1]/td[4]");

    By InvalidTemplateNameErr = By.xpath("//mat-error[text()='Only alphabets,digits,parenthesis and hyphens are allowed while naming a template.']");
    By ExistingTemplateNameErr = By.xpath("//div[text()='Template Name Already In Use.']");
    By CancelDeleteTemplate = By.xpath("//span[text()='Cancel']");

    //Navigation Page
    By UploadTemplatePage = By.xpath("//span[text()='Create New Template']");
    By TemplateExpanded = By.xpath("//div[text()=' Classification ']");
    By ClassificationListBox = By.xpath("//div[@role='listbox']");
    By DeleteTemplatePage = By.xpath("//*[text()=' Do you want to delete Template1 ? ']");

    String InvalidTemplateError = "";
    String TemplatePageURL = "https://alpha.neutrino-ai.com/#/home/n-training";


    //Methods
    public TemplatePage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickTemplateBtn() throws InterruptedException {
        driver.findElement(TemplateBtn).click();
    }

    public void ClickOnUploadTemplateBtn() throws InterruptedException {
        driver.findElement(UploadTemplate).click();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(UploadTemplatePage);
    }

    public void ClickCreateTemplate() {
        driver.findElement(CreateTemplate).click();
    }

    public void ClickCancelCreateTemplate()throws InterruptedException {
        driver.findElement(CancelCreateTemplate).click();
        Thread.sleep(2000);
    }

    public void ClickOnTemplateName(String text) {
        driver.findElement(TemplateName).sendKeys(text);
        driver.findElement(TemplateName).click();

    }

    public void ClickOnChooseFileBtn() {
        driver.findElement(ChooseFile).click();
    }

    public void ClickOnCloseButton() {
        driver.findElement(CloseBtn).click();
    }

    public void ClickOnSearchSinglePageTemplate(String tName) throws InterruptedException {
        driver.findElement(SearchTemplate).sendKeys(tName);
        Thread.sleep(2000);
        AssertionsFunction.verifyElementTextWithTrim("AutoSampleSPTemp", ExpandTemplate);

    }
    public void ClickOnSearchMultiplePageTemplate(String tName) throws InterruptedException {
        driver.findElement(SearchTemplate).sendKeys(tName);
        Thread.sleep(2000);
        AssertionsFunction.verifyElementTextWithTrim("AutoSampleMPTemp", ExpandTemplate);

    }

    public void ClickOnSearchTemplate(String tName) throws InterruptedException {
        driver.findElement(SearchTemplate).sendKeys(tName);
        Thread.sleep(2000);
        AssertionsFunction.verifyElementTextWithTrim("QA-AutoTemplate", ExpandTemplate);

    }


    public void ClickOnExpandTemplate() throws InterruptedException {
        driver.findElement(ExpandTemplate).click();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent (TemplateExpanded);
    }

    public void ClickExpandMore() {
        driver.findElement(ExpandTemplateMore).click();
    }

    public void ClickOnTemplateDataInfo() {
        driver.findElement(TemplateDataInfo).click();
    }

    public void ClickCancel() {
        driver.findElement(Cancel).click();
    }

    public void DeleteTemplate() {
        driver.findElement(TemplateDelete).click();
    }

    public void DeleteTemplateSinglePage() throws InterruptedException {
        driver.findElement(TemplateDelete).click();
        Thread.sleep(1000);
        AssertionsFunction.verifyElementPresent (DeleteTemplatePage);
    }



    public void ConfirmDeleteTemplate() {
        driver.findElement(ConfirmDeleteTemplate).click();
    }

    public void ClickOnTemplateGrid() {
        driver.findElement(TemplateOnGrid).click();
    }

    public void ClickOnZoomIn() {
        driver.findElement(ZoomInIcon).click();
    }

    public void ClickOnZoomOut() {
        driver.findElement(ZoomOutIcon).click();
    }

    public void ClickClassificationBox () throws InterruptedException
    {
        driver.findElement(ClickClassification).click();
        Thread.sleep(1000);
        AssertionsFunction.verifyElementPresent (ClassificationListBox);

    }

    public void SelectClassification() {
        driver.findElement(SelectClassification).click();
    }

    public void ClickValidation() {
        driver.findElement(ClickValidation).click();
    }

    public void SelectValidation() {
        driver.findElement(SelectValidation).click();
    }

    public void ClickCropIcon() {
        driver.findElement(CropDragIcon).click();
    }

    public void EnterFieldName() {
        driver.findElement(FieldName).sendKeys("Verify");
    }


    public void ClickMap() {
        driver.findElement(MapButton).click();

    }


    public void ClickSaveDraft() {
        driver.findElement(SaveDraft).click();
    }

    public void ClickCompleteTraining() {
        driver.findElement(CompleteTraining).click();
    }

    public void ClickCancelTraining() throws InterruptedException {
        driver.findElement(CancelTraining).click();
        Thread.sleep(1000);
        AssertionsFunction.verifyTargetPageURL ("https://alpha.neutrino-ai.com/#/home/n-training");

    }

    public void ClickNavigateNext() {
        driver.findElement(NavigateNext).click();
    }


    public void ClickNavigateBack() {
        driver.findElement(NavigateBack).click();
    }

    public void ClickOnTemplateMorePagesInfo() {
        driver.findElement(TemplateDataInfo1).click();
    }

    public void verifyInvalidTemplatNameErr() {
        AssertionsFunction.verifyElementText("Only alphabets,digits,parenthesis and hyphens are allowed while naming a template.", InvalidTemplateNameErr);
    }

    public void verifyExistingTemplateName() {
        AssertionsFunction.verifyElementText("Template Name Already In Use.", ExistingTemplateNameErr);

    }

    public void verifyTemplateMap() {

        AssertionsFunction.verifyElementText("Please select the portion on image for which the field name and validations have been given.", MapErrorMsg);

    }

    public void AssertTrainingStatus() {

        AssertionsFunction.verifyElementText("In Progress", TrainingStatus);

    }

    public void verifySinglePageTemplateCreated()
    {

        AssertionsFunction.verifyElementTextWithTrim("AutoSampleSPTemp", ExpandTemplate);
    }

    public void verifySinglePageTemplateDelete()
    {
        AssertionsFunction.verifyElementDeletedTextWithTrim("AutoSampleSPTemp", ExpandTemplate);
    }

    public void verifyMultiPageTemplateCreated()
    {
        AssertionsFunction.verifyElementTextWithTrim("AutoSampleMPTemp", ExpandTemplate);

    }

    public void verifyMultiPageTemplateDelete()
    {
        AssertionsFunction.verifyElementDeletedTextWithTrim("AutoSampleMPTemp", ExpandTemplate);
    }

    public void verifyDeleteAssociatedTemplate()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()=' Sample-page1 is associated with QA-AutoProject-Structured,QA-AutoProject-Structured4 projects ']")).isDisplayed());
    }

    public void cancelDeleteTemplate() {
        driver.findElement(CancelDeleteTemplate).click();
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }


}