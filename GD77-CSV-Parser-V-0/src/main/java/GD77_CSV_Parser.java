


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class GD77_CSV_Parser 
{

	public static void Test(String[] arguments)
	{
		// TODO Auto-generated method stub

		 try {
			 /*
	            File excel = new File("C://temp/ponti.xlsx");
	            //File csv = new File("C://temp/out.csv");
			 */	
			 	//File excel = new File(".\\Test-in.xlsx");
	            //File csv = new File(".\\Test-out.csv");
			 
			 	File excel = new File(arguments[1]);
	           // File csv = new File(arguments[2]);
	            
	            FileWriter os = new FileWriter("arguments[2]");
	            os.write("TEST");
	            os.close();
	            
	            
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
	                    
	                   // cell.getCellTypeEnum();
	                   // switch (cell.getCellType())
	                    switch (cell.getCellTypeEnum())
	                    {
	                   // case Cell.CELL_TYPE_STRING:
	                    case STRING:
	                        System.out.print(cell.getStringCellValue() + "\t");
	                        break;
	                   // case Cell.CELL_TYPE_BOOLEAN:
	                    case BOOLEAN:
	                        System.out.print(cell.getBooleanCellValue() + "\t");
	                        break;
	                    case NUMERIC:
	                        if (DateUtil.isCellDateFormatted(cell)) 
	                        {
	                            System.out.print(cell.getDateCellValue()+ "\t");
	                        } else {
	                            System.out.print(cell.getNumericCellValue()+ "\t");
	                        }
	                        break;
	                    case FORMULA:
	                        System.out.print(cell.getCellFormula()+ "\t");
	                        break;
	                    case BLANK:
	                        System.out.print("\t");
	                        break;
	                    default:
	                        System.out.print("");    
	                    

	                    }
	                }
	                System.out.println("");
	            }
	            
	            //binario
	            //FileOutputStream os = new FileOutputStream(csv);
	            
	            //testuale
	            //FileWriter os = new FileWriter(csv);
	            ///
	            
	            
	            
	            // Close workbook, OutputStream and Excel file to prevent leak
	          //  os.close();
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


	public static void main(String[] args)
	{
		System.out.println("Start...");
		 if(args.length!=0) 
		 {
			 Test(args);
		 }

		 else 
		 {
			 System.out.println("TEST...");
			// IWorkspace workspace = ResourcesPlugin.getWorkspace(); 
			//String path= ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
			 String workingDir = System.getProperty("user.dir");
			System.out.println("Run Test on working dir : "+workingDir+"...");
			String[] TestArgs = new String[5];;
			TestArgs[0]="0";
			TestArgs[1]=workingDir+"\\src\\main\\java\\"+"Test-in.xlsx";//input
			TestArgs[2]=workingDir+"\\src\\main\\java\\"+"Test-out.csv";//output
			Test(TestArgs);
		 }
		 
	}

}
		
		
		
	