package e2e.stepDefinitions.Roman_2;

import com.github.javafaker.Faker;
import e2e.pages.Roman_2.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class LoginSteps {

    private final LoginPage loginPage = new LoginPage();
    private final Faker faker = new Faker();

    @When("fill out the login form fields entering valid email and password")
    public void fill_out_the_login_form_fields_entering_valid_email_and_password() {
        // Instead of use hard code values we also can put in Configuration.properties file and use ConfigReader Util
        loginPage.enterEmail("this.bughunter@gmail.com");
        loginPage.enterPassword("1234Qwer");
    }

    @When("fill out the login form fields entering invalid email and password")
    public void fill_out_the_login_form_fields_entering_invalid_email_and_password() {
        loginPage.enterEmail(faker.internet().emailAddress());
        loginPage.enterPassword(faker.internet().password());

    }
    @When("click on login button")
    public void click_on_login_button() {
        loginPage.clickLoginButton();
    }
    @Then("verify “Wrong Email Or Password” message")
    public void verify_wrong_email_or_password_message() {
        Assert.assertEquals("Wrong Email Or Password", loginPage.getMessageText());
    }
}
