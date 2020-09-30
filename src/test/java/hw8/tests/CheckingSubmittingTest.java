package hw8.tests;

import com.epam.jdi.light.elements.common.UIElement;
import hw8.data.beans.MetalsAndColorsData;
import hw8.pages.MetalsColorsPage;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class CheckingSubmittingTest {

        @Step("Result section contains correctly data")
        public static void checkResultSectionData(MetalsColorsPage metalsColorsPage, MetalsAndColorsData metalsAndColorsData) {
            List<String> results = metalsColorsPage
                    .resultsList
                    .stream()
                    .map(UIElement::getText)
                    .collect(Collectors.toList());
            Assert.assertEquals(results, metalsAndColorsData.expectedResultList());
        }
    }


