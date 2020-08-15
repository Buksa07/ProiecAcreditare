package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.AdminSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class AdminTest extends BaseTest {

    @Steps
    private AdminSteps adminSteps;

    @Test
    public void loginAdmin() throws InterruptedException {
        adminSteps.navigateToAdminPage();
        adminSteps.loginToAdminPage("admin","parola11");
    }

    @Test
    public void loginInvalidAdminUser() throws InterruptedException {
        adminSteps.navigateToAdminPage();
        adminSteps.loginToAdminPage("admi","parola11");
    }

    @Test
    public void loginInvalidAdminPassword() throws InterruptedException {
        adminSteps.navigateToAdminPage();
        adminSteps.loginToAdminPage("admin","parola");
    }



}
