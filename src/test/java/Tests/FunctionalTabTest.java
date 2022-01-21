package Tests;

import Base.BasePage;
import Pages.FunctionalTab;
import Utilities.TakesScreen;
import org.testng.annotations.Test;
import java.io.IOException;

public class FunctionalTabTest extends BasePage {

       @Test
       public void FunctionalFlow() throws InterruptedException, IOException {
              try {
                     BasePage.LoginTest();
                     FunctionalTab FunctionalTabObj = new FunctionalTab(driver);
                     test.log(status.INFO, "TestInformation");
                     test.log(status.PASS, "TestPassed");

                     //TC 3.1 Click on N-Icon.
                     FunctionalTabObj.ClickNIcon();
                     Thread.sleep(3000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//NIconHorizontalHomepage.jpg");

                     //TC 3.2 Horizontal Users Tab and Navigate Backward.
                     FunctionalTabObj.ClickHorizontalUser();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalUsers.jpg");
                     driver.navigate().back();
                     Thread.sleep(3000);

                     //TC 3.3 Horizontal Roles Tab and Navigate Backward.
                     FunctionalTabObj.ClickHorizontalRoles();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalRoles.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);

                     //TC 3.4 Horizontal Templates Tab and Navigate Backward.
                     FunctionalTabObj.ClickHorizontalTemplates();
                     Thread.sleep(9000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalTemplates.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);

                     //TC 3.5 Horizontal Data Sets Tab and Navigate Backward.
                     FunctionalTabObj.ClickHorizontalDataset();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalDataSets.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);

                     //TC 3.6 Horizontal Projects Tab and Navigate Backward.
                     FunctionalTabObj.ClickHorizontalProjects();
                     Thread.sleep(9000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalProjects.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);

                     //TC 3.7 Horizontal Documents Tab and Navigate Backward.
                     FunctionalTabObj.ClickHorizontalDocuments();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalDocuments.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);

                     //TC 3.8 Horizontal Analytics Tab and Navigate Backward.
                     FunctionalTabObj.ClickHorizontalAnalytics();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalAnalytics.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);

                     //TC 3.9 Vertical Users and Navigate Backward.
                     FunctionalTabObj.ClickVerticalUser();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalUsers.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);

                     //TC 3.10 Vertical Roles Tab and Navigate Backward.
                     FunctionalTabObj.ClickVerticalRoles();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalRoles.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);

                     //TC 3.11 Vertical Templates Tab and Navigate Backward.
                     FunctionalTabObj.ClickVerticalTemplates();
                     Thread.sleep(9000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalTemplates.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);

                     //TC 3.12 Vertical Data Sets Tab and Navigate Backward.
                     FunctionalTabObj.ClickVerticalDataset();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalDataSets.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);

                     //TC 3.13 Vertical Projects Tab and Navigate Backward.
                     FunctionalTabObj.ClickVerticalProjects();
                     Thread.sleep(8000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalProjects.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);

                     //TC 3.14 Vertical Documents and Navigate Backward.
                     FunctionalTabObj.ClickVerticalDocuments();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalDocuments.jpg");
                     Thread.sleep(5000);

                     //TC 3.15 Vertical Analytics and Navigate Backward.
                     FunctionalTabObj.ClickVerticalAnalytics();
                     Thread.sleep(6000);
                     TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalAnalytics.jpg");
                     driver.navigate().back();
                     Thread.sleep(5000);
                     driver.close();
              }
              catch (Exception e) {
                     test.log(status.FAIL, e);
              }
       }

}
