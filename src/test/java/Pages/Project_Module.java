package Pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.Project_Module_Locators;
import Utilities.Scroll_Page;
import Utilities.Verification_Functions;

public class Project_Module
{
	
	public static void create_project_Button(WebDriver driver) throws Exception
	{
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		
		Thread.sleep(5000);
		loc.create_Project_button.click();
		Thread.sleep(5000);
	}
	public static void project_basic_details(WebDriver driver) throws Exception
	{
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		Random randam_num=new Random();
		int int_num=randam_num.nextInt(2000);
		loc.project_Name_Filed.sendKeys("PRONAME"+int_num);
		Thread.sleep(3000);
		loc.click_on_Lead_filed.click();
		Thread.sleep(1000);
		loc.search_Lead.sendKeys("qauser@gmail.com");
		Thread.sleep(1000);
		loc.select_Lead.click();
		Thread.sleep(1000);
		loc.start_Date.sendKeys("4/11/2022");
		Thread.sleep(1000);
		loc.end_Date.sendKeys("4/13/2022");
		Thread.sleep(1000);
		
	}
	
	public static void project_basic_details_with_existing_project_name(WebDriver driver) throws Exception
	{
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		loc.project_Name_Filed.sendKeys("TESTPRONAME");
		Thread.sleep(1000);
		loc.click_on_Lead_filed.click();
		Thread.sleep(1000);
		loc.search_Lead.sendKeys("qauser@gmail.com");
		Thread.sleep(1000);
		loc.select_Lead.click();
		Thread.sleep(1000);
		loc.start_Date.sendKeys("4/11/2022");
		Thread.sleep(1000);
		loc.end_Date.sendKeys("4/13/2022");
		Thread.sleep(1000);
		
	}
	public static void select_Project_Type(WebDriver driver,String projectType) throws Exception
	{
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		loc.document_Structure_dropdown.click();
		Thread.sleep(1000);
		
		if(projectType.equalsIgnoreCase("Structure"))
		{
			
			loc.select_Structured_Project_Type.click();
		}
		else if(projectType.equalsIgnoreCase("Semi-Structure"))
		{
			loc.select_Semi_Structured_Project_Type.click();
		}
		else if(projectType.equalsIgnoreCase("Free-Form"))
		{
			loc.select_Free_Form_Project_Type.click();
		}
		else if(projectType.equalsIgnoreCase("Medical_Chart"))
		{
			loc.select_Medical_Chart_Project_Type.click();
		}
	
		Thread.sleep(2000);
	}
	
	public static void select_Processing_Engine(WebDriver driver) throws Exception
	{
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		loc.processing_Engine_Dropdown.click();
		Thread.sleep(1000);
		loc.nh_High_ProcessingEngine_For_Structure_project.click();
	}
	
	public static void statuses(WebDriver driver,String project_type) throws Exception
	{
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		if(project_type.equalsIgnoreCase("Medical_Chart"))
		{
			loc.status_select.click();
			Thread.sleep(1000);
			loc.document_auto_assignment_select.click();
		}
		else
		{
		loc.status_select.click();
		Thread.sleep(1000);
		loc.document_auto_assignment_select.click();
		Thread.sleep(1000);
		loc.straight_Through_Process_select.click();
		Thread.sleep(1000);
		loc.document_Score.sendKeys("90");
		}
	}
	
	public static void template_Details(WebDriver driver) throws Exception
	{
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		Thread.sleep(3000);
		loc.add_Template_button.click();
		Thread.sleep(3000);
		loc.search_Template.sendKeys("YOURK_TEMPLATE");
		Thread.sleep(3000);
		loc.select_Template.click();
		Thread.sleep(3000);
		Scroll_Page.scroll_down_page(driver);
	}
	
	public static void roles_Details(WebDriver driver) throws Exception
	{
		Scroll_Page.scroll_down_page(driver);
		Thread.sleep(1000);
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		loc.expand_Role_Details.click();
		Thread.sleep(1000);
		loc.add_Role_Button.click();
		Thread.sleep(1000);
		loc.search_Role.sendKeys("BCAtesting");
		Thread.sleep(1000);
		loc.select_Role.click();
	}
	
	public static void user_Details_For_Roles_Section(WebDriver driver) throws Exception
	{
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		Thread.sleep(2000);
		loc.addButton_User_In_Roles_Details.click();
		Thread.sleep(1000);
		loc.select_userName_For_Roles_Details.click();
		
		Actions act=new Actions(driver);
		act.moveToElement(loc.user_Name_On_Roles_Section);
        act.click().build().perform();
		Thread.sleep(1000);
	}
	
	public static void document_investigation_details(WebDriver driver) throws Exception
	{
		Thread.sleep(2000);
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		loc.expand_Document_Investigation_Channels.click();
		Thread.sleep(1000);
		loc.channel_Type.click();
		Thread.sleep(1000);
	}
	public  static void gcp_document_investigation_details(WebDriver driver) throws Exception
	{
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		loc.gcp_Bucket_select.click();
		Thread.sleep(1000);
	}
	public static void google_drive_document_investigation_details(WebDriver driver,String user_Email) throws Exception
	{
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		loc.google_Drive_Select.click();
		loc.channel_Name.sendKeys("TESTGOOGLEDRIVE");
		loc.user_Email_for_google_drive.sendKeys(user_Email);		
		loc.upload_Service_Account_File.sendKeys("C:\\Users\\NTS-suwarna\\eclipse-workspace\\ChatBot\\Inputs_Files\\intellidocs-304911-16f0f75b8ed4.json");
		Thread.sleep(2000);
		loc.test_Connection_button.click();
		Thread.sleep(3000);
	}
	
	public static void check_connection_messages_and_click_on_ok_button(WebDriver driver) throws Exception
	{
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		if(driver.findElements(By.xpath("//*[text()='ok']//preceding::div[1]")).size()==1)
		{		
		System.out.println(loc.test_conn_success_or_error_msg.getText());
		}
		else
		{
			System.out.println(loc.test_conn_success_or_error_msg.getText());
		}
		loc.ok_button.click();
		Thread.sleep(1000);
	}
	
	public static void amazon_s3_document_investigation_details(WebDriver driver,String secret_key,String access_key,String bucket_region) throws Exception
	{
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		loc.amazon_s3_select.click();
		Thread.sleep(2000);
		loc.channel_Name.sendKeys("2299");
		Thread.sleep(2000);
		loc.secret_Key_ID.sendKeys(secret_key);
		Thread.sleep(2000);
		loc.access_Key_ID.sendKeys(access_key);
		Thread.sleep(2000);
		loc.bucket_Region.sendKeys(bucket_region);
		Thread.sleep(2000);
		loc.test_Connection_button.click();
		Thread.sleep(1000);
	}
	
	public static void api_configuration_Details(WebDriver driver) throws Exception
	{
		Thread.sleep(2000);
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		loc.expand_API_configuration_details.click();
		List<WebElement> able_to_access_api_or_not=driver.findElements(By.xpath("//*[text()=' You do not have permissions to add an API.']"));
	
		 if(able_to_access_api_or_not.size()==1)
         {
	      System.err.println("Able to Access");
         }
		 else
		 {
			 System.err.println("Access denied....");
		 }
	}
	
	public static void add_attribute_details_For_Free_Form_Project_Type(WebDriver driver, String search_Attribute) throws Exception
	{
		Scroll_Page.scroll_down_page(driver);
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		loc.add_Field_For_Attribute.click();
		Thread.sleep(1000);
		loc.search_Attribute.sendKeys(search_Attribute);
		Thread.sleep(2000);
		loc.select_Attribute.click();
	}
	
	public static void add_Entity_Details_For_Medical_Chart_Project(WebDriver driver, String search_Entity) throws Exception
	{
		Scroll_Page.scroll_down_page(driver);
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		loc.add_Entity_Button.click();
		Thread.sleep(1000);
		loc.search_Entity.sendKeys(search_Entity);
		Thread.sleep(1000);
		loc.select_HCC_Condition_Entity.click();
		Thread.sleep(1000);
		
	}
	
	public static void project_name_filed_validation(WebDriver driver,String projectName) throws Exception
	{
		String act_value=null;
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		loc.project_Name_Filed.sendKeys(projectName);
		Thread.sleep(1000);
		act_value=loc.project_Name_Filed.getText();
		Thread.sleep(1000);
		Verification_Functions.actual_text_data_Campare(act_value);
		
	}
	
	public static void lead_filed_validation(WebDriver driver,String searchLead) throws Exception
	{
		String act_value=null;
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		loc.click_on_Lead_filed.click();
		Thread.sleep(1000);
		loc.search_Lead.sendKeys(searchLead);
		Thread.sleep(1000);
	    act_value=loc.search_Lead.getText();
	    Verification_Functions.actual_text_data_Campare(act_value);
	}
	
	
	public static void start_date_filed_validation(WebDriver driver,String startDate) throws Exception
	{
		String act_value=null;
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		loc.project_Name_Filed.sendKeys("TEST");
		Thread.sleep(1000);
		loc.start_Date.sendKeys(startDate);
		Thread.sleep(1000);
		act_value=loc.start_Date.getText();
		Verification_Functions.actual_text_data_Campare(startDate,act_value);
		
	}
	
	public static void end_date_filed_validation(WebDriver driver,String startDate,String endDate) throws Exception
	{
		String act_value=null;
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		Thread.sleep(1000);
		loc.start_Date.sendKeys(startDate);
		Thread.sleep(1000);
		loc.end_Date.sendKeys(endDate);
		Thread.sleep(1000);
		act_value=loc.end_Date.getText();
		Verification_Functions.actual_text_data_Campare(act_value);
	}
	
	
	public static void document_Structure_filed_validation(WebDriver driver) throws Exception
	{
		String act_value=null;
		
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		loc.document_Structure_dropdown.click();
		Thread.sleep(1000);
		loc.select_Structured_Project_Type.click();
		Thread.sleep(1000);
		act_value=loc.project_Name_Filed.getText();
		Thread.sleep(1000);
		Verification_Functions.actual_text_data_Campare(act_value," Structured ");
		
		loc.document_Structure_dropdown.click();
		Thread.sleep(1000);
		loc.select_Semi_Structured_Project_Type.click();
		Thread.sleep(1000);
		act_value=loc.project_Name_Filed.getText();
		Verification_Functions.actual_text_data_Campare(act_value," Semi-Structured ");
		
		loc.document_Structure_dropdown.click();
		Thread.sleep(1000);
		loc.select_Free_Form_Project_Type.click();
		Thread.sleep(1000);
		act_value=loc.project_Name_Filed.getText();
		Thread.sleep(1000);
		Verification_Functions.actual_text_data_Campare(act_value," Free-Form ");

		loc.document_Structure_dropdown.click();
		Thread.sleep(1000);
		loc.select_Medical_Chart_Project_Type.click();
		Thread.sleep(1000);
		act_value=loc.project_Name_Filed.getText();
		Thread.sleep(1000);
		Verification_Functions.actual_text_data_Campare(act_value," Medical Chart ");
	 }
	
	
	public static void processing_Engine_filed_validation_for_Structured_Project(WebDriver driver,String projectName) throws Exception
	{  
		String act_value=null;
		
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		
		loc.document_Structure_dropdown.click();
		Thread.sleep(2000);
		loc.select_Structured_Project_Type.click();
		Thread.sleep(2000);
		
		loc.processing_Engine_Dropdown.click();
		Thread.sleep(2000);
		loc.nh_High_ProcessingEngine_For_Structure_project.click();
		Thread.sleep(2000);
		/*act_value=loc.nh_High_ProcessingEngine_For_Structure_project.getText();
		Verification_Functions.actual_text_data_Campare(act_value);*/
		
		loc.processing_Engine_Dropdown.click();
		Thread.sleep(2000);
		loc.nh_Low_ProcessingEngine_For_Structure_project.click();
		Thread.sleep(2000);
		/*act_value=loc.nh_Low_ProcessingEngine_For_Structure_project.getText();
		Verification_Functions.actual_text_data_Campare(act_value);*/
		
		loc.processing_Engine_Dropdown.click();
		Thread.sleep(2000);
		loc.brute_Force_ProcessingEngine_For_Structure_project.click();
		Thread.sleep(2000);
		/*act_value=loc.brute_Force_ProcessingEngine_For_Structure_project.getText();
		Verification_Functions.actual_text_data_Campare(act_value);*/
		
	 }
	
	public static void processing_Engine_filed_validation_for_Semi_Structured_Project(WebDriver driver,String projectName) throws Exception
	{  
		String act_value=null;
		
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		loc.document_Structure_dropdown.click();
		Thread.sleep(2000);
		loc.select_Semi_Structured_Project_Type.click();
		Thread.sleep(2000);
		
		loc.processing_Engine_Dropdown.click();
		Thread.sleep(2000);
		loc.trade_ProcessingEngine_For_SemiStructure_project.click();
		Thread.sleep(2000);
		/*act_value=loc.trade_ProcessingEngine_For_SemiStructure_project.getText();
		Verification_Functions.actual_text_data_Campare(act_value);*/
		
		loc.processing_Engine_Dropdown.click();
		Thread.sleep(2000);
		loc.returns_ProcessingEngine_For_SemiStructure_project.click();
		Thread.sleep(2000);
		/*act_value=loc.returns_ProcessingEngine_For_SemiStructure_project.getText();
		Verification_Functions.actual_text_data_Campare(act_value);*/
	 }
	
	
	 public static void processing_Engine_For_Free_From_Project(WebDriver driver,String projectName) throws Exception
	 {
		 Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
			loc.document_Structure_dropdown.click();
		 Thread.sleep(2000);
			loc.select_Free_Form_Project_Type.click();
		 Thread.sleep(2000);
		
		 try {
		       new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(loc.processing_Engine_Dropdown));
		       System.out.println("Element is clickable");
		     }
		catch(TimeoutException e) {
		       System.out.println("Element isn't clickable......Which means given field working as expected");
		    }
	 }
	 
	 public static void processing_Engine_For_Medical_Project(WebDriver driver,String projectName) throws Exception
	 {
		 Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
			loc.document_Structure_dropdown.click();
			Thread.sleep(1000);
			loc.select_Medical_Chart_Project_Type.click();  
			Thread.sleep(1000);
		
		 try {
		       new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(loc.processing_Engine_Dropdown));
		       System.out.println("Element is clickable");
		     }
		catch(TimeoutException e) {
		       System.out.println("Element isn't clickable......Which means given field working as expected");
		    }
	 }
	 
	 
	 public static void status_filed_validate(WebDriver driver) throws Exception
	 {
		 
		 Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		 Thread.sleep(1000);
		 loc.status_select.click();
		 Verification_Functions.check_statuses_enable_or_disable(driver, loc.status_select);
		 
	 }
	 
	 public static void document_auto_Assignment_filed_validate(WebDriver driver) throws Exception
	 {
		 Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		 Thread.sleep(1000);
		 loc.document_auto_assignment_select.click();
		 Verification_Functions.check_statuses_enable_or_disable(driver, loc.document_auto_assignment_select);
		 
	 }
	
	 
	 public static void straight_through_process_and_document_scrore_filed_validate(WebDriver driver) throws Exception
	 {
		 Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		 Thread.sleep(1000);
		 loc.straight_Through_Process_select.click();
		 Verification_Functions.check_statuses_enable_or_disable(driver, loc.straight_Through_Process_select);
		 Thread.sleep(1000);
		 loc.document_Score.sendKeys("99");
		 String act_value=loc.document_Score.getText();
		 Verification_Functions.actual_text_data_Campare(act_value);
		 
	 }
	 
	 public static void template_fields_validation(WebDriver driver) throws Exception
	 {
		 Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		 Thread.sleep(1000);
			loc.document_Structure_dropdown.click();
			Thread.sleep(1000);
			loc.select_Structured_Project_Type.click();
			Scroll_Page.scroll_down_page(driver);
			Thread.sleep(1000);
			loc.add_Template_button.click();
			Thread.sleep(1000);
			loc.search_Template.sendKeys("YOURK_TEMPLATE");
			String expect=loc.search_Template.getText();
			Thread.sleep(1000);
			loc.select_Template.click();
			Scroll_Page.scroll_down_page(driver);
			Thread.sleep(2000);
			String actual=loc.name_of_template.getText();
			Verification_Functions.actual_text_data_Campare(actual, expect);
			
	 }
	 
	 public static void roles_fields_validation(WebDriver driver) throws Exception
	 {

	     Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		 Scroll_Page.scroll_down_page(driver);
		 
		 Thread.sleep(1000);
		 loc.expand_Role_Details.click();
		 Thread.sleep(1000);
		 loc.add_Role_Button.click();
		 Thread.sleep(1000);
		 loc.search_Role.sendKeys("BCAtesting");
		 Thread.sleep(1000);
		 String expected="BCAtesting";
		 loc.select_Role.click(); 
		 Thread.sleep(2000);
		 String actual=loc.role_Name.getText();
		 Verification_Functions.actual_text_data_Campare(actual, expected);
	 }
	 
	 public static void create_Button(WebDriver driver) throws Exception
	 {
		 Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		 Thread.sleep(1000);
		 loc.create_button.click();
		 Thread.sleep(1000);
	 }
	 
	 public static void next_Button(WebDriver driver) throws Exception
	 {
		 Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		 Thread.sleep(1000);
		 loc.next_Button.click();
		 Thread.sleep(1000);
	 }
	 
	 public static void error_messages_validation(WebDriver driver) throws Exception
	 {
		 Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		 Scroll_Page.scroll_down_page_till_end(driver);
	
		 if(loc.error_msg_for_mandatory_attributes.getText().equalsIgnoreCase("Please add the attributes before creating the project."))
		 {
			 System.out.println("Please add the attributes before creating the project.");
		 }
		 else if(loc.error_msg_for_mandatory_attributes.getText().equalsIgnoreCase("Please add the template before creating the project."))
		 {
			 System.out.println("Please add the template before creating the project.");
		 }
		 else if(loc.error_msg_for_mandatory_attributes.getText().equalsIgnoreCase("Please check form data and role(s) cannot be empty"))
		 {
			 System.out.println("Please check form data and role(s) cannot be empty");
		 }
		 else if(loc.error_msg_for_mandatory_attributes.getText().equalsIgnoreCase("Please check form data and role(s) cannot be empty"))
		 {
			 System.out.println("Role cannot have empty users");
		 }
		 else if(loc.error_msg_for_mandatory_attributes.getText().equalsIgnoreCase("Role(s) cannot be empty"))
		 {
			 System.out.println("Role(s) cannot be empty");
		 }
		 
		 else if(loc.error_msg_for_mandatory_attributes.getText().equalsIgnoreCase("check form data"))
		 {
			 System.out.println("check form data");
		 }
		 Thread.sleep(3000);
	 }
	 
	 public static void cancel_details(WebDriver driver) throws Exception
	 {
		 Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		 Thread.sleep(1000);
		 loc.cancel_Button.click();
		 Thread.sleep(2000);
		 Verification_Functions.url_verification("https://alpha.neutrino-ai.com/#/home/project-management", driver.getCurrentUrl());
	 }
	 
	 public static void error_messages_for_blank_fileds_project_name_and_Lead_and_processing_engine(WebDriver driver) throws Exception
	 {
		 Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		 Thread.sleep(1000);
		 loc.project_Name_Filed.click();
		 Thread.sleep(1000);
		 loc.project_Name_Filed.sendKeys(Keys.TAB);
		 Thread.sleep(1000);
		 Verification_Functions.actual_text_data_Campare(loc.error_msg_for_Empty_Project_Name_Filed.getText(), "Can not be blank");
		 Thread.sleep(1000);
		 loc.click_on_Lead_filed.click();
		 Thread.sleep(1000);
		 Actions act=new Actions(driver);
		 act.moveToElement(loc.start_date_label).click().build().perform();
		 Verification_Functions.actual_text_data_Campare(loc.error_msg_for_Empty_lead_dropdown.getText(), "Can not be blank");
		 
		 loc.document_Structure_dropdown.click();
		 loc.select_Structured_Project_Type.click();
		 loc.processing_Engine_Dropdown.click();
		 act.moveToElement(loc.start_date_label).click().build().perform();
		 
		 Verification_Functions.actual_text_data_Campare(loc.error_msg_for_Empty_lead_dropdown.getText(), "Can not be blank");
	
		 Thread.sleep(2000);
		 
	 }
	 
	 public static void select_start_date_and_end_date_from_calendar_application(WebDriver driver) throws Exception
	 {
		 Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		 Thread.sleep(1000);
		 loc.calendar_app_for_start_date.click();
		 Thread.sleep(1000);
		 loc.select_start_date.click();
		 Thread.sleep(2000);
		 
		 loc.calendar_app_for_end_date.click();
		 Thread.sleep(1000);
		 loc.select_end_date.click();
		 Thread.sleep(2000);
     }
	 
	 public static void change_year_and_month_from_calendar_application(WebDriver driver) throws Exception
	 {
		 Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		 loc.calendar_app_for_start_date.click();
		 Thread.sleep(1000);
		 loc.month_year_filed_for_start_date_or_end_date.click();
		 Thread.sleep(1000);
		 loc.select_year_or_month_for_start_date.click();  //select year
		 Thread.sleep(1000);
		 loc.select_year_or_month_for_start_date.click();        //select month
		 Thread.sleep(1000);
		 loc.select_start_date.click();
		 
		 loc.calendar_app_for_end_date.click();
		 Thread.sleep(1000);
		 loc.month_year_filed_for_start_date_or_end_date.click();
		 Thread.sleep(1000);
		 loc.select_year_for_end_date.click();
		 Thread.sleep(1000);
		 loc.select_month_for_end_date.click();
		 Thread.sleep(1000);
		 loc.select_end_date.click();
     }
	 
	 public static void delete_user_from_role_section(WebDriver driver) throws Exception
	 {
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		Thread.sleep(1000);
		loc.remove_user_from_Roles_section.click();
		Thread.sleep(2000);
	 }
	 
}
