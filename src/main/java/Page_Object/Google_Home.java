package Page_Object;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_Home extends  Abstract_Class {


    //Constructor method is when a child sub class having identical
// name a parent class


    //call logger so you may use it
    ExtentTest logger;

    //Constructor
    public Google_Home(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //define all the WebElement you need using @Findby concept
    @FindBy(xpath = "//*[@name='q']")
    WebElement googleSearch;

    @FindBy(xpath = "//*[@name='btnK']")
    WebElement googleSearchButton;

    //create a method for google search
    public void EnterKeywordOnGoogleSearch(String userValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, googleSearch, userValue, logger, "Google Search");
    }//end of google search

    //create a method for google search button
    public void SubmitOnGoogleSearchButton() {
        Reusable_Actions_PageObject.submitOnElement(driver, googleSearchButton, logger, "Google Search button");
    }//end of google search


}// end of java class
