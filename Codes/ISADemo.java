class Account
{
	void withDraw(){
		System.out.println("Account Class WithDraw");
	}
	void deposit(){
		System.out.println("Account Class Deposit");
	}
}
//IS-A
class SavingAccount extends Account{
	void recInterest(){
		System.out.println("Interest Rec");
	}
}
class CurrentAccount extends Account{
	void payInterest(){
		System.out.println("Interest Pay");
	}
}
public class ISADemo {

	public static void main(String[] args) {
		//HAS-A
		SavingAccount sa = new SavingAccount();
		sa.deposit();
		sa.withDraw();
		sa.recInterest();

	}

}
