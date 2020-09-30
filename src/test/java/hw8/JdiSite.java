package hw8;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.ui.html.elements.common.Icon;
import hw8.data.entities.User;
import hw8.pages.JdiHomePage;
import hw8.pages.MetalsColorsPage;
import hw8.pages.forms.LoginForm;
import hw8.pages.sections.HeaderMenu;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JdiSite {

    @Url("index.html")
    @Title("Home Page")
    public static JdiHomePage jdiHomePage;

    @Url("/metals-colors.html")
    @Title("Metal and Colors")
    public static MetalsColorsPage metalsColorsPage;

    public static void open() {
        jdiHomePage.open();
    }

    @Css("#user-icon")
    public static Icon userIcon;

    @Css("#login-form")
    public static LoginForm loginForm;

    @Css("#user-name")
    public static UIElement userName;

    @Css(".uui-navigation.nav.navbar-nav.m-l8 li")
    public static HeaderMenu headerMenu;

    public static void login(User user) {
        jdiHomePage.login(user);
    }

}
