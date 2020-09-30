package hw8.pages.forms;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import hw8.data.entities.User;

public class LoginForm extends Form<User> {

    @Css("#name")
    public static TextField name;

    @Css("#password")
    public static TextField password;
}