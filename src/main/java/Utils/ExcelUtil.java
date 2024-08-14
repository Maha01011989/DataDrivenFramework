package Utils;

import Constants.Excel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;


import java.io.*;
import java.util.Arrays;

class ExcelUtil {

    int rowCount;
    int colCount;
    FileInputStream fis;

    Workbook wb;
    Sheet sheet;
    Row row;

    Cell cell;


    ExcelUtil(String sheetName) throws IOException {
        fis = new FileInputStream(Excel.TESTDATA_FOLDER);
        wb = WorkbookFactory.create(fis);
        sheet = wb.getSheet(sheetName);
    }

    public int getRowCount() {
        rowCount = sheet.getLastRowNum();
        return rowCount;
    }

    public int getColCount() {
        row = sheet.getRow(0);
        colCount = row.getLastCellNum();
        return colCount;
    }


    public Object[] getFirstColTestData() {
        Object[] data = new Object[getRowCount()];
        for (int i = 0; i < getRowCount(); i++) {
            row = sheet.getRow(i);
            cell = row.getCell(row.getFirstCellNum());
            data[i] = cell.toString();
        }
        return data;
    }

    public Object[] getLastColTestData() {
        Object[] data = new Object[getRowCount()];
        for (int i = 0; i < getRowCount(); i++) {
            row = sheet.getRow(i);
            cell = row.getCell(row.getLastCellNum() - 1);
            data[i] = cell.toString();
        }
        return data;
    }


    public static void main(String[] args) throws IOException {

        ExcelUtil eu = new ExcelUtil("Sheet1");
        System.out.println(eu.getRowCount());
        System.out.println(eu.getColCount());
        System.out.println(Arrays.toString(eu.getFirstColTestData()));
        System.out.println(Arrays.toString(eu.getLastColTestData()));

    }
}




