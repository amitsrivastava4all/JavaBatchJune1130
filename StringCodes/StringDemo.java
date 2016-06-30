
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";// this will create zero or 1 object 
		String b = "Hello";
		String c = new String("Hello");
		String d = new String("Hi"); // 2 or 1 Object
		String e = new String("HELLO");
		int t=1000;
		int t2= 1000;
		if(t ==t2){
			
		}
		// == vs equals
		if(a==c){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		if(a.equals(c)){
			System.out.println("Same Value");
		}
		else
		{
			System.out.println("Not Same Value");
		}
		if(a.equalsIgnoreCase(e)){
			System.out.println("Same Value Not Checking the Case");
		}
		else
		{
			System.out.println("Not Same Value...");
		}
		
		// String is Immutable
		String r = "Amit";
		String r2 = "Amit";
		r=r+"Srivastava";
		System.out.println("r is "+r);
		System.out.println("r2 "+r2);
		if(r == r2){
			System.out.println("Same Ref r and r2");
		}
		else
		{
			System.out.println("Not Same Ref r and r2");
		}
		

	}

}
