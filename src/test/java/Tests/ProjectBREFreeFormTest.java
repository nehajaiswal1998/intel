
package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import  Pages.ProjectBREFreeFormPage;
import Pages.ProjectBREMedicalChartDocumentPage;
import Utilities.LoginUser;
import Utilities.ReadProps;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ProjectBREFreeFormTest  extends BasePage {
    public static ProjectBREFreeFormPage  ProjectBREFreeFormPageobj;
    public DocumentPage DocPageObj;
    @BeforeSuite
    public void login() throws Exception{
        BasePage.driverInit();
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();

    }
    @AfterClass(enabled = false)
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
    public void Add_Attribute_In_FreeForm () throws  Exception{
        //IN482 Manual Intervention for Free form kind of documents
        LoginUser.login_users(driver, "pratiksha.bagal@neutrinotechlabs.com", "Pratiksha@12");
        Thread.sleep(9000);
        Robot r = new Robot();
        DocPageObj = new DocumentPage(driver);
        ProjectBREFreeFormPageobj = new ProjectBREFreeFormPage(driver);
        Thread.sleep(5000);
        DocPageObj.ClickDocumentBtn();
        Thread.sleep(6000);
        //AssertionsFunction.verifyTargetPageURL(DocPageObj.DocTabUrl);
        ProjectBREFreeFormPageobj.click_on_search_project();
        Thread.sleep(3000);
        ProjectBREFreeFormPageobj.select_free_form_project();
        Thread.sleep(8000);
        ProjectBREFreeFormPageobj.clickonRejectDocument();
        ProjectBREFreeFormPageobj.clickOnchartData();
        ProjectBREFreeFormPageobj.clickonAddAttribute();
        ProjectBREFreeFormPageobj.selectAttribute();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(5000);
        ProjectBREFreeFormPageobj.AddButton();
        ProjectBREFreeFormPageobj.enterAge();
        ProjectBREFreeFormPageobj.clickOnSubmit();
        Thread.sleep(5000);
        driver.navigate().back();
        ProjectBREFreeFormPageobj.clickOnStatusButton();
        ProjectBREFreeFormPageobj.CheckProcessedDocument();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(5000);
        ProjectBREFreeFormPageobj.clickOnProcessedPdf();
        ProjectBREFreeFormPageobj.clickOnchartData();
        ProjectBREFreeFormPageobj.clickonAddAttribute();


    }
}

