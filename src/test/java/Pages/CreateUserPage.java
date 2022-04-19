package Pages;
import Base.BasePage;
import Utilities.Functions;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class CreateUserPage extends BasePage
{
    public static By UserBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-users m-0 side-icon ng-star-inserted']");
    public static By CreateUserBtn = By.xpath("//span[contains(text(),' Create User ')]");
    By CreateBtn = By.xpath("//span[contains(text(),'Create')]");
    By EnterUserName = By.xpath("//input[@formcontrolname='name']");
    By EnterEmail  = By.xpath("//input[@formcontrolname='email']");
    By ActiveUser = By.xpath("//div[@class='mat-slide-toggle-thumb']");
    By ValidationUserName=By.xpath("//*[text()='Please enter only characters.']");
    By ValidationEmailID=By.xpath("//*[text()='Please enter a valid email id.']");
    By SearchBtn  = By.xpath("//input[@data-placeholder='Search']");
    By DisableUser = By.xpath("//div[@class='mat-slide-toggle-thumb']");

    public static By UpdateUser  = By.xpath("//span[contains(text(),'Update')]");
    public static By UpdatedTimeUser_Admin=By.xpath("//tbody[@role='rowgroup']/tr[1]/td[3]");
    public static   By CreatedTimeUser_Admin=By.xpath("//tbody[@role='rowgroup']/tr[1]/td[4]");
    By SortUser=By.xpath("//div[contains(text(),'Name ')]");
    By Password  = By.xpath("//input[@type='password']");
    By PlatformUser = By.xpath("//*[text()=' Create User ']//following::tr[2]/td[1]");  //change by suwarna
    By SelectUser = By.xpath("//tbody[@role='rowgroup']");
    By UserUpdated = By.xpath("//td[contains(text(),\""+ ReadProps.readAttr("ValidNameUP") +"\")]");
    //By AdminUser = By.xpath("//td[contains(text(),' Nirbhay ')]");                //Change everytime before u run.
    By AdminUser=By.xpath("//td[contains(text(),\""+ ReadProps.readAttr("AdminUserName") +"\")]");
    By AdminUserExtra=By.xpath("//*[@class='mat-table cdk-table mat-sort']//following::tr[1]/td[1]");
    By AdminUserExtraForDisabled=By.xpath("//*[@class='mat-table cdk-table mat-sort']//following::tr[1]/td[1]");
    By UpdatedTime = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[3]");
    By CreatedTime = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[4]");
    By logout = By.xpath("//span[@mattooltip='Logout']");
    By CancelButton = By.xpath("//span[contains(text(),'Cancel')]");
    By username = By.xpath("//input[@formcontrolname='userName']");
    By password = By.xpath("//input[@formcontrolname='password']");
    By loginBtn = By.xpath("//button[@type='submit']");
    By ExistErrorMsg = By.xpath("//span[contains(text(),'User exists with email sampleemail@email.com')]");
    By ProfileIcon=By.xpath("//div[@class='profileImageIcon ng-star-inserted']");
    By createdUser=By.xpath("//td[contains(text(),\""+ ReadProps.readAttr("AdminUserName") +"\")]");
    By createdUser_withDisabledStatus=By.xpath("//td[contains(text(),\""+ ReadProps.readAttr("AdminUserName") +"\")]");
    public By actualUserName=By.xpath("//span[contains(text(),' AE Admin ')]");
    public String UserText="AE Admin";
    public  String userTabUrl="https://alpha.neutrino-ai.com/#/home/user-management";
    public String loginHoempPageUrl="https://alpha.neutrino-ai.com/#/home/project-management";
    public String createUserUrl="https://alpha.neutrino-ai.com/#/home/user-management/create-user";
    public String loginPageUrl="https://alpha.neutrino-ai.com/#/login";

    public void ProfileIconClick(){driver.findElement(ProfileIcon).click();}
    public CreateUserPage(WebDriver driver) throws IOException {
        BasePage.driver = driver;
    }
    public  void DoubleClickUserBtn() {
        WebElement UserBtn1 = driver.findElement(By.xpath("//i[@class='mat-tooltip-trigger fa fa-users m-0 side-icon ng-star-inserted']"));

        Actions s = new Actions(driver);
        s.doubleClick(UserBtn1).perform();
        //driver.findElement(UserBtn).click();
    }
    public By getValidationEmailID(){return this.ValidationEmailID;}
    public By getValidationUserName(){return this.ValidationUserName;}
    public By getAdminUserExtra(){return this.AdminUserExtra;}
    public By getAdminUserExtraForDisabled(){return this.AdminUserExtraForDisabled;}
    public By getcreatedUser_withDisabledStatus(){return this.createdUser_withDisabledStatus;}
    public By getAdminUser(){return this.AdminUser;}
    public By GetcreatedUser() {return this.createdUser;}
    public void ClickUserBtn() throws Exception
    {
        Thread.sleep(5000);
        driver.findElement(UserBtn).click();
    }
    public  void ClickOnCancelBtn()throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(CancelButton).click();
    }
    //public void ClickCancelBtn(){driver.findElement(CancelBtn).click();}
    //Wait added
    public void ClickCreateUserBtn() throws InterruptedException {
       // Functions.custome_wait(CreateUserBtn);
        Thread.sleep(2000);
        driver.findElement(CreateUserBtn).click();}

    public void ClickCreateBtn()throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(CreateBtn).click();
    }
    public void EnterUserName(String text) throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(EnterUserName).sendKeys(text);
    }
    public void EnterEmail(String text)throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(EnterEmail).sendKeys(text);
    }
    public void ClickActiveUser() throws Exception   //change by suwarna
    {
    	Thread.sleep(5000);
    	driver.findElement(ActiveUser).click();
    	}

    public  void SearchCreatedUser(String text)throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(SearchBtn).sendKeys(text);
    }

    public  void SelectSearchedUserPA() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(PlatformUser).click();}
    public  void SelectUser()throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(SelectUser).click();}
    public  void SelectSearchedAdmin()throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(AdminUser).click();}//change this value

    public  void SelectSearchedUser()throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(AdminUserExtraForDisabled).click();
    }
    public  void SelectSearchedAdminUser()throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(AdminUserExtra).click();
    }//change this value
    
    public void ClickDisableUser()throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(DisableUser).click();
    }
    public void ClickEnableUser()throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(DisableUser).click();
    }
    public void ClickUpdateUser()throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(UpdateUser).click();}
    public void ClickOnSortUser()throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(SortUser).click();}
    public void ClickToClearName() throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(EnterUserName).clear();
    }
    public  void ClearPassword()throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(Password).clear();}
    public void EnterPassword(String text)throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(Password).sendKeys(text);
    }
    public  String errmsg="Please enter all the details before submitting.";
    public  By errmsgBlankDataCreateRoleClick=By.xpath("//span[contains(text(),'Please enter all the details before submitting.')]");
    public static By ErrMsgName = By.xpath("//mat-error[text()='Please enter only characters.']");
    public static By ErrMsgOnlyDigitsPWD = By.xpath("//mat-error[text()=' A password should contain an uppercase and lowercase characters.  ']");
    public static By ErrMsgPWD = By.xpath("//mat-error[text()=' A password should contain an uppercase and lowercase characters. and in between 8 to 12  ']");
   public static By ErrMsgOnlyUpperCaseChar = By.xpath("//mat-error[text()=' A password should contain and lowercase characters.  ']");
    public static By ErrMsgOnlylowerCaseChar = By.xpath("//mat-error[text()=' A password should contain an uppercase  ']");
    public static By ErrMsgLwrLimitPWD = By.xpath("//mat-error[text()=' A password should be minimum 8 characters long.  ']");
    public static By UserCreated = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[1]");
    public static By UserUpdatedTime = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[3]");
    public static By UserCreatedTime = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[4]");



    SoftAssert softAssert = new SoftAssert();

    public void CreateUserAssert() {
        String[] User = driver.findElement(PlatformUser).getText().split(" ");
        String ActualUser = User[1].trim();
        String ExpectedUser = "AutoSampleBB";
        softAssert.assertEquals(ActualUser, ExpectedUser);
    }
    public void CreateTimeAssert()
    {
        String UpdateTime=driver.findElement(UpdatedTime).getText();
        String CreateTime=driver.findElement(CreatedTime).getText();
        softAssert.assertEquals(UpdateTime, CreateTime);

    }
//    public void UserBlankAssert()
//    {
//        String ActBlankErrMsg=driver.findElement(BlankErrorMsg).getText();
//        String ExpctdBlankErrMsg="Please Check Form Detail ...!";
//        softAssert.assertEquals(ActBlankErrMsg, ExpctdBlankErrMsg);
//    }
    public void UserExistAssert()
    {
        String ActExistErrMsg = driver.findElement(ExistErrorMsg).getText();
        String ExpctdExistErrMsg ="User exists with email sampleemail@email.com";
        softAssert.assertEquals(ActExistErrMsg, ExpctdExistErrMsg);
    }
    public void UpdateTimeAssert()
    {
        String UpdateTime=driver.findElement(UpdatedTime).getText();
        String CreateTime=driver.findElement(CreatedTime).getText();
        softAssert.assertNotEquals(UpdateTime,CreateTime);
    }

    public void AssertAll()
    {
        softAssert.assertAll();
    }

    public void LogOut()throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(logout).click();
    }

    public void setUsername(String text) throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(username).sendKeys(text);
    }
    public void setPassword(String text)throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(password).sendKeys(text);
    }
    public void clickLoginButton() throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(loginBtn).click();
    }
    public void SelectUpdatedUser() throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(UserUpdated).click();
    }


}