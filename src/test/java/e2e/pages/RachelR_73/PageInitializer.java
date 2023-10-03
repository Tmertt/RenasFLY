package e2e.pages.RachelR_73;

import e2e.pages.Taylan_1.APIWorkFlow;
import e2e.pages.Taylan_1.HomePage;
import e2e.pages.Taylan_1.LoginPage;
import e2e.pages.Taylan_1.MyProfilePage;

public class PageInitializer {
    public static e2e.pages.Taylan_1.HomePage homePage;
    public static e2e.pages.Taylan_1.LoginPage loginPage;
    public static e2e.pages.Taylan_1.APIWorkFlow apiWorkFlow;
    public static e2e.pages.Taylan_1.MyProfilePage myProfilePage;
    public static e2e.pages.RachelR_73.SignUpPage signUpPage;


    public static void initializeObjects() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        apiWorkFlow = new APIWorkFlow();
        myProfilePage = new MyProfilePage();
        signUpPage = new SignUpPage();
    }
}
