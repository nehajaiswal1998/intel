package Tests;
import Base.BasePage;
import Pages.FunctionalTab;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;
@Listeners(Utilities.TestListeners.class)
public class FunctionalTabTest extends BasePage
{
       @BeforeTest
       public void login() {
              try {
                     BasePage.LoginTest();
              } catch (Exception e) {
                     test.log(LogStatus.FAIL, e);
              }}
       @Test(priority = 1)
       public void click_on_n_icon() throws InterruptedException, IOException {
              try {
                     FunctionalTab FunctionalTabObj = new FunctionalTab(driver);
                     //TC 13.1 Click on N-Icon.
                     FunctionalTabObj.ClickNIcon();
                     Thread.sleep(3000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//NIconHorizontalHomepage.jpg");
                     test.log(LogStatus.INFO, "FunctionalTabsTC1");
                     test.log(LogStatus.PASS, "TestPassed");
              }
              catch (Exception e) {
                     test.log(LogStatus.FAIL, e);
              }}
       @Test(priority = 2)
       public void horizontal_users_tab() throws InterruptedException, IOException {
              try {
                     FunctionalTab FunctionalTabObj = new FunctionalTab(driver);
                     //TC 13.2 Horizontal Users Tab and Navigate Backward.
                     FunctionalTabObj.ClickHorizontalUser();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalUsers.jpg");
                     driver.navigate().back();
                     Thread.sleep(3000);
                     test.log(LogStatus.INFO, "FunctionalTabsTC2");
                     test.log(LogStatus.PASS, "TestPassed");
              }
              catch (Exception e) {
                     test.log(LogStatus.FAIL, e);
              }}
       @Test(priority = 3)
       public void horizontal_roles_tab() throws InterruptedException, IOException {
              try {
                     FunctionalTab FunctionalTabObj = new FunctionalTab(driver);
                     //TC 13.3 Horizontal Roles Tab and Navigate Backward.
                     FunctionalTabObj.ClickHorizontalRoles();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalRoles.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);
                     test.log(LogStatus.INFO, "FunctionalTabsTC3");
                     test.log(LogStatus.PASS, "TestPassed");
              }
              catch (Exception e) {
                     test.log(LogStatus.FAIL, e);
              }}
       @Test(priority = 4)
       public void horizontal_templates_tab() throws InterruptedException, IOException {
              try {
                     FunctionalTab FunctionalTabObj = new FunctionalTab(driver);
                     //TC 13.4 Horizontal Templates Tab and Navigate Backward.
                     FunctionalTabObj.ClickHorizontalTemplates();
                     Thread.sleep(9000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalTemplates.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);
                     test.log(LogStatus.INFO, "FunctionalTabsTC4");
                     test.log(LogStatus.PASS, "TestPassed");
              }
              catch (Exception e) {
                     test.log(LogStatus.FAIL, e);
              }}
       @Test(priority = 5)
       public void horizontal_datasets_tab() throws InterruptedException, IOException {
              try {
                     FunctionalTab FunctionalTabObj = new FunctionalTab(driver);
                     //TC 13.5 Horizontal DataSets Tab and Navigate Backward.
                     FunctionalTabObj.ClickHorizontalDataset();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalDataSets.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);
                     test.log(LogStatus.INFO, "FunctionalTabsTC5");
                     test.log(LogStatus.PASS, "TestPassed");
              }
              catch (Exception e) {
                     test.log(LogStatus.FAIL, e);
              }}
       @Test(priority = 6)
       public void horizontal_projects_tab() throws InterruptedException, IOException {
              try {
                     FunctionalTab FunctionalTabObj = new FunctionalTab(driver);
                     //TC 13.6 Horizontal Projects Tab and Navigate Backward.
                     FunctionalTabObj.ClickHorizontalProjects();
                     Thread.sleep(9000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalProjects.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);
                     test.log(LogStatus.INFO, "FunctionalTabsTC6");
                     test.log(LogStatus.PASS, "TestPassed");
              }
              catch (Exception e) {
                     test.log(LogStatus.FAIL, e);
              }}
       @Test(priority = 7)
       public void horizontal_documents_tab() throws InterruptedException, IOException {
              try {
                     FunctionalTab FunctionalTabObj = new FunctionalTab(driver);
                     //TC 13.7 Horizontal Documents Tab and Navigate Backward.
                     FunctionalTabObj.ClickHorizontalDocuments();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalDocuments.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);
                     test.log(LogStatus.INFO, "FunctionalTabsTC7");
                     test.log(LogStatus.PASS, "TestPassed");
              }
              catch (Exception e) {
                     test.log(LogStatus.FAIL, e);
              }}
       @Test(priority = 8)
       public void horizontal_analytics_tab() throws InterruptedException, IOException {
              try {
                     FunctionalTab FunctionalTabObj = new FunctionalTab(driver);
                     //TC 13.8 Horizontal Analytics Tab and Navigate Backward.
                     FunctionalTabObj.ClickHorizontalAnalytics();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalAnalytics.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);
                     test.log(LogStatus.INFO, "FunctionalTabsTC8");
                     test.log(LogStatus.PASS, "TestPassed");
              }
              catch (Exception e) {
                     test.log(LogStatus.FAIL, e);
              }}
       @Test(priority = 9)
       public void vertical_users_tab() throws InterruptedException, IOException {
              try {
                     FunctionalTab FunctionalTabObj = new FunctionalTab(driver);
                     //TC 13.9 Vertical Users and Navigate Backward.
                     FunctionalTabObj.ClickVerticalUser();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalUsers.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);
                     test.log(LogStatus.INFO, "FunctionalTabsTC9");
                     test.log(LogStatus.PASS, "TestPassed");
              }
              catch (Exception e) {
                     test.log(LogStatus.FAIL, e);
              }}
       @Test(priority = 10)
       public void vertical_roles_tab() throws InterruptedException, IOException {
              try {
                     FunctionalTab FunctionalTabObj = new FunctionalTab(driver);
                     //TC 13.10 Vertical Roles Tab and Navigate Backward.
                     FunctionalTabObj.ClickVerticalRoles();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalRoles.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);
                     test.log(LogStatus.INFO, "FunctionalTabsTC10");
                     test.log(LogStatus.PASS, "TestPassed");
              }
              catch (Exception e) {
                     test.log(LogStatus.FAIL, e);
              }}
       @Test(priority = 11)
       public void vertical_templates_tab() throws InterruptedException, IOException {
              try {
                     FunctionalTab FunctionalTabObj = new FunctionalTab(driver);
                     //TC 13.11 Vertical Templates Tab and Navigate Backward.
                     FunctionalTabObj.ClickVerticalTemplates();
                     Thread.sleep(9000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalTemplates.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);
                     test.log(LogStatus.INFO, "FunctionalTabsTC11");
                     test.log(LogStatus.PASS, "TestPassed");
              }
              catch (Exception e) {
                     test.log(LogStatus.FAIL, e);
              }}
       @Test(priority = 12)
       public void vertical_datasets_tab() throws InterruptedException, IOException {
              try {
                     FunctionalTab FunctionalTabObj = new FunctionalTab(driver);
                     //TC 13.12 Vertical Data Sets Tab and Navigate Backward.
                     FunctionalTabObj.ClickVerticalDataset();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalDataSets.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);
                     test.log(LogStatus.INFO, "FunctionalTabsTC12");
                     test.log(LogStatus.PASS, "TestPassed");
              }
              catch (Exception e) {
                     test.log(LogStatus.FAIL, e);
              }}
       @Test(priority = 13)
       public void vertical_projects_tab() throws InterruptedException, IOException {
              try {
                     FunctionalTab FunctionalTabObj = new FunctionalTab(driver);
                     //TC 13.13 Vertical Projects Tab and Navigate Backward.
                     FunctionalTabObj.ClickVerticalProjects();
                     Thread.sleep(8000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalProjects.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);
                     test.log(LogStatus.INFO, "FunctionalTabsTC13");
                     test.log(LogStatus.PASS, "TestPassed");
              }
              catch (Exception e) {
                     test.log(LogStatus.FAIL, e);
              }}
       @Test(priority = 14)
       public void vertical_Documents_tab() throws InterruptedException, IOException {
              try {
                     FunctionalTab FunctionalTabObj = new FunctionalTab(driver);
                     //TC 13.14 Vertical Documents and Navigate Backward.
                     FunctionalTabObj.ClickVerticalDocuments();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalDocuments.jpg");
                     Thread.sleep(5000);
                     test.log(LogStatus.INFO, "FunctionalTabsTC14");
                     test.log(LogStatus.PASS, "TestPassed");
              }
              catch (Exception e) {
                     test.log(LogStatus.FAIL, e);
              }}
       @Test(priority = 15)
       public void vertical_analytics_tab() throws InterruptedException, IOException {
              try {
                     FunctionalTab FunctionalTabObj = new FunctionalTab(driver);
                     //TC 13.15 Vertical Analytics and Navigate Backward.
                     FunctionalTabObj.ClickVerticalAnalytics();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalAnalytics.jpg");
                     driver.navigate().back();
                     Thread.sleep(4000);
                     test.log(LogStatus.INFO, "FunctionalTabsTC15");
                     test.log(LogStatus.PASS, "TestPassed");
                     driver.close();
              }
              catch (Exception e) {
                     test.log(LogStatus.FAIL, e);
              }}
}