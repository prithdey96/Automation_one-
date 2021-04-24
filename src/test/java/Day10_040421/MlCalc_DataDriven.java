package Day10_040421;

import Day9_040321.Reusable_Methods;
import Reusable_Library.Abstract_Class;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class MlCalc_DataDriven {
    public static void main(String[] args) throws I0Exception, InterruptedException, BiffException {

//Step1: locate the path for readable file that we created in excel
        Workbook readableBook = Workbook.getWorkbook(new File("src/main/resources/Mlcalc_DataDriven.xls"));

//Step 2: accessing the excel sheet to read the data
        Sheet readableSheet = readableBook.getSheet(0);

//Step 3: create a writable workbook that will mimic the data from readable
        WritableWorkbook writableWorkbook = Workbook.createWorkbook(new File("src/main/resources/Mlcalc_DataDriven_Result.xls"),readableBook);

//Step 4: get the row count
        int rowCount = readableSheet.getRows();


    }// end of main method

}//end of java class
