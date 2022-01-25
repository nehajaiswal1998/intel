package Tests;

import Base.BasePage;
import Pages.AnalyticsPage;
import Pages.DocumentPage;
import Utilities.TakesScreen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.TestListeners.class)

public class ManualInterventionDocument extends BasePage {
    static DocumentPage documentPageObj;
    @BeforeTest
    public void login() throws Exception {
        BasePage.LoginTest();
    }
    @AfterTest
    public void cleanUp() throws Exception {
        driver.quit();
    }

    @Test(priority = 1)
    public void manual_intervention_freeform_rejected_document() throws Exception {
        //Object Creation
        documentPageObj = new DocumentPage(driver);

    }

}
