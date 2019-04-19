package DDT;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewRead {

	public static void main(String[] args) throws Throwable
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Babul\\Desktop\\grsss.xlsx");

		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Sheet k1=wb.getSheet("sheet1");
		Row k2=k1.getRow(3);
		String data=k2.getCell(1).getStringCellValue();
		System.out.println(data);



	}

}
