package hw8.pages.forms;

import com.epam.jdi.light.elements.common.Label;
import com.epam.jdi.light.elements.complex.JList;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.ui.html.elements.common.Button;
import hw8.data.beans.MetalsAndColorsData;

import java.util.Arrays;

public class MetalsColorsForm extends Form<MetalsAndColorsData> {

    @Css("#summary-block .info-panel-section label")
    public JList<Label> summary;

    @Css("#elements-checklist label")
    public JList<Label> elements;

    @JDropdown(root = "div[ui='dropdown']",
            value = ".filter-option",
            list = "li",
            expand = ".caret")
    public Dropdown colors;

    @JDropdown(
            root = "div[ui='combobox']",
            value = "input",
            list = "li",
            expand = ".caret")
    public Dropdown metals;

    @JDropdown(root = "#vegetables",
            value = "#salad-dropdown > button",
            list = "li",
            expand = ".caret")
    public static Dropdown vegetables;

    @Css("button#submit-button")
    public Button submit;

    @Override
    public void fill(MetalsAndColorsData object) {
        for (Label radio : summary) {
            if (radio.getText().equals(String.valueOf(object.getSummary()[0])) || radio.getText().equals(String.valueOf(object.getSummary()[1]))) {
                radio.click();
            }
        }
        for (Label element : elements) {
            if (Arrays.asList(object.getElements()).contains(element.getText())) {
                element.click();
            }
        }
        colors.select(object.getColor());
        metals.select(object.getMetals());
        vegetables.select(vegetables.selected());
        for (String vegetable : object.getVegetables()) {
            vegetables.select(vegetable);
        }
    }


}
