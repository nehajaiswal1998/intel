package Tests;

import Base.BasePage;
import Pages.AnalyticsPage;
import Utilities.TakesScreen;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AnalyticsTest extends BasePage {

    @Test
    public void AnalyticsFlow() throws InterruptedException, IOException {
        try {
            BasePage.LoginTest();
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");
            AnalyticsPageObj.ClickAnalyticsBtn();
            Thread.sleep(12000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//AnalyticsPage.jpg");

            // 10.1 Organization Statistics Hide and UnHide.
            AnalyticsPageObj.ClickOrganizationArrow();
           Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//OrganizationStatisticsHide.jpg");
           Thread.sleep(3000);
            AnalyticsPageObj.ClickOrganizationArrow();
           Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//OrganizationStatisticsUnHide.jpg");
           Thread.sleep(3000);
            // 10.2 Hover on Total Users.
            AnalyticsPageObj.HoverTotalUser();
           Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverTotalUsers.jpg");
            // 10.2 Hover on Total Documents.
            AnalyticsPageObj.HoverDocuments();
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverTotalDocuments.jpg");
            Thread.sleep(3000);
            // 10.3 Hover on Processed Documents.
            AnalyticsPageObj.HoverProcessed();
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverProcessed.jpg");
           Thread.sleep(3000);
            // 10.3 Hover on Ready to Process Documents.
            AnalyticsPageObj.HoverReadyToProcess();
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverReadyToProcess.jpg");
           Thread.sleep(3000);
            // 10.4 Hover on Ready to Rejected Documents.
            AnalyticsPageObj.HoverRejected();
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverRejected.jpg");
            Thread.sleep(3000);
            // 10.5 Hover on Validation Time.
            AnalyticsPageObj.HoverValidationTime();
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverValidationTime.jpg");
            Thread.sleep(3000);
            // 10.6 Hover on Structured.
            AnalyticsPageObj.HoverStructuredBar();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverStructureBar.jpg");
            Thread.sleep(3000);
            // 10.7 Hover on Semi-Structured.
            AnalyticsPageObj.HoverSemiStructured();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverSemi-StructureBar.jpg");
            Thread.sleep(3000);
            // 10.8 Hover on Free-Form.
            AnalyticsPageObj.HoverFreeForm();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverFree-FormBar.jpg");
            Thread.sleep(3000);
            // 10.9 Hover on Medical-Chart.
            AnalyticsPageObj.HoverMedicalChart();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverMedicalChartBar.jpg");
            Thread.sleep(3000);
            //Project Statistics.
            AnalyticsPageObj.ClickOrganizationArrow();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//ProjectStatisticsVisible.jpg");
            Thread.sleep(3000);
            AnalyticsPageObj.ClickProjectDownArrow();
           Thread.sleep(3000);
            //10.10 Search Project.
            AnalyticsPageObj.ClickSearchProject();
           Thread.sleep(3000);
            AnalyticsPageObj.ClickSelectProject();
           Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//ProjectSelected.jpg");
            Thread.sleep(3000);
            AnalyticsPageObj.ClickSelectDropDown();
            Thread.sleep(3000);
            //10.11 OverAll Data
            AnalyticsPageObj.ClickSelectOverall();
            Thread.sleep(3000);
            AnalyticsPageObj.ClickSelectDropDown();
            Thread.sleep(2000);
            //10.12 Monthly Data
            AnalyticsPageObj.ClickSelectMonthly();
            Thread.sleep(3000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,10000)", "");
           Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//MonthlyStatus.jpg");
            Thread.sleep(3000);
            AnalyticsPageObj.ClickSelectDropDown();
            Thread.sleep(3000);
            //10.13 Weekly Data
            AnalyticsPageObj.ClickSelectWeekly();
            Thread.sleep(3000);
            js.executeScript("window.scrollBy(0,10000)", "");
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//WeeklyStatus.jpg");
            Thread.sleep(3000);
            AnalyticsPageObj.ClickSelectDropDown();
            Thread.sleep(3000);
            //10.14 Daily Data
            AnalyticsPageObj.ClickSelectDaily();
            Thread.sleep(3000);
            js.executeScript("window.scrollBy(0,10000)", "");
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//DailyStatus.jpg");
            Thread.sleep(3000);
            AnalyticsPageObj.ClickOnSortByReceived();
           Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//SortByDocuments.jpg");
           Thread.sleep(3000);
            AnalyticsPageObj.ClickOnSortByDocuments();
           Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//SortByReceived.jpg");
            Thread.sleep(5000);
            driver.close();

        } catch (Exception e) {
            test.log(status.FAIL, e);
        }
    }
}
