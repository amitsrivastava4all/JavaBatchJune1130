class P1
{
	int x=1000;
	P1(){
		x = 100;
		System.out.println("This is Parent Class Default Constructor");
	}
	P1(int x){
		this();
		System.out.println("This is Parent Class Params Constructor");
	}
	void print(){
		System.out.println("I am Parent Print Method....");
	}
}
class PChild extends P1
{
	int x =2000;
	int y;
	@Override
	void print(){
		super.print();
		System.out.println("I am Child Print Method....");
	}
	PChild(){
		super(1000);
		//super(); // Will Call parent class default constructor
		// super() must be the first line
		 y = 100;
		 y = y + x;
		 //super(); 
		System.out.println("This is Child Class Default Constructor "+y);
	}
	PChild(int x){
		this();
		//super(100);
		x = super.x + this.x + x;
		System.out.println("This is Child Class Param Constructor "+x);
	}
}
public class SuperVsThis {

	public static void main(String[] args) {
		PChild pchild = new PChild(3000);
		pchild.print();

	}

}
