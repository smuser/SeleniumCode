// Inheritance inheriting parent class features in child class with its own property
public class MyClassInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		tri.set_values(10,10);
		rec.set_values(30, 10);
		System.out.println("Area of Rectangle: " +rec.area());
		System.out.println("Area of Triangle: " +tri.area());
	
}
}