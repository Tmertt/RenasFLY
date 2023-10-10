package e2e.stepDefinitions.Roman_2;

import com.github.javafaker.Faker;
import e2e.pages.Roman_2.LoginPage;
import e2e.pages.Roman_2.SignUpPage;
import e2e.utils.CommonMethods;
import e2e.utils.Constants;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SignUpSteps extends CommonMethods {

    private final SignUpPage signUpPage = new SignUpPage();
    private final Faker faker = new Faker();
    private final JavascriptExecutor jse = (JavascriptExecutor) driver;

    @When("user fills out a form with valid credentials")
    public void user_fills_out_a_form_with_valid_credentials() {
        signUpPage.enterUserFirstName(faker.name().firstName());
        signUpPage.enterUserLastName(faker.name().lastName());
        signUpPage.enterUserEmail(faker.internet().emailAddress());
        signUpPage.enterPhoneNumber(faker.phoneNumber().cellPhone());
        final String password = faker.
                internet().
                password(8,16,true,false,true);
        signUpPage.enterPassword(password);
        signUpPage.repeatPassword(password);
        jse.executeScript("window.scrollBy(0, 500);");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.implicitly_wait));
        signUpPage.clickMaleRadioButton();
    }

    @When("user fills out a form where password and password repeat fields do not match")
    public void user_fills_out_a_form_where_password_and_password_repeat_fields_do_not_match() {
        signUpPage.enterUserFirstName(faker.name().firstName());
        signUpPage.enterUserLastName(faker.name().lastName());
        signUpPage.enterUserEmail(faker.internet().emailAddress());
        signUpPage.enterPhoneNumber(faker.phoneNumber().cellPhone());
        signUpPage.enterPassword(faker.internet().password());
        signUpPage.repeatPassword(faker.internet().password());
    }
    @When("click sing up button")
    public void click_sing_up_button() {
        signUpPage.clickSingUpButton();
    }
    @Then("verify message “User Created”")
    public void verify_message_user_created() {
        Assert.assertTrue(signUpPage.isUserCreatedMessageVisible());
    }

    @Then("verify message “Password mismatch.”")
    public void verify_message_password_mismatch() {
        Assert.assertTrue(signUpPage.isPasswordMismatchMessageVisible());
    }
}

