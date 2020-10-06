package Stepdef;

import Base_fac.base_fac;
import billhome.billhome;
import billpage.billlogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homestep extends base_fac {
	public static billhome homepob;
	public static billlogin page;

	@Given("The user already logged into the application and gets landed into homepage")
	public void the_user_already_logged_into_the_application_and_gets_landed_into_homepage() {
		homepob = new billhome();
		base_fac.buttClick(homepob.homeP());
		System.out.println("Home Page Options");
	}

	@When("the User need to view Homepage")
	public void the_user_need_to_view_homepage() {
//		page = new billlogin();
//		homepob =new billhome();
//		base_fac.browserFac("chrome");
//		base_fac.getUrl("https://testing.archarena.com/BillManagement/Login.aspx");
//		base_fac.sendValue(page.getUsername(), "bhoopathy@innospire.com");
//		base_fac.sendValue(page.getPassword(), "1234");
//		base_fac.buttClick(page.getBtnlogin());
		base_fac.snapShot("HomePage" + System.currentTimeMillis());
	}

	@Then("the homepage contains the KPIs of  Total\\/Approved\\/Unapproved\\/Rejected bills and lists of draft bills\\/Invoice")
	public void the_homepage_contains_the_kp_is_of_total_approved_unapproved_rejected_bills_and_lists_of_draft_bills_invoice() {
		System.out.println("Kpi");
	}

	@Given("Actions")
	public void actions() {
		System.out.println("Home Actions");	}

	@When("the user need to view the bills\\/Invoice of the vendor")
	public void the_user_need_to_view_the_bills_invoice_of_the_vendor() {
		homepob = new billhome();
		base_fac.buttClick(homepob.getViewBill());
		base_fac.buttClick(homepob.getCloseBill());

	}

	@Then("need to click on the view option in the action of bill list")
	public void need_to_click_on_the_view_option_in_the_action_of_bill_list() {
		base_fac.snapShot("viewBill" + System.currentTimeMillis());
	}

	@When("the user need to edit the bills of vendor")
	public void the_user_need_to_edit_the_bills_of_vendor() {
		System.out.println("The User Edit The Bills Of Vendor");
	}

	@Then("need to click on the edit option in the action of bill list")
	public void need_to_click_on_the_edit_option_in_the_action_of_bill_list() {
		homepob = new billhome();
		page = new billlogin();
		base_fac.buttClick(homepob.getHedit());
		base_fac.sendValue(page.getBillnote(), "Additional Information Bill Add");
		base_fac.buttClick(page.getBtnsave());
	}

	@When("the user need to delete the bills of vendor")
	public void the_user_need_to_delete_the_bills_of_vendor() {
		System.out.println("User Delete the bill of vendor");
	}

	@Then("need to click on the delete option in the action of bill list")
	public void need_to_click_on_the_delete_option_in_the_action_of_bill_list() {
		homepob = new billhome();
		base_fac.buttClick(homepob.getHdelete());
		base_fac.buttClick(homepob.getHdelok());
		base_fac.snapShot("DeleConf" + System.currentTimeMillis());
	}

	@When("the user need to followup the bills of vendor")
	public void the_user_need_to_followup_the_bills_of_vendor() {
		page = new billlogin();
		base_fac.buttClick(page.getBillLink());
		base_fac.buttClick(page.getAddbill());
		base_fac.sendValue(page.getFileupload(), "c:\\Users\\skarthick\\Downloads\\ISC EB Bill July20.pdf");
		base_fac.sendValue(page.getInvoiceno(), "1234");
		base_fac.sendValue(page.getBilldesc(), "EB Bill");
		base_fac.selectDropdownVtext(page.getPaydropdown(), "NET60");
		base_fac.selectDropdownVtext(page.getBillcatdropdown(), "Commercial");
		base_fac.sendValue(page.getBillnote(), "clear to pay");
		base_fac.snapShot(System.currentTimeMillis() + "uploadbill");
		base_fac.buttClick(page.getBtnsave());
		base_fac.buttClick(page.getBillLink());
		base_fac.buttClick(page.getBsubmit());
		base_fac.snapShot("Approvb" + System.currentTimeMillis());
		base_fac.buttClick(page.getBtnAppro());
		base_fac.snapShot("Approva" + System.currentTimeMillis());
		base_fac.buttClick(homepob.homeP());

	}

	@Then("need to click on the followup option in the action of bill list")
	public void need_to_click_on_the_followup_option_in_the_action_of_bill_list() {
		base_fac.buttClick(page.getViewAp());
		base_fac.snapShot("userapp" + System.currentTimeMillis());
	}

	@Given("resubmission")
	public void resubmission() {
		System.out.println("Resubmission");
	}

	@When("the user need to Resubmit the bills of vendor")
	public void the_user_need_to_resubmit_the_bills_of_vendor() {
		System.out.println("Sample Test");
	}

	@Then("need to click on the Resubmit option in the action of bill list")
	public void need_to_click_on_the_resubmit_option_in_the_action_of_bill_list() {
		System.out.println("Sample Test");
	}

	@Given("upload")
	public void upload() {
System.out.println("Home Page Upload");	}

	@When("the user clicks on Upload button on the Homepage")
	public void the_user_clicks_on_upload_button_on_the_homepage() {
		System.out.println("Sample Test");
	}

	@Then("the application displays upload bills\\/Invoice page and the user need to Select the particular bill to upload by clicking browse option or Drag and drop or OCR option")
	public void the_application_displays_upload_bills_invoice_page_and_the_user_need_to_select_the_particular_bill_to_upload_by_clicking_browse_option_or_drag_and_drop_or_ocr_option() {
		System.out.println("Sample Test");
	}

	@Then("to save the bill to upload in the application")
	public void to_save_the_bill_to_upload_in_the_application() {
		System.out.println("Sample Test");
	}

}
