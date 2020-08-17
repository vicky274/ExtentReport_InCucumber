package TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


enum Data{
	END,AVAILABLE,USED;
}
public class RetreiveData {

	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	private static final String TEST_DATA_FOLDER="TestData";
	
	
	
	private static String getpath(String ExcelName){
		
		File f =new File(TEST_DATA_FOLDER);
		System.out.println(f.getAbsolutePath()+File.separator+ExcelName);
		return f.getAbsolutePath()+File.separator+ExcelName;
		  
	}
	
	
	public static void SetExcelFile(String path,String sheetname){
		try {
			FileInputStream ExcelFile = new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(sheetname);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	    public static String getCellData(int RowNum, int ColNum) throws Exception{

		try {
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			Cell.setCellType(CellType.STRING);
			String CellData = Cell.getStringCellValue();
			return CellData;

		} catch (Exception e) {

			return "";

		}
 }
	    
	    public static Object[][] getCellData(String sheetname) throws Exception{
			 Object[][] obj = null;
			 try {
				 
				   // SetExcelFile(path, sheetname);
					
					int rowcount =ExcelWSheet.getLastRowNum()+1;
					
					System.out.println("Total number of Rows :"+rowcount);
					
					Row  = ExcelWSheet.getRow(0);
					
					int lastcellcount = Row.getLastCellNum();
					System.out.println("Total number of Columns :"+lastcellcount);
					
					System.out.println(ExcelWSheet.getRow(22).getCell(1));
					
					obj=new Object[rowcount][lastcellcount];
					
					for(int i=0;i<rowcount;i++)
					{
						Row = ExcelWSheet.getRow(i);
						System.out.println(i);
						
						for(int j=0;j<lastcellcount;j++)
						{
							
							Cell =Row.getCell(j);
							
							if(Cell!=null)
						{
							switch(Cell.getCellType())   
							{
		                    case STRING:
		                    	 obj[i][j]=Cell.getStringCellValue();
		                    	 System.out.println("String value :"+obj[i][j]);
		                        break;
		                    case NUMERIC:
		                    	 Cell.setCellType(CellType.STRING);
		                    	 obj[i][j]=Cell.getStringCellValue();
		                    	 System.out.println("Number is :"+obj[i][j]);
		                        break;
		                    case BLANK:
		                    	obj[i][j]="";
							default:
								System.out.println(Cell.getStringCellValue());
								break;
		                    }
							
						}
						
					}
							
						
						}
					
					
			 }
					
				 catch (Exception e) {
					System.out.println(e.getMessage());
				}
			 
			return obj;

		 }

	    
	public static void setCellData(String ExcelName, String Result, int RowNum, int ColNum) throws Exception {
		FileOutputStream fileOut=null;
		try {
			fileOut = new FileOutputStream(getpath(ExcelName));
			
			Row = ExcelWSheet.getRow(RowNum);

			Cell = Row.getCell(ColNum);

			if (Cell == null) {
				Cell = Row.createCell(ColNum);
				Cell.setCellValue(Result);
			} else {
				Cell.setCellValue(Result);
			}
			ExcelWBook.write(fileOut);
			fileOut.flush();

		} catch (Exception e) {

			e.getMessage();

		}
		finally{
			if(fileOut!=null){
				fileOut.close();
				System.out.println("Written and closed successfully");
			}
		}

	}
	    
	public static String getAvailableDataFromExcel(String ExcelName) {

		String str = null;
		int j = 1, i = 0;
		int count = 0;

		try {
			outer: while (!(getCellData(i, j).equalsIgnoreCase(Data.END.toString()))) {
				str = getCellData(i, j);

				if (str.equalsIgnoreCase(Data.USED.toString())) {
					i++;
					continue outer;
				} else if (str.equalsIgnoreCase(Data.AVAILABLE.toString())) {
					count++;
					str = getCellData(i, j - 1);
					System.out.println("The value is :" + str);
					setCellData(ExcelName,Data.USED.toString(), i, j);
					break outer;
				}

			}

			if (count == 0) {
				System.out.println("No Available Records in Data sheet");
				return null;
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		return str;

	}
	public static void main(String[] args) throws Exception {
		
		SetExcelFile(getpath("ActiveNumber.xlsx"), "Sheet2");
		getAvailableDataFromExcel("ActiveNumber");
		
	}

}
