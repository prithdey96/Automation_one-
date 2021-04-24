package ActionItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

public class Four {

    public static void main(String[] args) throws InterruptedException {


        //kill all chrome instances that are opened
//Runtime.getRuntime().exec("taskill /F /IM chromedriver.exe /T");
//set the path to the driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//define the chromeoptions arguments
        ChromeOptions options = new ChromeOptions();
//maximize my driver
        options.addArguments("start-maximized");
//set the driver to incognito(private)
        options.addArguments("incognito");
//set it to headless
//options.addArguments("headless");
//define the webdriver
        WebDriver driver = new ChromeDriver(options);


        ArrayList<String> FindLocationbyzip = new ArrayList<>();
        FindLocationbyzip.add("11373");
        FindLocationbyzip.add("11432");
        FindLocationbyzip.add("11485");

        ArrayList<String> LocationType = new ArrayList<>();
        LocationType.add("Post Office");
        LocationType.add("Collection Boxes");
        LocationType.add("Self-Service Kiosks");


        ArrayList<String> LocationMiles = new ArrayList<>();
        LocationMiles.add("40 miles");
        LocationMiles.add("50 miles");
        LocationMiles.add("60 miles");

        for (int i = 0; i < FindLocationbyzip.size(); i++) {


//1. navigate to USPS.com
            try {
                driver.navigate().to("https://www.usps.com");
            } catch (Exception e) {
                System.out.println("Unable to navigate to usps. " + e);
            }//end of navigate exception


//2. verify the title equals Welcome USPS
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Welcome | USPS")) {
                System.out.println("Title matches");
            } else {
                System.out.println("Title doesn't match." + actualTitle);
            }//end of condition


//3. hover to "send" tab using mouse actions
            //define the mouse actions
            Actions mouseActions = new Actions(driver);
            //hover to send tab
            try {
//store your element as WebElement
                WebElement send = driver.findElement(By.xpath(String.valueOf(By.linkText("Send"))));
                //move your mouse actions to send tab dropdown to appear //you always end your mouse actions with .perform()
                mouseActions.moveToElement(send).perform();
            } catch (Exception e) {
                System.out.println("Unable to hover to send. " + e);
            }//end of send exception


//4. click on "find USPS locations"
            try {
                //store your element as WebElement
                WebElement USPSlocation = driver.findElement(By.linkText("Find USPS Locations"));
                mouseActions.moveToElement(USPSlocation).click().perform();
            } catch (Exception e2) {
                System.out.println("Unable to click on find USPS location. " + e2);
            }//end of track a package exception
            Thread.sleep(3000);


//5.on find a location dropdown enter the desire zip code from your array list...
            try {
                //store your element as WebElement
                WebElement ZipCode = driver.findElement(By.id("city-state-input"));
                mouseActions.moveToElement(ZipCode).click().sendKeys("11373").perform();
            } catch (Exception e3) {
                System.out.println("Error " + e3); }


//6.choose a location type from a dropdown based on your array list
            try {
                //store your element as WebElement
                WebElement Locationtype = driver.findElement(By.id("post-offices-select"));
                mouseActions.moveToElement(Locationtype).click().perform();
            } catch (Exception e4) {
                System.out.println("Error" + e4);


//7. choose a desired mile from dropdown
                try {
                    //store your element as WebElement
                    WebElement Mile = driver.findElement(By.id("within-select"));
                    mouseActions.moveToElement(Mile).click().perform();
                } catch (Exception e5) {
                    System.out.println("Error" + e5);

// 8. click on search button
                    try {
                        driver.findElement(By.id("searchLocations")).click();
                    } catch (Exception e6) {
                        System.out.println("Error" + e6); }


//Steps 9-11 from bottom (PUT TRY/CATCH FOR WEB ELEMENT LINK)
                    ArrayList<WebElement> links = new ArrayList<>(driver.findElements(By.xpath("//div[@class='list-item-location popover-trigger']")));

                    if (i == 0) {
                        links.get(0).click();

                    } else if (i == 1) {
                        links.get(1).click();
                    } else if (i == 2)
                        try {
                            links.get(2).click();
                        } catch (Exception f) {
                            System.out.println("Error:" + f); }

                    try {
                        String Address = driver.findElement(By.xpath("//div[@class='address-wrapper']")).getText();
                        System.out.println("for zip code " + FindLocationbyzip.get(i) + "the address is" + Address);

                    } catch (Exception g) {
                        System.out.println("Error" + g); }

                    try {
                        String Hour = driver.findElement(By.xpath("//div[@class='hours-flex-section']")).getText();
                        System.out.println(Hour);

                    } catch (Exception h) {
                        System.out.println("Error" + h); }
                } }




        }//end of for loop
    }//end of main method
}//end of java class




/*
1. navigate to usps.com
2. verify the title equals Welcome USPS
3. hover to "send" tab using mouse actions
4. click on "find USPS locations"
5. on find a location dropdown enter the desire zip code from your array list...
6. choose a location type from a dropdown based on your array list
7. choose a desired mile from dropdown
8. click on search button
9. iteration 1 click on the first link using findElements with common class group
iteration 2- click on the second link using findElements with common class group
iteration 3- click on the 3rd link using findElements
10. once the link is clicked, capture the address and print out address
11. capture the house as separate webElement and print out the hours
 */