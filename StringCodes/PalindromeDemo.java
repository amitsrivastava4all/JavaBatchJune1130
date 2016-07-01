
public class PalindromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "nitin";
		StringBuffer org = new StringBuffer(name);
		StringBuffer reverse = new StringBuffer(name);
		reverse.reverse();
		System.out.println("Reverse is "+reverse);
		System.out.println("Orginial is "+org);
		if(org.toString().equals(reverse.toString())){
			System.out.println("Palindrome String");
		}
		else{
			System.out.println("Not Palindrome String");
		}
		

	}

}
