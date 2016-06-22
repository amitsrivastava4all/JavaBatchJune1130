class Shape
{
	void draw(){
		System.out.println("Shape Draw...");
	}
	void rotate(){
		System.out.println("Shape Rotate ....");
	}
}
class Rectangle extends Shape{
	@Override
	void draw(){
		System.out.println("L X B Rectangle Draw");
	}
}
class Circle extends Shape{
	@Override
	void draw(){
		System.out.println("Circle Radius ");
	}
	void calculateRadius(){
		System.out.println("This is Circle Special Feature...");
	}
}
class Square extends Shape{
	@Override
	void draw(){
		System.out.println("All Side Equals");
	}
}
public class ShapeExample {
	
	void drawing(Shape shape){
		shape.draw();
		shape.rotate();
		if(shape instanceof Circle){
			Circle c = (Circle)shape;  // Downcasting
			c.calculateRadius();
		}
		//shape.calculateRadius();
	}

	public static void main(String[] args) {
		//Human obj = new SuperHuman();
		ShapeExample obj = new ShapeExample();
		obj.drawing(new Circle());
		obj.drawing(new Rectangle());
		obj.drawing(new Square());
		/*Shape shape = new Circle();  //Upcasting (Narrow) 
		//U r going to call this style when u r using the common features b/w parent and child 
		shape.draw();
		shape.rotate();
		shape.calculateRadius();*/
		/*Circle circle= new Circle();
		circle.draw();
		circle.rotate();
		Rectangle rect = new Rectangle();
		rect.draw();
		rect.rotate();*/
		


	}

}
