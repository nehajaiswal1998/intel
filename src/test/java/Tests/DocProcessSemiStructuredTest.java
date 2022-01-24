package Tests;

import Base.BasePage;
import Pages.DocumentPage;
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
public class DocProcessSemiStructuredTest extends BasePage
{

    @Test
    public void DocProcessSemiStructuredTestFlow() throws Exception {
            BasePage.LoginTest();
            Robot r = new Robot();
            DocumentPage DocPageObj = new DocumentPage(driver);
            test.log(LogStatus.INFO, "DocProcessSemiStructuredTest");
            test.log(LogStatus.PASS, "TestPassed");
            DocPageObj.ClickDocumentBtn();
            Thread.sleep(6000);

            //TC 9.1 Search Project.
            DocPageObj.ClickDropDownBtn();
            Thread.sleep(1000);
            DocPageObj.ClickSearchProject(ReadProps.readAttr("SemiStructuredProjectName"));
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//ProjectListDropDown.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickSelectSemiStructuredProject();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//ProjectSelected.jpg");
            Thread.sleep(1000);
            DocPageObj.ClickStatusFilter();
            Thread.sleep(1000);
            DocPageObj.ClickCheckProcessed();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//StatusFilter.jpg");
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//Statuses.jpg");

            //TC 9.2 SearchBox Document.
            DocPageObj.ClickSearchBox("AN - OOLU2604599081.pdf");
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//DocumentSearched.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickSearchDocument();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//OpenDocument.jpg");
            Thread.sleep(2000);

            //TC 9.3 Update document and cancel it.
            DocPageObj.ClickViewDocIcon2();
            Thread.sleep(10000);
            DocPageObj.ClickDocumentBtn();
            Thread.sleep(1000);
            DocPageObj.ClickClearSearch();
            Thread.sleep(1000);
            DocPageObj.ClickRefreshDocument();
            Thread.sleep(5000);

            //TC 9.4 Hide and UnHide Analytics.
            DocPageObj.ClickHideAnalytics();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//HideAnalytics.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickUnHideAnalytics();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//UnHideAnalytics.jpg");

            //TC 9.5 Documents filter.
            DocPageObj.ClickFilterDoc();
            Thread.sleep(2000);
            DocPageObj.ClickSearchFilterDoc("AN");
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//FilterDocSearch.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickFilterSearchIcon();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);
            DocPageObj.ClickFilterDoc();
            Thread.sleep(2000);
            DocPageObj.ClickCancelFilterSearch();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);
            //TC 9.6 Sorting.
            DocPageObj.ClickDocSort();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//DocumentSort.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickAssigneeSort();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//AssigneeSort.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickStatusSort();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//StatusSort.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickTypeSort();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//TypeSort.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickScoreSort();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//ScoreSort.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickSizeSort();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//SizeSort.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickUpdateSort();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//UpdateSort.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickReceivedSort();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//ReceivedSort.jpg");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,10000)", "");
            Thread.sleep(3000);

            //TC 9.7 Items Per Page.
            DocPageObj.ClickItemsPerPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//ItemsPerPage.jpg");
            DocPageObj.SelectItemsPerPage();
            Thread.sleep(2000);

            //TC 9.8 Next Page, Previous Page, Last Page and First Page.
            DocPageObj.ClickNextPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//NextItemPerPage.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickPreviousPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//PreviousItemPerPage.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickLastPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//LastItemPerPage.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickFirstPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//FirstItemPerPage.jpg");
            Thread.sleep(2000);

            //TC 9.9 Anti-Clock Wise, Clock Wise, Zoom IN, Zoom Out, Navigate Right and Navigate Left.
            DocPageObj.ClickSearchBox("4.tif");
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//DocumentMorePage.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickSearchDocument();
            Thread.sleep(2000);
            DocPageObj.ClickViewDocIcon3();
            Thread.sleep(6000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//OpenDocument.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickAntiWiseIcon();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//AntiClockWiseIcon.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickClockWiseIcon();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//ClockWiseIcon.jpg");

            // Zoom In.
            DocPageObj.ClickZoomIN();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//ZoomIn.jpg");

            // ZoomOut.
            DocPageObj.ClickZoomOut();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//ZoomOut.jpg");

            // Navigate Right.
            DocPageObj.ClickNvgtRt();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//NextPage.jpg");

            // Navigate Back.
            DocPageObj.ClickNvgtLft();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//SemiStructuredDocument//PreviousPage.jpg");
            Thread.sleep(4000);
            driver.close();
    }
}