//Has-A (It Usage Based RelationShip)
class Student extends Object
{
	Course mca ; // Has - A RelationShip
//	Student(){
//		System.out.println("Student Class Cons Call");
//		// Composition (Create Object From Student Class)
//		mca = new Course();
//	}
	Student(Course mca){
		this.mca = mca;
		System.out.println("Student Class Cons Call");
	}
	@Override
	protected void finalize(){
		System.out.println("Gud Bye Student Object...");
	}
}
class Course
{
	Course(){
		System.out.println("Course Class Cons Call");
	}
	@Override
	protected void finalize(){
		System.out.println("Gud Bye Course Object...");
	}
}
public class HasADemo {

	public static void main(String[] args) {
		Course mca = new Course();
		// Assign a Course to Student
		// mca reference is pass to Student Class
		Student ram = new Student(mca);  // Has A RelationShip
		ram = null; // DeReference  
		System.gc();// I am Requesting to GC to Run
		for(int i = 1; i<=10; i++){
			System.out.println("I is "+i);
		}
	}

}
