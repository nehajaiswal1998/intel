package Tests;

import Base.BasePage;
import Pages.LoginPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class LoginTest extends BasePage {
    WebDriver driver;

    @Test
    public static void LoginTestFlow() throws Exception {
        try {

            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");
            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //Object creation
            LoginPage loginPageObjects = new LoginPage(driver);

            driver.get(ReadProps.readAttr("URL"));
            Thread.sleep(2000);
            String actualTitle = driver.getTitle();
            String expectedTitle = "IntelliDoc";
            assertEquals(expectedTitle, actualTitle);
            System.out.println("Title Match");
            driver.manage().window().maximize();
            // Identify Logo
            WebElement i = driver.findElement(By.xpath("//img[contains(@class,'img-fluid login-logo')]"));
            Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);
            //Verify logo Matched or not.
            if (p) {
                System.out.println("Logo Matched!");
            } else {
                System.out.println("Logo Unmatched!");
            }
            Thread.sleep(2000);
            //TC 1.1 - Login with Blank Username and Blank Password for Platform Admin.
            loginPageObjects.clickLoginButton();
            loginPageObjects.VerifyAssertError();
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//BlankID&Pwd.jpg");
            System.out.println("Please Enter Valid Data!");
            Thread.sleep(2000);

            //TC 1.2 - Login with Invalid Username and Blank Password for Platform Admin.
            loginPageObjects.setUsername(ReadProps.readAttr("InvalidUsername"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            loginPageObjects.VerifyAssertError();
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//InvalidID&BlankPwd.jpg");
            System.out.println("Login Failed - Invalid Username and Blank Password");
            Thread.sleep(2000);

            //TC 1.3 - Login with Blank Username and Valid Password for Platform Admin.
            loginPageObjects.ClearUserID();
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("Password"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//BlankID&ValidPwd.jpg");
            System.out.println("Login Failed - Blank Username and Valid Password");
            Thread.sleep(2000);

            //TC 1.4 - Login with Blank Username and Invalid Password for Platform Admin.
            loginPageObjects.ClearPWD();
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("InvalidPassword"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//BlankID&InvalidPwd.jpg");
            System.out.println("Login Failed - Blank Username and Invalid Password");
            Thread.sleep(2000);

            //TC 1.5 - Login with Valid Username and Blank Password for Platform Admin.
            loginPageObjects.ClearPWD();
            Thread.sleep(2000);
            loginPageObjects.setUsername(ReadProps.readAttr("UserID"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//ValidID&BlankPwd.jpg");
            System.out.println("Login Failed - Valid Username and Blank Password");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);

            //TC 1.6 - Login with Invalid Username and Password for Platform Admin.
            loginPageObjects.setUsername(ReadProps.readAttr("InvalidUsername"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("InvalidPassword"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//InvalidID&InvalidPwd.jpg");
            System.out.println("Login Failed - Invalid Username and Invalid Password");
            Thread.sleep(2000);

            //TC 1.7 - Login with Invalid Username and Valid Password for Platform Admin.
            driver.navigate().refresh();
            Thread.sleep(3000);
            loginPageObjects.setUsername(ReadProps.readAttr("InvalidUsername"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("Password"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//InvalidID&ValidPwd.jpg");
            System.out.println("Login Failed - Invalid Username and Valid Password");
            Thread.sleep(2000);

            //TC 1.8 - Login with Valid Username and Invalid Password for Platform Admin.
            driver.navigate().refresh();
            Thread.sleep(3000);
            loginPageObjects.setUsername(ReadProps.readAttr("UserID"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("InvalidPassword"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//ValidID&InvalidPwd.jpg");
            System.out.println("Login Failed - Valid Username and Invalid Password");
            Thread.sleep(2000);

            //TC 1.9 Login with Valid Username and Password for Platform Admin.
            driver.navigate().refresh();
            Thread.sleep(3000);
            loginPageObjects.setUsername(ReadProps.readAttr("UserID"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("Password"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(12000);
            loginPageObjects.VerifyHomePage();
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//LoginSuccess.jpg");
            System.out.println("Login Success - Valid Username and Valid Password");
            Thread.sleep(4000);

            //TC 1.10 - Navigate Backward for Platform Admin.
            driver.navigate().back();
            loginPageObjects.VerifyAssertBack();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//NavigateBack.jpg");
            System.out.println("Navigated to backward successfully");
            Thread.sleep(2000);

            //TC 1.11 - Logout for Platform Admin.
            loginPageObjects.ClickLogoutBtn();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//Logout.jpg");
            System.out.println("Logout Success");
            Thread.sleep(2000);

            //TC 1.2 - Admin Login with Invalid Username and Password.
            loginPageObjects.setUsername(ReadProps.readAttr("AdminInvalidUser"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("AdminInvalidPwd"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//AdminInvalidID&InvalidPwd.jpg");
            System.out.println("Login Failed - Admin Invalid Username and Invalid Password");
            Thread.sleep(2000);

            //TC 1.13 - Admin Login with Invalid Username and Valid Password.
            driver.navigate().refresh();
            Thread.sleep(3000);
            loginPageObjects.setUsername(ReadProps.readAttr("AdminInvalidUser"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//AdminInvalidID&ValidPwd.jpg");
            System.out.println("Login Failed - Admin Invalid Username and Valid Password");
            Thread.sleep(2000);

            //TC 1.14 - Admin Login with Valid Username and Invalid Password.
            driver.navigate().refresh();
            Thread.sleep(3000);
            loginPageObjects.setUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("AdminInvalidPwd"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//AdminValidID&InvalidPwd.jpg");
            System.out.println("Login Failed - Admin Valid Username and Invalid Password");
            Thread.sleep(2000);

            //TC 1.15 Admin Role Login with Valid Username and Password.
            driver.navigate().refresh();
            Thread.sleep(3000);
            loginPageObjects.setUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(12000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//AdminLoginSuccess.jpg");
            System.out.println("Login Success - Admin Valid Username and Valid Password");
            Thread.sleep(2000);
            loginPageObjects.ClickLogoutBtn();
            Thread.sleep(2000);

            //TC 1.16 Supervisor Role Login with InValid Username and Password.
            driver.navigate().refresh();
            Thread.sleep(3000);
            loginPageObjects.setUsername(ReadProps.readAttr("SupervisorInvalidUser"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("SupervisorInvalidPwd"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//SupervisorInvalidID&InvalidPwd.jpg");
            System.out.println("Login Failed - Supervisor Invalid Username and Invalid Password");
            Thread.sleep(2000);

            //TC 1.17 - Supervisor Role  Login with Invalid Username and Valid Password.
            driver.navigate().refresh();
            Thread.sleep(3000);
            loginPageObjects.setUsername(ReadProps.readAttr("SupervisorInvalidUser"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("SupervisorPwd"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//SupervisorInvalidID&ValidPwd.jpg");
            System.out.println("Login Failed - Supervisor Invalid Username and Valid Password");
            Thread.sleep(2000);

            //TC 1.18 - Supervisor Role  Login with Valid Username and Invalid Password.
            driver.navigate().refresh();
            Thread.sleep(3000);
            loginPageObjects.setUsername(ReadProps.readAttr("SupervisorUser"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("SupervisorInvalidPwd"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//SupervisorValidID&InvalidPwd.jpg");
            System.out.println("Login Failed - Supervisor Valid Username and Invalid Password");
            Thread.sleep(2000);

            //TC 1.19 Supervisor Role Valid Username and Password.
            driver.navigate().refresh();
            Thread.sleep(3000);
            loginPageObjects.setUsername(ReadProps.readAttr("SupervisorUser"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("SupervisorPwd"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(10000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//SupervisorValidLogin.jpg");
            System.out.println("Login Success - Supervisor Valid Username and Valid Password");
            Thread.sleep(2000);
            loginPageObjects.ClickLogoutBtn();
            Thread.sleep(2000);

            //TC 1.20 - Operator Role  Login with Invalid Username and Password.
            driver.navigate().refresh();
            Thread.sleep(3000);
            loginPageObjects.setUsername(ReadProps.readAttr("OperatorInvalidUser"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("OperatorInvalidPwd"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//OperatorInvalidID&InvalidPWD.jpg");
            System.out.println("Login Failed - Operator Invalid Username and Invalid Password");
            Thread.sleep(2000);

            //TC 1.21 - Operator Role  Login with Invalid Username and Valid Password.
            driver.navigate().refresh();
            Thread.sleep(3000);
            loginPageObjects.setUsername(ReadProps.readAttr("OperatorInvalidUser"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("OperatorPwd"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//OperatorInvalidIDValidPWD.jpg");
            System.out.println("Login Failed - Invalid Username and Valid Password");

            //TC 1.22 - Operator ROle  Login with Valid Username and Invalid Password.
            driver.navigate().refresh();
            Thread.sleep(3000);
            loginPageObjects.setUsername(ReadProps.readAttr("OperatorUser"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("OperatorInvalidPwd"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//OperatorValidID&InvalidPWD.jpg");
            System.out.println("Login Failed - Valid Username and Invalid Password");
            Thread.sleep(2000);

            //TC 1.23 Operator Role Login with Valid Username and Password.
            driver.navigate().refresh();
            Thread.sleep(3000);
            loginPageObjects.setUsername(ReadProps.readAttr("OperatorUser"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("OperatorPwd"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(10000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//OperatorValidLogin.jpg");
            System.out.println("Login Success - Operator Valid Username and Invalid Password");
            loginPageObjects.ClickLogoutBtn();
            Thread.sleep(5000);
            driver.close();
        }
        catch (Exception e) {
            test.log(status.FAIL, e);
        }
    }
}