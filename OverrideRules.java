class P
{
	private int b;
	//int c;
	protected void print(){
		System.out.println("Old Print");
	}
}
class P2 extends P
{
	private int a;
	@Override
	 public void print(){
		System.out.println("New Print");
	}
}
public class OverrideRules {

	public static void main(String[] args) {
		P2 obj = new P2();
		obj.print();

	}

}
