package Pack10;

import java.io.File;
import java.io.IOException;
//how to create a file, txt, xls, word?
public class CreateFile {
	public static void main(String[] args) throws IOException {
		//Create a new file
		
		File f = new File("C:/Users/Govardhan/git/Basheerfirstproject/FilesFolder/sample.txt");
		f.createNewFile();
		System.out.println("File Created");
	}

}
