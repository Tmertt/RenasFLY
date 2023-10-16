package e2e.pages.Roman_2;

import e2e.utils.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {

    @FindBy(xpath = "//input[@name='userEmail']")
    private WebElement email;

    @FindBy(xpath = "//input[@name='userPassword']")
    private WebElement password;

    @FindBy(xpath = "//button[normalize-space(text())='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[normalize-space(text())='Wrong Email Or Password']")
    private WebElement errorMessage;

    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    public void enterEmail (String email) {
        this.email.sendKeys(email);
    }

    public void enterPassword (String password) {
        this.password.sendKeys(password);
    }

    public void clickLoginButton(){
        this.loginButton.click();
    }

    public String getMessageText () {
        return this.errorMessage.getText();
    }


}
