package e2e.stepDefinitions;

import e2e.pages.Roman_2.LoginPage;
import e2e.pages.Roman_2.SearchFlightPage;
import e2e.pages.Roman_2.SignUpPage;
import e2e.pages.Taylan_1.PageInitializer;
import e2e.utils.CommonMethods;
import e2e.utils.ConfigReader;
import e2e.utils.Constants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks extends CommonMethods {

    @Before
    public void initialize() {
        openAndLunchApplication();
    }
    @After
    public void teardown(Scenario scenario){

        byte[] pic;
        if (scenario.isFailed()) {
            pic = takeScreenShots("failed/" + scenario.getName());
        }else {
            pic = takeScreenShots("passed/" + scenario.getName());
        }
        scenario.attach(pic,"image/png", scenario.getName());

        //PageInitializer.myProfilePage.logout();
        closeBrowser();
    }
}
