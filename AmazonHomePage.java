package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;

public class AmazonHomePage extends BasePage {

    private By hamburgerMenu = By.id("nav-hamburger-menu");
    private By outdoorsButton = By.xpath("//div[contains(text(),'Sports & Outdoors')]");
    private By allOutdoors = By.xpath("//div[contains(text(),'All Outdoor Recreation')]");
    private By accountList = By.id("nav-link-accountList");
    private By signinButton= By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]");

    public void clickHamburgerButton(){
      clickOn(hamburgerMenu);
    }
    public void clickOutdoors() throws InterruptedException {
      scrollToView(outdoorsButton);
      Thread.sleep(2000);
      clickOn(outdoorsButton);
    }
    public void clickAllOutdoor(){
        clickOn(allOutdoors);
    }
    public void hoveronAccounts(){ hoverOver(accountList);}
    public void clickSignin(){clickOn(signinButton);}




}
