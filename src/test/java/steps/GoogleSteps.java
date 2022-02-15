package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GooglePage;

public class GoogleSteps {

	GooglePage google = new GooglePage();

	@Given("^I am on the Google search page$")
	public void navigateToGoogle(){
		google.navigateToGoogle();
	}

	@When("^I enter a search criteria$")
	public void enterSearchCriteria(){
		google.enterSearchCriteria("Argentina");
	}
	@And("^click on the search button$")
	public void clickOnSearchButton(){
		google.clickGoogleSearch();
	}
	@Then("^the results match the criteria$")
	public void resultsMatched(){
		Assert.assertEquals("Expected text", google.firstResult());
	}

}
