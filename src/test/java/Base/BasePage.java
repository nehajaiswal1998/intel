package Base;
import Pages.LoginPage;
import Utilities.ReadProps;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BasePage {

        public static WebDriver driver;
        public static LogStatus status;
        public static ExtentTest test;
        public static ExtentReports report;

        @BeforeClass
        public void startTest()
        {   String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
            report = new ExtentReports("ExtentReportResults"+timestamp+".html");
            test = report.startTest("IntelliDoc");
        }

        public static void LoginTest() throws InterruptedException, IOException, Exception {
            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            LoginPage loginPageObjects = new LoginPage(driver);
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            loginPageObjects.setUsername(ReadProps.readAttr("UserID"));
            loginPageObjects.setPassword(ReadProps.readAttr("Password"));
            loginPageObjects.clickLoginButton();
            Thread.sleep(12000);
        }

        @AfterClass
        public void endTest()
        {
            report.endTest(test);
            report.flush();
        }
    }