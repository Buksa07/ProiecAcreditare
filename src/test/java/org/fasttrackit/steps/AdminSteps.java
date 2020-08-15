package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AdminPage;
import org.junit.Assert;

public class AdminSteps {

    private AdminPage adminPage;

    @Step
    public void navigateToAdminPage() {
        adminPage.open();
    }

    @Step
    public void loginToAdminPage(String user, String password) {
        adminPage.typeUserField(user);
        adminPage.typePassField(password);
        adminPage.clickLoginButton();
        assert true;
    }

    @Step
    public void loginIvalidUserToAdminPage(String user, String password) {
        adminPage.typeUserField(user);
        adminPage.typePassField(password);
        adminPage.clickLoginButton();
        assert false;
    }


    @Step
    public void loginIvalidPasswordToAdminPage(String user, String password) {
        adminPage.typeUserField(user);
        adminPage.typePassField(password);
        adminPage.clickLoginButton();
        assert false;
    }
}