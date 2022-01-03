package exam;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	@Given("Initialize driver and open chrome")
	public void initialize_driver_and_open_chrome() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inintalizing driver and i have opened chrome or any other browser");
	}

	@When("go to google.com")
	public void go_to_google_com() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("In the browser  i have opened the url google");
	}


	@Then("^search (.+)$")
	public void search(String searchitem) throws Throwable {
		System.out.println("i have search the "+searchitem+ "in the search bar");	
	}

}
