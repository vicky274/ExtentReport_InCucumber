package TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;


enum Data{
	END,AVAILABLE,USED;
}
public class RetreiveData {

	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	private static final String TEST_DATA_FOLDER= "TestData";
	
	
	
	private static String getpath(String ExcelName){
		
		File f =new File(TEST_DATA_FOLDER);
		System.out.println(f.getAbsolutePath()+File.separator+ExcelName);
		return f.getAbsolutePath()+File.separator+ExcelName;
		  
	}
	
	
	public static void SetExcelFile(String ExcelName,String sheetname){
		try {
			FileInputStream ExcelFile = new FileInputStream(getpath(ExcelName));
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
	    
	    public static Object[][] getCellData() throws Exception{
			 Object[][] obj = null;
			 try {
				 CellStyle style;

				 XSSFDataFormat XSSFDataFormat = ExcelWBook.getCreationHelper().createDataFormat();
				 DataFormatter dataFormatter = new DataFormatter();
				   // SetExcelFile(path, sheetname);
					
					int rowcount =ExcelWSheet.getLastRowNum()+1;
					
					System.out.println("Total number of Rows :"+rowcount);
					
					Row  = ExcelWSheet.getRow(0);
					
					int lastcellcount = Row.getLastCellNum();
					System.out.println("Total number of Columns :"+lastcellcount);

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

								DataFormat format = ExcelWBook.createDataFormat();
								style = ExcelWBook.createCellStyle();

								/*style.setDataFormat(format.getFormat("€ #.##0,0000000"));
								//style.setDataFormat((short)7);
								Cell.setCellStyle(style);*/

								 style.setDataFormat((short)7);
								 Cell.setCellStyle(style);
		                    	 obj[i][j]=Cell.getNumericCellValue();

								 DecimalFormat df = new DecimalFormat("#.##");
								 df.setMaximumFractionDigits(7);
								 String value = df.format(obj[i][j]).replaceAll("\\,", "\\.").trim();
								System.out.println("Formatted Number is :"+value);
								 System.out.println("Formatted Number is :"+Double.parseDouble(value)*5);


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
