import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Downloader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Path to Download");
		String downloadLocationURL = scanner.next();
		String fileLocation = "/Users/amit/Documents/FileHandlingTesting";
		URL url = new URL(downloadLocationURL);
		URLConnection connection = url.openConnection();
		connection.connect();
		InputStream is = connection.getInputStream();
		BufferedInputStream bi = new BufferedInputStream(is);
		fileLocation = fileLocation + downloadLocationURL.substring(downloadLocationURL.lastIndexOf("/"));
		FileOutputStream fo = new FileOutputStream(fileLocation);
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		int singleByte = bi.read();
		while(singleByte!=-1){
			bo.write(singleByte);
			singleByte = bi.read();
		}
		bi.close();
		bo.close();
		is.close();
		fo.close();
		System.out.println("File Downloaded...");
		
		

	}

}
