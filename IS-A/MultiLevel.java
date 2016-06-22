class N
{
	int x=10;
}
class M extends N
{
	int x=20;
}
class V extends M
{
	int x=30;
	V(int x){
		System.out.println(((N)this).x+super.x+this.x+x);
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		V obj = new V(40);
		

	}

}
