package hw8.tests;

import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.init.PageFactory;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import hw8.data.entities.User;
import hw8.JdiSite;
import static hw8.JdiSite.*;

public class LoginTest {

    @BeforeSuite
    public void beforeSuite() {
        PageFactory.initSite(JdiSite.class);
    }

    @AfterSuite
    public void afterSuite() {
        WebDriverUtils.killAllSeleniumDrivers();
    }

    @Test
    @Description("Opening site and logging, checking that's right user or not")
    public void loginTest() {

        open();
        login(User.ROMAN);

        jdiHomePage.checkUserLoggedIn(User.ROMAN);

    }

    @Step("Checking that user are logged in or not, if not - log in")
    public static  void LogIn() {
            open();
            if (!userName.isDisplayed()) {
                if (!loginForm.isDisplayed()) {
                    userIcon.click();
                }
                loginForm.submit(User.ROMAN);
            }
    }
}