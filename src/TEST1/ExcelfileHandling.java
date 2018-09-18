package TEST1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelfileHandling 
{
	@Test
	public void excel() throws IOException
	{
		FileInputStream fis= new FileInputStream("C:/Users/JUBER/Desktop/Excelsheet.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		Sheet s= wb.getSheet("Sheet1");
		Row r=s.getRow(6);
		Cell c=r.getCell(5);
		System.out.println();
		//System.out.println(wb.getSheet("Sheet1").getRow(6).getCell(5).toString());
		
	}

}
