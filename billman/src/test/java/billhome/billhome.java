package billhome;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_fac.base_fac;

public class billhome extends base_fac {
	public billhome() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-Home")
	private WebElement Homep;
	@FindBy(xpath = "/div[@class='isc-manger-home-par-con-s1']/ul/li")
	private List<WebElement> Homekpi;
	@FindBy(id = "bill_KPI")
	private List<WebElement> Homekpi1;
	@FindBy(xpath = "//div[@class='div-col-70per']/div[2]/a")
	private WebElement uploadBill;
	@FindBy(xpath = "//a[@id='filter-toggle-btn']")
	private WebElement hfilter;
	@FindBy(xpath = "//a[@title='View Bill']")
	private WebElement viewBill;
	@FindBy(id="attachment-close")
	private WebElement closebill;
	@FindBy(xpath = "//a[@title='Edit']")
	private WebElement hEdit;
	@FindBy(xpath = "//a[@title='Delete']")
	private WebElement hDelete;
	@FindBy(id="btn-delete-ok")
	private WebElement hdelok;
	@FindBy(id="close-delete")
	private WebElement hdelcal;
	
	public WebElement homeP()
	{
		return Homep;
	}
	public List<WebElement> getHomekpi() {
		return Homekpi;
	}

	public List<WebElement> getHomeKpi1() {
		return Homekpi1;
	}

	public WebElement getUploadB() {
		return uploadBill;
	}

	public WebElement gethFilter() {
		return hfilter;
	}

	public WebElement getViewBill() {
		return viewBill;
	}
	public WebElement getCloseBill()
	{
		return closebill;
	}

	public WebElement getHedit() {
		return hEdit;
	}

	public WebElement getHdelete() {
		return hDelete;
	}
	public WebElement getHdelok()
	{
		return hdelok;
	}
	public WebElement getHdelCal()
	{
		return hdelcal;
	}

}
