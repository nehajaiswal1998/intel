package Pages;
import Utilities.Custome_Wait;
import Utilities.Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Random;

public class CreateRolePage {

    WebDriver driver = null;
    //TC 6.1 element locators

    public static By RoleManagementBtn = By.xpath("//*[@id='sidenav']//following::mat-nav-list/mat-list-item[2]/div/i");
    public static By CreateRoleBtn = By.xpath("//span[text()=' Create Role ']");

    By ClickCreate = By.xpath("//span[text()= ' Create ']");
    public By RoleName = By.xpath("//input[@formcontrolname='role']");
    By activeOrInactiveRoleToggleButton = By.xpath("//div[@class='mat-slide-toggle-thumb']");
    By AddPermission = By.xpath(" //button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']");
    By searchPermission=By.xpath("//input[@placeholder='Search']");
    By ViewDocumentPermission = By.xpath("//span[contains(text(),'View Document' )]");
    By errorMsgForInvalidRoleName=By.xpath("//mat-error[@class='mat-error ng-star-inserted']");
    By ClickCancel = By.xpath("//span[text()='Cancel']");
    By SearchRole = By.xpath("//input[@data-placeholder='Search']");
    By selectCreatedRole=By.xpath("//td[@class='mat-cell cdk-cell mat-tooltip-trigger cdk-column-role mat-column-role ng-star-inserted']");
    By ProcessDocumentPermission = By.xpath("//span[contains(text(),' Process Document ')]");
    By ViewApiConfig=By.xpath("//span[text()=' View API Config ']");
    By CreateUserPermission = By.xpath("//span[(text()='Create User']");
    By CreateProject = By.xpath("//span[contains(text(),'Create Project')]");
    By ViewUser = By.xpath("//span[contains(text(),'View User')]");
    By ViewRole = By.xpath("//span[contains(text(),'View Role')]");
    By UpdateProject = By.xpath("//span[contains(text(),'Update Project')]");
    By UpdateUser = By.xpath("//span[contains(text(),'Update User')]");
    By CreateTemplate = By.xpath("//span[contains(text(),'Create Template')]");
    By CreateRole = By.xpath("//span[contains(text(),'Create Role')]");
    By ViewAnalytics    = By.xpath("//span[contains(text(),'View Analytics')]");
    By UpdateRole = By.xpath("//span[contains(text(),'Update Role')]");
    @FindBy (xpath="//span[text()='Cancel']")
    public WebElement cancelButton;
    public static By ClickUpdateBtn = By.xpath("//span[text()=' Update ']");
    By RemovePermission = By.xpath("//mat-icon[contains(text(),'cancel')]");

    public static By UpdatedTime = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[3]");
    public static By CreatedTime = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[4]");
    By sortRole= By.xpath("//div[text()='Roles ']");

    public static By errorMsgForBlankInputOrExistRoleName=By.xpath("//simple-snack-bar[@class='mat-simple-snackbar ng-star-inserted']"); //work for all error message after click on create button
    public static String errormsg="Please enter all the details before submitting.";
    public static String role_exist_error_msg="Role exist with name";

    public By getCreateUserPermission()
    {
        return this.CreateUserPermission;
    }

    public By getValidationMessage()
    {
        return this.errorMsgForBlankInputOrExistRoleName;
    }
    public By getProcessDocumentPermission()
    {
        return  this.ProcessDocumentPermission;
    }
    public By getViewApiConfig()
    {
        return this.ViewApiConfig;
    }
    public By getViewDocumentPermission()
    {
        return this.ViewDocumentPermission;
    }
    public By getSearch_created_role_element()
    {
        return this.selectCreatedRole;
    }

    public CreateRolePage(WebDriver driver) throws IOException
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnSortButton()
    {
        Custome_Wait.wait(driver,sortRole);
        driver.findElement(sortRole).click();
    }

    public void clickOnRoleMenu() throws Exception
    {
        driver.findElement(RoleManagementBtn).click();
        Thread.sleep(5000);
    }
    public void clickOnCreateRoleButton() throws Exception
    {
        Custome_Wait.wait(driver,CreateRoleBtn);
        Thread.sleep(5000);
        driver.findElement(CreateRoleBtn).click();
    }

    public void enterNewRoleName(String roleName)
    {
        Custome_Wait.wait(driver,RoleName);
        Random r = new Random();
        char first_c = (char)(r.nextInt(26) + 'a');
        char second_c = (char)(r.nextInt(26) + 'a');
        driver.findElement(RoleName).sendKeys(roleName+first_c+second_c);
    }

    public void enterExistingRoleNameOrInvalidRoleName(String roleName)
    {
        Custome_Wait.wait(driver,RoleName);
        driver.findElement(RoleName).sendKeys(roleName);
    }

    public void clickOnAddPermissionButton(String permissionMenu) throws Exception
    {
        driver.findElement(AddPermission).click();
        driver.findElement(searchPermission).sendKeys(permissionMenu);


    }

    public void SelectViewDocumentPermission() throws Exception
    {
        Custome_Wait.wait(driver,ViewDocumentPermission);
        driver.findElement(ViewDocumentPermission).click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);

    }
    public void SelectCreateUserPermission() throws Exception
    {
        driver.findElement(CreateUserPermission).click();

    }
    public  void SelectCreateProject() throws Exception
    {
        driver.findElement(CreateProject).click();

    }
    public void SelectViewUser() throws Exception
    {
        driver.findElement(ViewUser).click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
    }
    public void SelectUpdateRole() throws Exception
    {
        driver.findElement(UpdateRole).click();

    }
    public  void SelectViewRole() throws Exception
    {
        driver.findElement(ViewRole).click();

    }
    public void SelectUpdateProject() throws Exception
    {
        driver.findElement(UpdateProject).click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);

    }
    public void SelectUpdateUser() throws Exception
    {
        driver.findElement(UpdateUser).click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);

    }
    public void SelectCreateTemplate() throws Exception
    {
        driver.findElement(CreateTemplate).click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);

    }
    public  void SelectCreateRole() throws Exception
    {
        driver.findElement(CreateRole).click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);

    }
    public  void SelectViewAnalytics() throws Exception
    {
        driver.findElement(ViewAnalytics).click();

    }

    public void selectViewAPIConfiPermission() throws Exception
    {
        driver.findElement(ViewApiConfig).click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
    }
    public void activeOrInactiveRoleButton()
    {
        driver.findElement(activeOrInactiveRoleToggleButton).click();
    }

    public void clickOnCancelButton()
    {
       Custome_Wait.waitElement(driver,cancelButton);
        cancelButton.click();
    }

    public void clickOnCreateButton() throws Exception
    {
        Custome_Wait.wait(driver,ClickCreate);
        driver.findElement(ClickCreate).click();
    }

    public void searchCreatedRole(String text)
    {
        Custome_Wait.wait(driver,SearchRole);
        driver.findElement(SearchRole).sendKeys(text);

    }

    public void clickOnEditRole()
    {
        driver.findElement(selectCreatedRole).click();
    }
    public void ClickProcessDocPermission()
    {
        driver.findElement(ProcessDocumentPermission).click();
    }
    public void ClickViewApiConfig() throws Exception
    {
        driver.findElement(ViewApiConfig).click();

    }

    public void RemoveProcessPermission()
    {
        driver.findElement(RemovePermission).click();
    }

    public void ClickUpdateBtn()
    {
        Custome_Wait.wait(driver,ClickUpdateBtn);
        driver.findElement(ClickUpdateBtn).click();
    }

    public void ClickRemovePermission()
    {
        driver.findElement(RemovePermission).click();
    }



}