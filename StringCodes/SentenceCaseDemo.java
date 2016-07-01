import java.util.Scanner;

public class SentenceCaseDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Sentence");  //hELLo hOw aRE yOu
		String sentence = scanner.nextLine();
		String wordArray[] = sentence.split(" ");
		
		for(String word : wordArray){
			//word = word.toLowerCase();
			//System.out.println(String.valueOf(word.charAt(0)).toUpperCase()+word.substring(1));
			System.out.print(String.valueOf(word.charAt(0)).toUpperCase()
					+ word.substring(1).toLowerCase()+" ");
			//char firstChar= word.charAt(0);  // Get Single Character
			//String singleChar = String.valueOf(firstChar);  // Convert char into String
			//System.out.print(singleChar.toUpperCase() + word.substring(1).toLowerCase()+" ");
		}
	}

}
