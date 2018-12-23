package com.syntax.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class addEditDelPage extends BaseClass{

	

	@FindBy(id="txtUsername")
	public WebElement userName;

	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(id="btnLogin")
	public WebElement btnLogin;
	
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement PIM;
	
	@FindBy (id= "menu_core_viewDefinedPredefinedReports")
	public WebElement Reports;
	
	@FindBy (id ="btnAdd")
	public WebElement Add;
	
	@FindBy(id= "report_report_name")
	public WebElement reportName;
	
	@FindBy(id="report_criteria_list")
	public WebElement ReportList;
	
	@FindBy(id="btnAddConstraint")
	public WebElement addConstr;
	
	@FindBy(id="employee_name_empName")
	public WebElement EmpName;
	
	@FindBy(id="report_display_groups")
	public WebElement DisGroup;
	
	@FindBy(id="report_display_field_list")
	public WebElement DisList;
	
	@FindBy(id="btnAddDisplayField")
	public WebElement Addbtn;
	
	@FindBy(id="display_group_1")
	public WebElement CheckBox;
	
	@FindBy(id="btnSave")
	public WebElement save;
	

	@FindBy(xpath="//table[@id='resultTable']/tbody/tr")
    public WebElement editBtn;
	
//	@FindBy(xpath="//table[@id='resultTable']/tbody")
//	public WebElement checkReport;
	
	
	@FindBy(id="age_group_comparision")
	public WebElement AgeGroup;
	
	@FindBy(id="age_group_value1")
	public WebElement GroupAge;
	
	@FindBy(xpath="//tbody//tr[8]//td[4]")
	public WebElement edit;
	
	@FindBy(id="location")
	public WebElement Location;
	
	@FindBy(id="//table[@id='resultTable']/tbody/tr")
	public WebElement DelEle;
//	
	
	@FindBy (id="btnDelete")
	public WebElement btnDelete;
	
	@FindBy(id="dialogDeleteBtn")
	public WebElement DelOk;
	
	
	
	
	
	
	
	
//	@FindBy(id="")
//	public WebElement Validate;
	
	
	
	
	

	public addEditDelPage() {
		PageFactory.initElements(driver, this);
	}
	




}