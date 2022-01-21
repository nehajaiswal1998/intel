package Tests;

import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.testng.annotations.Test;
import java.io.IOException;

public class CreateUserPlatformAdminTest extends BasePage {
    @Test
    public void CreateUserPlatformAdminFlow() throws InterruptedException, IOException {
        try {
            BasePage.LoginTest();
            CreateUserPage UserPageObj = new CreateUserPage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");
            //Blank username and Blank ID
            UserPageObj.ClickUserBtn();
            Thread.sleep(3000);
            UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(500);
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUserCreation//BlankNameID.jpg");
            System.out.println("Please Check Form Detail...!");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(5000);

            // Valid Username Blank ID
            UserPageObj.EnterUserName(ReadProps.readAttr("CUName"));

            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUserCreation//ValidUserNameBlankId.jpg");
           // UserPageObj.UserBlankAssert();
            Thread.sleep(3000);
            System.out.println("Please Check Form Detail...!");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(4000);

            //Blank Username Valid ID
            UserPageObj.EnterEmail(ReadProps.readAttr("CUEmail"));
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
           // UserPageObj.UserBlankAssert();
            System.out.println("Please Check Form Detail...!");
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUserCreation//BlankUsernameValidId.jpg");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(4000);

            //Invalid UserName Blank ID
            UserPageObj.EnterUserName(ReadProps.readAttr("CUname"));
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
          //  UserPageObj.UserBlankAssert();
            System.out.println("Please Check Form Detail...!");
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUserCreation//InvalidUsernameBlankId.jpg");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(4000);

            // Blank UserName Invalid Id
            UserPageObj.EnterEmail(ReadProps.readAttr("CUemail"));
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
           // UserPageObj.UserBlankAssert();

            System.out.println("Please Check Form Detail...!");
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUserCreation//BlankUserNameInvalidId.jpg");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(4000);

            //  Invalid Credential
            UserPageObj.EnterUserName(ReadProps.readAttr("CUname"));
            Thread.sleep(2000);
            UserPageObj.EnterEmail(ReadProps.readAttr("CUemail"));
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            System.out.println("Please Check Form Detail...!");
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUserCreation//InvalidCredentials.jpg");
           // UserPageObj.UserBlankAssert();
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);

            // Create User with Existing username and ID
            UserPageObj.EnterUserName(ReadProps.readAttr("CUName"));
            Thread.sleep(2000);
            UserPageObj.EnterEmail(ReadProps.readAttr("CUEmail"));
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUserCreation//ValidUsernameValidId.jpg");
            //UserPageObj.UserExistAssert();
            Thread.sleep(2000);
            UserPageObj.ClickOnCancelBtn();
            Thread.sleep(3000);

            //Creation Of User-Whenever we have to run on new env then these lines are used.
          /*  UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.EnterUserName(ReadProps.readAttr("Username"));
            Thread.sleep(2000);
            UserPageObj.EnterEmail(ReadProps.readAttr("UserEmail"));
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUserCreation//PlatformAdminUserCreate.jpg");
            Thread.sleep(2000);
            System.out.println("User Created Successfully");
            Thread.sleep(2000);

            UserPageObj.CreateUserAssert();
            Thread.sleep(2000);
            System.out.println("User Created");

            // At the time of create user need to remove comment from assertion

            UserPageObj.CreateTimeAssert();
            Thread.sleep(2000);
            System.out.println("Time Assert Pass ");


            //1 AE Admin
            UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.EnterUserName("AE Admin");
            Thread.sleep(2000);
            UserPageObj.EnterEmail("Admin@Test.com");
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUserCreation//AdminUserCreate.jpg");
            Thread.sleep(2000);
            System.out.println("User Created Successfully");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);

            // At the time of create user need to remove comment from assertion

          /*  UserPageObj.CreateTimeAssert();
            Thread.sleep(2000);
            System.out.println("Time Assert Pass ");


            //2 AE Supervisor
           // UserPageObj.ClickCreateUserBtn();
           // Thread.sleep(2000);
            UserPageObj.EnterUserName("AE Suprevisor");
            Thread.sleep(2000);
            UserPageObj.EnterEmail("supervisor@Test.com");
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUserCreation//SupervisorUserCreate.jpg");
            Thread.sleep(2000);
            System.out.println("User Created Successfully");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);

            // At the time of create user need to remove comment from assertion
            UserPageObj.CreateTimeAssert();
            Thread.sleep(2000);
            System.out.println("Time Assert Pass ");

            //3 AE Operator
           // UserPageObj.ClickCreateUserBtn();
          //  Thread.sleep(2000);
            UserPageObj.EnterUserName("AE Operator");
            Thread.sleep(2000);
            UserPageObj.EnterEmail("operator@Test.com");
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUserCreation//OpratorUserCreate.jpg");
            Thread.sleep(2000);
            System.out.println("User Created Successfully");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);
            // At the time of create user need to remove comment from assertion

           UserPageObj.CreateTimeAssert();
                Thread.sleep(2000);
         System.out.println("Time Assert Pass ");*/


            //Search for already Created user
            UserPageObj.ClickUserBtn();
            Thread.sleep(3000);
            UserPageObj.SearchCreatedUser(ReadProps.readAttr("Username"));
            Thread.sleep(2000);
            UserPageObj.SelectSearchedUser();
            Thread.sleep(2000);
            UserPageObj.ClickOnCancelBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUserCreation//OpenUserCreated.jpg");
            Thread.sleep(2000);
            UserPageObj.SelectSearchedUser();
            Thread.sleep(2000);
            UserPageObj.ClickUpdateUser();
            Thread.sleep(5000);
            UserPageObj.LogOut();
            Thread.sleep(4000);
            driver.close();
            UserPageObj.AssertAll();

        } catch (Exception e) {
            test.log(status.FAIL, e);
        }
    }
}


