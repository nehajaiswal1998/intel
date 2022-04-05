package Pages;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

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
    By ChronicConditions = By.xpath("//div[contains(text(),' Chronic Conditions ')]");

    By AddChronicCondition = By.xpath("//mat-icon[contains(text(),'add')]");
    
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

    By Diagnosis=By.xpath("//div[text()='Patient Demographics']/following::div[contains(text(),' Diagnosis')]");
    By DignosisPlusBtn=By.xpath("(//mat-icon[contains(text(),'add')])[1]");
    By CancelEncounterDetails=By.xpath("//span[contains(text(),' Cancel ')]");
    By AddHCCorNonHCCBtn=By.xpath("//div[text()='DOS End Date ']/following::button/span/mat-icon[contains(text(),' add')]");
    By LatestEncounter=By.xpath("(//*[contains(text(),'DOS End Date ')])[1]");
    By HCCdiagnosis=By.xpath("//input[@name='Diagnosis']");
    By PageNum=By.xpath("//input[@type='number']");
    By PageNumNonHCC=By.xpath("//div[text()='HCC']//following::div[text()='Non HCC']//following::mat-label[text()='Diagnosis']//following::input[@name='NonHccPageRange']");
    By AddICD=By.xpath("//span[contains(text(),'Add ICD')]");
    By ICD=By.xpath("(//input[@type='text'])[4]");
    By HCC=By.xpath("//*[text()=' HCC ']//following::input[2]");
    By SaveHCC=By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']");
    By EditEncounter=By.xpath("//div[text()='DOS End Date ']/following::button/span/mat-icon[contains(text(),' create')]");
    By NonHCC=By.xpath("//div[text()='HCC']//following::div[text()='Non HCC']");
    By DignosisNonHCC=By.xpath("//div[text()='HCC']//following::div[text()='Non HCC']//following::mat-label[text()='Diagnosis']");
    By CommentNonHCC=By.xpath("//following::mat-label[text()='Diagnosis']//following::input[@name='NonHccPageRange']//following::mat-select[@name='NonHccComment']");
    //Constructor
    public ProjectBREMedicalChartDocumentPage(WebDriver driver) throws IOException {
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

    public void ClickOnChartData() {driver.findElement(ChartData).click();}

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

    public void clickOnEnterNPI(String text) {driver.findElement(NPINumber).sendKeys(text);}
    public void clearNPINUM(){driver.findElement(NPINumber).clear();}

    public void ClickOnEnterPhysicianName(String text) {driver.findElement(DoctorName).sendKeys(text);}
    public void clearPhysicianName(){driver.findElement(DoctorName).clear();}
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

    public void clickOnSaveDiagonis() {
    public void ClickOnSaveDiagosisConditionButton() {



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
    public void ClickOnRunRuleBtn() {

    
        driver.findElement(RunRule).click();
    }
    public void ClickOnCancelButtonICD() {
    	
        driver.findElement(CancelBtnICD).click();
    }

    public void clickOnDiagnosis(){driver.findElement(Diagnosis).click();}
    public void clickOnAddEncounter(){driver.findElement(DignosisPlusBtn).click();}
    public void clickOnCancelAddEncounter(){driver.findElement(CancelEncounterDetails).click();}
    public void clickLatestEncounter(){driver.findElement(LatestEncounter).click();}
    public void clickOnAddHCCorNonHCCplusBtn(){driver.findElement(AddHCCorNonHCCBtn).click();}
    public void enterDiagnosisForHCC(String text){driver.findElement(HCCdiagnosis).sendKeys(text);}
    public void enterPageNum(String text){driver.findElement(PageNum).sendKeys(text);}

    public void selectCommentDropdown() throws InterruptedException {
       WebElement CommentDropdown=driver.findElement(By.xpath("//span[text()='Add Comment']"));
        CommentDropdown.click();
        Thread.sleep(1000);
        WebElement option=driver.findElement(By.xpath("//span[text()=' Dx listed but not Monitored/Evaluated/Assessed/Treated ']"));
        option.click();
    }
    public void clickOnAddICD(){driver.findElement(AddICD).click();}
    public void enterICDCode(String text){driver.findElement(ICD).sendKeys(text);}
    public void enterHCC(String text){driver.findElement(HCC).sendKeys(text);}

    public void selectICDDisciptionDropdown() throws InterruptedException {
        WebElement ICDDiscription=driver.findElement(By.xpath("//*[text()=' Description ']//following::span[3]"));
         ICDDiscription.click();
         Thread.sleep(2000);
         WebElement ICDDesctrionOption=driver.findElement(By.xpath("//*[@class='cdk-overlay-pane']//following::mat-option[1]"));
         ICDDesctrionOption.click();
    }
    public void clickOnsaveBtnHCC(){driver.findElement(SaveHCC).click();}
    public void clickOnNonHCC(){driver.findElement(NonHCC).click();}
    public void addDiagnosisNonHCC(String text){driver.findElement(DignosisNonHCC).sendKeys(text);}
    public void enterPageNumNonHCC(String text){driver.findElement(PageNumNonHCC).sendKeys(text);}
    public void clickOnCommentNonHCC() throws InterruptedException {
        driver.findElement(CommentNonHCC).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='NonHccPageRange']//following::mat-select[@name='NonHccComment']//following::span[text()=' No valid records found ']")).click();
    }
}

