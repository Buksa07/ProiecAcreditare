package org.fasttrackit.pages;

import net.bytebuddy.implementation.bind.annotation.Default;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementState;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa5.fasttrackit.org:8008/wp-login.php?loggedout=true")

public class AdminPage extends PageObject {

    @FindBy(id = "user_login")
    private WebElementFacade usernameField;

    @FindBy(id = "user_pass")
    private WebElementFacade passwordField;

    @FindBy(id = "wp-submit")
    private WebElementFacade loginButton;

    @FindBy(css = "#welcome-panel > div > h2")
    private WebElementFacade welcomeMessage;

    public void typeUserField(String email) {
        typeInto(usernameField, email);
    }

    public void typePassField(String pass) {
        typeInto(passwordField, pass);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }


}
