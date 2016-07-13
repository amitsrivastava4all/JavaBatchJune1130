import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//c:\\xyz\\abcd
		File file = new File("/Users/amit/Documents/FileHandlingTesting/qq/pp/tt/kk");
		if(file.exists()){
			//file.delete();
			file.renameTo(new File("/Users/amit/Documents/FileHandlingTesting/test2.txt"));
			System.out.println("File Exist and Now rename");
		}
		else{
		file.mkdirs(); // Nested Directory
		//file.mkdir(); // Single Directory
			//file.createNewFile();
		System.out.println("File Not Exist and Now Create...");
		}
		
	}

}
