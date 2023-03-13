package GenaricUtil;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil 
{
	public  String[][] getdatafordataprovider()  throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream fis=new FileInputStream("./ApiDatadriverTesting.xlsx");
		DataFormatter  df=new DataFormatter();
		Workbook book = WorkbookFactory.create(fis);
		
		
	
		Sheet sh = book.getSheet("Sheet1");
		 int lastrow = sh.getLastRowNum();
	 
		   int lastcell = sh.getRow(0).getLastCellNum();
	   
			String[][] arr=new String[lastrow][lastcell];
			
		for (int i=0; i <lastrow; i++)
		{
			
			for (int j=0; j<lastcell; j++)
			{
				
				  arr[i][j]= df.formatCellValue(sh.getRow(i+1).getCell(j));
				
				  

			}
			
		}
		return arr;
		
	}

}
