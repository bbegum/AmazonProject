package framework;

import org.openqa.selenium.By;

public class AmazonCreateaccountPage extends BasePage {

    private By nameField = By.id("ap_customer_name");
    private By emailField = By.id("ap_email");
    private By passField = By.id("ap_password");
    private By checkPassField = By.id("ap_password_check");
    private By submitButton = By.id("continue");
    private By errorField = By.xpath("//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-none']/li/span']");
    private String errorMessage;

    public void enterName(String text){ setValue(nameField, text);}
    public void enterEmail(String text){ setValue(emailField, text);}
    public void enterPassword(String text){ setValue(passField, text);}
    public void enterCheckPassword(String text){ setValue(checkPassField, text);}
    public void clickSubmit(){clickOn(submitButton);}
    public String getErrorMessage(){errorMessage = getInnerHTML(errorField); return  errorMessage;}


}
