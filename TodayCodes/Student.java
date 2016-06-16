
public class Student  {
	private String name;   // Instance Variables
	private int rollno;
	private String course;
	private byte age;  //-127 to 128 (1 Byte)  -2 ^ 7 to 2 ^ 7 -1 
	private int marks;
	private String collegeName;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		if(marks<0){
			System.out.println("Marks Not Negative....");
			return ;
		}
		this.marks = marks;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	// Constructor - It is CaLL When Object is Created 
	// It is used to initalize the Instance Variables
	// It's Name is Same As Class name
	// it return nothing
	// It is same like function , but used only for initalize
	// By Default there is default constructor
	// And We Can Build Our Own
	// Constructor Overloading
	Student(){
		collegeName = "SRCC";
	}
	Student(int rollno, String name, String course , byte age , int marks){
		//Student();
		this(); // Calling Constructor (Default)
		if(rollno<=0){
			System.out.println("Rollno Can't Be Zero or Negative ");
			//return ;
			System.exit(0);
		}
		this.rollno=rollno;
		this.name = name;
		this.course = course;
		this.age = age;
		this.marks = marks;
	}
	// DRY
	// Use of this (Shadow Problem)
	// Instance Methods
	void takeInput(int rollno, String name , String course, byte age, int marks){
		// Assign Local Variables into Instance Variables
		if(rollno<=0){
			System.out.println("Rollno Can't Be Zero or Negative ");
			//return ;
			System.exit(0);
		}
		this.rollno = rollno;
		this.name  = name;
		this.course = course;
		this.age  = age;
		this.marks= marks;
	}
	
	void print(){
		// this is a keyword and it is used  to hold the current reference
		System.out.println("Rollno "+this.rollno);  // 77.rollno
		System.out.println("Name "+this.name);
		System.out.println("Course "+this.course);
		System.out.println("Age "+this.age);
		System.out.println("Marks "+this.marks);
		System.out.println("College Name "+this.collegeName);
		System.out.println("******************************");
	}
	
	public int hashCode(){
		if(age>21){
		return 1000;
		}
		else
		{
			return 2000;
		}
	}
}
