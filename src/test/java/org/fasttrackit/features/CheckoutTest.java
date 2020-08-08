package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.CheckoutSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Steps
    private CartSteps cartSteps;
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CheckoutSteps checkoutSteps;



    @Test
    public void verifyCheckoutWithoutPhoneNumberTest(){
        loginSteps.login("qa19team@yahoo.com", "aii123456?",
                "Hello qa19team (not qa19team? Log out)");
        cartSteps.navigateToShop();
        cartSteps.addSpecificProductsToCart();
        cartSteps.navigateToCart();
        cartSteps.proceedToCheckout();
        checkoutSteps.invalidBillingInfo("qa", "19team", "United Kingdom (UK)",
                "28 Clifton Gardens", "London",
                "London","NW117EL","qa19team@yahoo.com");
        checkoutSteps.clickOnPlaceOrder();
        checkoutSteps.verifyImpossibleToCheckout("Billing Phone is a required field.");

    }
}
