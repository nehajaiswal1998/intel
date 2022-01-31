package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditProfilePage
{
    WebDriver driver = null;
    By Profile = By.xpath("//div[@class='profileImageIcon ng-star-inserted']");
    By NightMode = By.xpath("//*[contains(text(),'Night Mode')]");
    By DayMode = By.xpath("//*[contains(text(),'Day Mode')]");
    By EditProfile = By.xpath("//button[@id='profile-modal-button']");
    By Cancel = By.xpath("//mat-icon[contains(text(),'close')]");
    By Visible = By.xpath("//mat-icon[contains(text(),'visibility')]");

    public EditProfilePage(WebDriver driver) {
        this.driver = driver;
    }
    public  void clickVisible(){driver.findElement(Visible).click();}
    public void ProfileButton() {
        driver.findElement(Profile).click();
    }
    public void NightModeButton() {
        driver.findElement(NightMode).click();
    }
    public void DayModeButton() {
        driver.findElement(DayMode).click();
    }

    public void EditProfileButton() {
        driver.findElement(EditProfile).click();
    }
    public void CancelButton() {
        driver.findElement(Cancel).click();
    }
}