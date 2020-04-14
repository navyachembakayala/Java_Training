package Session14_Excels;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelIn2DArray_Class {

	public static void main(String[] args) {
		
		
		Object [][] arr2 = Read_Excel_data();
		System.out.println(arr2[0][0]);
		System.out.println(arr2[3][0]);
		System.out.println(arr2[4][3]);

	}

	public static Object [][] Read_Excel_data() {
		File file = new File("E:\\Excel1.xlsx");
		XSSFWorkbook wrkbook;
		XSSFSheet    wrksheet;
		Object [][] arr = new Object[0][0]; 
		
		try {
			FileInputStream  excel = new FileInputStream(file);
			wrkbook = new XSSFWorkbook(excel);
			wrksheet = wrkbook.getSheet("Sheet1");
			//System.out.println(wrksheet.getRow(2).getCell(3).getDateCellValue());
			int start = wrksheet.getFirstRowNum();
			int end = wrksheet.getLastRowNum();
			arr = new Object[end-start+1][4];
			for(int i=start;i<=end;i++) {
			/*	System.out.print(wrksheet.getRow(i).getCell(0).getStringCellValue()+"\t");
				System.out.print(wrksheet.getRow(i).getCell(1).getNumericCellValue()+"\t");
				System.out.print(wrksheet.getRow(i).getCell(2).getBooleanCellValue()+"\t");
				System.out.println(wrksheet.getRow(i).getCell(3).getDateCellValue()); */
				arr[i][0] = wrksheet.getRow(i).getCell(0).getStringCellValue();
				arr[i][1] = wrksheet.getRow(i).getCell(1).getNumericCellValue();
				arr[i][2] = wrksheet.getRow(i).getCell(2).getBooleanCellValue();
				arr[i][3] = wrksheet.getRow(i).getCell(3).getDateCellValue();
				
				
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return arr;
		
	}
}
