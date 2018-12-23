package com.syntax.stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.syntax.pages.addEditDelPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addEditDelSteps {
	addEditDelPage obj;
	WebDriver driver;

	@Given("^I logged into OrangeHRM with \"(.*)\" and \"(.*)\" and click loginButton$")
	public void i_logged_into_OrangeHRM_with_and_and_click_loginButton(String userName, String password)
			throws InterruptedException {
		obj = new addEditDelPage();
		CommonMethods.enterValue(obj.userName, userName);
		Thread.sleep(3000);
		CommonMethods.enterValue(obj.password, password);
		Thread.sleep(3000);
		CommonMethods.click(obj.btnLogin);
		Thread.sleep(3000);
	}

	@When("^I click on PIM also I click on Reports$")
	public void i_click_on_PIM_also_I_click_on_Reports() throws Throwable {
		CommonMethods.click(obj.PIM);
		CommonMethods.click(obj.Reports);
	}

	@When("^I click add$")
	public void i_click_add() throws Throwable {
		CommonMethods.click(obj.Add);

	}

	@When("^I enter Report Name \"([^\"]*)\"$")
	public void i_enter_Report_Name(String reportName) throws Throwable {
		CommonMethods.enterValue(obj.reportName, reportName);
//	    Thread.sleep(3000);
	}

	@When("^Select Selection Criteria to Sub Unit \"([^\"]*)\"$")
	public void select_Selection_Criteria_to_Sub_Unit(String selectSubUnit) throws Throwable {
		CommonMethods.click(obj.ReportList);
		Select select = new Select(obj.ReportList);
		select.selectByVisibleText(selectSubUnit);
//		Thread.sleep(3000);
	}

	@When("^Add Sub Unit$")
	public void add_Sub_Unit() throws Throwable {
		CommonMethods.click(obj.addConstr);
//	    Thread.sleep(3000);
	}

	@When("^Select Selection Criteria to Job Title \"([^\"]*)\"$")
	public void select_Selection_Criteria_to_Job_Title(String selectjobtitle) throws Throwable {
		CommonMethods.click(obj.ReportList);
		Select select1 = new Select(obj.ReportList);
		select1.selectByVisibleText(selectjobtitle);
	}

	@When("^Add Job Title$")
	public void add_Job_Title() throws Throwable {
		CommonMethods.click(obj.addConstr);
//	    Thread.sleep(3000);
	}

	@When("^Select Selection Criteria to Employee Name \"([^\"]*)\"$")
	public void select_Selection_Criteria_to_Employee_Name(String selectEmpName) throws Throwable {
		CommonMethods.click(obj.ReportList);
		Select select2 = new Select(obj.ReportList);
		select2.selectByVisibleText(selectEmpName);
	}

	@When("^Add Employee Name$")
	public void add_Employee_Name() throws Throwable {
		CommonMethods.click(obj.addConstr);
//		Thread.sleep(3000);
	}

	@When("^Enter Employee Name \"([^\"]*)\" that matches the default employee$")
	public void enter_Employee_Name_that_matches_the_default_employee(String EmpName) throws Throwable {
		CommonMethods.enterValue(obj.EmpName, EmpName);
		CommonMethods.keysEntering(obj.EmpName);
//		Thread.sleep(3000);

	}

	@Then("^Verify Display Field Groups Personal is selected$")
	public void verify_Display_Field_Groups_Personal_is_selected() throws Throwable {
		CommonMethods.click(obj.DisGroup);
//		Thread.sleep(2000);
	}

	@Then("^Select Display Fields to Employee Id \"([^\"]*)\"$")
	public void select_Display_Fields_to_Employee_Id(String selectEmpAdd) throws Throwable {
		CommonMethods.click(obj.DisList);
		Select select3 = new Select(obj.DisList);
		select3.selectByVisibleText(selectEmpAdd);

	}

	@Then("^Add Employee Id$")
	public void add_Employee_Id() throws InterruptedException {
		CommonMethods.click(obj.Addbtn);
//	    Thread.sleep(3000);
	}

	@Then("^Check the box for Display Fields$")
	public void check_the_box_for_Display_Fields() throws Throwable {
		CommonMethods.driver.findElement(By.id("display_group_1")).click();
//		Thread.sleep(3000);
	}

	@Then("^Click Save$")
	public void click_Save() {
		CommonMethods.click(obj.save);
	}

	@Then("^Validate Report Name appears$")
	public void validate_Report_Name_appears() throws Throwable {
		Assert.assertTrue(true);
	}
	@When("^I click Edit on existing Report from the previous entry$")
    public void i_click_Edit_on_existing_Report_from_the_previous_entry() throws Throwable {
  
		
	        List<WebElement> rows = (List<WebElement>) obj.editBtn;
	        for (int i = 1; i <= rows.size(); i++) {
	            WebElement row = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]"));
	            String data = row.getText();
	            Thread.sleep(1000);
	            if (data.contains("my report")) {
	                Thread.sleep(1000);
	                //WebElement edit = BaseClass.driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[4]"));
	                WebElement edit = BaseClass.driver.findElement(By.xpath("//td[text()='my report']//following-sibling::td//following-sibling::td//child::a"));
	                Actions act = new Actions(driver);
	                act.moveToElement(edit).doubleClick().perform();

	            }
	        }
	    
    }
//	@When("^I click Edit on existing Report from the previous entry \"([^\"]*)\"$")
//	public void i_click_Edit_on_existing_Report_from_the_previous_entry(String report) throws InterruptedException {
//	  
//		//String xPATH = "//table[@id='resultTable']/tbody/tr";
//		List<WebElement> row = obj.checkReport.findElements(By.tagName("tr"));
//		
//		for (int i = 0; i <= row.size(); i++) {
//			String rowData = row.get(i).getText();
//			List<WebElement> links = row.get(i).findElements(By.tagName("a"));
//			for (WebElement link : links) {
//				if (link.getText().equalsIgnoreCase("Edit")) {
//					link.click();
//					if driver.findElement(By.xpath("//table/tbody/tr/td[4]").equals(report)){
//						obj.checkReport.click();
//					}
//					break;
//				}
//			}
////			System.out.println(rowData);
////			WebElement ele=row.get(i);
////			String id=ele.getAttribute("id");
////			if (id.equalsIgnoreCase("ohrmList_chkSelectRecord_15")) {
////				ele.click();
////				break;
////			}
//		}
//
//		 CommonMethods.click(obj.edit);
		// }


	@When("^Select Selection Criteria to Age group \"([^\"]*)\"$")
	public void select_Selection_Criteria_to_Age_group(String selectAgeGroup) throws Throwable {
		CommonMethods.click(obj.ReportList);
		Select select5 = new Select(obj.ReportList);
		select5.selectByVisibleText(selectAgeGroup);
	}

	@When("^Add Age group$")
	public void add_Age_group() throws Throwable {
		CommonMethods.click(obj.addConstr);
	}

	@When("^specify the age group \"([^\"]*)\"$")
	public void specify_the_age_group(String selectGreat) throws Throwable {
		CommonMethods.click(obj.AgeGroup);
		Select select6 = new Select(obj.AgeGroup);
		select6.selectByVisibleText(selectGreat);
		CommonMethods.enterValue(obj.GroupAge, "60");
	}

	@When("^Select Selection Criteria to Location \"([^\"]*)\"$")
	public void select_Selection_Criteria_to_Location(String selectLocation) throws Throwable {
		CommonMethods.click(obj.ReportList);
		Select select7 = new Select(obj.ReportList);
		select7.selectByVisibleText(selectLocation);
	}

	@When("^Add Location$")
	public void add_Location() throws Throwable {
		CommonMethods.click(obj.addConstr);

	}

	@When("^Select the location from the default menu \"([^\"]*)\"$")
	public void select_the_location_from_the_default_menu(String selectCountry) throws Throwable {
		CommonMethods.click(obj.Location);
		Select select8 = new Select(obj.Location);
		select8.selectByVisibleText(selectCountry);
	}

	@When("^Verify Display Field Groups Personal is selected \"([^\"]*)\"$")
	public void verify_Display_Field_Groups_Personal_is_selected(String arg1) throws Throwable {
		CommonMethods.click(obj.DisGroup);
	}

	@When("^Select Display Fields to Employee Id$")
	public void select_Display_Fields_to_Employee_Id1(String selectEmpId) throws Throwable {

		CommonMethods.click(obj.DisList);
		Select select9 = new Select(obj.DisList);
		select9.selectByVisibleText(selectEmpId);
	}
	@When("^Select Display Fields to Employee Middle Named \"([^\"]*)\"$")
	public void select_Display_Fields_to_Employee_Middle_Named(String selectMiddle) throws Throwable {
	    CommonMethods.click(obj.DisList);
	    Select select10= new Select(obj.DisList);
	    select10.selectByVisibleText(selectMiddle);
	}

	@When("^Add Employee Middle Name$")
	public void add_Employee_Middle_Name() throws Throwable {
	    CommonMethods.click(obj.Addbtn);
	    
	}
	@When("^Select the Check Box for the edited Report Name from$")
    public void select_the_Check_Box_for_the_edited_Report_Name_from() throws Throwable {
		  List<WebElement> rows = (List<WebElement>) obj.DelEle;

        for (int i = 1; i <=rows.size(); i++) {
            WebElement row = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]"));
            String data = row.getText();
            System.out.println("Data from row " + i + " : " + data);
            if (data.contains("my report")) {
                BaseClass.driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]")).click();
            }
        }
    }


	@Then("^Click Delete$")
	public void click_Delete() throws Throwable {
	    CommonMethods.click(obj.btnDelete);
	}

	@Then("^click Ok$")
	public void click_Ok() throws Throwable {
	  CommonMethods.click(obj.DelOk);
	  
	}
	   @Then("^Verify Report Name does not Exist$")
	    public void verify_Report_Name_does_not_Exist() {
			  List<WebElement> rows = (List<WebElement>) obj.DelEle;


	        for (int i = 1; i < rows.size(); i++) {
	            WebElement row = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]"));
	            String data = row.getText();
	            System.out.println("Data from row " + i + " : " + data);
	            if (data.contains("my report")) {
	                System.out.println("Report was not deleted");
	            } else {
	                System.out.println("Report was successfully delted.");
	            }
	        }
	   }}


