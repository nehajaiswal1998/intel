package Tests;

import Utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Pages.Project_Module;

public class TC_For_Operator_User 
{
	WebDriver driver;
	Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
	
	@Test
	public void create_Structure_Type_Project_without_having_google_or_amazon_attachment_and_By_click_On_Create_Button() throws Exception
	{
		driver= Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
		LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
		
        
		if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
		{
			System.err.println("Unable to Access Project Module.......");
			driver.quit();
		}
		else
		{
		Project_Module.create_project_Button(driver);
		Project_Module.project_basic_details(driver);
		Project_Module.select_Project_Type(driver,"Structure");
		Project_Module.select_Processing_Engine(driver);
		Project_Module.statuses(driver,"Structure");
		Project_Module.template_Details(driver);
		Project_Module.roles_Details(driver);
		Project_Module.user_Details_For_Roles_Section(driver);
		Project_Module.document_investigation_details(driver);
		Project_Module.gcp_document_investigation_details(driver);
		Project_Module.api_configuration_Details(driver);
		Project_Module.create_Button(driver);
		Thread.sleep(2000);
		driver.quit();
		}
		
	}

	/*@Test
	public void create_Semi_Structure_Type_Project_without_having_google_or_amazon_attachment_and_By_click_On_Create_Button() throws Exception
	{
		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
		LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
		if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
		{
			System.err.println("Unable to Access Project Module.......");
			driver.quit();
		}
		else
		{
		Project_Module.create_project_Button(driver);
		Project_Module.project_basic_details(driver);
		Project_Module.select_Project_Type(driver,"Semi-Structure");
		Project_Module.select_Processing_Engine(driver);
		Project_Module.statuses(driver,"Semi-Structure");
     	Project_Module.roles_Details(driver);
     	Project_Module.user_Details_For_Roles_Section(driver);
		Project_Module.document_investigation_details(driver);
		Project_Module.gcp_document_investigation_details(driver);
		Project_Module.api_configuration_Details(driver);
		Project_Module.create_Button(driver);
		Thread.sleep(2000);
		driver.quit();
		}
	}
	
    @Test
	public void create_Free_Form_Type_Project_without_having_google_or_amazon_attachment_and_By_click_On_Create_Button() throws Exception
	{
		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
		LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
		if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
		{
			System.err.println("Unable to Access Project Module.......");
			driver.quit();
		}
		else
		{
		Project_Module.create_project_Button(driver);
		Project_Module.project_basic_details(driver);
		Project_Module.select_Project_Type(driver,"Free-Form");
		Project_Module.statuses(driver,"Free-Form");
		Project_Module.add_attribute_details_For_Free_Form_Project_Type(driver, "PatientName");
		Project_Module.roles_Details(driver);
		Project_Module.user_Details_For_Roles_Section(driver);
		Project_Module.document_investigation_details(driver);
		Project_Module.gcp_document_investigation_details(driver);
		Project_Module.api_configuration_Details(driver);
		Project_Module.create_Button(driver);
		Thread.sleep(2000);
		driver.quit();
		}
	}
	
	@Test
	public void create_Medical_Chart_Type_Project_without_having_google_or_amazon_attachment_and_By_click_On_Create_Button() throws Exception
	{
		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
		LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
		if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
		{
			System.err.println("Unable to Access Project Module.......");
			driver.quit();
		}
		else
		{
		Project_Module.create_project_Button(driver);
		Project_Module.project_basic_details(driver);
		Project_Module.select_Project_Type(driver,"Medical_Chart");
		Project_Module.statuses(driver,"Medical_Chart");
	    Project_Module.add_Entity_Details_For_Medical_Chart_Project(driver,"HCC Conditions");
		Project_Module.roles_Details(driver);
		Project_Module.user_Details_For_Roles_Section(driver);
		Project_Module.document_investigation_details(driver);
		Project_Module.gcp_document_investigation_details(driver);
		Project_Module.api_configuration_Details(driver);
		Project_Module.create_Button(driver);
		Thread.sleep(2000);
		driver.quit();
		}
	}	*/
		
		@Test
		public void verify_project_name_field() throws Exception
		{
			driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
			
			if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			{
				System.err.println("Unable to Access Project Module.......");
				driver.quit();
			}
			else
			{	
			Project_Module.create_project_Button(driver);
			Project_Module.project_name_filed_validation(driver, "ProjectDemo");
			Thread.sleep(2000);
			driver.quit();
			}
	     }
		
		@Test
		public void verify_Lead_Filed() throws Exception
		{
			driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
			
			
			if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			{
				System.err.println("Unable to Access Project Module.......");
				driver.quit();
			}
			else
			{	
			Project_Module.create_project_Button(driver);
			Project_Module.lead_filed_validation(driver, "qauser@gmail.com");
			Thread.sleep(2000);
			driver.quit();
			}
		}
		
		@Test
		public void verify_Start_Date_Filed() throws Exception
		{
			driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
			
			if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			{
				System.err.println("Unable to Access Project Module.......");
				driver.quit();
			}
			else
			{
			Project_Module.create_project_Button(driver);
			Project_Module.start_date_filed_validation(driver, "4/12/2022");
			driver.quit();
			Thread.sleep(2000);
			}
			
		}
		
		@Test
		public void verify_End_Date_Filed() throws Exception
		{
			driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
			
			if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			{
				System.err.println("Unable to Access Project Module.......");
				driver.quit();
			}
			else
			{
			Project_Module.create_project_Button(driver);
			Project_Module.end_date_filed_validation(driver, "4/10/2022","4/13/2022");
			Thread.sleep(2000);
			driver.quit();
			}
			
		}
		
		@Test
		public void verify_document_structure_type_Filed() throws Exception
		{
			driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
			
			if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			{
				System.err.println("Unable to Access Project Module.......");
				driver.quit();
			}
			else
			{
			Project_Module.create_project_Button(driver);
			Project_Module.document_Structure_filed_validation(driver);
			Thread.sleep(2000);
			driver.quit();
			}
			
		}
		
		@Test
		public void verify_processing_Engine_filed_for_Structured_Project() throws Exception
		{
			driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
			
			if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			{
				System.err.println("Unable to Access Project Module.......");
				driver.quit();
			}
			else
			{
			Project_Module.create_project_Button(driver);
			Project_Module.processing_Engine_filed_validation_for_Structured_Project(driver, "Structured");
			Thread.sleep(2000);
			driver.quit();
			}
			
		}
		
		@Test
		public void verify_processing_Engine_filed_for_Semi_Structured_Project() throws Exception
		{
			driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
			
			if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			{
				System.err.println("Unable to Access Project Module.......");
				driver.quit();
			}
			else
			{
			Project_Module.create_project_Button(driver);
			Project_Module.processing_Engine_filed_validation_for_Semi_Structured_Project(driver, "Semi_Structured");
			Thread.sleep(2000);
			driver.quit();
			}
		}
		
		@Test
		public void verify_processing_Engine_For_Medical_Project() throws Exception
		{
			driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
			
			if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			{
				System.err.println("Unable to Access Project Module.......");
				driver.quit();
			}
			else
			{
			Project_Module.create_project_Button(driver);
			Project_Module.processing_Engine_For_Medical_Project(driver, "Medical_Chart");
			Thread.sleep(2000);
			driver.quit();
			}
			
		}
		
		@Test
		public void verify_processing_Engine_For_Free_From_Project() throws Exception
		{
			driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
			
			if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			{
				System.err.println("Unable to Access Project Module.......");
				driver.quit();
			}
			else
			{
			Project_Module.create_project_Button(driver);
			Project_Module.processing_Engine_For_Medical_Project(driver, "Free_Form");
			Thread.sleep(2000);
			driver.quit();
			}
			
		}
		
		@Test
		public void verify_Status_Field() throws Exception
		{
			driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
			
			if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			{
				System.err.println("Unable to Access Project Module.......");
				driver.quit();
			}
			else
			{
			Project_Module.create_project_Button(driver);
			Project_Module.status_filed_validate(driver);
			Thread.sleep(2000);
			driver.quit();
			}
		}
		
		
		@Test
		public void verify_document_Auto_Assignment_Field() throws Exception
		{
			driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
			
			if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			{
				System.err.println("Unable to Access Project Module.......");
				driver.quit();
			}
			else
			{
			Project_Module.create_project_Button(driver);
			Project_Module.document_auto_Assignment_filed_validate(driver);
			Thread.sleep(2000);
			driver.quit();
			}
		
		}
		
		@Test
		public void verify_straight_through_process_and_document_scrore_filed() throws Exception
		{
			driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");

			if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			{
				System.err.println("Unable to Access Project Module.......");
				driver.quit();
			}
			else
			{
			Project_Module.create_project_Button(driver);
			Project_Module.straight_through_process_and_document_scrore_filed_validate(driver);
			Thread.sleep(2000);
			driver.quit();
			}
		}
		
		@Test
		public void verify_template_filed() throws Exception
		{
			driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
		
            if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			{
				System.err.println("Unable to Access Project Module.......");
				driver.quit();
			}
			else
			{
			Project_Module.create_project_Button(driver);
			Project_Module.template_fields_validation(driver);
			Thread.sleep(2000);
			driver.quit();
			}
		}
		
		@Test
		public void verify_roles_filed() throws Exception
		{
			driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver,"Operator@Test.com","Operator@111");
		   
            if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			{
				System.err.println("Unable to Access Project Module.......");
				driver.quit();
			}
			else
			{
			Project_Module.create_project_Button(driver);
			Project_Module.roles_fields_validation(driver);
			Thread.sleep(2000);
			driver.quit();
			}
		}
		
		
		@Test
		public void verify_project_page_url() throws Exception
		{
			driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
			
            if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			{
				System.err.println("Unable to Access Project Module.......");
				driver.quit();
			}
			else
			{
			Project_Module.create_project_Button(driver);
			String exp_url="https://alpha.neutrino-ai.com/#/home/project-management/create-project";
			String act_url=driver.getCurrentUrl();
			Verification_Functions.url_verification(act_url, exp_url);
			Thread.sleep(2000);
			driver.quit();
			}
            
            
		}
		
		@Test
		public void create_project_with_all_blank_details_By_click_On_Create_Button() throws Exception
		{
			driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
			
		   
	        if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			{
				System.err.println("Unable to Access Project Module.......");
				driver.quit();
			}
			else
			{
			Project_Module.create_project_Button(driver);
			Project_Module.create_Button(driver);
			Project_Module.error_messages_validation(driver);
			Thread.sleep(2000);
			driver.quit();
			}
		}
		
		@Test
    	public void create_project_with_blank_template_details_By_click_On_Create_Button() throws Exception
    	{
    		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
    		LoginUser.login_users(driver,"Operator@Test.com","Operator@111");
    		
    	   
            if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
    		{
    			System.err.println("Unable to Access Project Module.......");
    			driver.quit();
    		}
    		else
    		{
    		Project_Module.create_project_Button(driver);
    		Project_Module.project_basic_details(driver);
    		Project_Module.select_Project_Type(driver, "Structure");
    		Project_Module.create_Button(driver);
    		Project_Module.error_messages_validation(driver);
    		Thread.sleep(2000);
    		driver.quit();
    		}
		
    	}
		
		@Test
    	public void create_project_with_blank_roles_details_By_click_On_Create_Button() throws Exception
    	{
    		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
    		
    	   
            if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
    		{
    			System.err.println("Unable to Access Project Module.......");
    			driver.quit();
    		}
    		else
    		{
    		Project_Module.create_project_Button(driver);
    		Project_Module.project_basic_details(driver);
    		Project_Module.select_Project_Type(driver, "Structure");
    		Project_Module.select_Processing_Engine(driver);
    		Project_Module.statuses(driver,"Structure");
    		Project_Module.template_Details(driver);
    		Project_Module.create_Button(driver);
    		Project_Module.error_messages_validation(driver);
    		Thread.sleep(2000);
    		driver.quit();
    		}
        }
		
		@Test
    	public void create_project_with_blank_user_details_inside_the_roles_section_By_click_On_Create_Button() throws Exception
    	{
    		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
    		
            if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
    		{
    			System.err.println("Unable to Access Project Module.......");
    			driver.quit();
    		}
    		else
    		{
    		Project_Module.create_project_Button(driver);
    		Project_Module.project_basic_details(driver);
    		Project_Module.select_Project_Type(driver, "Structure");
    		Project_Module.select_Processing_Engine(driver);
    		Project_Module.statuses(driver,"Structure");
    		Project_Module.template_Details(driver);
    		Project_Module.roles_Details(driver);
    		Project_Module.create_Button(driver);
    		Project_Module.error_messages_validation(driver);
    		Thread.sleep(2000);
    		driver.quit();
    		}
        }
		
		@Test
	 	public void create_project_with_blank_processing_engine_details_By_click_On_Create_Button() throws Exception
	 	{
	 		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
	 		
	         if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
	 		{
	 			System.err.println("Unable to Access Project Module.......");
	 			driver.quit();
	 		}
	 		else
	 		{
	 		Project_Module.create_project_Button(driver);
	 		Project_Module.project_basic_details(driver);
	 		Project_Module.select_Project_Type(driver, "Structure");
	 		Project_Module.statuses(driver,"Structure");
	 		Project_Module.template_Details(driver);
	 		Project_Module.roles_Details(driver);
	 		Project_Module.user_Details_For_Roles_Section(driver);
	 		Project_Module.create_Button(driver);
	 		Project_Module.error_messages_validation(driver);
	 		Scroll_Page.scroll_up_page(driver);
	 		Thread.sleep(2000);
	 		driver.quit();
	 		}
	     
	     
		}
	     
	      @Test
	 	public void create_project_with_disable_status_details_By_click_On_Create_Button() throws Exception
	 	{
	 		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
	 		
	         if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
	 		{
	 			System.err.println("Unable to Access Project Module.......");
	 			driver.quit();
	 		}
	 		else
	 		{
	 			Project_Module.create_project_Button(driver);
	 	 		Project_Module.project_basic_details(driver);
	 	 		Project_Module.select_Project_Type(driver, "Structure");
	 	 		Project_Module.select_Processing_Engine(driver);
	 	 		Project_Module.template_Details(driver);
	 	 		Project_Module.roles_Details(driver);
	 	 		Project_Module.create_Button(driver);
	 	 		Project_Module.error_messages_validation(driver);
	 	 		Thread.sleep(2000);
	 	 		driver.quit();
	 		}
	     }
	      
	      @Test
	  	public void create_project_with_existing_project_name_By_click_On_Create_Button() throws Exception
	  	{
	  		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
	  		
	          if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
	  		{
	  			System.err.println("Unable to Access Project Module.......");
	  			driver.quit();
	  		}
	  		else
	  		{
	  			Project_Module.create_project_Button(driver);
	  	 		Project_Module.project_basic_details_with_existing_project_name(driver);
	  	 		Project_Module.select_Project_Type(driver, "Structure");
	  	 		Project_Module.select_Processing_Engine(driver);
	  	 		Project_Module.statuses(driver,"Structure");
	  	 		Project_Module.template_Details(driver);
	  	 		Project_Module.roles_Details(driver);
	  	 		Project_Module.user_Details_For_Roles_Section(driver);
	  	 		Project_Module.create_Button(driver);
	  	 		Project_Module.error_messages_validation(driver);
	  	 		Thread.sleep(2000);
	  	 		driver.quit();
	  		}
	      }
	      
	      @Test
	   	public void verify_cancel_button_funationality_for_any_data() throws Exception
	   	{
	   		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
	   		
	           if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
	   		{
	   			System.err.println("Unable to Access Project Module.......");
	   			driver.quit();
	   		}
	   		else
	   		{
	   		Project_Module.create_project_Button(driver);
	   		Project_Module.project_basic_details(driver);
	   		Project_Module.select_Project_Type(driver, "Structure");
	   		Project_Module.statuses(driver,"Structure");
	   		Project_Module.template_Details(driver);
	   		Project_Module.roles_Details(driver);
	   		Project_Module.cancel_details(driver);
	   		Thread.sleep(2000);
	   		driver.quit();
	   		}
	       
	       
	  	}    
	      @Test
	   	public void verify_error_Messages_for_empty_Project_Name_filed_and_lead_file_and_processing_engine() throws Exception
	   	{
	   		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
			LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
	   		
	           if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
	   		{
	   			System.err.println("Unable to Access Project Module.......");
	   			driver.quit();
	   		}
	   		else
	   		{
	   		Project_Module.create_project_Button(driver);
	   		Project_Module.error_messages_for_blank_fileds_project_name_and_Lead_and_processing_engine(driver);
	   		Thread.sleep(2000);
	   		driver.quit();
	   		}
	       }    		
	      
	      @Test
			public void create_project_with_all_blank_details_By_click_On_Next_Button() throws Exception
			{
				driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver,"Operator@Test.com","Operator@111");
				
			   
		        if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
				{
					System.err.println("Unable to Access Project Module.......");
					driver.quit();
				}
				else
				{
				Project_Module.create_project_Button(driver);
				Project_Module.next_Button(driver);
				Project_Module.error_messages_validation(driver);
				Thread.sleep(2000);
				driver.quit();
				}
			}
			
			@Test
	    	public void create_project_with_blank_template_details_By_click_On_Next_Button() throws Exception
	    	{
	    		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
	    		
	    	   
	            if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
	    		{
	    			System.err.println("Unable to Access Project Module.......");
	    			driver.quit();
	    		}
	    		else
	    		{
	    		Project_Module.create_project_Button(driver);
	    		Project_Module.project_basic_details(driver);
	    		Project_Module.select_Project_Type(driver, "Structure");
	    		Project_Module.next_Button(driver);
	    		Project_Module.error_messages_validation(driver);
	    		Thread.sleep(2000);
	    		driver.quit();
	    		}
			
	    	}
			
			@Test
	    	public void create_project_with_blank_roles_details_By_click_On_Next_Button() throws Exception
	    	{
	    		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver,"Operator@Test.com","Operator@111");
	    		
	    	   
	            if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
	    		{
	    			System.err.println("Unable to Access Project Module.......");
	    			driver.quit();
	    		}
	    		else
	    		{
	    		Project_Module.create_project_Button(driver);
	    		Project_Module.project_basic_details(driver);
	    		Project_Module.select_Project_Type(driver, "Structure");
	    		Project_Module.select_Processing_Engine(driver);
	    		Project_Module.statuses(driver,"Structure");
	    		Project_Module.template_Details(driver);
	    		Project_Module.next_Button(driver);
	    		Project_Module.error_messages_validation(driver);
	    		Thread.sleep(2000);
	    		driver.quit();
	    		}
	        }
			
			@Test
	    	public void create_project_with_blank_user_details_inside_the_roles_section_By_click_On_Next_Button() throws Exception
	    	{
	    		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
	    		
	            if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
	    		{
	    			System.err.println("Unable to Access Project Module.......");
	    			driver.quit();
	    		}
	    		else
	    		{
	    		Project_Module.create_project_Button(driver);
	    		Project_Module.project_basic_details(driver);
	    		Project_Module.select_Project_Type(driver, "Structure");
	    		Project_Module.select_Processing_Engine(driver);
	    		Project_Module.statuses(driver,"Structure");
	    		Project_Module.template_Details(driver);
	    		Project_Module.roles_Details(driver);
	    		Project_Module.next_Button(driver);
	    		Project_Module.error_messages_validation(driver);
	    		Thread.sleep(2000);
	    		driver.quit();
	    		}
	        }
			
			@Test
		 	public void create_project_with_blank_processing_engine_details_By_click_On_Next_Button() throws Exception
		 	{
		 		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
		 		
		         if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
		 		{
		 			System.err.println("Unable to Access Project Module.......");
		 			driver.quit();
		 		}
		 		else
		 		{
		 		Project_Module.create_project_Button(driver);
		 		Project_Module.project_basic_details(driver);
		 		Project_Module.select_Project_Type(driver, "Structure");
		 		Project_Module.statuses(driver,"Structure");
		 		Project_Module.template_Details(driver);
		 		Project_Module.roles_Details(driver);
		 		Project_Module.user_Details_For_Roles_Section(driver);
		 		Project_Module.next_Button(driver);
		 		Project_Module.error_messages_validation(driver);
		 		Scroll_Page.scroll_up_page(driver);
		 		Thread.sleep(2000);
		 		driver.quit();
		 		}
		     
		     
			}
			
			 @Test
			   	public void select_dates_from_calendar_application_without_changing_year_and_month() throws Exception
			   	{
			   		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
					LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
			   		
			   		
			           if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			   		{
			   			System.err.println("Unable to Access Project Module.......");
			   			driver.quit();
			   		}
			   		else
			   		{
			   		Project_Module.create_project_Button(driver);
			   		Project_Module.select_start_date_and_end_date_from_calendar_application(driver);
			   		Thread.sleep(2000);
			   		driver.quit();
			   		}
			       }    		

			 @Test
			   	public void select_dates_from_calendar_application_with_changing_year_and_month() throws Exception
			   	{
			   		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
					LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
			   		
			   		
			           if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
			   		{
			   			System.err.println("Unable to Access Project Module.......");
			   			driver.quit();
			   		}
			   		else
			   		{
			   		Project_Module.create_project_Button(driver);
			   		Project_Module.change_year_and_month_from_calendar_application(driver);
			   		Thread.sleep(2000);
			   		driver.quit();
			   		}
			       }    		
			 @Test
			   	public void verify_delete_functionality_for_user_on_Roles_Section() throws Exception
			   	{
				 driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
					LoginUser.login_users(driver, "Operator@Test.com","Operator@111");
				
		        if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
				{
					System.err.println("Unable to Access Project Module.......");
					driver.quit();
				}
				else
				{
				Project_Module.create_project_Button(driver);
				Project_Module.project_basic_details(driver);
				Project_Module.select_Project_Type(driver, "Structure");
				Project_Module.select_Processing_Engine(driver);
				Project_Module.statuses(driver,"Structure");
				Project_Module.template_Details(driver);
				Project_Module.roles_Details(driver);
				Project_Module.user_Details_For_Roles_Section(driver);
				Project_Module.delete_user_from_role_section(driver);
				Project_Module.create_Button(driver);
				Project_Module.error_messages_validation(driver);
				Thread.sleep(2000);
				driver.quit();
				}
		    }

	@Test
	public void create_Structure_Type_Project_having_google_drive_attachment_and_By_click_On_Create_Button() throws Exception
	{
		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
		LoginUser.login_users(driver, "di-admin@neutrinotechsystems.com", "Nts#admin@123");

		if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
		{
			System.err.println("Unable to Access Project Module.......");
			driver.quit();
		}
		else
		{
			Project_Module.create_project_Button(driver);
			Project_Module.project_basic_details(driver);
			Project_Module.select_Project_Type(driver,"Structure");
			Project_Module.select_Processing_Engine(driver);
			Project_Module.statuses(driver,"Structure");
			Project_Module.template_Details(driver);
			Project_Module.roles_Details(driver);
			Project_Module.user_Details_For_Roles_Section(driver);
			Project_Module.document_investigation_details(driver);
			Project_Module.google_drive_document_investigation_details(driver,"suwarnajungari@gmail.com");
			Project_Module.check_connection_messages_and_click_on_ok_button(driver);
			Project_Module.api_configuration_Details(driver);
			Project_Module.create_Button(driver);
			Thread.sleep(2000);
			driver.quit();
		}

	}

	@Test
	public void create_Structure_Type_Project_having_amazon_s3_attachment_and_By_click_On_Create_Button() throws Exception
	{
		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
		LoginUser.login_users(driver, "di-admin@neutrinotechsystems.com", "Nts#admin@123");

		if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
		{
			System.err.println("Unable to Access Project Module.......");
			driver.quit();
		}
		else
		{
			Project_Module.create_project_Button(driver);
			Project_Module.project_basic_details(driver);
			Project_Module.select_Project_Type(driver,"Structure");
			Project_Module.select_Processing_Engine(driver);
			Project_Module.statuses(driver,"Structure");
			Project_Module.template_Details(driver);
			Project_Module.roles_Details(driver);
			Project_Module.user_Details_For_Roles_Section(driver);
			Project_Module.document_investigation_details(driver);
			Project_Module.amazon_s3_document_investigation_details(driver,"Wmsp+0/+stE6dvgk3pAnObP38THQESOylCASX0V7","AKIAWKITVLWMKRADZH3O","us-east-1");
			Project_Module.check_connection_messages_and_click_on_ok_button(driver);
			Project_Module.api_configuration_Details(driver);
			Project_Module.create_Button(driver);
			Thread.sleep(2000);
			driver.quit();
		}

	}

	@Test
	public void create_Structure_Type_Project_having_google_drive_attachment_and_having_existing_projectName_and_By_click_On_Create_Button() throws Exception
	{
		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
		LoginUser.login_users(driver, "di-admin@neutrinotechsystems.com", "Nts#admin@123");

		if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
		{
			System.err.println("Unable to Access Project Module.......");
			driver.quit();
		}
		else
		{
			Project_Module.create_project_Button(driver);
			Project_Module.project_basic_details_with_existing_project_name(driver);
			Project_Module.select_Project_Type(driver,"Structure");
			Project_Module.select_Processing_Engine(driver);
			Project_Module.statuses(driver,"Structure");
			Project_Module.template_Details(driver);
			Project_Module.roles_Details(driver);
			Project_Module.user_Details_For_Roles_Section(driver);
			Project_Module.document_investigation_details(driver);
			Project_Module.google_drive_document_investigation_details(driver,"suwarnajungari@gmail.com");
			Project_Module.check_connection_messages_and_click_on_ok_button(driver);
			Project_Module.api_configuration_Details(driver);
			Project_Module.create_Button(driver);
			Thread.sleep(2000);
			driver.quit();
		}

	}

	@Test
	public void create_Structure_Type_Project_having_amazon_s3_attachment_and_having_existing_projectName_and_By_click_On_Create_Button() throws Exception
	{
		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
		LoginUser.login_users(driver, "di-admin@neutrinotechsystems.com", "Nts#admin@123");

		if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
		{
			System.err.println("Unable to Access Project Module.......");
			driver.quit();
		}
		else
		{
			Project_Module.create_project_Button(driver);
			Project_Module.project_basic_details_with_existing_project_name(driver);
			Project_Module.select_Project_Type(driver,"Structure");
			Project_Module.select_Processing_Engine(driver);
			Project_Module.statuses(driver,"Structure");
			Project_Module.template_Details(driver);
			Project_Module.roles_Details(driver);
			Project_Module.user_Details_For_Roles_Section(driver);
			Project_Module.document_investigation_details(driver);
			Project_Module.amazon_s3_document_investigation_details(driver,"Wmsp+0/+stE6dvgk3pAnObP38THQESOylCASX0V7","AKIAWKITVLWMKRADZH3O","us-east-1");
			Project_Module.check_connection_messages_and_click_on_ok_button(driver);
			Project_Module.api_configuration_Details(driver);
			Project_Module.create_Button(driver);
			Thread.sleep(2000);
			driver.quit();
		}

	}

	@Test
	public void verify_error_message_for_invalid_user_email_for_google_drive_section() throws Exception
	{
		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
		LoginUser.login_users(driver, "di-admin@neutrinotechsystems.com", "Nts#admin@123");

		if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
		{
			System.err.println("Unable to Access Project Module.......");
			driver.quit();
		}
		else
		{
			Project_Module.create_project_Button(driver);
			Project_Module.project_basic_details_with_existing_project_name(driver);
			Project_Module.select_Project_Type(driver,"Structure");
			Project_Module.select_Processing_Engine(driver);
			Project_Module.statuses(driver,"Structure");
			Project_Module.template_Details(driver);
			Project_Module.roles_Details(driver);
			Project_Module.user_Details_For_Roles_Section(driver);
			Project_Module.document_investigation_details(driver);
			Project_Module.google_drive_document_investigation_details(driver,"suwarnajungari@nutrinotechlabs.com");
			Project_Module.check_connection_messages_and_click_on_ok_button(driver);
			Project_Module.api_configuration_Details(driver);
			Project_Module.create_Button(driver);
			Thread.sleep(2000);
			driver.quit();
		}

	}

	@Test
	public void verify_error_message_for_invalid_key_details_for_amazon_s3_section() throws Exception
	{
		driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
		LoginUser.login_users(driver, "di-admin@neutrinotechsystems.com", "Nts#admin@123");

		if(driver.findElements(By.xpath("//*[text()=' Create Project ']")).size()==0)              //check project access
		{
			System.err.println("Unable to Access Project Module.......");
			driver.quit();
		}
		else
		{
			Project_Module.create_project_Button(driver);
			Project_Module.project_basic_details_with_existing_project_name(driver);
			Project_Module.select_Project_Type(driver,"Structure");
			Project_Module.select_Processing_Engine(driver);
			Project_Module.statuses(driver,"Structure");
			Project_Module.template_Details(driver);
			Project_Module.roles_Details(driver);
			Project_Module.user_Details_For_Roles_Section(driver);
			Project_Module.document_investigation_details(driver);
			Project_Module.amazon_s3_document_investigation_details(driver,"Wmsp+0/+stE6dvgk38THQESOylCASX0V7","AKIAWKITADZH3O","us-t-1");
			Project_Module.check_connection_messages_and_click_on_ok_button(driver);
			Project_Module.api_configuration_Details(driver);
			Project_Module.create_Button(driver);
			Thread.sleep(2000);
			driver.quit();
		}

	}
}
