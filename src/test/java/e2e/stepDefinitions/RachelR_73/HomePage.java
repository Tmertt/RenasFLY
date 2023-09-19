package e2e.stepDefinitions.RachelR_73;

import e2e.pages.Taylan_1.RachelR_73.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage {
    @Given("User navigates to Login page and verifies title as {string}")
    public void user_navigates_to_login_page_and_verifies_title_as(String string) {
      PageInitializer.homePage.openLoginPage();
      PageInitializer.loginPage.loginToSystem();

    }
}
