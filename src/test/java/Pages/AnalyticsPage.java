package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class
AnalyticsPage {

    WebDriver driver = null;

    //xpath change by suwarna
    public static String AnalyticsPageURL = "https://alpha.neutrino-ai.com/#/home/analytics";
    public static By AnalyticsBtn = By.xpath("//*[@class='mat-nav-list mat-list-base side-bar-menue ng-star-inserted']//following::i[7]");
    By OrganizationStatistics =By.xpath("//span[text()='Project Statistics']");

    public static By StatisticsHidden = By.xpath("//span[text()='Project Statistics']//following::span[2]");
    public static By StatisticsVisible = By.xpath("//span[text()='Project Statistics']//following::span[2]");

    public static By TotalUser = By.xpath("//div[text()=' Users ']");
    By Document = By.xpath("//*[text()=' Users ']//following::div[5]");
    By Processed = By.xpath("//*[text()=' Users ']//following::div[22]");

    By ReadyToProcess = By.xpath("//div[text()=' Users ']//following::div[32]");
    By Rejected = By.xpath("//*[text()=' Users ']//following::div[40]");
    By ValidationTime = By.xpath("//*[text()=' Validation Time ']");
    By SProcessedBar = By.xpath("//*[text()=' Structured ']//following::div[2]");
    By SReadyBar = By.xpath("//*[text()=' Structured ']//following::div[3]");
    By SRejectedBar = By.xpath("//*[text()=' Structured ']//following::div[4]");
    By SSProcessedBar = By.xpath("//*[text()=' Semi-Structured ']//following::div[1]");
    By SSReadyBar = By.xpath("//*[text()=' Semi-Structured ']//following::div[3]");
    By SSRejectedBar = By.xpath("//*[text()=' Semi-Structured ']//following::div[4]");
    By FFProcessedBar = By.xpath("//*[text()=' Free-Form ']//following::div[2]");
    By FFReadyBar = By.xpath("//*[text()=' Free-Form ']//following::div[3]");
    By FFRejectedBar = By.xpath("//*[text()=' Free-Form ']//following::div[4]");
    By MCProcessedBar = By.xpath("//*[text()=' Medical Chart ']//following::div[2]");
    By MCReadyBar = By.xpath("//*[text()=' Medical Chart ']//following::div[3]");
    By MCRejectedBar = By.xpath("//*[text()=' Medical Chart ']//following::div[4]");
    By ProjectDownArrow=By.xpath("//*[@class='mat-icon notranslate docStIconPos material-icons mat-icon-no-color']//following::i");
    public static By ProjectSelected = By.xpath("//span[@class='mat-tooltip-trigger projectname']");
    By SearchProject=By.xpath("//input[@placeholder='Search']");
    public static By SelectProject=By.xpath("//input[@placeholder='Search']//following::span[1]");
    By SelectDropDown= By.xpath("//*[@id=\"mat-select-0\"]/div/div[2]");
    By SelectMonthly = By.xpath("//span[contains(text(),'Monthly')]");
    By SelectWeekly = By.xpath("//span[contains(text(),'Weekly')]");
    By SelectDaily = By.xpath("//span[contains(text(),'Daily')]");
    By SelectOverall = By.xpath("//*[@id='mat-option-3']/span");
    By SortByDocuments = By.xpath("//*[text()=' Received ']//preceding::div[3]");
    By SortByReceived = By.xpath("//div[contains(text(),'Received')]");
    By OperatorPerformanceSection = By.xpath("//div[text()=' Operator Performance']");
    public static By AnalyticsPageDisplay= By.xpath("//div[@class='row ng-star-inserted']");
    public static By ProjectStatistics = By.xpath("//span[text()='Project Statistics']");



    //Constructor for Analytics Page.
    public AnalyticsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickAnalyticsBtn() throws Exception {
    	Thread.sleep(5000);
        driver.findElement(AnalyticsBtn).click();
    }

    public void ClickOnSortByReceived() throws Exception {
    	Thread.sleep(5000);
        driver.findElement(SortByReceived).click();
    }

    public void ClickOnSortByDocuments() throws Exception {
    	Thread.sleep(5000);
        driver.findElement(SortByDocuments).click();
    }

    public  void ClickOrganizationArrow() throws Exception{
    	Thread.sleep(5000);
        driver.findElement(OrganizationStatistics).click();
    }

    public  void clickProjectStatisticsarrow() throws Exception{
    	Thread.sleep(5000);
        driver.findElement(ProjectStatistics).click();
    }


    public  void HoverTotalUser(){
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(TotalUser);
        action.moveToElement(element).build().perform();
        System.out.println("Mouse hover");
    }

    public void HoverDocuments()
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(Document);
        action.moveToElement(element).build().perform();
        System.out.println("Mouse hover");
    }

public void HoverProcessed()
{
    Actions action = new Actions(driver);
    WebElement element= driver.findElement(Processed);
    action.moveToElement(element).build().perform();

}

public void HoverReadyToProcess()
{
    Actions action = new Actions(driver);
    WebElement element= driver.findElement(ReadyToProcess);
    action.moveToElement(element).build().perform();
}

public void HoverRejected()
{
    Actions action = new Actions(driver);
    WebElement element= driver.findElement(Rejected);
    action.moveToElement(element).build().perform();
}

public void HoverValidationTime()
{
    Actions action = new Actions(driver);
    WebElement element= driver.findElement(ValidationTime);
    action.moveToElement(element).build().perform();
}

    public void HoverStructuredBar()
    {
        Actions action = new Actions(driver);
        WebElement element1= driver.findElement(SProcessedBar);
        action.moveToElement(element1).build().perform();

        WebElement element2= driver.findElement(SReadyBar);
        action.moveToElement(element2).build().perform();

        WebElement element3= driver.findElement(SRejectedBar);
        action.moveToElement(element3).build().perform();
    }

    public void HoverSemiStructured()
    {
        Actions action = new Actions(driver);
        WebElement element1= driver.findElement(SSProcessedBar);
        action.moveToElement(element1).build().perform();

        WebElement element2= driver.findElement(SSReadyBar);
        action.moveToElement(element2).build().perform();

        WebElement element3= driver.findElement(SSRejectedBar);
        action.moveToElement(element3).build().perform();
    }

    public void HoverFreeForm()
    {
        Actions action = new Actions(driver);
        WebElement element1= driver.findElement(FFProcessedBar);
        action.moveToElement(element1).build().perform();

        WebElement element2= driver.findElement(FFReadyBar);
        action.moveToElement(element2).build().perform();

        WebElement element3= driver.findElement(FFRejectedBar);
        action.moveToElement(element3).build().perform();
    }

    public void HoverMedicalChart()
    {
        Actions action = new Actions(driver);
        WebElement element1= driver.findElement(MCProcessedBar);
        action.moveToElement(element1).build().perform();

        WebElement element2= driver.findElement(MCReadyBar);
        action.moveToElement(element2).build().perform();

        WebElement element3= driver.findElement(MCRejectedBar);
        action.moveToElement(element3).build().perform();
    }

    public  void ClickProjectDownArrow(){
        driver.findElement(ProjectDownArrow).click();
    }
    public void ClickSearchProject(){driver.findElement(SearchProject).click();}
    public void ClickSelectProject(){driver.findElement(SelectProject).click();}
    public void ClickSelectDropDown(){driver.findElement(SelectDropDown).click();}
    public void ClickSelectMonthly(){driver.findElement(SelectMonthly).click();}
    public void ClickSelectWeekly(){driver.findElement(SelectWeekly).click();}
    public void ClickSelectDaily(){driver.findElement(SelectDaily).click();}
    public void ClickSelectOverall(){driver.findElement(SelectOverall).click();}

    public void VerifyOperatorPerformance ()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()=' Operator Performance']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()=' Operator ']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()=' Validation count ']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()=' Validation time ']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()=' Validation time avg ']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//canvas[@id='bar-chart-horizontal']")).isDisplayed());
    }
}