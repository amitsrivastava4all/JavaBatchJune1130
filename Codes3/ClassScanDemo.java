import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class T
{
	private int s;
	private int p;
	public int d;
	static int e;
	void disp(){
		
	}
	void print(){
		
	}
}
public class ClassScanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = T.class; // It will give class meta information
		T obj = new T();
		Class d = obj.getClass(); // Data + Meta Data
		Field fields [] = c.getDeclaredFields();
		System.out.println("Total Fields are "+fields.length);
		int privateFieldCounter = 0;
		for(Field f : fields){
			if(Modifier.isPrivate(f.getModifiers())){
				privateFieldCounter++;
			}
			if(Modifier.isPublic(f.getModifiers())){
				
			}
			if(Modifier.isStatic(f.getModifiers())){
				
			}
		}
		System.out.println("Private fields are "+privateFieldCounter);
		
		Method methods[] = c.getDeclaredMethods();
		
		System.out.println("Total Methods are "+methods.length);
		

	}

}
