package Pages;

import Utilities.AssertionsFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LoginPage {

    WebDriver driver = null;

    By userName = By.xpath("//input[@formcontrolname='userName']");
    By password = By.xpath("//input[@formcontrolname='password']");
    By loginBtn = By.xpath("//button[@type='submit']");
    public static  By Logout = By.xpath("//span[@mattooltip='Logout']");
    By ErrorMsgBlankData = By.xpath("//span[contains (text(),'Please Enter Valid Data ...!')]");
    ////span[contains (text(),'Please Enter Valid Data ...!')]
    public static By ErrorMsgInvalidData = By.xpath("//span[contains (text(),'Something Went Wrong ...!')]");
    public static By ErrorMsgDisableUser = By.xpath("//span[text()='User is inactive. Please contact Administration']");
    public static String ErrorMsgIdPwdSame ="Password cannot be email Id";
    public static By ErrMsgIdPwdSame= By.xpath("//span[text()='Password cannot be email Id']");

    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Methods Declaration.


    public void setPassword(String text) {
        driver.findElement(password).sendKeys(text);
    }

    public void clickLoginButton() {
        driver.findElement(loginBtn).click();
    }

    public void ClickLogoutBtn() {
        driver.findElement(Logout).click();
    }

    public void ClearUserID() {
        driver.findElement(userName).clear();
    }

    public void ClearPWD() {
        driver.findElement(password).clear();
    }

    public void VerifyAssertError() {
        String actual_msg = driver.findElement(ErrorMsgBlankData).getText();
        String expect = "Please Enter Valid Data ...!";
        Assert.assertEquals(actual_msg, expect);
    }
    public void VerifyAssertError1() {
        String actual_msg = driver.findElement(ErrorMsgInvalidData).getText();
        String expect = "Something Went Wrong ...!";
        Assert.assertEquals(actual_msg, expect);
    }
    public void VerifyHomePage() { // url changehttps://alpha.neutrino-ai.com/#/home
        String actual_page = driver.getCurrentUrl();
        String expected_page = "https://alpha.neutrino-ai.com/#/home/project-management";
        Assert.assertEquals(actual_page, expected_page);
    }
    public void VerifyHomePage1() { // added
        String actual_page = driver.getCurrentUrl();
        String expected_page = "https://alpha.neutrino-ai.com/#/home";
        Assert.assertEquals(actual_page, expected_page);
    }
    public void VerifyAssertBack() {
        String actual_page = driver.getCurrentUrl();
        String expected_page = "https://alpha.neutrino-ai.com/#/home";
        Assert.assertEquals(actual_page, expected_page);
    }
    public void VerifyAssertBack1() {  // added
        String actual_page = driver.getCurrentUrl();
        String expected_page = "https://alpha.neutrino-ai.com/#/login";
        Assert.assertEquals(actual_page, expected_page);
    }
    public void RefreshPage()
    {
        driver.navigate().refresh();
    }

    public void NavigateBack()
    {
        driver.navigate().back();
    }

    public void accessPermission(String TabName) throws InterruptedException {
        switch (TabName){

            case "User":
            {
                AssertionsFunction.verifyElementPresent(CreateUserPage.UserBtn);
                Thread.sleep(2000);
                driver.findElement(CreateUserPage.UserBtn).click();
                Thread.sleep(5000);
                AssertionsFunction.verifyElementPresent(CreateUserPage.CreateUserBtn);
                Thread.sleep(4000);
                driver.findElement(By.xpath("//tbody[@role='rowgroup']/tr[1]/td[5]")).click();
                Thread.sleep(4000);
                AssertionsFunction.verifyElementPresent(CreateUserPage.UpdateUser);
                Thread.sleep(1000);
                break;

            }

            case "Role":
            {
                AssertionsFunction.verifyElementPresent(CreateRolePage.RoleManagementBtn);
                Thread.sleep(2000);
                driver.findElement(CreateRolePage.RoleManagementBtn).click();
                Thread.sleep(2000);
                AssertionsFunction.verifyElementPresent(CreateRolePage.CreateRoleBtn);
                Thread.sleep(4000);
                driver.findElement(By.xpath("//tbody[@role='rowgroup']/tr[1]/td[5]")).click();
                Thread.sleep(4000);
                AssertionsFunction.verifyElementPresent(CreateRolePage.ClickUpdateBtn);
                Thread.sleep(1000);
                break;

            }

            case "Templates":
            {
                AssertionsFunction.verifyElementPresent(TemplatePage.TemplateBtn);
                Thread.sleep(2000);
                driver.findElement(TemplatePage.TemplateBtn).click();
                Thread.sleep(8000);
                AssertionsFunction.verifyElementPresent(TemplatePage.UploadTemplate);
                Thread.sleep(1000);
                break;
            }

            case "Dataset":
            {
                AssertionsFunction.verifyElementPresent(DatasetPage.DatasetBtn);
                Thread.sleep(2000);
                driver.findElement(DatasetPage.DatasetBtn).click();
                Thread.sleep(6000);
                AssertionsFunction.verifyElementPresent(DatasetPage.AddCategoryBtn);
                Thread.sleep(1000);
                break;
            }
            case "Projects":
            {
                AssertionsFunction.verifyElementPresent(ProjectPage.ProjectBtn);
                Thread.sleep(2000);
                driver.findElement(ProjectPage.ProjectBtn).click();
                Thread.sleep(8000);
                AssertionsFunction.verifyElementPresent(ProjectPage.CreateProject);
                Thread.sleep(1000);
                break;
            }

            case "Documents":
            {
                AssertionsFunction.verifyElementPresent(DocumentPage.DocumentBtn);
                Thread.sleep(2000);
                driver.findElement(DocumentPage.DocumentBtn).click();
                Thread.sleep(10000);
                AssertionsFunction.verifyElementPresent(DocumentPage.DocumentTable);
                Thread.sleep(1000);
                break;
            }
            case "Analytics":
            {
                AssertionsFunction.verifyElementPresent(AnalyticsPage.AnalyticsBtn);
                Thread.sleep(2000);
                driver.findElement(AnalyticsPage.AnalyticsBtn).click();
                Thread.sleep(8000);
                AssertionsFunction.verifyElementPresent(AnalyticsPage.AnalyticsPageDisplay);
                Thread.sleep(1000);
                break;
            }
            default:
            {
                System.out.println("Wrong Tab Name Entered");
            }

    }
    }


}