
public class PassByValueDemo {
	public int add(int x, int y){
		x++;
		y++;
		System.out.println("X is "+x+" and Y is "+y);
		
		return  x + y;
	}
	public static void main(String[] args) {
		PassByValueDemo obj = new PassByValueDemo();
		int a = 100;
		int b = 200;
		int c = obj.add(a,b);
		System.out.println("A is "+a+" and B is "+b);
		System.out.println("C is "+c);

	}

}
