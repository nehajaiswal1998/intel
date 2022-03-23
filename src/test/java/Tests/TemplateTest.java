package Tests;

import Base.BasePage;
import Pages.TemplatePage;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;
import java.util.concurrent.TimeUnit;

@Listeners(Utilities.TestListeners.class)

public class TemplateTest extends BasePage {
    static TemplatePage TemplatePageObj;
    String TemplatePageURL = "https://alpha.neutrino-ai.com/#/home/n-training";



    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BasePage.LoginTest();
    }

    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }

    @Test(priority = 1)
    public void create_template_with_invalid_name() throws Exception {
        TemplatePageObj = new TemplatePage(driver);
        Robot r = new Robot();
        TemplatePageObj.ClickTemplateBtn();
        Thread.sleep(8000);
        AssertionsFunction.verifyTargetPageURL (TemplatePageURL);
        Thread.sleep(1000);



        //TC 20.1 - Create Template with Invalid Name and Chosen File.
        TemplatePageObj.ClickOnUploadTemplateBtn();
        Thread.sleep(4000);
        TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TInvalidName"));
        Thread.sleep(3000);
        TemplatePageObj.ClickCreateTemplate();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText("Only alphabets,digits,parenthesis and hyphens are allowed while naming a template.",TemplatePage.InvalidTemplateNameErr);
        Thread.sleep(1000);
        WebElement upload_file = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-new-training[1]/div[3]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));
        upload_file.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\Template1.jpg");
        Thread.sleep(2000);
        TemplatePageObj.ClickCancelCreateTemplate();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL (TemplatePageURL);
        Thread.sleep(5000);
    }

      @Test(priority = 2)
       public void create_template_with_valid_name_no_chosen_file() throws Exception {
           //TC 20.2 - Create Template with Valid Name and No Chosen file.
           TemplatePageObj.ClickOnUploadTemplateBtn();
           Thread.sleep(2000);
           TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TNameUnique"));
           Thread.sleep(2000);
           TemplatePageObj.ClickCancelCreateTemplate();
           Thread.sleep(5000);
       }

       @Test(priority = 3)
       public void create_template_with_already_exists_name_no_chosen_file() throws Exception {
           //TC 20.3 - Create Template with Already Exists Name and Chosen file
           TemplatePageObj.ClickOnUploadTemplateBtn();
           Thread.sleep(2000);
           TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TExistName"));
           Thread.sleep(2000);
           WebElement upload_file = driver.findElement(By.xpath("//*[@id='faxDetailModal']/div/div/div[2]/div/form/div/input"));
           upload_file.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\Template1.jpg");
           Thread.sleep(3000);
           TemplatePageObj.ClickCreateTemplate();
           Thread.sleep(5000);
           AssertionsFunction.verifyElementText("Template Name Already In Use.", TemplatePage.ExistingTemplateNameErr);
           Thread.sleep(1000);
           TemplatePageObj.ClickCancelCreateTemplate();
           Thread.sleep(5000);
       }

       @Test(priority = 4)
       public void create_template_with_valid_name_chosen_file() throws Exception {
           //TC 20.4 - Create template with Valid Name and chosen file.
           TemplatePageObj.ClickOnUploadTemplateBtn();
           Thread.sleep(2000);
           TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TNameUnique"));
           Thread.sleep(2000);
           WebElement upload_file = driver.findElement(By.xpath("//*[@id='faxDetailModal']/div/div/div[2]/div/form/div/input"));
           upload_file.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\Template1.jpg");
           Thread.sleep(2000);
           TemplatePageObj.ClickCreateTemplate();
           Thread.sleep(9000);
           TemplatePageObj.ClickCancel();
           Thread.sleep(8000);
           AssertionsFunction.verifyElementTextWithTrim("AutoSampleSPTemp", TemplatePage.ExpandTemplate);
           Thread.sleep(2000);
           AssertionsFunction.verifyElementText("In Progress",TemplatePage.TemplateStatus);
           Thread.sleep(2000);
           AssertionsFunction.verifyElementCreatedUpdatedTime(TemplatePage.TemplateCreatedTime,TemplatePage.TemplateUpdatedTime);
           Thread.sleep(2000);

       }

       @Test(priority = 5)
       public void search_created_template() throws Exception {
           //TC 20.5 Search Created template.
           TemplatePageObj.ClickOnSearchSinglePageTemplate(ReadProps.readAttr("TNameUnique"));
           Thread.sleep(4000);
           TemplatePageObj.ClickOnExpandTemplate();
           Thread.sleep(2000);
           TemplatePageObj.ClickOnTemplateDataInfo();
           Thread.sleep(6000);

       }

        @Test(priority = 6)
        public void zoom_in() throws Exception {
            //TC 20.6 Zoom IN.
            TemplatePageObj.ClickOnZoomIn();
            Thread.sleep(2000);

            TemplatePageObj.ClickOnZoomIn();
            Thread.sleep(2000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,10000)", "");
            Thread.sleep(2000);
        }

        @Test(priority = 7)
        public void zoom_out() throws Exception {
            //TC 20.7 Zoom OUT.
            TemplatePageObj.ClickOnZoomOut();
            Thread.sleep(2000);
            TemplatePageObj.ClickOnZoomOut();
            Thread.sleep(2000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
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
            AssertionsFunction.verifyElementText("Please select the portion on image for which the field name and validations have been given.", TemplatePage.MapErrorMsg);
            Thread.sleep(2000);

            TemplatePageObj.ClickCancelTraining();
            Thread.sleep(4000);
        }

        @Test(priority = 8)
        public void delete_created_template_single_page() throws Exception {
            //TC 20.8 Delete created template (Single Page).
            TemplatePageObj.ClickOnSearchSinglePageTemplate(ReadProps.readAttr("TNameUnique"));
            Thread.sleep(4000);
            TemplatePageObj.ClickOnExpandTemplate();
            Thread.sleep(2000);
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(2000);
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(4000);
            TemplatePageObj.refreshPage();
            Thread.sleep(4000);
            AssertionsFunction.verifyElementDeletedTextWithTrim("AutoSampleSPTemp", TemplatePage.ExpandTemplate);
            Thread.sleep(2000);


        }

        @Test(priority = 9)
        public void create_template_with_more_pages() throws Exception {
            //TC 20.9 Create Template with more pages.
            Thread.sleep(8000);
            TemplatePageObj.ClickOnUploadTemplateBtn();
            Thread.sleep(2000);
            TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TNameMorePages"));
            Thread.sleep(4000);
            WebElement upload_file1 = driver.findElement(By.xpath("//*[@id='faxDetailModal']/div/div/div[2]/div/form/div/input"));
            upload_file1.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\Sample.pdf");
            Thread.sleep(2000);
            TemplatePageObj.ClickCreateTemplate();
            Thread.sleep(20000);
            TemplatePageObj.ClickCancel();
            Thread.sleep(5000);
            AssertionsFunction.verifyElementTextWithTrim("AutoSampleMPTemp", TemplatePage.ExpandTemplate);
            Thread.sleep(2000);
            TemplatePageObj.ClickOnSearchMultiplePageTemplate(ReadProps.readAttr("TNameMorePages"));
            Thread.sleep(4000);
            AssertionsFunction.verifyElementTextWithTrim("AutoSampleMPTemp", TemplatePage.ExpandTemplate);
            TemplatePageObj.ClickExpandMore();
            Thread.sleep(4000);
            TemplatePageObj.ClickOnTemplateMorePagesInfo();
            Thread.sleep(15000);
            TemplatePageObj.ClickOnZoomIn();
            Thread.sleep(2000);
            TemplatePageObj.ClickOnZoomOut();
            Thread.sleep(2000);
        }

        @Test(priority = 10)
        public void navigate_next() throws Exception {
            //TC 20.10 Navigate Next.
            TemplatePageObj.ClickNavigateNext();
            Thread.sleep(7000);


        }

        @Test(priority = 11)
        public void navigate_back() throws Exception {
            //TC 20.11 Navigate Back.
            TemplatePageObj.ClickNavigateBack();
            Thread.sleep(7000);
            TemplatePageObj.ClickCancelTraining();
            Thread.sleep(8000);
            TemplatePageObj.ClickOnSearchMultiplePageTemplate(ReadProps.readAttr("TNameMorePages"));
            Thread.sleep(2000);
            TemplatePageObj.ClickExpandMore();
            Thread.sleep(7000);
        }

        @Test(priority = 12)
        public void delete_more_page_template() throws Exception {
            //TC 20.12 Delete More Pages Template.
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(3000);
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(4000);
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(3000);
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(4000);
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(3000);
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(4000);
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(3000);
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(4000);
            TemplatePageObj.refreshPage();
            Thread.sleep(3000);
            AssertionsFunction.verifyElementDeletedTextWithTrim("AutoSampleMPTemp", TemplatePage.ExpandTemplate);
            Thread.sleep(3000);

        }

        @Test(priority = 13)
        public void delete_template_assciatewithproject() throws InterruptedException {
            TemplatePageObj.ClickTemplateBtn();
            Thread.sleep(5000);
            TemplatePageObj.ClickOnSearchTemplate("QA-AutoTemplate");
            Thread.sleep(3000);
            TemplatePageObj.ClickOnExpandTemplate();
            Thread.sleep(5000);
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(3000);
            Assert.assertTrue(driver.findElement(By.xpath("//*[text()=' Sample-page1 is associated with QA-AutoProject-Structured,QA-AutoProject-Structured4 projects ']")).isDisplayed());
            Thread.sleep(1000);
            TemplatePageObj.cancelDeleteTemplate();
            Thread.sleep(5000);
        }

    @Test(priority = 14)
    public void sortingOnTemplatePage() throws InterruptedException {

        TemplatePageObj.ClickTemplateBtn();
        Thread.sleep(5000);
        TemplatePageObj.verifySortingOnTemplatePage("TempalteName");
        Thread.sleep(3000);
        TemplatePageObj.verifySortingOnTemplatePage("Projects");
        Thread.sleep(3000);
        TemplatePageObj.verifySortingOnTemplatePage("Pages");
        Thread.sleep(3000);
        TemplatePageObj.verifySortingOnTemplatePage("Training");
        Thread.sleep(3000);
        TemplatePageObj.verifySortingOnTemplatePage("Updated");
        Thread.sleep(3000);
        TemplatePageObj.verifySortingOnTemplatePage("Created");
        Thread.sleep(3000);


    }



}

