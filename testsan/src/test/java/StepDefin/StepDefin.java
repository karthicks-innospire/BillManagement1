package StepDefin;

import basefac.basefac;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefin extends basefac {

	@Given("User enter in the url {string}")
	public void user_enter_in_the_url(String string) {
		basefac.bro_fac("chrome");
		basefac.getUrl(string);
		basefac.snapShot(System.currentTimeMillis()+"HomePage");
	}

	@Given("User validate url title and url")
	public void user_validate_url_title_and_url() {
		System.out.println("Validate Url");
	}

	@When("user select gmail link")
	public void user_select_gmail_link() {
		System.out.println("Link Enable");
	}

	@Then("user landed into gmail page")
	public void user_landed_into_gmail_page() {
		System.out.println("landing gmail");
	}

}
