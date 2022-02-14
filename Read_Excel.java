package reading_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel 
{
	public static void main(String[] args) throws Exception 
	{
		File src=new File("C:\\Srinivas\\TestData.xlsx");
		
		FileInputStream fs=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		int rowCount=sheet.getLastRowNum();
		
		System.out.println("Number of rows: "+rowCount);
		
		for(int i=0;i<rowCount;i++)
		{
			String data0=sheet.getRow(i).getCell(0).getStringCellValue();
			
			String data1=sheet.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(data0+"||"+data1);
		}
		
		
	}
}
