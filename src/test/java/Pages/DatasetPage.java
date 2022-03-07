package Pages;

import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class DatasetPage {

        WebDriver driver = null;
        By DatasetBtn = By.xpath("//i[@aria-describedby='cdk-describedby-message-5']");
        By AddCategoryBtn = By.xpath("//span[contains(text(),'Add Category')]");
        By CategoryName = By.xpath("//input[@formcontrolname='newCategoryName']");
        By CreateCategory = By.xpath("//span[contains(text(),'Create Category')]");
        By CategoryCancelBtn = By.xpath("//button[@id='category-close-modal']");

        By ActionBtn = By.xpath("//tbody/tr[1]/td[5]/div[1]/button[1]/span[1]/mat-icon[1]");

        By SearchBox = By.xpath("//input[@data-placeholder='Search']");        //driver.clear();
        By ExpandDataset1 = By.xpath("//tbody/tr[1]/td[1]");
        By NameOptionValidationDropdown = By.xpath("//span[contains(text(),' Name ')]");
        By DatasetFile = By.xpath("//td[contains(text(),'contacts_to_import.csv')]");
        By CancelDatasetFile = By.xpath("//span[contains(text(),'Cancel')]");
        By DatasetName = By.xpath("//input[@formcontrolname='newDatasetName']");
        By ValidationDropDown1 = By.xpath("//tbody/tr[1]/td[3]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]");
        By ValidationName= By.xpath("//div[@role='listbox']/mat-option[1]");
        By ValidationEmail=By.xpath("//span[contains(text(),' Email ')]");
        By ValidationText=By.xpath("//span[text()=' Text ']");
        By ValidationDropDown2 = By.xpath("//tbody/tr[2]/td[3]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]");
        By validationDropdown3=By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c163-42 ng-star-inserted']");
        By ValidationDropDown4=By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c163-63 ng-star-inserted']");
        By ValidationDropDown5=By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c163-48 ng-star-inserted']");
        By ValidationdropDown6=By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c163-150 ng-star-inserted']");
        By ValidationRoles = By.xpath("//span[contains(text(),'Phone')]");
        By DisableDataset = By.xpath("//div[@class='mat-slide-toggle-bar mat-slide-toggle-bar-no-side-margin']");
        By CreateNewDataset=By.xpath("(//span[contains(text(),'Create New Dataset')])[2]");
        By CreateDataset = By.xpath("//span[contains(text(),'Create Dataset')]");
        By NewDatasetCancelBtn = By.xpath("//button[@id='dataset1-close-modal']");
        By CreateNewDatasetCategory=By.xpath("//span[contains(text(),'Create New Dataset Category')]");
        By NoRecordFound=By.xpath("//*[contains(text(),' No Records Found ! ')]");
        By createdCategory=By.xpath("//td[contains(text(),\""+ ReadProps.readAttr("DName")+"\")]");
        public By getNameOptionValidationDropdown(){return this.NameOptionValidationDropdown;}
        public String dataSetTabUrl ="https://alpha.neutrino-ai.com/#/home/datasets";
        public By getCreateNewDataset(){return this.CreateNewDataset;}
        public By getNoRecordFound(){return this.NoRecordFound;}
        public By getCreateNewDatasetCategory(){return this.CreateNewDatasetCategory;}
        public By getcreatedCategory(){return this.createdCategory;}

        public DatasetPage(WebDriver driver) throws IOException { this.driver = driver;}
        public void ClickDatasetBtn(){ driver.findElement(DatasetBtn).click();}
        public void ClickAddCategoryBtn(){ driver.findElement(AddCategoryBtn).click();}
        public void ClickCategoryName(String text){ driver.findElement(CategoryName).sendKeys(text);}
        public void ClickCreateCategory(){driver.findElement(CreateCategory).click();}

        public void ClickActionBtn(){driver.findElement(ActionBtn).click();}
        public void ClickDatasetName(String text){ driver.findElement(DatasetName).sendKeys(text);}
        public void ClickValidationDropDown(){driver.findElement(ValidationDropDown1).click();}
        public void ClickValidationName(){driver.findElement(ValidationName).click();}
        public void ClickValidationEmail(){driver.findElement(ValidationEmail).click();}
        public void ClickValidationText(){driver.findElement(ValidationText).click();}
        public void ClickValidationDropDown2(){driver.findElement(ValidationDropDown2).click();}
        public void ClickValidationDropDown3(){driver.findElement(validationDropdown3).click();}
        public void ClickValidationDropDown4(){driver.findElement(ValidationDropDown4).click();}
        public void ClickValidationDropDown5(){driver.findElement(ValidationDropDown5).click();}
        public void ClickValidationDropDown6(){driver.findElement(ValidationdropDown6).click();}

        public void ClickValidationRoles(){driver.findElement(ValidationRoles).click();}
        public void ClickCreateDataset(){driver.findElement(CreateDataset).click();}
        public void ClickCategoryCancelBtn(){driver.findElement(CategoryCancelBtn).click();}

        public void ClickSearchBox(String text){ driver.findElement(SearchBox).sendKeys(text);}
        public void ClickExpand1(){driver.findElement(ExpandDataset1).click();}
        public void ClickDatasetFileName(){ driver.findElement(DatasetFile).click();}
        public void ClickCancelDatasetFileName(){ driver.findElement(CancelDatasetFile).click();}
        public void ClickDisableUser(){driver.findElement(DisableDataset).click();}
        public void ClickAddDatasetCancelBtn(){ driver.findElement(NewDatasetCancelBtn).click();}
}