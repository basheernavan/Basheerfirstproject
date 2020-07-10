package Pack10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInFile {
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:/Users/Govardhan/git/Basheerfirstproject/FilesFolder/sample.txt");
		f.createNewFile();
		System.out.println("File Created");
		
		
		//Write Data in the File:
		//Create Object for FileWriter;
		FileWriter w = new FileWriter(f);
		
		//Create object for BufferedWriter
		BufferedWriter out = new BufferedWriter(w);
		out.write("this is the first line");
		out.newLine();
		out.write("second line2");
		out.newLine();
		out.write("second line3");
		out.newLine();
		out.write("second line4");
		out.newLine();
		out.write("second line5");
		out.newLine();
		out.write("second line6");
		out.flush();
		System.out.println("Written in the file:");
		
		
	}
	

}
