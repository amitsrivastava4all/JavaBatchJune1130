import java.util.Arrays;
import java.util.Scanner;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxCount = 0;
		char higestChar = '#';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.next();
		char array[]= str.toCharArray();
		Arrays.sort(array);
		str = new String(array);
		System.out.println("Str is "+str);
		for(int i = 0; i<str.length(); i++){
			char y = str.charAt(i);
			int index =str.indexOf(y);
			int lastIndex= str.lastIndexOf(y);
			int count =(lastIndex-index)+1;
			if(count>maxCount){
				maxCount=count;
				higestChar = y ;
			}
			i = lastIndex;
			System.out.println("CHAR "+y +" "+index + " "+lastIndex);
			
		}
		System.out.println("Higest is "+maxCount+" Char is "+higestChar);

	}

}
