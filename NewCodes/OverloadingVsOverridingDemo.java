/*
 * What is Overloading - Same Name Method But Arguments are Different
 * 1. Number of Arguments Might be Different
 * 2. Type of Arguments Might Be Different
 * In Overloading the logic is remain same but arguments are different
 * In Overloading Inheritance is Optional
 */
/*
 * Overriding - Inheritance + When U Override the Child Signature 
 * must be same as parent Signature.
 * Why Overriding?
 * the parent feature is outdated and we want to build the improve feature in child
 * then we override the parent in child
 */
// HomeLoan is a Loan
class Loan
{
	void emi(){
		System.out.println("Loan EMI is Called...");
	}
	void applyForLoan(){
		System.out.println("Apply For Loan is Called...");
	}
	
}
class HomeLoan extends Loan
{
	// When we overide it will hide the parent method defination
	void emi(){
		System.out.println("This is HomeLoan EMi");
	}
}
class Naukri
{
	void search(String keyword){
		System.out.println("Get Jobs Based on Keyword");
	}
	void search(String keyword, String location){
		System.out.println("Get Jobs Based on Keyword and Location");
	}
	void search(String keyword, int exp){
		System.out.println("Get Jobs Based on Keyword and exp");
	}
	void search(String keyword, String jobLocation,int exp){
		System.out.println("Get Jobs Based on Keyword , Location and exp");
	}
}
public class OverloadingVsOverridingDemo {

	public static void main(String[] args) {
		// The Benefit of Inheritance is Code Reuse
		HomeLoan homeLoan = new HomeLoan();
		homeLoan.applyForLoan();
		homeLoan.emi();
		
		/*Naukri obj = new Naukri();
		obj.search("Java");
		obj.search("Java","Noida");
		obj.search("Java",0);
		obj.search("Java","Noida",0);*/

	}

}
