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

    }
    @Test
    public void verifyCheckoutTest(){
        loginSteps.login("qa19team@yahoo.com", "aii123456?",
                "Hello qa19team (not qa19team? Log out)");
        cartSteps.navigateToShop();
        cartSteps.addSpecificProductsToCart();
        cartSteps.navigateToCart();
        cartSteps.proceedToCheckout();
        checkoutSteps.validBillingInfo("Paul", "Ionut", "United Kingdom (UK)",
                "28 Clifton Gardens", "London",
                "London","NW117EL","+47451234456","qa19team@yahoo.com");
        checkoutSteps.clickOnPlaceOrder();
        checkoutSteps.equals("Thank you. Your order has been received.");

    }
}
