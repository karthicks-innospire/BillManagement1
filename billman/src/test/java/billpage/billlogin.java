package billpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_fac.base_fac;

public class billlogin extends base_fac {
	public billlogin() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ContentPlaceHolder1_login_userName")
	private WebElement username;
	@FindBy(id = "ContentPlaceHolder1_login_passWord")
	private WebElement password;
	@FindBy(id = "ContentPlaceHolder1_btnLogin")
	private WebElement btnlogin;
	@FindBy(linkText = "Bills / Invoice")
	private WebElement BillLink;
	@FindBy(xpath = "//div[@class='cell-right pad-rig-5 mar-top-3']/a")
	private WebElement addbill;
	@FindBy(xpath = "(//input[@type='file'])[1]")
	private WebElement fileupload;
	@FindBy(id = "txt-Invoice-Number")
	private WebElement invoiceno;
	@FindBy(id = "txt-Bill-Description")
	private WebElement billdesc;
	@FindBy(id = "slt-PaymentTerms")
	private WebElement paydropdown;
	@FindBy(id = "slt-BillCategory")
	private WebElement billcatdropdown;
	@FindBy(id = "txt-Notes")
	private WebElement billnote;
	@FindBy(xpath = "//a[@id='save-draft']/img")
	private WebElement nextbill;
	@FindBy(xpath = "//div[@class=\"div-col-70per\"]/div[3]/a")
	private WebElement btnsave;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement splitcheckbo;
	@FindBy(xpath = "//a[@title='Edit']")
	private WebElement Editdat;
	@FindBy(xpath = "//button[@id='btn-edit-ok']")
	private WebElement editOk;
	@FindBy(xpath = "//a[@title=\"Delete\"]")
	private WebElement Delete;
	@FindBy(xpath = "//a[@title='Attachment']")
	private WebElement Attach;
	@FindBy(id="attachment-close")
	private WebElement Attachclos;
	@FindBy(id = "txt-Amount")
	private WebElement Billamount;
	@FindBy(xpath = "//tbody[@id=\"tbl-split-body\"]/tr/td[2]/input")
	private WebElement splitdesc;
	@FindBy(xpath = "//span[@id='select2-oio2-container']")
	private WebElement splitdrop;
	@FindBy(xpath = "//tbody[@id=\"tbl-split-body\"]/tr/td[3]/input")
	private WebElement splitamount;
	@FindBy(xpath = "//tbody[@id=\"tbl-split-body\"]/tr/td[4]/i")
	private WebElement splitAdd;
	@FindBy(xpath = "//tbody[@id='tbl-split-body']/tr[2]/td[2]/input")
	private WebElement splitdesc1;
	@FindBy(xpath = "//tbody[@id='tbl-split-body']/tr[2]/td[3]/input")
	private WebElement splitamount1;
	
	@FindBy(xpath = "//a[@title=\"View Bill\"]")
	private WebElement viewBill;
	@FindBy(xpath="//i[@title=\"Close\"]")
	private WebElement closev;
	@FindBy(xpath = "//a[@title='Edit']")
	private WebElement edit;
	@FindBy(xpath = "//a[@title='Submit']")
	private WebElement submit;
	@FindBy(xpath="//a[@title='Save & submit']")
	private WebElement sapproval;
	@FindBy(xpath="//a[@title='Save Draft']")
	private WebElement ssave;
	@FindBy(xpath="//a[@title='Cancel']")
	private WebElement scancl;
	@FindBy(xpath = "//a[@title='Delete']")
	private WebElement delete;
	@FindBy(id="btn-delete-ok")
	private WebElement delOk;
	@FindBy(id="close-delete")
	private WebElement delcan;
	@FindBy(xpath ="//a[@title='Follow up/Invoice']")
	private WebElement follop;
	
	

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public WebElement getBillLink() {
		return BillLink;
	}

	public WebElement getAddbill() {
		return addbill;
	}

	public WebElement getFileupload() {
		return fileupload;
	}

	public WebElement getInvoiceno() {
		return invoiceno;
	}

	public WebElement getBilldesc() {
		return billdesc;
	}

	public WebElement getPaydropdown() {
		return paydropdown;
	}

	public WebElement getBillcatdropdown() {
		return billcatdropdown;
	}

	public WebElement getBillnote() {
		return billnote;
	}

	public WebElement getNextbill() {
		return nextbill;
	}

	public WebElement getBtnsave() {
		return btnsave;
	}
	public WebElement getBtnAppro()
	{
		return sapproval;
	}
	public WebElement getBtnCan()
	{
		return scancl;
	}
	public WebElement enterDataEdit() {
		return Editdat;
	}

	public WebElement editdataOk() {
		return editOk;
	}
	public WebElement getDelete()
	{
		return Delete;	
	}
	public WebElement getAttach()
	{
		return Attach;
	}
	public WebElement getAttaclo()
	{
		return Attachclos;
	}
	public WebElement getAmount() {
		return Billamount;
	}

	public WebElement getCheck() {
		return splitcheckbo;
	}

	public WebElement getSplitDrop() {
		return splitdrop;
	}

	public WebElement getSplitDes() {
		return splitdesc;
	}

	public WebElement getSplitamnt() {
		return splitamount;
	}

	public WebElement getAsplitamnt() {
		return splitAdd;
	}

	public WebElement getSplitDes1() {
		return splitdesc1;
	}

	public WebElement getSplitamnt1() {
		return splitamount1;

	}
	
	public WebElement getBview()
	{
		return viewBill;
	}
	public WebElement closeView()
	{
		return closev;
	}
	public WebElement getBsubmit()
	{
		return submit;
	}
	public WebElement getBedit()
	{
		return edit;
	}
	public WebElement getBdel()
	{
		return delete;
	}
	public WebElement getDelOK()
	{
		return delOk;
	}
	public WebElement getDelC()	
	{ return getDelC();	}
	public WebElement getViewAp()
	{return follop; }
}
