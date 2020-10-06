

package Stepdef;

import Base_fac.base_fac;
import billpage.billlogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef extends base_fac {
	public static billlogin page;

	@Given("The user enter into the BillManagent URI")
	public void the_user_enter_into_the_bill_managent_uri() {
		base_fac.browserFac("chrome");
		base_fac.getUrl("https://testing.archarena.com/BillManagement/Login.aspx");
	}

	@When("The user Enter the Login Credentials")
	public void the_user_enter_the_login_credentials() {
		page = new billlogin();
		base_fac.sendValue(page.getUsername(), "bhoopathy@innospire.com");
		base_fac.sendValue(page.getPassword(), "1234");
	}

	@Then("The user click on login button")
	public void the_user_click_on_login_button() {
		base_fac.buttClick(page.getBtnlogin());
	}

	@When("The user  click on add button on Bill\\/Invoice list page")
	public void the_user_click_on_add_button_on_bill_invoice_list_page() {
		base_fac.buttClick(page.getBillLink());
		base_fac.snapShot(System.currentTimeMillis() + "BillInvoice");
		base_fac.buttClick(page.getAddbill());
	}

	@Then("The application views upload bills\\/Invoice page")
	public void the_application_views_upload_bills_invoice_page() {
		page = new billlogin();
		base_fac.sendValue(page.getFileupload(), "c:\\Users\\skarthick\\Downloads\\ISC EB Bill July20.pdf");
		base_fac.sendValue(page.getInvoiceno(), "1234");
		base_fac.sendValue(page.getBilldesc(), "EB Bill");
		base_fac.selectDropdownVtext(page.getPaydropdown(), "NET60");
		base_fac.selectDropdownVtext(page.getBillcatdropdown(), "Commercial");
		base_fac.sendValue(page.getBillnote(), "clear to pay");
		base_fac.snapShot(System.currentTimeMillis() + "uploadbill");
		base_fac.buttClick(page.getNextbill());
	}

	@Then("The user need to Select the particular bill to upload by clicking browse option or Drag and Drop or OCR")
	public void the_user_need_to_select_the_particular_bill_to_upload_by_clicking_browse_option_or_drag_and_drop_or_ocr() {
		page = new billlogin();
		base_fac.sendValue(page.getFileupload(), "c:\\Users\\skarthick\\Downloads\\Innospire Rent Invoice July 20.pdf");
		base_fac.sendValue(page.getInvoiceno(), "1235");
		base_fac.sendValue(page.getBilldesc(), "Rent Bill Invoice");
		base_fac.sendValue(page.getBillnote(), "clear to pay");
		base_fac.snapShot(System.currentTimeMillis() + "uploadbill1");

	}

	@Then("user need to fill in the vendor and account details and click save")
	public void user_need_to_fill_in_the_vendor_and_account_details_and_click_save() {
		page = new billlogin();
		base_fac.buttClick(page.getNextbill());
	}

	@When("user click edit option in bill\\/invoice page")
	public void user_click_edit_option_in_bill_invoice_page() {
		base_fac.buttClick(page.enterDataEdit());
		base_fac.buttClick(page.editdataOk());
	}

	@Then("user change the bill information")
	public void user_change_the_bill_information() {
		base_fac.sendValue(page.getBilldesc(), "Rent Bill Additional");
		base_fac.sendValue(page.getAmount(), "50000");
	}

	@Then("user save the changed bill details")
	public void user_save_the_changed_bill_details() throws InterruptedException {
		page = new billlogin();
		base_fac.snapShot(System.currentTimeMillis() + "updatebill");
		Thread.sleep(15000);
		base_fac.buttClick(page.getBtnsave());

	}

	@Given("The user already logged into the application and in upload bills\\/Invoice page")
	public void the_user_already_logged_into_the_application_and_in_upload_bills_invoice_page() {
		base_fac.buttClick(page.getBillLink());
	}

	@Then("need to click on the view option in the action of bill list and can able to Print or Download the file")
	public void need_to_click_on_the_view_option_in_the_action_of_bill_list_and_can_able_to_print_or_download_the_file() {
		base_fac.buttClick(page.getBview());
		base_fac.buttClick(page.closeView());
	}

	@When("the user need to split the amount")
	public void the_user_need_to_split_the_amount() {
		base_fac.buttClick(page.enterDataEdit());
		base_fac.sendValue(page.getAmount(), "50000");
		base_fac.buttClick(page.getCheck());
		base_fac.sendValue(page.getSplitDes(), "Stationary");
		base_fac.sendValue(page.getSplitamnt(), "25000");
		base_fac.buttClick(page.getAsplitamnt());
		base_fac.sendValue(page.getSplitDes1(), "Office Travel");
		base_fac.sendValue(page.getSplitamnt1(), "25000");
		base_fac.sendValue(page.getBillnote(), "Clear For Approval");

	}

	@Then("need to click on the checkbox split this amount to split the amount of the bill")
	public void need_to_click_on_the_checkbox_split_this_amount_to_split_the_amount_of_the_bill() {
		base_fac.snapShot("split" + System.currentTimeMillis());
		base_fac.buttClick(page.getBtnsave());
	}

	@When("the user need to view the bill")
	public void the_user_need_to_view_the_bill() {
		base_fac.buttClick(page.getBillLink());
	}

	@Then("on clicking view option,it displays the bills with information")
	public void on_clicking_view_option_it_displays_the_bills_with_information() {
		base_fac.buttClick(page.getBview());
		base_fac.buttClick(page.closeView());
	}

	@Given("The user already created a bill and saved")
	public void the_user_already_created_a_bill_and_saved() {
		System.out.println(driver.getTitle());
	}

	@When("the user need to edit the bill")
	public void the_user_need_to_edit_the_bill() {
		base_fac.buttClick(page.getBedit());
	}

	@Then("the user need to click on the edit option in the bills list and, by clicking on it displays the bills with information and the user now can able to edit the informations related to the bills and to finally click the save option to update the changes")
	public void the_user_need_to_click_on_the_edit_option_in_the_bills_list_and_by_clicking_on_it_displays_the_bills_with_information_and_the_user_now_can_able_to_edit_the_informations_related_to_the_bills_and_to_finally_click_the_save_option_to_update_the_changes() {
		page = new billlogin();
		base_fac.sendValue(page.getFileupload(), "c:\\Users\\skarthick\\Downloads\\ISC EB Bill July20.pdf");
		base_fac.sendValue(page.getInvoiceno(), "1234");
		base_fac.sendValue(page.getBilldesc(), "EB Bill");
		base_fac.selectDropdownVtext(page.getPaydropdown(), "NET60");
		base_fac.selectDropdownVtext(page.getBillcatdropdown(), "Commercial");
		base_fac.sendValue(page.getBillnote(), "clear to pay");
		base_fac.snapShot(System.currentTimeMillis() + "uploadbill");

	}

	@When("the user need to comment on the bill")
	public void the_user_need_to_comment_on_the_bill() {
		System.out.println("Comment");
	}

	@Then("the user need to click on the edit option in the bills list and it shows the comment option and the user by clicking on it can able to comment on the bill from the list")
	public void the_user_need_to_click_on_the_edit_option_in_the_bills_list_and_it_shows_the_comment_option_and_the_user_by_clicking_on_it_can_able_to_comment_on_the_bill_from_the_list() {
		System.out.println("Comment");
	}

	@When("the user need to save the bills\\/Invoice as a draft")
	public void the_user_need_to_save_the_bills_invoice_as_a_draft() {
		base_fac.buttClick(page.getBtnsave());
	}

	@Then("user need to click on the save as Draft option and the Bills\\/Invoice gets saved as the draft")
	public void user_need_to_click_on_the_save_as_draft_option_and_the_bills_invoice_gets_saved_as_the_draft() {
		base_fac.buttClick(page.getBillLink());
		base_fac.snapShot("basesnap" + System.currentTimeMillis());
	}

	@When("the user need to delete the bill")
	public void the_user_need_to_delete_the_bill() {
		base_fac.buttClick(page.getBdel());
		base_fac.buttClick(page.getDelOK());
	}

	@Then("the user need to click on the delete option in the bills list and the user by clicking on it can able to delete the bill from the list")
	public void the_user_need_to_click_on_the_delete_option_in_the_bills_list_and_the_user_by_clicking_on_it_can_able_to_delete_the_bill_from_the_list() {
		base_fac.snapShot("delete" + System.currentTimeMillis());
	}

}
