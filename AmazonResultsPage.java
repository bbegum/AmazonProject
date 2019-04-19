package framework;

import org.openqa.selenium.By;

public class AmazonResultsPage extends BasePage {

    private By resultsField = By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]");
    private String resultstext;
    private int resultsNumber;

    public String  getresultsText(){ resultstext =  getTextFromElement(resultsField); return resultstext;}
    public int getResultsNumber(){ String[] text1 = getresultsText().split(" "); resultsNumber = Integer.parseInt(text1[2]);
    return resultsNumber;}


}
