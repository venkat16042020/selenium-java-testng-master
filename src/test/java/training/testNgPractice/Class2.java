package training.testNgPractice;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

public class Class2 {
    @DataProvider(name = "ReadUserData1")
    public Object[][] abc(){
        return new Object[][]    {{"John"}, {"Biden"}, {"Anwer"}};
    }

    @DataProvider(name = "ReadUserData2")
    public Object[][] def(){
        return new Object[][]    {{"John", "Charlie"},
                {"Biden", "Trump"}, {"Anwer", "Malik"}};
    }

    @DataProvider(name = "ReadUserData3")
    public Object[][] ghi(){
        return new Object[][]{{2, 3 , 5}, {5, 7, 9}};
    }

    @DataProvider (name = "data-provider")
    public Object[][] dpMethod (Method m){
        switch (m.getName()) {
            case "Sum":
                return new Object[][] {{2, 3 , 5}, {5, 7, 12}};
            case "Diff":
                return new Object[][] {{2, 3, -1}, {5, 7, -2}};
        }
        return null;
    }


    @DataProvider(name = "ReadExcelData1")
    public static Object[][] readExcelData() throws IOException
    {
        String fileLocation="src/test/java/org/xproject/learnSeleniumAndJava/testNgPractice/CityAndPincodes.xlsx";
        FileInputStream file = new FileInputStream(fileLocation);

        //Create Workbook instance holding reference to .xlsx file
        XSSFWorkbook wb = new XSSFWorkbook(file);

        //Get first/desired sheet from the workbook
        XSSFSheet worksheet = wb.getSheetAt(0);
        int rowNum = worksheet.getPhysicalNumberOfRows();// count my number of Rows
        int colNum= worksheet.getRow(0).getLastCellNum(); // get column count
       
        Object data[][]= new Object[rowNum-1][colNum]; // pass my  count data in array
        XSSFRow row;
        XSSFCell cell;
        DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale

        for(int i=0; i<rowNum-1; i++) //Loop work for Rows
        {
            row = worksheet.getRow(i+1);

            for (int j=0; j<colNum; j++) //Loop work for colNum
            {
                if(row==null)
                    data[i][j]= "";
                else
                {
                    cell= row.getCell(j);
                    if(cell==null)
                        data[i][j]= ""; //if it get Null value it pass no data
                    else
                    {
                        String value=formatter.formatCellValue(cell);
                        data[i][j]=value; //This formatter get my all values as string i.e integer, float all type data value
                    }
                }
            }
        }

        return data;
    }

}
