package framework;

import org.openqa.selenium.By;

public class AmazonSigninPage extends BasePage {

    private By createAccountButton = By.xpath("//a[@id='createAccountSubmit']");

    public void clickCreateAccount(){clickOn(createAccountButton); }









}
