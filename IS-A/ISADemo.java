
class W
{
	final void show(){
		
	}
}
class W1 extends W
{
	/*void show(){
		
	}*/
}

/*class Amit extends String{
	
}*/
/*final class MathOperations{
	void cube(){
		
	}
	void  squareRoot(){
		
	}
}
class MuchBetterMathOperations extends MathOperations{
	
}*/

abstract class Account
{
	void withDraw(){
		System.out.println("Account Class WithDraw");
	}
	void deposit(){
		System.out.println("Account Class Deposit");
	}
	abstract void roi();
	 /*void roi(){
		 System.out.println("Common ROI");
	 }*/
}
//IS-A
class SavingAccount extends Account{
	@Override
	void roi(){
		System.out.println("Interest Rec");
	}
}
class CurrentAccount extends Account{
	void roi(){
		System.out.println("Interest Pay");
	}
}
public class ISADemo {

	public static void main(String[] args) {
		final double PI = 3.14;
		int p = 1000;
		String x = "ram";
		//Amit y = "ram";
		//Account account = new Account();
		SavingAccount account = new SavingAccount();
		account.deposit();
		account.withDraw();
		account.roi();
		/*SavingAccount sa = new SavingAccount();
		sa.deposit();
		sa.withDraw();
		sa.recInterest();*/

	}

}
