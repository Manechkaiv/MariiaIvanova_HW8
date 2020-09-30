package hw8.pages;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.complex.JList;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import hw8.pages.forms.MetalsColorsForm;

public class MetalsColorsPage extends WebPage {

    @Css(".panel-body-list.logs li")
    public JList<UIElement> logsList;

    @Css(".panel-body-list.results li")
    public JList<UIElement> resultsList;

    @Css(".form")
    public MetalsColorsForm metalsColorsForm;
}