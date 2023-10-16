package e2e.stepDefinitions.Roman_2;
import e2e.pages.Roman_2.SearchFlightPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SearchFlightSteps {

    private final SearchFlightPage searchFlightPage = new SearchFlightPage();

    @Given("the user navigate to Sing Up page")
    public void the_user_navigate_to_sing_up_page() {
        searchFlightPage.goToSignUp();
    }
    @Given("the user navigate to Login page")
    public void the_user_navigate_to_login_page() {
        searchFlightPage.goToLogIn();
    }
    @Then("verify redirection to the Search Flight Page.")
    public void verify_redirection_to_the_search_flight_page() {
        Assert.assertTrue(searchFlightPage.isHeaderVisible());
    }
}
