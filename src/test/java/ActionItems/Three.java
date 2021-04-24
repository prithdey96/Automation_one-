package ActionItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Three {
    public static void main(String[] args) throws InterruptedException {


        //set the path to the driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //define the ChromeOptions arguments
        ChromeOptions options = new ChromeOptions();
        //maximize my driver
        options.addArguments("start-maximized");
        //set the driver to incognito(private)
        options.addArguments("incognito");
        //define the webDriver
        WebDriver driver = new ChromeDriver(options);

        //Array for Variables- declare the arraylist

        String[] Purchaseprice = new String[]{"50000","100000","150000"};
        String[] Downpayment = new String[]{"2000","4000","6000"};
        String[] Interestrate = new String[]{"4","5","6"};
        String[] PMI = new String[]{"0.5","0.6","0.7"};
        String[] startMonth = new String[]{"Mar","Apr","May"};
        String[] startYear = new String[]{"2021","2022","2023"};

        /**this is where the for loop starts with test cases **/

        for (int i = 0; i < Purchaseprice.length; i++) {


            //1.navigate to mcalc website
            driver.navigate().to("https://www.mlcalc.com");
            Thread.sleep(2000);

            //2.expected title of the page in auto loan calculator (should fail)
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Mortgage calculator")) {
                System.out.println("Title matches");
            } else {
                System.out.println("Title doesn't match." + actualTitle);
            }//end of condition

            //3.CLEAR AND ENTER THE PURCHASE PRICE
            WebElement purchaseP = driver.findElement(By.xpath("//*[@id='ma']"));
            //clear the previous data
            purchaseP.clear();
            //enter the new home value
            purchaseP.sendKeys(Purchaseprice[i]);


            //4.CLEAR AND ENTER THE DOWN PAYMENT
            WebElement downP = driver.findElement(By.xpath("//*[@id='dp']"));
            //clear the previous data
            downP.clear();
            //enter the new home value
            downP.sendKeys(Downpayment[i]);

            //5.CLEAR AND ENTER INTEREST RATE
            WebElement interestR = driver.findElement(By.xpath("//*[@id='ir']"));
            //clear the previous data
            interestR.clear();
            //enter the new home value
            interestR.sendKeys(Interestrate[i]);


            WebElement PM = driver.findElement(By.xpath("//*[@id='mi']"));
            //clear the previous data
            PM.clear();
            //enter the new home value
            PM.sendKeys(PMI[i]);

            //6.SELECT START MONTH FROM DROPDOWN- use select command
            WebElement startM = driver.findElement(By.xpath("//select[@id='sm']"));
            //select the locator using Select command
            Select dropdown = new Select(startM);
            //using by visible text command select month April
            dropdown.selectByVisibleText(startMonth[i]);


            // 7.SELECT START YEAR FROM DROPDOWN - use click twice
            WebElement startY = driver.findElement(By.xpath("//select[@id='sy']"));
            //click on dropout1
            startY.click();
            //click on dropdown1 value by text
            dropdown.selectByVisibleText(startYear[i]);


            //8. click on Calculate button
            driver.findElement(By.xpath("//input[@type='submit']")).click();

            //9. wait a few seconds
            Thread.sleep(2000);

            //10. CAPTURE MONTHLY PAYMENT AND PRINT OUT MONTHLY PAYMENT
            String mntPayment = driver.findElements(By.xpath())










        }// end of loop
    }//end of main method
}//end of java class
