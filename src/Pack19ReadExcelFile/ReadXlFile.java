package Pack19ReadExcelFile;

import org.testng.annotations.Test;

import util.XLS_Reader;

public class ReadXlFile {
	@Test
	public void getRowCount() {		
		XLS_Reader xls = new XLS_Reader("resources/testdata.xlsx");
		//to get the row count: 
		System.out.println("Total rows: "+xls.getRowCount("mydata"));
		
		//read data from xl file:
		System.out.println("my data: "+xls.getCellData("mydata", 0, 1));
		System.out.println("My data: "+xls.getCellData("mydata", "username", 2));
		System.out.println("My data: "+xls.getCellData("mydata", "password", 2));
		System.out.println("My data: "+xls.getCellData("mydata", "pincode", 2));
		
		System.out.println("=====================================================");
		for(int i=1;i<=xls.getRowCount("mydata");i++){
			System.out.println("My data: "+xls.getCellData("mydata", "password", i));
		}
		
		System.out.println("+++++++++++++++Get complete Data++++++++++++++");
		
		
		for(int i=1;i<=xls.getRowCount("mydata");i++){
			for(int j=0;j<xls.getColumnCount("mydata");j++){
			System.out.print(xls.getCellData("mydata", j, i)+" | ");
			}
			System.out.println();
		}
		
	}

}
