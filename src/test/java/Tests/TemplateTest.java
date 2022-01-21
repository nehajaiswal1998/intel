package Tests;

import Base.BasePage;
import Pages.TemplatePage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.IOException;
public class TemplateTest extends BasePage {

    @Test
    public void TemplateFlow() throws InterruptedException, IOException {

        try {
            BasePage.LoginTest();
            Robot r = new Robot();
            Thread.sleep(8000);
            TemplatePage TemplatePageObj = new TemplatePage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");
            TemplatePageObj.ClickTemplateBtn();
            Thread.sleep(5000);
            System.out.println("Clicked template icon");
            Thread.sleep(1000);

            // TC 1.1 - Create Template with Invalid Name and Chosen File
            TemplatePageObj.ClickOnUploadTemplateBtn();
            Thread.sleep(4000);
            TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TInvalidName"));
            System.out.println("Template name entered");
            Thread.sleep(2000);
            WebElement upload_file = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-new-training[1]/div[3]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));
            upload_file.sendKeys("C:\\Users\\kumar\\Downloads\\Template1.jpg");
            System.out.println("File chosen");
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//InvalidName.jpg");
            TemplatePageObj.ClickCancelCreateTemplate();
            Thread.sleep(3000);

            // TC 1.2 - Create Template with Valid Name and No Chosen file
            TemplatePageObj.ClickOnUploadTemplateBtn();
            Thread.sleep(2000);
            TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TNameUnique"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//NoFileChoose.jpg");
            System.out.println("Template with valid name and no chosen file");
            TemplatePageObj.ClickCancelCreateTemplate();
            Thread.sleep(3000);

            // TC 1.3 - Create Template with Already Exists Name and Chosen file
            TemplatePageObj.ClickOnUploadTemplateBtn();
            Thread.sleep(2000);
            TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TExistName"));
            System.out.println("Template name entered");
            Thread.sleep(2000);
            upload_file.sendKeys("C:\\Users\\kumar\\Downloads\\Template1.jpg");
            System.out.println("File chosen");
            Thread.sleep(3000);
            TemplatePageObj.ClickCreateTemplate();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//AlreadyExistsName.jpg");
            TemplatePageObj.ClickCancelCreateTemplate();
            Thread.sleep(3000);

            // TC 1.4 - Create template with Unique name and chosen file
            TemplatePageObj.ClickOnUploadTemplateBtn();
            Thread.sleep(2000);
            TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TNameUnique"));
            Thread.sleep(2000);
            upload_file.sendKeys("C:\\Users\\kumar\\Downloads\\Template1.jpg");
            System.out.println("File chosen");
            Thread.sleep(2000);
            TemplatePageObj.ClickCreateTemplate();
            Thread.sleep(6000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//TemplateCreated.jpg");
            System.out.println("Template created");
            //Need to Update Assertion Name with Template Name before executing.
            //  TemplatePageObj.AssertCreatTemplate();
           // Thread.sleep(3000);
           // TemplatePageObj.AssertTrainingStatus();
           // Thread.sleep(3000);
            TemplatePageObj.ClickCancel();
            Thread.sleep(5000);
            // // TC 1.5- Search template
            TemplatePageObj.ClickOnSearchTemplate(ReadProps.readAttr("TNameUnique"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//SearchTemplate.jpg");
            Thread.sleep(2000);
            TemplatePageObj.ClickOnExpandTemplate();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//ExpandTemplate.jpg");
            Thread.sleep(2000);
            TemplatePageObj.ClickOnTemplateDataInfo();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//OpenTemplateFile.jpg");
            Thread.sleep(3000);
            System.out.println("Template open");
            TemplatePageObj.ClickOnZoomIn();
            Thread.sleep(2000);
            TemplatePageObj.ClickOnZoomIn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/ZoomIn.jpg");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,10000)", "");
            Thread.sleep(2000);
            TemplatePageObj.ClickOnZoomOut();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/ZoomOut.jpg");
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
            //TemplatePageObj.AssertMap();
           // Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/MapError.jpg");
            TemplatePageObj.ClickCancelTraining();
            Thread.sleep(4000);

            // TC 1.5- Delete created template
            TemplatePageObj.ClickOnSearchTemplate(ReadProps.readAttr("TNameUnique"));
            Thread.sleep(2000);
            TemplatePageObj.ClickOnExpandTemplate();
            Thread.sleep(2000);
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//DeleteTemplateWindow.jpg");
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(3000);

            //Create Template with more page
            driver.navigate().refresh();
            Thread.sleep(6000);
            TemplatePageObj.ClickOnUploadTemplateBtn();
            Thread.sleep(2000);
            TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TNameMorePages"));
            Thread.sleep(2000);
            System.out.println("Template name entered");
            WebElement upload_file1 = driver.findElement(By.xpath("//*[@id='faxDetailModal']/div/div/div[2]/div/form/div/input"));
            upload_file1.sendKeys("C:\\Users\\kumar\\Downloads\\Sample.pdf");
            System.out.println("File chosen");
            Thread.sleep(2000);
            TemplatePageObj.ClickCreateTemplate();
            Thread.sleep(12000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//MorePageTemplateCreated.jpg");
            System.out.println("Template created successfully");
            TemplatePageObj.ClickCancel();
            Thread.sleep(5000);
            TemplatePageObj.ClickOnSearchTemplate(ReadProps.readAttr("TNameMorePages"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//SearchTemplate.jpg");
            TemplatePageObj.ClickExpandMore();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//ExpandTemplate.jpg");
            TemplatePageObj.ClickOnTemplateMorePagesInfo();
            Thread.sleep(10000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//OpenTemplateFile.jpg");
            TemplatePageObj.ClickOnZoomIn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/ZoomInPages.jpg");
            TemplatePageObj.ClickOnZoomOut();
            Thread.sleep(2000);
            TemplatePageObj.ClickNavigateNext();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/NextPage.jpg");
            TemplatePageObj.ClickNavigateBack();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/BackPage.jpg");
            TemplatePageObj.ClickCancelTraining();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/ZoomOutPages.jpg");
            TemplatePageObj.ClickOnSearchTemplate(ReadProps.readAttr("TNameMorePages"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//SearchTemplate.jpg");
            Thread.sleep(2000);
            System.out.println("Search template");
            TemplatePageObj.ClickExpandMore();
            Thread.sleep(2000);
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(2000);
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/DeletePage1.jpg");
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/DeletePage2.jpg");
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/DeletePage3.jpg");
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(2000);
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(2000);
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(2000);
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/DeletedTemplateSuccessfully.jpg");
            TemplatePageObj.SoftAssertAll();
            Thread.sleep(4000);
            driver.close();
        }
        catch (Exception e) {
            test.log(status.FAIL, e);
        }

    }

}

