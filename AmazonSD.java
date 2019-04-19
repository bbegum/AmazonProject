package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.*;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AmazonSD {

    AmazonHomePage amazonHomePage = new AmazonHomePage();
    AmazonOutdoorsPage amazonOutdoorsPage = new AmazonOutdoorsPage();
    AmazonResultsPage amazonResultsPage = new AmazonResultsPage();
    AmazonSigninPage amazonSigninPage = new AmazonSigninPage();
    AmazonCreateaccountPage amazonCreateaccountPage = new AmazonCreateaccountPage();

    @Given("^I am on home page of amazon$")
    public void AssertAmazon(){
        Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more", SharedSD.getDriver().getTitle()); }

    @When("^I select Sports and Outdoors department dropdown$")
    public void selectOutdoors() throws InterruptedException {
        amazonHomePage.clickHamburgerButton();
        amazonHomePage.clickOutdoors();
        amazonHomePage.clickAllOutdoor();
    }

    @And("^I enter (.+) into search text field$")
    public void enterSearchText(String text){
        amazonOutdoorsPage.enterSearchText(text); }

    @And("^I click on search icon in amazon site$")
    public void clickSearch(){
        amazonOutdoorsPage.clickSearch(); }


    @Then("^I verify total search result value should be greater than (.+)$")
    public void verifyResults(int number) {

        boolean greaterThan200 = false;

        if (amazonResultsPage.getResultsNumber() > number) {
            greaterThan200 = true;
            Assert.assertTrue(greaterThan200);
            System.out.println("The results are greater than: " + number);
        } else {
            System.out.println("results are not greater than: " + number);
        }

    }

    @When("^I click on sign in button$")
    public void clickSignIn(){ amazonHomePage.hoveronAccounts();
        amazonHomePage.clickSignin();
    }

    @And("^I click on create your amazon account on login screen$")
     public void clickCreateAccount(){ amazonSigninPage.clickCreateAccount(); }

     @And("^I enter (name|email|password|re-enter-password) as (.+) on field on create account screen$")
    public void enterData(String field, String text){

        switch(field){
            case("name"):
                amazonCreateaccountPage.enterName(text);
                break;
            case ("email"):
                amazonCreateaccountPage.enterEmail(text);
                break;
            case("password"):
                amazonCreateaccountPage.enterPassword(text);
            case("re-enter-password"):
                amazonCreateaccountPage.enterCheckPassword(text);
                break;
        }
     }

     @And("^I click on create your amazon account button on create account screen$")
    public void clickCreateAccountButton() throws InterruptedException {
        amazonCreateaccountPage.clickSubmit();
        Thread.sleep(5000);

     }

     @Then("^I verify validation message header (.+)$")
    public void verifyValidationMessage(String text) throws InterruptedException {
         Assert.assertEquals(text, amazonCreateaccountPage.getErrorMessage());


     }




}
