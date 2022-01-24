package Tests;

import Base.BasePage;
import Pages.TemplatePage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.IOException;
@Listeners(Utilities.TestListeners.class)
public class TemplateTest extends BasePage {

    @Test
    public void TemplateFlow() throws InterruptedException, IOException {

        try {
            BasePage.LoginTest();
            Robot r = new Robot();
            Thread.sleep(8000);
            TemplatePage TemplatePageObj = new TemplatePage(driver);
            test.log(LogStatus.INFO, "Template");
            test.log(LogStatus.PASS, "TestPassed");
            TemplatePageObj.ClickTemplateBtn();
            Thread.sleep(5000);
            System.out.println("Clicked template icon");
            Thread.sleep(1000);

            //TC 20.1 - Create Template with Invalid Name and Chosen File.
            TemplatePageObj.ClickOnUploadTemplateBtn();
            Thread.sleep(4000);
            TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TInvalidName"));
            System.out.println("Template name entered");
            Thread.sleep(2000);
            WebElement upload_file = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-new-training[1]/div[3]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));
            upload_file.sendKeys("C:\\Users\\kishor_ghadge\\IdeaProjects\\Template1.jpg");
            System.out.println("File chosen");
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//InvalidName.jpg");
            TemplatePageObj.ClickCancelCreateTemplate();
            Thread.sleep(3000);

            //TC 20.2 - Create Template with Valid Name and No Chosen file.
            TemplatePageObj.ClickOnUploadTemplateBtn();
            Thread.sleep(2000);
            TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TNameUnique"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//NoFileChoose.jpg");
            System.out.println("Template with valid name and no chosen file");
            TemplatePageObj.ClickCancelCreateTemplate();
            Thread.sleep(3000);

            //TC 20.3 - Create Template with Already Exists Name and Chosen file
            TemplatePageObj.ClickOnUploadTemplateBtn();
            Thread.sleep(2000);
            TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TExistName"));
            System.out.println("Template name entered");
            Thread.sleep(2000);
            upload_file.sendKeys("C:\\Users\\kishor_ghadge\\IdeaProjects\\Template1.jpg");
            System.out.println("File chosen");
            Thread.sleep(3000);
            TemplatePageObj.ClickCreateTemplate();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//AlreadyExistsName.jpg");
            TemplatePageObj.ClickCancelCreateTemplate();
            Thread.sleep(3000);

            //TC 20.4 - Create template with Valid Name and chosen file.
            TemplatePageObj.ClickOnUploadTemplateBtn();
            Thread.sleep(2000);
            TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TNameUnique"));
            Thread.sleep(2000);
            upload_file.sendKeys("C:\\Users\\kishor_ghadge\\IdeaProjects\\Template1.jpg");
            System.out.println("File chosen");
            Thread.sleep(2000);
            TemplatePageObj.ClickCreateTemplate();
            Thread.sleep(6000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//TemplateCreated.jpg");
            System.out.println("Template created");
            TemplatePageObj.ClickCancel();
            Thread.sleep(5000);

            //TC 20.5 Search Created template.
            TemplatePageObj.ClickOnSearchTemplate(ReadProps.readAttr("TNameUnique"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//SearchTemplate.jpg");
            Thread.sleep(2000);
            TemplatePageObj.ClickOnExpandTemplate();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//ExpandTemplate.jpg");
            Thread.sleep(2000);
            TemplatePageObj.ClickOnTemplateDataInfo();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//OpenTemplateFile.jpg");
            Thread.sleep(3000);
            System.out.println("Template open");

            //TC 20.6 Zoom IN.
            TemplatePageObj.ClickOnZoomIn();
            Thread.sleep(2000);
            TemplatePageObj.ClickOnZoomIn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//ZoomIn.jpg");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,10000)", "");
            Thread.sleep(2000);

            //TC 20.7 Zoom OUT.
            TemplatePageObj.ClickOnZoomOut();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//ZoomOut.jpg");
            TemplatePageObj.ClickOnZoomOut();
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,-10000)", "");
            Thread.sleep(2000);
            TemplatePageObj.ClickClassificationBox();
            Thread.sleep(2000);
            TemplatePageObj.SelectClassification();
            Thread.sleep(2000);
            TemplatePageObj.EnterFieldName();
            Thread.sleep(2000);
            TemplatePageObj.ClickValidation();
            Thread.sleep(2000);
            TemplatePageObj.SelectValidation();
            Thread.sleep(2000);
            TemplatePageObj.ClickMap();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//MapError.jpg");
            TemplatePageObj.ClickCancelTraining();
            Thread.sleep(4000);

            //TC 20.8 Delete created template (Single Page).
            TemplatePageObj.ClickOnSearchTemplate(ReadProps.readAttr("TNameUnique"));
            Thread.sleep(2000);
            TemplatePageObj.ClickOnExpandTemplate();
            Thread.sleep(2000);
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//DeleteTemplateWindow.jpg");
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(3000);

            //TC 20.9 Create Template with more pages.
            driver.navigate().refresh();
            Thread.sleep(6000);
            TemplatePageObj.ClickOnUploadTemplateBtn();
            Thread.sleep(2000);
            TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TNameMorePages"));
            Thread.sleep(2000);
            System.out.println("Template name entered");
            WebElement upload_file1 = driver.findElement(By.xpath("//*[@id='faxDetailModal']/div/div/div[2]/div/form/div/input"));
            upload_file1.sendKeys("C:\\Users\\kishor_ghadge\\IdeaProjects\\Sample.pdf");
            System.out.println("File chosen");
            Thread.sleep(2000);
            TemplatePageObj.ClickCreateTemplate();
            Thread.sleep(10000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//MorePageTemplateCreated.jpg");
            System.out.println("Template created successfully");
            TemplatePageObj.ClickCancel();
            Thread.sleep(5000);
            TemplatePageObj.ClickOnSearchTemplate(ReadProps.readAttr("TNameMorePages"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//SearchTemplate.jpg");
            TemplatePageObj.ClickExpandMore();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//ExpandTemplate.jpg");
            TemplatePageObj.ClickOnTemplateMorePagesInfo();
            Thread.sleep(10000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//OpenTemplateFile.jpg");
            TemplatePageObj.ClickOnZoomIn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//ZoomInPages.jpg");
            TemplatePageObj.ClickOnZoomOut();
            Thread.sleep(2000);

            //TC 20.10 Navigate Next.
            TemplatePageObj.ClickNavigateNext();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//NextPage.jpg");

            //TC 20.11 Navigate Back.
            TemplatePageObj.ClickNavigateBack();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//BackPage.jpg");
            TemplatePageObj.ClickCancelTraining();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//ZoomOutPages.jpg");
            TemplatePageObj.ClickOnSearchTemplate(ReadProps.readAttr("TNameMorePages"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//SearchTemplate.jpg");
            Thread.sleep(2000);
            System.out.println("Search template");
            TemplatePageObj.ClickExpandMore();
            Thread.sleep(2000);

            //TC 20.12 Delete More Pages Template.
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(2000);
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//DeletePage1.jpg");
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//DeletePage2.jpg");
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//DeletePage3.jpg");
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(2000);
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(2000);
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(2000);
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Template//DeletedTemplateSuccessfully.jpg");
            TemplatePageObj.SoftAssertAll();
            Thread.sleep(4000);
            driver.close();
        }
        catch (Exception e) {
            test.log(LogStatus.FAIL, e);
        }

    }

}

