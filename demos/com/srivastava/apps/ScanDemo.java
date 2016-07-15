package com.srivastava.apps;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;

class MyFilter implements FilenameFilter{
	private String extension;
	MyFilter(String extension){
		this.extension = extension;
	}
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		if(extension==null){
			return true;
		}
		return name.endsWith(extension);
	}
	
}
public class ScanDemo {

	public static File[] getFiles(File file, String extension) {
		// TODO Auto-generated method stub
		//File file = new File("/Users/amit/Documents/FileHandlingTesting");
		//String names []= file.list();
		File files [] ;
		MyFilter filter = new MyFilter(extension);
		if(extension!=null){
		 files = file.listFiles(filter);
		}
		else
		{
			files = file.listFiles();
		}
		int fileCounter = 0;
		int dirCounter = 0;
		int readOnlyCounter = 0;
		int hiddenCounter = 0;
		for(File f : files){
			if(f.isDirectory()){
				dirCounter++;
				
				System.out.println("<DIR> "+f.getName());
			}
			else
			if(f.isFile()){
				if(f.isHidden()){
					hiddenCounter++;
				}
				if(!f.canWrite()){
					readOnlyCounter++;
				}
				fileCounter++;
				Date d = new Date(f.lastModified()); // ms to Date time
				System.out.println("<FILE> "+f.getName()+" "+d);
			}
			//f.delete();
		}
		System.out.println("Total No of Files "+fileCounter);
		System.out.println("Total No of Dir "+dirCounter);
		return files;
//		for(String name : names){
//			System.out.println(name);
//		}

	}

}
