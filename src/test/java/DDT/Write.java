package DDT;	
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {

	public static void main(String[] args) throws Throwable
	{
		String file="C:\\Users\\Babul\\Desktop\\Book1.xlsx";
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Sheet kkk=wb.getSheet("sheet1");
		Row kkkk=kkk.getRow(2);
		Cell cel=kkkk.createCell(6);
		cel.setCellValue("GRS at jspur191");
		FileOutputStream f1=new FileOutputStream(file);
	   wb.write(f1);
		wb.close();
	}
}

