package Utils;

import Constants.Excel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;


import java.io.*;

class ExcelUtil {

    int rowCount;
    int colCount;
    FileInputStream fis;

    Workbook wb;
    Sheet sheet;
    Row row;


    ExcelUtil() throws IOException {
        fis = new FileInputStream(Excel.TESTDATA_FOLDER);
        wb = WorkbookFactory.create(fis);

    }

//        for (int i = firstRow; i < rowCount; i++) {
//            Row row = sheet.getRow(i);
//            for (int j = row.getFirstCellNum(); j < row.getLastCellNum(); j++) {
//                Cell cell = row.getCell(j);
//                System.out.println(cell);
//            }
//        }


    public int getRowCount(String sheetName) {
        sheet = wb.getSheet(sheetName);
        rowCount = sheet.getLastRowNum();
        return rowCount;
    }

    public int getColCount(String sheetName) {
        sheet = wb.getSheet(sheetName);
        row = sheet.getRow(0);
        colCount = row.getLastCellNum();
        return colCount;
    }

    public static void main(String[] args) throws IOException {

        ExcelUtil eu = new ExcelUtil();
        System.out.println(eu.getRowCount("Sheet1"));
        System.out.println(eu.getColCount("Sheet1"));


    }
}



