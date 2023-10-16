package e2e.pages.Roman_2;

import e2e.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends CommonMethods {


    @FindBy(xpath = "//input[@name='userFirstName']")
    private WebElement userFirstName;
    @FindBy(xpath = "//input[@name='userLastName']")
    private WebElement userLastName;
    @FindBy(xpath = "//input[@name='userEmail']")
    private WebElement userEmail;
    @FindBy(xpath = "//input[@name='userPhoneNumber']")
    private WebElement userPhoneNumber;
    @FindBy(xpath = "//input[@name='userPassword']")
    private WebElement userPassword;
    @FindBy(xpath = "//input[@name='userPasswordRepeat']")
    private WebElement userPasswordRepeat;
    @FindBy(xpath = "//input[@type='radio' and @value='MALE']")
    private WebElement maleRadioButton;
    @FindBy(xpath = "//button[normalize-space(text())='Sign Up']")
    private WebElement singUpButton;

    @FindBy(xpath = "//div[normalize-space(text())='User Created']")
    private WebElement userCreatedMessage;
    @FindBy(xpath = "//div[normalize-space(text())='Password Mismatch']")
    private WebElement passwordMismatchMessage;

    public SignUpPage() {
        PageFactory.initElements(driver, this);
    }

    public void enterUserFirstName(String firstName) {
        this.userFirstName.sendKeys(firstName);
    }

    public void enterUserLastName(String lastName) {
        this.userLastName.sendKeys(lastName);
    }

    public void enterUserEmail(String email) {
        this.userEmail.sendKeys(email);
    }

    public void enterPhoneNumber (String phoneNumber) {
        this.userPhoneNumber.sendKeys(phoneNumber);
    }

    public void enterPassword (String password) {
        this.userPassword.sendKeys(password);
    }

    public void repeatPassword (String repeatPassword) {
        this.userPasswordRepeat.sendKeys(repeatPassword);
    }

    public void clickMaleRadioButton(){
        this.maleRadioButton.click();
    }

    public void clickSingUpButton(){
        this.singUpButton.click();
    }

    public boolean isUserCreatedMessageVisible() {
        return this.userCreatedMessage.isDisplayed();
    }
    public boolean isPasswordMismatchMessageVisible () {
        return this.passwordMismatchMessage.isDisplayed();
    }

    public void fillOutSignUp (String firstName, String lastName, String email, String phoneNumber,
                               String password, String repeatPassword) {
        this.enterUserFirstName(firstName);
        this.enterUserLastName(lastName);
        this.enterUserEmail(email);
        this.enterPhoneNumber(phoneNumber);

        this.enterPassword(password);
        this.repeatPassword(repeatPassword);
    }
}
