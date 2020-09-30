package hw8.pages.sections;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.complex.JList;

public class HeaderMenu extends JList<UIElement> {

    public void clickOnMenuItem(String nameItem) {
        for (UIElement item : this) {
            if (item.getText().equalsIgnoreCase(nameItem)) {
                item.click();
                break;
            }
        }
    }
}
