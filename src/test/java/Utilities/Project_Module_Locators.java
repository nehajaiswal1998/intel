package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Project_Module_Locators
{
	
	//locators for login test cases
	
	WebDriver driver;

	@FindBy (xpath="//input[@formcontrolname='userName']")
	public WebElement userName;
	
	@FindBy (xpath="//input[@formcontrolname='password']")
	public WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	public WebElement loginButton;
	
	@FindBy (xpath="//span[@mattooltip='Logout']")
	public WebElement logoutButton;
	
	@FindBy (xpath="//span[contains (text(),'Please Enter Valid Data ...!')]")
	public WebElement ErrorMsgBlankData;
	
	@FindBy (xpath="//span[contains (text(),'Something Went Wrong ...!')]")
	public WebElement ErrorMsgInvalidData;
	
	
	//locators for document page
	
	@FindBy (xpath="//*[text()=' keyboard_arrow_right ']//preceding::i[2]")
	public WebElement documents_Menu;
	
	@FindBy (xpath="//*[@class='mat-focus-indicator mat-menu-trigger white_bg mat-button mat-button-base mat-primary ng-star-inserted']")
	public WebElement click_0n_Project_dropDown;

	@FindBy (xpath="//*[@class='mat-focus-indicator mat-menu-trigger white_bg mat-button mat-button-base mat-primary ng-star-inserted']//following::input[2]")
	public WebElement search_project;
	
	@FindBy (xpath="//*[text()=' Action ']//following::tr[1]/td[8]")
	public WebElement click_on_Action_Button;
	
	
	//locators for project module
	
	@FindBy (xpath="//*[text()=' Create Project ']")
	public WebElement create_Project_button;
	
	@FindBy (xpath="//*[text()='Project Name']//following::input[1]")
	public WebElement project_Name_Filed;
	
	@FindBy (xpath="//*[text()='Lead']//following::div[2]")
	public WebElement click_on_Lead_filed;
	
	@FindBy (xpath="//*[text()='Lead']//following::input[9]")
	public WebElement search_Lead;
	
	@FindBy (xpath="//*[text()='Lead']//following::mat-option")
	public WebElement select_Lead;
	
	@FindBy (xpath="//*[text()='Start Date']//following::input[1]")
	public WebElement start_Date;
	
	@FindBy (xpath="//*[text()='End Date']//following::input[1]")
	public WebElement end_Date;
	
	@FindBy (xpath="//*[text()=' Document Structure ']//following::div[12]")
	public WebElement document_Structure_dropdown;
	
	@FindBy (xpath="//*[text()=' Document Structure ']//following::mat-option[1]")
	public WebElement select_Structured_Project_Type;
	
	@FindBy (xpath="//*[text()=' Document Structure ']//following::span[text()=' Semi-Structured ']")
	public WebElement select_Semi_Structured_Project_Type;
	
	@FindBy (xpath="//*[text()=' Document Structure ']//following::mat-option[3]")
	public WebElement select_Free_Form_Project_Type;
	
	@FindBy (xpath="//*[text()=' Document Structure ']//following::mat-option[4]")
	public WebElement select_Medical_Chart_Project_Type;
	
	@FindBy (xpath="//*[text()=' Processing Engine ']//following::div[12]")
	public WebElement processing_Engine_Dropdown;
	
	@FindBy (xpath="//*[text()=' Processing Engine ']//following::mat-option[1]")
	public WebElement nh_High_ProcessingEngine_For_Structure_project;
	
	@FindBy (xpath="//*[text()=' Processing Engine ']//following::mat-option[2]")
	public WebElement nh_Low_ProcessingEngine_For_Structure_project;
	
	@FindBy (xpath="//*[text()=' Processing Engine ']//following::mat-option[3]")
	public WebElement brute_Force_ProcessingEngine_For_Structure_project;
	
	
	@FindBy (xpath="//*[text()=' Processing Engine ']//following::mat-option[1]")
	public WebElement trade_ProcessingEngine_For_SemiStructure_project;
	
	@FindBy (xpath="//*[text()=' Processing Engine ']//following::mat-option[2]")
	public WebElement returns_ProcessingEngine_For_SemiStructure_project;
	
	@FindBy (xpath="//*[text()=' Processing Engine ']//following::label[1]")
	public WebElement status_select;
	
	@FindBy (xpath="//*[text()=' Processing Engine ']//following::label[2]")
	public WebElement document_auto_assignment_select;
	
	@FindBy (xpath="//*[text()=' Processing Engine ']//following::label[3]")
	public WebElement straight_Through_Process_select;
	
	@FindBy (xpath="//*[text()='Document Score (0-100)']//following::input[1]")
	public WebElement document_Score;
	
	@FindBy (xpath="//*[text()=' Add Template ']")
	public WebElement add_Template_button;
	
	@FindBy (xpath="//*[text()=' Add Template ']//following::input[3]")
	public WebElement search_Template;
	
	@FindBy (xpath="//*[@placeholder='Search']//following::button[1]")
	public WebElement select_Template;
	
	@FindBy (xpath="//*[text()='Roles']/descendant-or-self::span")
	public WebElement expand_Role_Details;
	
	@FindBy (xpath="//*[text()=' Add Role ']")
	public WebElement add_Role_Button;
	
	@FindBy (xpath="//*[@class='cdk-overlay-pane']//following::button")
	public WebElement search_Role;
	
	@FindBy (xpath="//*[@class='mat-focus-indicator mat-menu-item']")
	public WebElement select_Role;
	
	@FindBy (xpath="//*[text()=' Document Ingestion Channels ']")
	public WebElement expand_Document_Investigation_Channels;
	
	@FindBy (xpath="//*[text()='Channel Type']//following::span[1]")
	public WebElement channel_Type;
	
	@FindBy (xpath="//*[text()='Channel Type']//following::img[4]")
	public WebElement gcp_Bucket_select;
	
	@FindBy (xpath="//*[text()='Channel Type']//following::img[3]")
	public WebElement amazon_s3_select;
	
	@FindBy (xpath="//*[text()='Channel Type']//following::img[2]")
	public WebElement google_Drive_Select;
	
	@FindBy (xpath="//*[text()='API Configuration']")
	public WebElement expand_API_configuration_details;
	
	@FindBy (xpath="//*[text()=' You do not have permissions to add an API.']")
	public WebElement api_Access_related_message;
	
	@FindBy (xpath="//*[text()=' Create API ']")
	public WebElement create_API_Button;
	
	
	@FindBy (xpath="//*[text()='API Name']//following::input[1]")
	public WebElement api_Name;
	
	@FindBy (xpath="//*[text()='Method Type']//following::div[1]")
	public WebElement method_Type_Dropdown;
	
	
	@FindBy (xpath="//*[text()='GET']")
	public WebElement select_get_method;
	
	@FindBy (xpath="//*[text()='POST']")
	public WebElement select_post_method;
	
	@FindBy (xpath="//*[text()='PUT']")
	public WebElement select_put_method;
	
	@FindBy (xpath="//*[text()='DELETE']")
	public WebElement select_delete_method;
	
	@FindBy (xpath="//*[text()='End Point']//following::input")
	public WebElement end_Point;
	
	@FindBy (xpath="//*[text()=' Add Field ']")
	public WebElement add_filed_button_for_api;
	
	@FindBy (xpath="//*[text()=' Add Field ']//following::input[1]")
	public WebElement api_key;
	
	@FindBy (xpath="//*[text()=' Add Field ']//following::input[2]")
	public WebElement api_value;
	
	@FindBy (xpath="//*[text()=' Test Connection ']")
	public WebElement test_Connection_button;
	
	@FindBy (xpath="//*[text()='Add ']")
	public WebElement add_Button_for_API;
	
	@FindBy (xpath="//*[text()='Add ']//following::button[1]")
	public WebElement cancel_Button_For_API;
	
	@FindBy (xpath="//*[text()=' Next']//preceding::button[1]")
	public WebElement cancel_Button_On_Project_Details;
	
	@FindBy (xpath="//*[text()=' Next']")
	public WebElement next_Button_On_Project_Details;
	
	@FindBy (xpath="//*[text()=' Add Fields ']")
	public WebElement add_Field_For_Attribute;
	
	@FindBy (xpath="//*[text()=' Add Fields ']//following::input[3]")
	public WebElement search_Attribute;
	
	@FindBy (xpath="//*[@class='cdk-overlay-pane']//following::button[1]")
	public WebElement select_Attribute;
	
	@FindBy (xpath="//*[text()=' Add Entity ']")
	public WebElement add_Entity_Button;
	
	@FindBy (xpath="//*[text()=' Add Entity ']//following::input[3]")
	public WebElement search_Entity;
	
	@FindBy (xpath="//*[text()=' Add Entity ']//following::button[text()=' HCC Conditions']")
	public WebElement select_HCC_Condition_Entity;
	
	@FindBy (xpath="//*[text()=' Create']")
	public WebElement create_button;
	
	@FindBy (xpath="//*[text()=' Create']//following::button[1]")
	public WebElement cancel_Button;
	
	@FindBy (xpath="//*[text()=' Next']")
	public WebElement next_Button;
	
	//google drive locators and Amazon s3
	
	@FindBy (xpath="//*[text()='Channel Name']//following::input[1]")
	public WebElement channel_Name;
	
	@FindBy (xpath="//*[text()='User Email']//following::input[1]")
	public WebElement user_Email_for_google_drive;
	
	@FindBy (xpath="//*[text()='Service Account File']//following::input[1]")
	public WebElement upload_Service_Account_File;
	
	@FindBy (xpath="//*[text()='ok']//preceding::div[1]")
	public WebElement test_conn_success_or_error_msg;
	
	@FindBy (xpath="//*[text()='ok']")
	public WebElement ok_button;
	
	@FindBy (xpath="//*[text()='Secret Key ID']//following::input[1]")
	public WebElement secret_Key_ID;
	
	@FindBy (xpath="//*[text()='Access Key ID']//following::input[1]")
	public WebElement access_Key_ID;
	
	@FindBy (xpath="//*[text()='Bucket Region']//following::input[1]")
	public WebElement bucket_Region;
	
	@FindBy (xpath="//*[text()=' Test Connection ']")
	public WebElement test_Connection_button_for_google_drive_and_Amazon_s3;
	
	
	
	//verify template details
	
	@FindBy (xpath="//*[text()=' Action ']//following::mat-row[1]/mat-cell[1]/span[1]")
	public WebElement name_of_template;
	
	
	//verify roles details
	@FindBy (xpath="//*[text()=' Users ']//following::div[3]")
	public WebElement role_Name;
	
	@FindBy (xpath="//*[text()=' Users ']//following::mat-icon[1]")
	public WebElement addButton_User_In_Roles_Details;
	
	@FindBy (xpath="//*[@class='cdk-overlay-connected-position-bounding-box']//following::mat-option[1]/span[1]")
	public WebElement select_userName_For_Roles_Details;
	
	@FindBy (xpath="//*[@class='mat-chip-ripple']//following::mat-icon[1]")
	public WebElement delete_userName_From_Roles_Details;
	
	@FindBy (xpath="//*[text()=' Users ']//following::mat-chip")
	public WebElement user_Name_On_Roles_Section;
	
	@FindBy (xpath="//*[text()=' Users ']//following::mat-icon[1]")
	public WebElement remove_user_from_Roles_section;
	
	
	//Error messages
	
	@FindBy (xpath="//*[@class='mat-simple-snackbar ng-star-inserted']")   //works for missing roles, template, roles and existing project
	public WebElement error_msg_for_mandatory_attributes;
	
	@FindBy (xpath="//*[text()='Lead']//following::mat-error[1]")
	public WebElement error_msg_for_Empty_lead_dropdown;
	
	@FindBy (xpath="//*[text()='Project Name']//following::mat-error[1]")
	public WebElement error_msg_for_Empty_Project_Name_Filed;
	
	@FindBy (xpath="//*[text()=' Processing Engine ']//following::mat-error[1]")
	public WebElement error_msg_for_Empty_processing_engine_for_structured_type_project;
	
	//label locators
	
	@FindBy (xpath="//*[text()='Start Date']")
	public WebElement start_date_label;
	
	
	//locators for calendar application
	
	@FindBy (xpath="//*[text()='Start Date']//following::span[2]")
	public WebElement calendar_app_for_start_date;
	
	@FindBy (xpath="//*[text()='End Date']//following::span[2]")
	public WebElement calendar_app_for_end_date;
	
	@FindBy (xpath="//*[text()=' 10 ']")
	public WebElement select_start_date;
	
	@FindBy (xpath="//*[text()=' 17 ']")
	public WebElement select_end_date;
	
	@FindBy (xpath="//*[@class='mat-focus-indicator mat-calendar-period-button mat-button mat-button-base']")
	public WebElement month_year_filed_for_start_date_or_end_date;
	
	@FindBy (xpath="//*[@class='mat-focus-indicator mat-calendar-next-button mat-icon-button mat-button-base']//following::div[2]")
	public WebElement select_year_or_month_for_start_date;
	
	@FindBy (xpath="//*[@class='mat-focus-indicator mat-calendar-next-button mat-icon-button mat-button-base']//following::div[48]")
	public WebElement select_year_for_end_date;
	
	@FindBy (xpath="//*[@class='mat-focus-indicator mat-calendar-next-button mat-icon-button mat-button-base']//following::div[24]")
	public WebElement select_month_for_end_date;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
