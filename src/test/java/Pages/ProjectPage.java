package Pages;

import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectPage   {
    String currentDate = new SimpleDateFormat("dd").format(new Date());
    WebDriver driver = null;


    //Define Project
    public static String ProjectPageURl = "https://alpha.neutrino-ai.com/#/home/project-management";
    public  String  EditProjectURL = "https://alpha.neutrino-ai.com/#/home/project-management/edit-project/6221eeaa994e456345dd1030";
    public String EditProjectAdmin = "https://alpha.neutrino-ai.com/#/home/project-management/edit-project/6200fd11cc453f40a6baf157";

    public static By ProjectBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-briefcase m-0 side-icon ng-star-inserted']");
    public static By CreateProject = By.xpath("//span[contains(text(),' Create Project ')]");
    By ProjectName = By.xpath("//input[@formcontrolname='project']");
    By Lead = By.xpath("//*[@formcontrolname='lead']");
    By SearchLead = By.xpath("//input[@placeholder='Search']");
    By SelectLeadSample = By.xpath("//span[contains(text(),'new@gmail.com')]");
    By SelectLeadAdmin = By.xpath("//span[contains(text(),' admin@test.com ')]");
    By SelectLead = By.xpath("//span[contains(text(),'qa1@email.com')]");
    public static By DisableRoleSearchError = By.xpath("//div[contains(text(),' No Records Found ! ')]");
    By ClickStartDate = By.cssSelector("button[aria-label='Open calendar'][tabindex='0']");
    By ClearStartDate = By.xpath("//input[@id='mat-input-3']");
    By SelectStartDate = By.xpath("//div[contains(text()," + currentDate + ")]");
    By ClickEndDate = By.xpath("/html/body/app-root/div/app-landing/div/div/main/div/app-create-project/div[2]/div/form/mat-card/div/div[4]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button");
    By ClearEndDate = By.xpath("//input[@id='mat-input-4']");
    By SelectEndDate = By.xpath("//div[contains(text()," + currentDate + ")]");
    By ClickDocumentStructure = By.xpath("//*[@formcontrolname='documentStructure']");
    public static By SelectStructure = By.xpath("//span[contains(text(),'Structured')]");
    public static By SelectMedical = By.xpath("//span[contains(text(),'Medical Chart')]");
    public static By ProjectCreated = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[1]");

    public static By SelectFreeForm = By.xpath("//span[contains(text(),'Free-Form')]");
    public static  By SelectSemiStructure = By.xpath("//span[contains(text(),'Semi-Structured')]");
    By AddEntity = By.xpath("//span[contains(text(),' Add Entity ')]");


    By PatientDemoGraphics = By.xpath("//button[contains(text(),' Patient Demographics')]");
    By HCCConditions = By.xpath("//button[contains(text(),' HCC Conditions')]");
    public static By PatientDemoGraphicsSelected = By.xpath("//*[text()=' Patient Demographics ']");
    public static By HCCCConditionsSelected = By.xpath("//*[text()=' HCC Conditions ']");


    By ClickProcessingEngine = By.xpath("//*[@formcontrolname='processingEngine']/div[1]/div[2]");
    By SelectProcessingEngine = By.xpath("//span[contains(text(),'NN High')]");
    public static By SelectProcessingEngineNNLow = By.xpath("//span[contains(text(),'NN Low')]");
    public static By StraightThroughProcess = By.xpath("//*[@formcontrolname='staightThroughProcessing']/label/div");
    By DocumentScore = By.xpath("//input[@formcontrolname='score']");
    public static By Status = By.xpath("//*[@formcontrolname='status']/label/div");
    By Attributes = By.xpath("//span[contains(text(),'Attributes')]");
    public static By DocumentAutoAssign = By.xpath("//*[@formcontrolname='autoAssignment']/label/div");
    By ClickAddTemplate = By.xpath("//span[contains(text(),'Add Template')]");
    By SelectTemplate = By.xpath("//button[contains(text(),'PE_TEMPLATE')]");
    public static By TemplateSelected = By.xpath("//*[@role='gridcell'][1]");

    //*[@role='gridcell'][1]
    By AddFields = By.xpath("//span[contains(text(),' Add Fields ')]");
    By SelectField = By.xpath("//button[contains(text(),'PatientName')]");
    public static By SelectedPatientNameField = By.xpath("//*[contains(text(),'PatientName')]");



    By ClickRoles = By.xpath("//span[contains(text(),'Roles')]");
    public static   By AddRoleAdmin = By.xpath("//span[contains(text(),'Add Role')]");
    public static By SelectRoleAdmin = By.xpath("//button[contains(text(),'AE Admin')]");
    public static By SelectedRoleAdmin = By.xpath("//*[text()=' AE Admin ']");


    By SelectRoleSuperVisor = By.xpath("//button[contains(text(),'AE Supervisor')]");
    By AddUser = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[2]/div[1]/form[1]/project-info-section[1]/mat-accordion[1]/project-roles[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]");
    By AddUserAdmin = By.xpath("//button[@class='mat-focus-indicator disabled-font-color mat-icon-button mat-button-base primary-font-color']");       //esc method
    public static By SelectUserAdmin = By.xpath("//span[contains(text(),'j1@gmail.com')]");
    By UpdateProject = By.xpath("//project-info-section/following-sibling::div/button/span[text()=' Update']/parent::button");
    By UpdatePrjectOnRulePage = By.xpath("//project-rule-section/following-sibling::div/button/span[text()=' Update ']/parent::button");
    By RoleUserDisableEnable = By.xpath("//div[@class='row']/div[3]/mat-slide-toggle");
    By SupervisorRoleDisable = By.xpath("//project-roles/mat-expansion-panel/div/div/div[1]/div[3]/div/div[3]/mat-slide-toggle/label[@class='mat-slide-toggle-label']");
    By RulesPage = By.xpath("//span[text()='Next']");
    By CreateButtonOnProjectPage = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[2]/div[1]/form[1]/div[1]/button[1]/span[1]");


    By ItemsPerPage = By.xpath("//*[@aria-label='Items per page:']");
    By SelectItems = By.xpath("//span[contains(text(),'50')]");
    By NextPage = By.xpath("//span[contains(text(),' Next')]");

    By CancelOnProject = By.xpath("//*[contains(text(),'Cancel')]");
    By ErrorMsgBlank = By.xpath("//span[contains(text(),'Please add the attributes before creating the project.')]");
    By ErrorMsgRoleUser = By.xpath("//span[contains(text(),'Role cannot have empty users')]");
    By ErrorMsgTemplate = By.xpath("//span[contains(text(),'Please add the template before creating the project.')]");
    By ErrorMsgData = By.xpath("//span[contains(text(),'Please check form data')]");
    By ErrorMsgRole = By.xpath("//span[contains(text(),'Role(s) cannot be empty')]");
    By ErrorMsgDisableRole = By.xpath("//span[contains(text(),'AE Supervisor role is Disabled')]");
    By ErrorMsgDataRole = By.xpath("//span[contains(text(),'Please check form data and role(s) cannot be empty')]");
    By TableStructure = By.xpath("//*[contains(text(),' list ')]");
    By SearchProject = By.xpath("//input[@data-placeholder='Search']");


    By RoleManagementBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-id-card m-0 side-icon ng-star-inserted']");
    By SearchRole = By.xpath("//input[@data-placeholder='Search']");
    By EditRole = By.xpath("//span[contains(text(),' AutoAdminRole ')]");
    By ActiveRole = By.xpath("//div[@class='mat-slide-toggle-thumb']");
    By ClickUpdateBtn = By.xpath("//span[contains(text(),'Update' )]");
    By ClickSearchBox = By.xpath("//input[@placeholder='Search']");
    By EditProjectBtn = By.xpath("//mat-icon[contains(text(),'create')]");

    By Logout = By.xpath("//i[@class='fa fa-power-off']");
    By LoginBtn = By.xpath("//button[@type='submit']");
    By Username = By.xpath("//input[@formcontrolname='userName']");
    By Password = By.xpath("//input[@formcontrolname='password']");
    By EditProject = By.xpath("//mat-icon[contains(text(),'create')]");
    By DeleteAttributeFieldName = By.xpath("//mat-table[@role='grid']/mat-row[1]/mat-cell[3]/button");
    public static By DeletedInvoiceAttribute = By.xpath("//*[@role='grid']/mat-row[1]");



    // User Update
    By UserBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-users m-0 side-icon ng-star-inserted']");
    By User = By.xpath("//td[contains(text(),' AE Admin ')]");
    By SearchBtn = By.xpath("//input[@data-placeholder='Search']");
    By DisableUser = By.xpath("//div[@class='mat-slide-toggle-thumb']");
    By UpdateUser = By.xpath("//span[text()='Update']");
    By BackButtonRulePage = By.xpath("//project-rule-section/following-sibling::div/button/span[text()='Back']/parent::button");
    By BackButtonDataPage = By.xpath("//project-data-section/following-sibling::div/button/span[text()='Back']/parent::button");
    By ErrorMsgEntities = By.xpath("//span[contains(text(),'Please add the entities before creating the project.')]");
    public static By DisableUserToggle = By.xpath("//*[@class='mat-slide-toggle mat-primary ng-valid ng-touched ng-dirty']");
    public static By ProjectNameInList = By.xpath("//tbody/tr[1]/td[1]");
    public static By DataPageDispaly = By.xpath("//*[@class='mat-accordion example-headers-align']/parent::project-data-section");
    public static By RulePageDispaly = By.xpath("//*[@class='mat-accordion example-headers-align']/parent::project-data-section");

    public String projectTabUrl="https://alpha.neutrino-ai.com/#/home/project-management";
    public String createProjectUrl="https://alpha.neutrino-ai.com/#/home/project-management/create-project";

    public ProjectPage(WebDriver driver) {
        this.driver = driver;
    }

    SoftAssert softAssert = new SoftAssert();

    public void ClickOnDeleteAttributeFieldName() {
        driver.findElement(DeleteAttributeFieldName).click();
    }

    public By GetSelectUserAdmin(){return this.SelectUserAdmin;}
    public By GetSelectRoleAdmin(){return this.SelectRoleAdmin;}
    public By GetHCCConditions(){
        System.out.println(HCCConditions);
        return this.HCCConditions;}
    public By getPatientDemoGraphics(){
        System.out.println(PatientDemoGraphics);
        return this.PatientDemoGraphics;}
    public By GetSelectMedical(){return this.SelectMedical;}
    public By GetLead(){return this.Lead;}
    public By GetselectLead(){return this.SelectLead;}
    public void ClickOnProjectBtn() throws  InterruptedException{
        driver.findElement(ProjectBtn).click();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL ("https://alpha.neutrino-ai.com/#/home/project-management");

    }

    public void ClickOnCreateProjectBtn() throws InterruptedException {
        driver.findElement(CreateProject).click();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL ("https://alpha.neutrino-ai.com/#/home/project-management/create-project");
    }

    public void ClickOnProjectNameBtn(String text) {
        driver.findElement(ProjectName).sendKeys(text);
    }

    public void ClickOnLeadBtn() {
        driver.findElement(Lead).click();
    }

    public void SelectPatientGraphics() {
        driver.findElement(PatientDemoGraphics).click();
    }

    public void SelectHCCConditions() {
        driver.findElement(HCCConditions).click();
    }


    public void ClickOnAddEntity() {
        driver.findElement(AddEntity).click();
    }

    public void ClickSearchLead(String text) {
        driver.findElement(SearchLead).sendKeys(text);
    }

    public void ClearSearchLead() {
        driver.findElement(SearchLead).clear();
    }

    public void SelectOnLeadBtn() {
        driver.findElement(SelectLead).click();
    }

    public void SelectOnLeadSampleBtn() {
        driver.findElement(SelectLeadSample).click();
    }

    public void SelectOnLeadAdminBtn() {
        driver.findElement(SelectLeadAdmin).click();
    }


    public void ClickOnStartDateBtn() {
        driver.findElement(ClickStartDate).click();
    }

    public void SelectStartDateBtn() {
        driver.findElement(SelectStartDate).click();
    }

    public void ClickOnDocumentStructureBtn() {
        driver.findElement(ClickDocumentStructure).click();
    }

    public void SelectDocumentStructureBtn() {
        driver.findElement(SelectStructure).click();
    }


    public void SelectDocumentStructureMedicalBtn() {
        driver.findElement(SelectMedical).click();
    }


    public void SelectOnSemiStructure() {
        driver.findElement(SelectSemiStructure).click();
    }

    public void SelectOnFreeFormStructure() {
        driver.findElement(SelectFreeForm).click();
    }

    public void ClickOnProcessingEngineBtn() {
        driver.findElement(ClickProcessingEngine).click();
    }

    public void SelectOnProcessingEngineBtn() {
        driver.findElement(SelectProcessingEngine).click();
    }

    public void SelectOnProcessingEngineLowBtn() {
        driver.findElement(SelectProcessingEngineNNLow).click();
    }

    public void ClickOnStraightThroughProcessBtn() {
        driver.findElement(StraightThroughProcess).click();
    }

    public void ClickOnDocumentScoreBtn(String text) {
        driver.findElement(DocumentScore).sendKeys(text);
    }

    public void ClickOnStatusBtn() {
        driver.findElement(Status).click();
    }

    public void ClickOnDocumentAutoAssignBtn() {
        driver.findElement(DocumentAutoAssign).click();
    }

    public void ClickOnAddTemplateBtn() {
        driver.findElement(ClickAddTemplate).click();
    }

    public void ClickOnAddFieldBtn() {
        driver.findElement(AddFields).click();
    }

    public void SelectFieldValue() {
        driver.findElement(SelectField).click();
    }

    public void ClickOnRoleUserDisableEnable() {
        driver.findElement(RoleUserDisableEnable).click();
    }

    public void ClickOnSupervisorRoleDisable() {
        driver.findElement(SupervisorRoleDisable).click();
    }

    public void ClickOnTemplateBtn() {
        driver.findElement(SelectTemplate).click();
    }

    public void ClickOnRolesBtn() {
        driver.findElement(ClickRoles).click();
    }

    public void ClickOnAddRoleBtn() {
        driver.findElement(AddRoleAdmin).click();
    }

    public void ClickOnSelectRoleBtn() {
        driver.findElement(SelectRoleAdmin).click();
    }

    public void ClickOnSelectSupervisorRoleBtn() {
        driver.findElement(SelectRoleSuperVisor).click();
    }

    public void ClickUpdateBtn() {
        driver.findElement(ClickUpdateBtn).click();
    }


    public void ClickOnAddUserBtn() {
        driver.findElement(AddUserAdmin).click();
    }

    public void ClickOnAddUser() {
        driver.findElement(AddUser).click();
    }

    public void ClickOnSelectUserBtn() {
        driver.findElement(SelectUserAdmin).click();
    }


    public void ClickItemsPerPage() {
        driver.findElement(ItemsPerPage).click();
    }

    public void SelectItemsPerPage() {
        driver.findElement(SelectItems).click();
    }

    public void ClickNextPage() {
        driver.findElement(NextPage).click();
    }


    public void ClickRulesPage() {
        driver.findElement(RulesPage).click();
    }

    public void ClickOnCreate()  {
        driver.findElement(CreateButtonOnProjectPage).click();
    }

    public void ClickOnCancelProject() throws  InterruptedException
    {
        driver.findElement(CancelOnProject).click();
    }

    public void VerifyAssertForBlank()
    {
        AssertionsFunction.verifyElementText("Please add the attributes before creating the project.",ErrorMsgBlank);
    }

    public void VerifyAssertForUser()
    {
        AssertionsFunction.verifyElementText("Role cannot have empty users",ErrorMsgRoleUser);
    }

    public void VerifyAssertForNoTemplate()
    {

        AssertionsFunction.verifyElementText("Please add the template before creating the project.",ErrorMsgTemplate);

    }

    public void VerifyAssertForData()
    {

        AssertionsFunction.verifyElementText("Please check form data",ErrorMsgData);

    }

    public void VerifyAssertForDataAndRole()
    {
        AssertionsFunction.verifyElementText("Please check form data and role(s) cannot be empty",ErrorMsgDataRole);

    }

    public void VerifyAssertForRole() {

        AssertionsFunction.verifyElementText("Role(s) cannot be empty",ErrorMsgRole);

    }


    public void VerifyAssertForLeadAdmin() {
        String actual_msg = driver.findElement(SelectLeadAdmin).getText();
        String expect = "admin@test.com";
        softAssert.assertEquals(actual_msg, expect);
    }

    public void VerifyAssertForRoleDisable() {
        String actual_msg = driver.findElement(ErrorMsgDisableRole).getText();
        String expect = "AE Supervisor role is Disabled";
        softAssert.assertEquals(actual_msg, expect);
    }

    public void VerifyAssertForEntities() {

        AssertionsFunction.verifyElementText("Please add the entities before creating the project.",ErrorMsgEntities);

    }



    public void ClickOnEndDate() {
        driver.findElement(ClickEndDate).click();
    }

    public void SelectEndDate() {
        driver.findElement(SelectEndDate).click();
    }

    public void TableStructure() {
        driver.findElement(TableStructure).click();
    }

    public void SearchProject() {
        driver.findElement(SearchProject).sendKeys("QA-AutoProject-Structured10");
    }

    public void SearchProjectAdmin() {
        driver.findElement(SearchProject).sendKeys("QA-AutoAdmin1");
    }

    public void ClickRoleManagementBtn() {
        driver.findElement(RoleManagementBtn).click();
    }

    public void SearchCreatedRole(String text) {
        driver.findElement(SearchRole).sendKeys(text);
    }

    public void ClickEditRole() {
        driver.findElement(EditRole).click();
    }

    public void ClickActiveRole() {
        driver.findElement(ActiveRole).click();
    }

    public void ClickLogout() {
        driver.findElement(Logout).click();
    }

    //Admin Login
    public void EnterUsername(String text) {
        driver.findElement(Username).sendKeys(text);
    }

    public void EnterPassword(String text) {
        driver.findElement(Password).sendKeys(text);
    }

    public void ClickLoginButton() {
        driver.findElement(LoginBtn).click();
    }

    public void ClickOnEditProject() {
        driver.findElement(EditProject).click();
    }

    public void ClickOnUpdateProject() {
        driver.findElement(UpdateProject).click();
    }

    public void ClickOnUpdateProjectOnRulePage() {
        driver.findElement(UpdatePrjectOnRulePage).click();
    }

    // User Enable and disable
    public void ClickUserBtn() {
        driver.findElement(UserBtn).click();
    }

    public void SearchCreatedUser(String text) {
        driver.findElement(SearchBtn).sendKeys(text);
    }

    public void SelectSearchedUser() {
        driver.findElement(User).click();
    }

    public void ClickDisableUser() {
        driver.findElement(DisableUser).click();
    }

    public void ClickUpdateUser() {
        driver.findElement(UpdateUser).click();
    }

    public void ClickBackRulePage() {
        driver.findElement(BackButtonRulePage).click();
    }

    public void CLickBackDataPage() {
        driver.findElement(BackButtonDataPage).click();
    }
    public void ClickOnSearchBox(String text) {driver.findElement(ClickSearchBox).sendKeys(text);}
    public void ClickEditProjectBtn(){ driver.findElement(EditProjectBtn).click();}


    public void verifyProjectCreated(String TupeOfProject) throws IOException {
        switch (TupeOfProject) {
            case "MedicalChartProject": {
                AssertionsFunction.verifyElementText(ReadProps.readAttr("MedicalChartProjectName1"), ProjectCreated);
                break;
            }

            case "FreeFormProject": {
                AssertionsFunction.verifyElementText(ReadProps.readAttr("FreeFormProjectName1"), ProjectCreated);
                break;
            }

            case "StructuredProject": {
                AssertionsFunction.verifyElementText(ReadProps.readAttr("StructuredProjectName1"), ProjectCreated);
                break;
            }

            case "SemiStructuredProject": {
                AssertionsFunction.verifyElementText(ReadProps.readAttr("SemiStructuredProjectName1"), ProjectCreated);
                break;
            }

        }
    }
}
