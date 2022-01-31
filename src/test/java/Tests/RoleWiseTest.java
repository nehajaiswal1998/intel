package Tests;
import Base.BasePage;
import Pages.RoleAccess;
import Utilities.ReadProps;
import org.testng.annotations.*;
import java.io.IOException;
@Listeners(Utilities.TestListeners.class)

public class RoleWiseTest extends BasePage {
       static RoleAccess roleAccessObj;
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
    public void login_with_valid_username_password() throws InterruptedException, IOException {
            roleAccessObj = new RoleAccess(driver);
            driver.get(ReadProps.readAttr("URL"));
            Thread.sleep(8000);
            driver.manage().window().maximize();
            Thread.sleep(2000);
            //TC 19.1 Admin Role Login with valid Username and Valid password
            roleAccessObj.setUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(2000);
            roleAccessObj.setPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(2000);
            roleAccessObj.clickLoginButton();
            Thread.sleep(8000);
    }
        @Test(priority = 2)
        public void admin_role_access_users_tab() throws InterruptedException, IOException {
                //TC 19.2 Admin Role Access Users tab.
                roleAccessObj.clickAdminUser();
                Thread.sleep(5000);
        }
        @Test(priority = 3)
        public void admin_role_access_roles_tab() throws InterruptedException, IOException {
                //TC 19.3 Admin Role Access Roles tab.
                roleAccessObj.clickAdminRole();
                Thread.sleep(5000);
        }
        @Test(priority = 4)
                public void admin_role_access_templates_tab() throws InterruptedException, IOException {
                //TC 19.4 Admin Role Access Templates tab.
                roleAccessObj.clickAdminTemplate();
                Thread.sleep(5000);
        }
        @Test(priority = 5)
        public void admin_role_access_user_tab() throws InterruptedException, IOException {
                //TC 19.5 Admin Role Access Project tab.
                roleAccessObj.clickAdminProject();
                Thread.sleep(5000);
        }
        @Test(priority = 6)
        public void admin_role_access_analytics_tab() throws InterruptedException, IOException {
                //TC 19.6 Admin Role Access Analytics tab.
                roleAccessObj.clickAdminAnalytic();
                Thread.sleep(5000);
        }
        @Test(priority = 7)
        public void admin_role_access_logout() throws InterruptedException, IOException {
                //TC 19.7 Admin Role Access logout.
                roleAccessObj.ClickLogout();
                Thread.sleep(4000);
                driver.navigate().refresh();
                Thread.sleep(3000);
        }
        @Test(priority = 8)
        public void supervisor_role_valid_login() throws InterruptedException, IOException {
                //TC 19.8 Supervisor ROle Valid login.
                roleAccessObj.setUsername(ReadProps.readAttr("SupervisorUser"));
                Thread.sleep(2000);
                roleAccessObj.setPassword(ReadProps.readAttr("SupervisorPwd"));
                Thread.sleep(2000);
                roleAccessObj.clickLoginButton();
                Thread.sleep(5000);
        }
        @Test(priority = 9)
        public void supervisor_role_access_template() throws InterruptedException, IOException {
                //TC 19.9 Supervisor ROle Access Template.
                roleAccessObj.clickSupervisorTemplate();
                Thread.sleep(6000);
        }
        @Test(priority = 10)
        public void supervisor_role_access_document() throws InterruptedException, IOException {
                //TC 19.10 Supervisor ROle Access Document.
                roleAccessObj.clickSupervisorDocument();
                Thread.sleep(6000);
        }
        @Test(priority = 11)
        public void supervisor_role_access_analytics() throws InterruptedException, IOException {
                //TC 19.11 Supervisor ROle Access Analytics
                roleAccessObj.ClickLogout();
                Thread.sleep(4000);
                driver.navigate().refresh();
                Thread.sleep(5000);
        }
        @Test(priority = 12)
        public void operator_role_with_valid_login() throws InterruptedException, IOException {
                //TC 19.12 Operator ROle Login with Valid ID and PWD.
                roleAccessObj.setUsername(ReadProps.readAttr("OperatorUser"));
                Thread.sleep(2000);
                roleAccessObj.setPassword(ReadProps.readAttr("OperatorPwd"));
                Thread.sleep(2000);
                roleAccessObj.clickLoginButton();
                Thread.sleep(4000);
        }
        @Test(priority = 13)
        public void operator_role_access_document() throws InterruptedException, IOException {
                //TC 19.13 Operator Role Access Document.
                roleAccessObj.clickOperatorDocument();
                Thread.sleep(4000);
        }
        @Test(priority = 14)
        public void operator_role_access_analytics() throws InterruptedException, IOException {
            //TC 19.14 Operator Role Access Analytics.
            roleAccessObj.ClickLogout();
            Thread.sleep(4000);
        }
    }