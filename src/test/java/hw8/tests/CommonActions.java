package hw8.tests;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import com.epam.jdi.light.elements.init.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static hw8.JdiSite.jdiHomePage;
import hw8.JdiSite;

interface CommonActions {

    @BeforeSuite
    static void beforeSuite() {
        PageFactory.initSite(JdiSite.class);
        jdiHomePage.open();
    }

    @AfterSuite
    static void afterSuite() {
        killAllSeleniumDrivers();
    }
}