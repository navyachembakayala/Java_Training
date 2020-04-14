package Session14_Excels;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel_Class {

	public static void main(String[] args) {
		
		File file = new File("E:\\Excel2.xlsx");
		XSSFWorkbook wrkbook = new XSSFWorkbook();
		XSSFSheet    wrksheet = wrkbook.createSheet("Data1");
		Row row;
		Cell cell;
		
		for(int i=0;i<=9;i++) {
			row = wrksheet.createRow(i);
			for(int j=0;j<=9;j++) {
				cell = row.createCell(j);
				cell.setCellValue((i+1)*(j+1));
			}
		}
		
		
		
		//cell.setCellValue("Hello world");
		try {
			FileOutputStream excel = new FileOutputStream(file);
			wrkbook.write(excel);
			excel.close();
			wrkbook.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
