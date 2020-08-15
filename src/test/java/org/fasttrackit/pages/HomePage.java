package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa5.fasttrackit.org:8008/")

public class HomePage extends PageObject {

    @FindBy(css = ".menu-item-70")
    private WebElementFacade myAccountLink;

    @FindBy(css = ".account")
    private WebElementFacade loginLink;

    @FindBy(css = ".search-form .search-field")
    private  WebElementFacade searchField;

    @FindBy(css = ".search-form .searchsubmit")
    private WebElementFacade searchTopButton;

    @FindBy(css = ".menu-item-73")
    private WebElementFacade shopLink;



    @FindBy(css = ".entry-title a")
    private WebElementFacade helloText;



    @FindBy (css = "#mastheads button.searchsubmit")
    private WebElementFacade searchButton;

    @FindBy(css = "#menu-item-73")
    private WebElementFacade shopHeaderButton;

    @FindBy(css = ".bttn.read-more")
    private WebElementFacade readMoreButton;

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    public boolean checkLogOut(String text){
        return helloText.containsOnlyText(text);
    }

    public void insertSearchText(String text){ typeInto(searchField, text);
    }
    public void clickSearchButton(){
        clickOn(searchButton);
    }
    public void clickShopHeaderButton(){
        clickOn(shopHeaderButton);
    }
    public void clickOnReadMoreButton(){clickOn(readMoreButton);}



    public void clickMyAccount(){
        clickOn(myAccountLink);
    }


    public void setSearchField(String value){
        waitFor(searchField);
        typeInto(searchField, value);
    }
    public void clickOnSearchTopButton(){
        clickOn(searchTopButton);
    }

    public void clickShopButton(){
        clickOn(shopLink);
    }


}
