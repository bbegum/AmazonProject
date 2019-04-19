package framework;

import org.openqa.selenium.By;

public class AmazonOutdoorsPage extends BasePage {

    private By searchField = By.id("twotabsearchtextbox");
    private By searchButton = By.xpath("//input[@value='Go']");

    public void enterSearchText(String text){ setValue(searchField, text); }
    public void clickSearch(){ clickOn(searchButton); }


}
