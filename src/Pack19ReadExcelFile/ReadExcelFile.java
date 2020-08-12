package Pack19ReadExcelFile;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
//https://gist.github.com/madan712/3912272
public class ReadExcelFile {
	public String file = "resources/testdata.xlsx";
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	
	//@Test
	public void getRowCount() {		
		//read excel file using poi-ooxml jar:
		
		//create object for XSSFWorkbook		
		try {
			workbook = new XSSFWorkbook(file);
		
		//create object for XSSFSheet
		sheet = workbook.getSheet("mydata");
		//int rows=sheet.getLastRowNum();
		int rows=sheet.getPhysicalNumberOfRows();
		System.out.println("Total rows: "+rows);
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Test
	public void getCellData() {			
		//create object for XSSFWorkbook		
		try {
			workbook = new XSSFWorkbook(file);		
		//create object for XSSFSheet
		sheet = workbook.getSheet("mydata");
		//String mytestdata = sheet.getRow(2).getCell(1).getStringCellValue();
		String username = sheet.getRow(2).getCell(0).getStringCellValue();
		String password = sheet.getRow(2).getCell(1).getStringCellValue();
		//System.out.println("cell data: "+mytestdata);
		System.out.println("User Name: "+username);
		System.out.println("password : "+password);
		
		int pincode = (int) sheet.getRow(2).getCell(2).getNumericCellValue();
		System.out.println("Pincode: "+pincode);
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
	

}
