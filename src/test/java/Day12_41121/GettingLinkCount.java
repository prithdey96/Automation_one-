package Day12_41121;

import Day7_032721.java.util.ArrayList;
import Day9_040321.Reusable_Methods;
import Reusable_Library.Abstract_Class;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

import static jxl.biff.FormatRecord.logger;

public class GettingLinkCount extends Abstract_Class {


    @Test
    public void SearchForACar() throws InterruptedException, IOException {
        WebDriver driver= Reusable_Methods.defineTheDriver();
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2500);
        //search for a car
        Reusable_Methods.sendKeysMethod(driver, "//*[@name='q']", "cars", "Search Field");
        //submit on google search button
        Reusable_Methods.submitOnElement(driver, "//*[@name='btnK']", "Google Search");
        Thread.sleep(3000);
    }//end of test 1

    @Test(dependsOnMethods = "SearchForACar")
    public void getSearchNumber() {
        String result = Reusable_Methods.captureText(driver, "//*[@id='result-stats']", 0,  "Google Search Result");
        String[] arrayResult = result.split(" ");
        logger.log(LogStatus.INFO, "My search number is " + arrayResult[1]);
    }//end of test 2






}// end of java class
