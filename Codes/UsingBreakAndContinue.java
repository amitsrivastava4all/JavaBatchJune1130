
public class UsingBreakAndContinue {

	public static void main(String[] args) {
		/*final int SUNDAY = 1;
		final int MONDAY =2;*/
		String day = "Sunday";
		//int day = 100;
		// From Java 7 switch case can take String
		switch(day){
		default:
			System.out.println("Wrong Day ");
			//break;
		case "Sunday":
			//case SUNDAY:
			System.out.println("Enjoy the Day!");
			
			//break;
		case "Monday":
			System.out.println("Another Boring Day !");
			//break;
			
		}
		/*abcd:
		for(int k = 1; k<=3 ; k++){*/
		myouterloop:
		for(int i = 1; i<=3; i++){
			for(int j= 1; j<=3; j++){
			if(i==j){
			continue myouterloop;
				//continue;
			//	break abcd;
			}
			System.out.println("I is "+i+" and J is "+j);
			}
			}
		/*}*/
	System.out.println("Program going to end...");

	}

}
