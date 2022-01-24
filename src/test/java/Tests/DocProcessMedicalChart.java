package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectBREMedicalChartDocumentPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
@Listeners(Utilities.TestListeners.class)
public class DocProcessMedicalChart extends BasePage
{
    @Test
    public void DocProcessMedicalChartTestFlow() throws InterruptedException, IOException {
        try {
            BasePage.LoginTest();
            Robot r = new Robot();
            DocumentPage DocPageObj = new DocumentPage(driver);
            test.log(LogStatus.INFO, "DocProcessMedicalChartTest");
            test.log(LogStatus.PASS, "TestPassed");
            DocPageObj.ClickDocumentBtn();
            Thread.sleep(6000);

            //TC 8.1 Search Project.
            DocPageObj.ClickDropDownBtn();
            Thread.sleep(1000);
            DocPageObj.ClickSearchProject(ReadProps.readAttr("MedicalChartProjectName"));
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//ProjectListDropDown.jpg");
            Thread.sleep(1000);
            DocPageObj.ClickSelectMedicalChartProject();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//ProjectSelected.jpg");
            Thread.sleep(1000);
            DocPageObj.ClickStatusFilter();
            Thread.sleep(1000);
            DocPageObj.ClickCheckProcessed();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//StatusFilter.jpg");
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//Statuses.jpg");

            //TC 8.2 SearchBox Document.
            DocPageObj.ClickSearchBox("Processed");
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//DocumentSearched.jpg");
            Thread.sleep(1000);
            DocPageObj.ClickSearchDocument();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//OpenDocument.jpg");

            //TC 8.3 Update Document and Cancel it.
            DocPageObj.ClickViewDocIcon5();
            Thread.sleep(10000);
            DocPageObj.ClickExpansionPanel();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//PanelExpanded.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickCancelDoc2();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//CancelUpdate.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickClearSearch();
            Thread.sleep(2000);
            DocPageObj.ClickRefreshDocument();
            Thread.sleep(5000);

            //TC 8.4 Hide and UnHide Analytics.
            DocPageObj.ClickHideAnalytics();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//HideAnalytics.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickUnHideAnalytics();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//UnHideAnalytics.jpg");

            //TC 8.5 Documents filter.
            DocPageObj.ClickFilterDoc();
            Thread.sleep(2000);
            DocPageObj.ClickSearchFilterDoc("Processed");
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//FilterDocSearch.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickFilterSearchIcon();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);
            DocPageObj.ClickFilterDoc();
            Thread.sleep(2000);
            DocPageObj.ClickCancelFilterSearch();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);

            //TC 8.6 sorting.
            DocPageObj.ClickDocSort();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//DocumentSort.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickAssigneeSort();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//AssigneeSort.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickStatusSort();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//StatusSort.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickTypeSort();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//TypeSort.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickScoreSort();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//ScoreSort.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickSizeSort();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//SizeSort.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickUpdateSort();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//UpdateSort.jpg");
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//ReceivedSort.jpg");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,5000)", "");
            Thread.sleep(3000);

            //TC 8.7 Items Per Page.
            DocPageObj.ClickItemsPerPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//ItemsPerPage.jpg");
            DocPageObj.SelectItemsPerPage();
            Thread.sleep(2000);

            //TC 8.8 Next Page, Previous Page, Last Page and First Page.
            DocPageObj.ClickNextPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//NextItemPerPage.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickPreviousPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//PreviousItemPerPage.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickLastPage();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//LastItemPerPage.jpg");
            Thread.sleep(1000);
            DocPageObj.ClickFirstPage();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//FirstItemPerPage.jpg");
            Thread.sleep(1000);

            //TC 8.9 Create Chronic condition.
            DocPageObj.ClickViewDocIcon2();
            Thread.sleep(5000);
            ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
            ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
            Thread.sleep(2000);
            DocPageObj.ClickChronicCondition();
            Thread.sleep(2000);
            DocPageObj.ClickAddCondition();
            Thread.sleep(2000);
            DocPageObj.AddNPINumber();
            Thread.sleep(2000);
            DocPageObj.AddPhysicianName();
            Thread.sleep(2000);
            DocPageObj.ClickStartDate();
            Thread.sleep(3000);
            DocPageObj.SelectStartDate();
            Thread.sleep(2000);
            DocPageObj.ClickEndDate();
            Thread.sleep(2000);
            DocPageObj.SelectEndDate();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//MedicalChartProject//ChronicConditionPage.jpg");
            DocPageObj.SaveChronicCondition();
            Thread.sleep(3000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnSaveDraft();
            Thread.sleep(4000);
            driver.close();

        } catch (Exception e) {
            test.log(LogStatus.FAIL, e);
        }
    }
}