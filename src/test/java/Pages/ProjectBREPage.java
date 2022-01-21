package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProjectBREPage {


    WebDriver driver = null;

    By NextPage = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[3]/div[1]/div[1]/button[4]/span[1]");
    By ThreeDots = By.xpath("//mat-icon[contains(text(),'menu')]");
    By ProjectData = By.xpath("//mat-panel-title[contains(text(),'Project DATA')]");
    By DataSets = By.xpath("//mat-panel-title[contains(text(),'Datasets')]");
    By Variables = By.xpath("//mat-panel-title[contains(text(),'Variables')]");
    By AddRules = By.xpath("//span[contains(text(),'Rules')]");
    By DeleteRules = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/span[3]/mat-icon[1]");
    By ExpandFirstRule = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-icon[1]");
    By ContractFirstRule = By.xpath("//mat-icon[contains(text(),'visibility_off')]");
    By AddNameOfCondition = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer[2]/div[1]/rule-edit-sidebar[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");

    By RuleName1 = By.xpath("//input[@data-placeholder='Rule Name']");
    By FirstDecisionBox =  By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/div[1]/span[1]");
    By AddCondition = By.xpath("//span[contains(text(),'Add Condition')]");
    By AttributeValue = By.xpath("//span[contains(text(),'Attribute / Variable')]");
    By NameAttribute = By.xpath("//span[contains(text(),'NAME')]");
    By Visibility = By.xpath("//mat-icon[contains(text(),'visibility')]");
    By Operator = By.xpath("//span[contains(text(),'Operator')]");
    By OperatorValueEqualTo = By.xpath("//span[contains(text(),'==')]");

    By Save = By.xpath("//span[contains(text(),'Save ')]");
    By AddAction = By.xpath("//span[contains(text(),'Add Action')]");
   // By SaveAction = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer[2]/div[1]/rule-edit-sidebar[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]/span[1]");
    By ExpandVariables = By.xpath("//span[contains(text(),'Variables')]");
    By AddVariablesButton = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[3]/div[1]/project-data-section[1]/mat-accordion[1]/project-variables[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/button[1]/span[1]");
    By VariableName = By.xpath("//input[@id='variableName']");
    By ValidationType = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[3]/div[1]/project-data-section[1]/mat-accordion[1]/project-variables[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]");
    By Name = By.xpath("//span[contains(text(),'Name')]");
    By DefaultValue = By.xpath("//input[@id='VariableValue']");
    By AddButton = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[3]/div[1]/project-data-section[1]/mat-accordion[1]/project-variables[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[2]/span[1]");
    By CancelButton = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[3]/div[1]/project-data-section[1]/mat-accordion[1]/project-variables[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]/span[1]");

    By Value= By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer[2]/div[1]/rule-edit-sidebar[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");
    By ActionValue = By.xpath("//input[@data-placeholder='Enter name of Condition / Action']");
    By FalseBox = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/app-tree-node[1]/div[2]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/div[1]");
    By CreateProject = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/div[1]/button[2]/span[1]");
    By TrueBox = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/div[1]");
    By SelectVariable = By.xpath("//span[contains(text(),'Variable1')]");
    By VariableDropdown = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer[2]/div[1]/rule-edit-sidebar[1]/div[1]/div[3]/div[2]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]");
    By Project = By.xpath("//span[contains(text(),'AutoSample3')]");
    By FalseBoxSelection = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/app-tree-node[1]/div[2]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/div[1]/span[1]");
    By TrueBoxSelection = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/div[1]");
    //Constructor
    public ProjectBREPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickOnCreateProjectButton(){driver.findElement(CreateProject).click();}
    public void ClickOnTrueBoxButton(){driver.findElement(TrueBox).click();}
    public void ClickOnNextPageButton(){driver.findElement(NextPage).click();}
    public void ClickOnThreeDotsButton(){driver.findElement(ThreeDots).click();}
    public void ClickOnProjectData(){driver.findElement(ProjectData).click();}
    public void ClickOnDataSets(){driver.findElement(DataSets).click();}
    public void ClickOnVariables(){driver.findElement(Variables).click();}
    public void ClickOnAddRulesButton(){driver.findElement(AddRules).click();}
    public void ClickOnDeleteRulesButton(){driver.findElement(DeleteRules).click();}
    public void ClickOnFirstDecisionBox(){driver.findElement(FirstDecisionBox).click();}
    public void SearchCreatedProject(){driver.findElement(Project).click();}

    public void ClickOnExpandFirstRule(){driver.findElement(ExpandFirstRule).click();}
    public void EnterAddNameOfCondition(String text){ driver.findElement(AddNameOfCondition).sendKeys(text);}

    public  void ClickOnRule1(){driver.findElement(RuleName1).click();}
    public  void ClickOnClearRule1(){driver.findElement(RuleName1).clear();}
    public  void EnterValue(String text){ driver.findElement(Value).sendKeys(text);}

    public  void ClickOnAddCondition(){driver.findElement(AddCondition).click();}
    public  void ClickOnAttributeValue(){driver.findElement(AttributeValue).click();}
    public  void SelectNameAttribute(){driver.findElement(NameAttribute).click();}
    public  void ClickOnOperator(){driver.findElement(Operator).click();}
    public  void ClickOnVisibility(){driver.findElement(Visibility).click();}
    public  void SelectOperatorValueEqualTo(){driver.findElement(OperatorValueEqualTo).click();}

    public  void ClickOnAddAction(){driver.findElement(AddAction).click();}
    public  void ClickOnSave(){driver.findElement(Save).click();}
    public  void ClickOnExpandVariables(){driver.findElement(ExpandVariables).click();}
    public  void ClickOnAddVariables(){driver.findElement(AddVariablesButton).click();}
    public void EnterVariableName(String text){ driver.findElement(VariableName).sendKeys(text);}
    public  void ClickOnValidationType(){driver.findElement(ValidationType).click();}
    public  void ClickOnName(){driver.findElement(Name).click();}
    public void EnterDefaultValue(String text){ driver.findElement(DefaultValue).sendKeys(text);}

    public  void ClickOnAddButton(){driver.findElement(AddButton).click();}
    public  void ClickOnCancelButton(){driver.findElement(CancelButton).click();}
    public  void ClickOnContractRuleButton(){driver.findElement(ContractFirstRule).click();}
    public  void SelectTrueBox(){driver.findElement(TrueBoxSelection).click();}
    public  void SelectFalseBox(){driver.findElement(FalseBoxSelection).click();}
    public  void ClickOnFalseBoxButton(){driver.findElement(FalseBox).click();}
  //  public  void ClickOnSaveAction(){driver.findElement(SaveAction).click();}
    public  void EnterActionValue(String text){ driver.findElement(ActionValue).sendKeys(text);}
    public  void ClickOnVariableDropdown(){driver.findElement(VariableDropdown).click();}
    public  void SelectVariable(){driver.findElement(SelectVariable).click();}

    public void EnterRuleName(String text){ driver.findElement(RuleName1).sendKeys(text);}




    public void DoubleClickOnRule1(){
        Actions act = new Actions(driver);
        //Double click on element
        WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Rule-1')]"));
        act.doubleClick(ele).perform();
    }


    public void DoubleClickOnRule1Second(){
        Actions act = new Actions(driver);
        //Double click on element
        WebElement ele = driver.findElement(By.xpath("//span[@ class='py-2 rulesetName']"));
        act.doubleClick(ele).perform();
    }
    public void DoubleClickOnTrue(){
        Actions act = new Actions(driver);
        //Double click on element
        WebElement ele = driver.findElement(By.xpath("//button[@class='float-left conditinBlockTrueButton ng-star-inserted']"));
        act.doubleClick(ele).perform();
    }
    public void DoubleClickOnFalse(){
        Actions act = new Actions(driver);
        //Double click on element
        WebElement ele = driver.findElement(By.xpath("//button[@class='float-right conditionBlockFalseButton ng-star-inserted']"));
        act.doubleClick(ele).perform();
    }
}
