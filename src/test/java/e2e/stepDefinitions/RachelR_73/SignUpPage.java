package e2e.stepDefinitions.RachelR_73;

import e2e.pages.RachelR_73.PageInitializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpPage {
    @Given("the user is on the SignUp page")
    public void the_user_is_on_the_sign_up_page() throws InterruptedException {
      //  PageInitializer.homePage.openLoginPage();


    }
    @And("the user clicks the Sign Up button")
    public void the_user_clicks_the_sign_up_button() {
        PageInitializer.signUpPage.setSignUp_Button();

    }

    @When("the user enters the following valid information:")
    public void the_user_enters_the_following_valid_information(io.cucumber.datatable.DataTable dataTable) {

    }
    @Then("the {string} banner message with a green background should appear")
    public void the_banner_message_with_a_green_background_should_appear(String string) {

    }
    @When("the user enters invalid email {string}")
    public void the_user_enters_invalid_email(String string) {

    }
    @Then("the user should see an error message {string}")
    public void the_user_should_see_an_error_message(String string) {

    }


    @When("the user enters an invalid phone number {string}")
    public void the_user_enters_an_invalid_phone_number(String string) {

    }
    @When("the user clicks the Sign Up button without filling in all mandatory fields")
    public void the_user_clicks_the_sign_up_button_without_filling_in_all_mandatory_fields() {

    }
    @Then("the user should see error messages for missing fields")
    public void the_user_should_see_error_messages_for_missing_fields() {

    }
    @When("the user enters different passwords in the Password and Password Repeat fields")
    public void the_user_enters_different_passwords_in_the_password_and_password_repeat_fields() {

    }

@When("the user enters a password with special characters {string}")
public void the_user_enters_a_password_with_special_characters(String string) {

        }



}
