// SAM (Single Abstract Method) Interface
@FunctionalInterface
interface P
{
	void print();
	//void show();
}
@FunctionalInterface
interface Calc{
	int add(int x, int y);
}
// 1st Way (Class Way)
// Step - 1 Class Create and implement interface

class P1 implements P
{
	// Step - 2 Override the interface method
	public void print(){
		System.out.println("P1 Print");
	}
}
public class InterfaceUseWays {

	public static void main(String[] args) {
		// Step -3 
		// Create Object
		//P1 obj = new P1();
		// Step -4 Call it 
		//obj.print();
		
		
		// Anonymous Way
		//// Step - 1 Class Create and implement interface
		// Step -3 
				// Create Object
		/*P p = new P(){
			// Step - 2 Override the interface method
			public void print(){
				System.out.println("Anonymous Print");
			}
		};
		p.print();*/
		
		// 3rd Way (Lambda Style)
		P pobj = ()->System.out.println("Lambda Print");
		pobj.print();
		Calc c = (a,b)->a+b;
		Calc cc = (a,b)->{
			int d = 100;
			int e = 200;
			e = d + a + b ; 
			return d;
		};
		System.out.println("Add is "+c.add(100,200));

	}

}
