package e2e.pages.RachelR_73;

import com.github.javafaker.Faker;
import e2e.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends CommonMethods {
    Faker faker=new Faker();
    public SignUpPage(){
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//a[@href='#/signup']")
    private WebElement signUp_Button;




    public void setSignUp_Button() {
        signUp_Button.click();
    }
}
