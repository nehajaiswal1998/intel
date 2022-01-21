package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class DocProcessFreeFormTest extends BasePage {


        @Test
        public void DocProcessFreeFormFlow() throws InterruptedException, IOException {
            try {
                BasePage.LoginTest();
                Robot r = new Robot();
                DocumentPage DocPageObj = new DocumentPage(driver);
                test.log(status.INFO, "TestInformation");
                test.log(status.PASS, "TestPassed");
                DocPageObj.ClickDocumentBtn();
                Thread.sleep(5000);

                //TC 13.1 Search Project.
                DocPageObj.ClickDropDownBtn();
                Thread.sleep(2000);
                DocPageObj.ClickSearchProject(ReadProps.readAttr("FreeFormProjectName"));
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//ProjectListDropDown.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickSelectFreeFormProject();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//ProjectSelected.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickStatusFilter();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//StatusFilter.jpg");
                DocPageObj.ClickCheckProcessed();
                Thread.sleep(1000);
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(1000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//StatusFilter.jpg");
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//Statuses.jpg");

                //13.2 SearchBox Document.
                DocPageObj.ClickSearchBox("AN - OOLU2604599081.pdf");
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//DocumentSearched.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickSearchDocument();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//OpenDocument.jpg");

                //11.3 Update document and cancel it.
                DocPageObj.ClickViewDocIcon();
                Thread.sleep(8000);
                DocPageObj.ClickDocumentBtn();
                Thread.sleep(3000);
                DocPageObj.ClickRefreshDocument();
                Thread.sleep(3000);

                //13.4 Hide and UnHide Analytics.
                DocPageObj.ClickHideAnalytics();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//HideAnalytics.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickUnhideAnalytics();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//UnHideAnalytics.jpg");

                //TC 13.5 Documents filter.
                DocPageObj.ClickFilterDoc();
                Thread.sleep(2000);
                DocPageObj.ClickSearchFilterDoc("AN");
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//FilterDocSearch.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickFilterSearchIcon();
                Thread.sleep(1000);
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(1000);
                DocPageObj.ClickFilterDoc();
                Thread.sleep(2000);
                DocPageObj.ClickCancelFilterSearch();
                Thread.sleep(1000);
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(1000);

                //TC 13.6 Sorting.
                DocPageObj.ClickDocSort();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//DocumentSort.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickAssigneeSort();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//AssigneeSort.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickStatusSort();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//StatusSort.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickTypeSort();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//TypeSort.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickScoreSort();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//ScoreSort.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickSizeSort();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//SizeSort.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickUpdateSort();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//UpdateSort.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickReceivedSort();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//ReceivedSort.jpg");
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,10000)", "");
                Thread.sleep(3000);

                //TC 13.7 Items Per Page.
                DocPageObj.ClickItemsPerPage();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//ItemsPerPage.jpg");
                DocPageObj.SelectItemsPerPage();
                Thread.sleep(2000);

                //13.8 Next Page, Previous Page, Last Page and First Page.
                DocPageObj.ClickNextPage();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//NextItemPerPage.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickPreviousPage();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//PreviousItemPerPage.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickLastPage();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//LastItemPerPage.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickFirstPage();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//FirstItemPerPage.jpg");
                Thread.sleep(2000);

                //13.9 Anti-Clock Wise, Clock Wise, Zoom IN, Zoom Out, Navigate Right and Navigate Left.
                DocPageObj.ClickSearchBox("3.tif");
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//DocumentMorePage.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickSearchDocument();
                Thread.sleep(2000);
                DocPageObj.ClickViewDocIcon();
                Thread.sleep(10000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//OpenDocument.jpg");
                DocPageObj.ClickAntiWiseIcon();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//AntiClockWiseIcon.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickClockWiseIcon();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//ClockWiseIcon.jpg");

                // Zoom In.
                DocPageObj.ClickZoomIn();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//ZoomIn.jpg");

                // ZoomOut.
                DocPageObj.ClickZoomOut();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//ZoomOut.jpg");

                // Navigate Right.
                DocPageObj.ClickNvgtRt();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//NextPage.jpg");

                // Navigate Back.
                DocPageObj.ClickNvgtLft();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//PreviousPage.jpg");
                Thread.sleep(3000);
                driver.close();

            } catch (Exception e) {
                test.log(status.FAIL, e);
            }
        }
    }







