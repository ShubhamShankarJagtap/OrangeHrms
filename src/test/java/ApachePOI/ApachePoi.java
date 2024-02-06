package ApachePOI;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ApachePoi {
    static XSSFWorkbook xssfWorkbook;
    static XSSFSheet xssfSheet;
//    static XSSFRow xssfRow;
//    static XSSFCell xssfCell;
    static File file;
    static FileInputStream fileInputStream;
    static int totalRows;
    static int totalCells;
    public static void main(String[] args) throws IOException {
        
        file = new File("F:\\ApachePOI\\ApachePOI.xlsx");

        try {
            fileInputStream = new FileInputStream(file);
        }
        catch (FileNotFoundException f){
            throw new RuntimeException("Hey buddy we are unable to find this file .");
        }

        // Accessing workbook.
        xssfWorkbook = new XSSFWorkbook(fileInputStream);

      // Accessing Sheet
        xssfSheet = xssfWorkbook.getSheetAt(0);

     // get total row
        totalRows = xssfSheet.getPhysicalNumberOfRows() + 1;

        //get total cell
        totalCells = xssfSheet.getRow(0).getLastCellNum();

        for (int currentRow = 1;currentRow<totalRows;currentRow++){
            for (int currentcell=0;currentcell<totalCells;currentcell++){
                System.out.println(xssfSheet.getRow(currentRow).getCell(currentcell).toString());
                System.out.println("\t");
            }
            System.out.println();
        }


    }
}
