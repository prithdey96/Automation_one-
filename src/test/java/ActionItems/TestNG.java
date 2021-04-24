package ActionItems;

import Day9_040321.Reusable_Methods;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestNG {

    //declare your global variables
    WebDriver driver = null;
    WritableWorkbook writableWorkbook = null;
    WritableSheet writableSheet = null;
    int rowCount = 0;


    //setup your driver on before suite
    @BeforeSuite
    public void preconditions() throws IOException, InterruptedException, BiffException {
        //set the driver using reusable method
        driver = Reusable_Methods.defineTheDriver();

        //Step1: locate the path for readable file that we created in excel
        Workbook readableBook = Workbook.getWorkbook(new File("src/main/resources/Express.xls"));

        //Step 2: create a writable workbook that will mimic the data from readable
        writableWorkbook = Workbook.createWorkbook(new File("src/main/resources/Express_Results.xls"), readableBook);

        //Ste3 : read everything from writable sheet
        writableSheet = writableWorkbook.getSheet(0);

        //Step 4: get the row count
        rowCount = writableSheet.getRows();
    }//end of preconditions

    @Test
    public void ExpressTest() throws WriteException, InterruptedException {
        for (int i = 1; i < rowCount; i++) {

            //List all values
            String Size = writableSheet.getCell(0, i).getContents();
            String Qty = writableSheet.getCell(1, i).getContents();
            String firstName = writableSheet.getCell(2, i).getContents();
            String Lastname = writableSheet.getCell(3, i).getContents();
            String Email = writableSheet.getCell(4, i).getContents();
            String phone = writableSheet.getCell(5, i).getContents();
            String streetAddress = writableSheet.getCell(6, i).getContents();
            String city = writableSheet.getCell(7, i).getContents();
            String ZipCode = writableSheet.getCell(8, i).getContents();
            String State = writableSheet.getCell(9, i).getContents();
            String ccNumber = writableSheet.getCell(10, i).getContents();
            String expMonth = writableSheet.getCell(11, i).getContents();
            String expYear = writableSheet.getCell(12, i).getContents();
            String cvvCode = writableSheet.getCell(13, i).getContents();

            //Step 1 :Navigate to express.com
            driver.navigate().to("https://www.express.com");
            Thread.sleep(1500);

            //Step 2 : close pop up
            Reusable_Actions.closePopupIfExist(driver, "//*[@id='closeModal']", logger, "close pop up");
            Thread.sleep(1000);

            //Step 3; Hover over to mens tab
            Reusable_Actions.mouseHover(driver, "//*[@href='/mens-clothing']", logger, "mens clothing");

            //Step 4: CLICK ON SWEATERS
            Reusable_Actions.clickOnElement(driver, "//*[text()='Sweatshirts & Hoodies']", logger, "Sweaters");
            Thread.sleep(2000);

            //5. CLICK FIRST SWEATER
            Reusable_Actions.clickOnElement(driver, "//*[text()='Soft Double Knit Bomber Sweatshirt']", logger, "Sweatshirt");
            Thread.sleep(1000);

            //6. CLICK  SIZE
            Reusable_Actions.clickOnElement(driver, "//*[text()='" + Size + "']", logger, "Size");

            //7. CLICK ADD TO BAG
            Reusable_Actions.clickOnElement(driver, "//*[text()='Add to Bag']", logger, "add to bag");

            //8. CLICK  VIEW BAG
            Reusable_Actions.clickOnElement(driver, "//*[text()='View Bag']", logger, "View bag");
            Thread.sleep(1000);

            //9: change the quantity
            Reusable_Actions.dropdownByText(driver, "//*[@id='qdd-0-quantity']", Qty, logger, "Quantity");

            //10 : click on check out
            Reusable_Actions.clickOnElement(driver, "//*[text()='Checkout']", logger, "Checkout");
            Thread.sleep(1000);

            //11: CLICK ON CHECKOUT AS GUEST
            Reusable_Actions.clickOnElement(driver, "//*text()='Checkout as Guest']", logger, "Check out as guest");
            Thread.sleep(1000);

            //12: enter first name
            Reusable_Actions.sendKeysMethod(driver, "", firstName,logger, "First Name");

            // 13. ENTER LAST NAME
            Reusable_Actions.sendKeysMethod(driver, "")


            //14. ENTER EMAIL


        }
    }//end of loop
}// end of java class