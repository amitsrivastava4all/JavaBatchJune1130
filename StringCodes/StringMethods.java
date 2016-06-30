import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "Hello";
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		if(a==a.toUpperCase()){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref  "+a+" "+a.toUpperCase());
		}
		char w = a.charAt(0); // a[0]
		// valueOf can convert any primitive into String
		String singleChar = String.valueOf(w);
		a= "hello";
		char tt []=a.toCharArray();
		// String to Byte Convert 
		// So U Can write byte in a file or on network
		String productId = "FKNDNZ-1001";
		String array [] = productId.split("-");
		String newProductId = array[0]+"-"+(Integer.parseInt(array[1])+1);
		System.out.println("New Product Id is "+newProductId);
		byte pp [] = a.getBytes();
		a= "Hello";
		System.out.println("SubString is "+a.substring(2));
		String vv = "Hello How are You";
		String array2 [] = vv.split(" ");
		System.out.println("Word Count is "+array2.length);
		
		// 2 it is index and 4 position
		System.out.println("SubString Overloaded version "+a.substring(2, 4));
		a="       Amit      Srivastava       ";
		System.out.println("Before Trim ["+a+"]");
		System.out.println("After Trim ["+a.trim()+"]");
		// Arrays is a predefine class used to search and sort in primitive array
		Arrays.sort(tt);
		String bb = new String(tt); // Convert char array into String
		System.out.println("After Sort "+bb);
		String e="Mr Ram Kumar";
		boolean result= e.startsWith("Mr");
		result = e.endsWith("Kumar");
		
		a= "Hello How are You Hello";
		int index = a.indexOf("are");
		index = a.lastIndexOf("Hello");
		System.out.println("Index is "+index);
		if(index>=0){
			System.out.println("Found...");
		}
		else
		{
			System.out.println("Not found..");
		}

	}

}
