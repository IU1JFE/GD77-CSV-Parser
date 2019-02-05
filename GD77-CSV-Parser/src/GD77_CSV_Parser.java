


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class GD77_CSV_Parser 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		 try {
	            File excel = new File("C://temp/ponti.xlsx");
	            File csv = new File("C://temp/out.csv");
	            FileInputStream fis = new FileInputStream(excel);
	            XSSFWorkbook book = new XSSFWorkbook(fis);
	            XSSFSheet sheet = book.getSheetAt(0);

	            Iterator<Row> itr = sheet.iterator();

	            // Iterating over Excel file in Java
	            while (itr.hasNext()) 
	            {
	                Row row = itr.next();

	                // Iterating over each column of Excel file
	                Iterator<Cell> cellIterator = row.cellIterator();
	                while (cellIterator.hasNext()) 
	                {

	                    Cell cell = cellIterator.next();

	                    switch (cell.getCellType())
	                    {
	                    case Cell.CELL_TYPE_STRING:
	                        System.out.print(cell.getStringCellValue() + "\t");
	                        break;
	                    case Cell.CELL_TYPE_NUMERIC:
	                        System.out.print(cell.getNumericCellValue() + "\t");
	                        break;
	                    case Cell.CELL_TYPE_BOOLEAN:
	                        System.out.print(cell.getBooleanCellValue() + "\t");
	                        break;
	                    default:

	                    }
	                }
	                System.out.println("");
	            }
	            
	            
	            FileOutputStream os = new FileOutputStream(csv);
	            
	            ///
	            
	            
	            
	            // Close workbook, OutputStream and Excel file to prevent leak
	            os.close();
	            book.close();
	            fis.close();

		 	} 
		 	catch (FileNotFoundException fe)
		 	{
	            fe.printStackTrace();
	        } 
		 	catch (IOException ie) 
		 	{
	            ie.printStackTrace();
	        }
	}
}
		
		
		
	