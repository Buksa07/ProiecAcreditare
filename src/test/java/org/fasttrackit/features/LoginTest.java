package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void testValidLoginWithEmailAddress(){

        loginSteps.navigateToLogin();
        loginSteps.loginDetails("qa19team@yahoo.com", "aii123456?");
        loginSteps.clickRememberMe();
        loginSteps.clickLogin();
        loginSteps.checkIfLoggedIn("Hello qa19team (not qa19team? Log out)");
    }

    @Test

    public void testInvalidEmailLogin(){
        loginSteps.navigateToLogin();
        loginSteps.loginDetails("qa19team@yahoo", "aii123456?");
        loginSteps.clickRememberMe();
        loginSteps.clickLogin();
        loginSteps.checkIfInvalidLogin("ERROR: Invalid username. Lost your password?");
    }

    @Test
    public void testValidLoginWithUsername(){

        loginSteps.navigateToLogin();
        loginSteps.loginDetails("qa19team", "aii123456?");
        loginSteps.clickRememberMe();
        loginSteps.clickLogin();
        loginSteps.checkIfLoggedIn("Hello qa19team (not qa19team? Log out)");
    }
    @Test

    public void testInvaliPasswordLogin(){
        loginSteps.navigateToLogin();
        loginSteps.loginDetails("qa19team@yahoo", "aii12345678?");
        loginSteps.clickRememberMe();
        loginSteps.clickLogin();
    }



}
