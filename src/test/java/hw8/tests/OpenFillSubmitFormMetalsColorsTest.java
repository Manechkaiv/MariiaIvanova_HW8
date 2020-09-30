package hw8.tests;

import hw8.data.TestDataProvider;
import hw8.data.beans.MetalsAndColorsData;
import org.testng.annotations.Test;

import static hw8.tests.CheckingSubmittingTest.*;
import static hw8.tests.LoginTest.LogIn;
import static hw8.JdiSite.*;

public class OpenFillSubmitFormMetalsColorsTest implements CommonActions {

    public static final String METALS_AND_COLORS = "Metals & Colors";

    @Test(dataProvider = "MetalsAndColors", dataProviderClass = TestDataProvider.class)
    public void testMetalsColorsPageOpeningFillingSubmitting(MetalsAndColorsData metalsAndColorsData) {

        LogIn();
        jdiHomePage.checkOpened();

        headerMenu.clickOnMenuItem(METALS_AND_COLORS);
        metalsColorsPage.checkOpened();

        metalsColorsPage.metalsColorsForm.fill(metalsAndColorsData);
        metalsColorsPage.metalsColorsForm.check(metalsAndColorsData);
        metalsColorsPage.metalsColorsForm.submit();

        checkResultSectionData(metalsColorsPage, metalsAndColorsData);

    }
}