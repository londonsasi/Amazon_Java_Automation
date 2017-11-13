package com.amazan.in;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;

public class StepDef {

    Homepage home=new Homepage();
    SearchResultPage resultPage=new SearchResultPage();
    ProductDetailsPage detailsPage=new ProductDetailsPage();
    BasketPage basketPage = new BasketPage();

    @Given("^I am on amazon home page$")
    public void i_am_on_amazon_home_page() throws Throwable {
        //home.openBroweser();Before hook is handled to open browser with amazon url
    }

    @When("^I search for a product$")
    public void i_search_for_a_product() throws Throwable {
        home.searchForProduct();
    }

    @When("^I choose the first product$")
    public void i_choose_the_first_product() throws Throwable {
        resultPage.selectFirstProduct();
    }

    @Then("^I should see the product in the search result$")
    public void i_should_see_the_product_in_the_search_result() throws Throwable {
        Assert.assertTrue("Search result page", resultPage.searchResultPage());
    }

    @Then("^basket is updated with an item count$")
    public void basket_is_updated_with_an_item_count() throws Throwable {
        Assert.assertEquals("1", basketPage.getBasketItems());
    }

    @And("^I add product to basket$")
    public void i_add_product_to_basket() throws Throwable {
       detailsPage.addToBasket();
    }

}
