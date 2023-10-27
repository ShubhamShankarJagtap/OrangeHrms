package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;


public class ExcelDataReader {
    public static void main(String[] args) {
        String excelFilePath = "F:\\ApachePOI\\ApachePOI.xlsx";

        try (FileInputStream inputStream = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(inputStream)) {

            Sheet sheet = workbook.getSheetAt(0); // Assuming you want to read the first sheet
            int rowCount = sheet.getLastRowNum();

            for (int i = 0; i <= rowCount; i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    Cell cell = row.getCell(0); // Assuming you want to read data from the first cell
                    if (cell != null) {
                        String cellValue = cell.getStringCellValue();
                        System.out.println("Cell Value at Row " + (i + 1) + ": " + cellValue);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
