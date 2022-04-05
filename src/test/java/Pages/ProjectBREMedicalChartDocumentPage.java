package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ProjectBREMedicalChartDocumentPage {

    WebDriver driver = null;

    //Element Locators
    By OpenReadyDocument = By.xpath("//span[contains(text(),'Processed.pdf')]");
    By OpenReadyDocumentICD = By.xpath("//span[contains(text(),'document (1).pdf')]");
    By OpenRejectedDocument = By.xpath("//span[contains(text(),'inputDocs.jpg')]");
    By ChartData = By.xpath("//mat-label[contains(text(),'Chart Data')]");
    //By Address = By.xpath("//div[@class='mat-form-field-infix ng-tns-c97-11']");
    By Address= By.xpath("//input[@pattern=\"^([a-zA-Z0-9,\\s])+([a-zA-Z0-9\\s()]+)*(-[()a-zA-Z0-9\\s]+)*$\"]");


    By SaveDraft = By.xpath("//span[contains(text(),'Save Draft')]");
    By diagnosis_Tab = By.xpath("//*[text()='Patient Demographics']//following::div[1]");   
    By addEncounterDetails = By.xpath("//*[text()='Cancel']//following::span[10]");   //+button
    By NPINumber = By.xpath("//input[@formcontrolname='npiNo']");
    By EncounterDetails = By.xpath("//span[contains(text(),'NPI No')]");
    By DoctorName = By.xpath("//input[@formcontrolname='physicianName']");
    By StartDate = By.xpath("//input[@formcontrolname='startDate']");
    By HCCCodes = By.xpath("//*[text()='HCC']");          //input[@formcontrolname='hcc_codes']
    By EditICDCodeDetailsOnEditDiagnosisDetails = By.xpath("//*[text()=' ICD ']//following::input[1]");

    By EditICDCodeDetails = By.xpath("//*[text()='Patient Demographics']//following::button[6]");
    By PickCommentAdd = By.xpath("//span[contains(text(),'ADD')]");
    By EndDate = By.xpath("//input[@formcontrolname='endDate']");
    By ClickAddedChronicCondition = By.xpath("//div[contains(text(),' Chronic Conditions ')]//following::button[1]/span/mat-icon");
    By SaveBtn = By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']");
    By DeleteCC = By.xpath("//mat-icon[contains(text(),'delete')]");
    By CancelCC = By.xpath("//button[@class='mat-focus-indicator mr-2 mat-stroked-button mat-button-base mat-accent']");
    By EditEncounterDetails = By.xpath("//mat-expansion-panel-header/span[1]/mat-panel-description[1]/button[1]/span[1]/mat-icon[1]");
    By EditEncounterDetailsCC = By.xpath("//div[contains(text(),'DOS End Date')]/following::button/span/mat-icon[contains(text(),'create')]");
    By endDate=By.xpath("//div[contains(text(),'DOS End Date')]");
    By CancelEditEncounterDetails = By.xpath("//button[@class='mat-focus-indicator mr-2 mat-stroked-button mat-button-base mat-accent']");
    By AddDiagnosisDetails = By.xpath("//mat-expansion-panel-header/span[1]/mat-panel-description[1]/button[2]/span[1]/mat-icon[1]");
    By CancelDiagnosisDetails = By.xpath("//button[@id='category-close-modal']");
    By RunRule = By.xpath("//*[@id='docImag']//following::button[2]");
    By AddComment = By.xpath("//span[contains(text(),'Add Comment')]");
    By CancelBtnICD = By.xpath("//span[text()='Cancel']");
    By SelectICDCode = By.xpath("//span[contains(text(),' Cholera due to Vibrio cholerae 01, biovar cholerae')]");
    By OpenReadyDocumentICD1 = By.xpath("//span[contains(text(),'Karis Garner_only 8 page.pdf')]");
    By npnNum=By.xpath("//mat-label[contains(text(),'NPI Number')]");
    //Constructor
    public ProjectBREMedicalChartDocumentPage(WebDriver driver) {
        this.driver = driver;
    }

    //Methods
    public By getendDate(){return  this.endDate;}
    public By getnpnNum(){return this.npnNum;}
    public void ClickOnEncounterDetails() {
        driver.findElement(EncounterDetails).click();
    }
    public void ClickOnPickICDCode() {
        driver.findElement(SelectICDCode).click();
    }
    public void ClickOnReadyDocument() {
        driver.findElement(OpenReadyDocument).click();
    }
    public void ClickOnClearICDCode() {
        driver.findElement(EditICDCodeDetailsOnEditDiagnosisDetails).clear();
    }
    public void ClickOnendDate(){driver.findElement(endDate).click();}
    public void ClickOnEditICDCodeOnEditDiagnosisDetails() {
        driver.findElement(EditICDCodeDetails).click();
    }
    public void ClickOnSaveEditDiagnosisDetails() {
        driver.findElement(SaveBtn).click();
    }
    public void ClickOnCancelEditDiagnosisDetails() {
        driver.findElement(CancelCC).click();
    }

    public void ClickOnReadyDocumentICD() {
        driver.findElement(OpenReadyDocumentICD).click();
    }
    public void ClickOnReadyDocumentICD1() {
        driver.findElement(OpenReadyDocumentICD1).click();
    }
    public void ClickOnEditICDDetails() {
        driver.findElement(EditICDCodeDetails).click();
    }
    public void ClickOnRejectedDocument() {
        driver.findElement(OpenRejectedDocument).click();
    }
    public void ClickOnEditEncounterDetails() {
        driver.findElement(EditEncounterDetails).click();
    }

    public void ClickOnChartData() {
        driver.findElement(ChartData).click();
    }

    public void ClickOnClearAddress() {
        driver.findElement(Address).clear();
    }

    public void ClickOnEnterAddress(String text) {
        driver.findElement(Address).sendKeys(text);
    }
    public void ClickOnEnterHCCCodes(String text) {
        driver.findElement(HCCCodes).sendKeys(text);
    }

    public void ClickOnSaveDraft() {
        driver.findElement(SaveDraft).click();
    }
    public void ClickOnAddComment() {
        driver.findElement(AddComment).click();
    }
    public void ClickOnDiagnosisTab() {
        driver.findElement(diagnosis_Tab).click();
    }

    public void ClickOnAddChronicCondition() {
        driver.findElement(AddDiagnosisDetails).click();
    }

    public void ClickOnEnterNPI(String text) {
        driver.findElement(NPINumber).sendKeys(text);
    }

    public void ClickOnEnterPhysicianName(String text) {
        driver.findElement(DoctorName).sendKeys(text);
    }
    public void ClickOnEnterInvalidICDCode(String text) {
        driver.findElement(EditICDCodeDetailsOnEditDiagnosisDetails).sendKeys(text);
    }
    public void ClearDoctorName() {
        driver.findElement(DoctorName).clear();
    }

    public void ClickOnEnterStarDate(String text) {
        driver.findElement(StartDate).sendKeys(text);
    }

    public void ClickOnEnterEndDate(String text) {
        driver.findElement(EndDate).sendKeys(text);
    }

    public void ClickOnSaveDiagosisConditionButton() {
        driver.findElement(SaveBtn).click();
    }

    public void ClickOnCancelChronicCondition() {
        driver.findElement(CancelCC).click();
    }

    public void ClickOnAddedChronicCondition() {
        driver.findElement(ClickAddedChronicCondition).click();
    }

    public void ClickOnDeleteChronicCondition() {
        driver.findElement(DeleteCC).click();
    }

    public void ClickOnEditChronicCondition() {
        driver.findElement(EditEncounterDetailsCC).click();
    }

    public void ClickOnSaveEditEncounterDetails() {
        driver.findElement(SaveBtn).click();
    }

    public void ClickOnCancelEditEncounterDetails() {
        driver.findElement(CancelEditEncounterDetails).click();
    }

    public void ClickOnAddDiagnosisDetails() {
        driver.findElement(AddDiagnosisDetails).click();
    }
    public void ClickOnSelectCommentAdd() {
        driver.findElement(PickCommentAdd).click();
    }
    public void ClickOnCancelDiagnosisDetails() {
        driver.findElement(CancelDiagnosisDetails).click();
    }

    public void ClickOnSaveDiagnosisDetails() {
        driver.findElement(SaveBtn).click();
    }

    public void ClickOnRunRuleBtn() throws Exception {
    	Thread.sleep(5000);
        driver.findElement(RunRule).click();
    }

    public void ClickOnCancelButtonICD() {
    	
        driver.findElement(CancelBtnICD).click();
    }
}

