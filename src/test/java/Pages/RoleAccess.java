package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RoleAccess {
    WebDriver driver = null;

    By username = By.xpath("//input[@formcontrolname='userName']");
    By password = By.xpath("//input[@formcontrolname='password']");
    By loginBtn = By.xpath("//button[@type='submit']");
    By Logout = By.xpath("//i[@class='fa fa-power-off']");
    By Document = By.xpath("//i[@class='mat-tooltip-trigger fa fa-file-text m-0 side-icon ng-star-inserted']");
    By Project = By.xpath("//i[@class='mat-tooltip-trigger fa fa-briefcase m-0 side-icon ng-star-inserted']");
    By ProjectForSupervisor = By.xpath("//i[@class='mat-tooltip-trigger fa fa-briefcase m-0 side-icon ng-star-inserted']");
    By ProjectForOperator = By.xpath("//i[@class='mat-tooltip-trigger fa fa-briefcase m-0 side-icon ng-star-inserted']");
    By User = By.xpath("//i[@class='mat-tooltip-trigger fa fa-users m-0 side-icon ng-star-inserted']");
    By Role =By.xpath("//i[@class='mat-tooltip-trigger fa fa-id-card m-0 side-icon ng-star-inserted']");
    By Template = By.xpath("//i[@class='mat-tooltip-trigger fa fa-newspaper-o m-0 side-icon ng-star-inserted']");
    By Analytics = By.xpath("//i[@class='mat-tooltip-trigger fa fa-cubes m-0 side-icon ng-star-inserted']");

    public RoleAccess(WebDriver driver) { this.driver = driver;}
    public void setUsername(String text) {
        driver.findElement(username).sendKeys(text);
    }
    public void setPassword(String text) {
        driver.findElement(password).sendKeys(text);
    }
    public  void clickOperatorDocument(){driver.findElement(Document).click();}
    public  void clickOperatorAnalytics(){driver.findElement(Analytics).click();}
    public  void clickOperatorProject(){driver.findElement(ProjectForOperator).click();}
    public void clickLoginButton() {
        driver.findElement(loginBtn).click();
    }
    public void clickAdminUser() {driver.findElement(User).click();}
    public  void clickAdminRole(){driver.findElement(Role).click();}
    public void clickAdminTemplate(){driver.findElement(Template).click();}
    public void ClickLogout(){driver.findElement(Logout).click();}
    public void clickAdminProject(){driver.findElement(Project).click();}
    public void clickAdminDocument(){driver.findElement(Document).click();}
    public  void clickAdminAnalytic(){driver.findElement(Analytics).click();}
    public void clickSupervisorTemplate(){driver.findElement(Template).click();}
    public void clickSupervisorProject(){driver.findElement(ProjectForSupervisor).click();}
    public void clickSupervisorDocument(){driver.findElement(Document).click();}
    public void clickSupervisorAnalytics(){driver.findElement(Analytics).click();}
    public void ClearUserID(){driver.findElement(username).clear();}
    public void ClearPWD(){driver.findElement(password).clear();}
}