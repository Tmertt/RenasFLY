package e2e.pages.Roman_2;

import e2e.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFlightPage extends CommonMethods {

    @FindBy(xpath = "//a[normalize-space(text())='Login']")
    private WebElement logIn;

    @FindBy(xpath = "//a[normalize-space(text())='Signup']")
    private WebElement signUp;

    @FindBy(xpath = "//h1[normalize-space(text())='Search Flight']")
    private WebElement searchFlightHeader;

    public SearchFlightPage() {
        PageFactory.initElements(driver,this);
    }

    public void goToLogIn() {
        this.logIn.click();
    }
    public void goToSignUp() {
        this.signUp.click();
    }

    public boolean isHeaderVisible() {
        return this.searchFlightHeader.isDisplayed();
    }
}
