package Day11_040921;

import Day9_040321.Reusable_Methods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class GoogleSearch_TestNG {
    /** capture search result for google**/
    //declare the global variable outside of annotation method
    WebDriver driver = null;

    //use before suite when you have multiple @test methods
    @BeforeSuite
    public void setupDriver() throws IOException, InterruptedException {
        //define the driver
        driver = Reusable_Methods.defineTheDriver();
    }//END OF DRIVER SET UP

    @Test (priority = 1)
    public void googleSearch() throws InterruptedException{
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);
        //enter keyword
        Reusable_Methods.sendKeysMethod(driver,"//*[@name='q']","Cars","Google Search");
        //submit on google search button
        Reusable_Methods.submitOnElement(driver,"//*[@name='btnK']","Google Search Button");
        Thread.sleep(2000);
    }//end of google search

    @Test (priority = 2)
    public  void captureSearchNumber(){
        String result = Reusable_Methods.captureText(driver,"//*[@id='result-stats']",0,"Google Search Results");
        String[] arrayResult = result.split(" ");
        System.out.println("Search number is " + arrayResult[1]);

    }//end of google search

    @AfterSuite
    public  void  closeBrowser(){
        driver.quit();
    }

}//end of class


