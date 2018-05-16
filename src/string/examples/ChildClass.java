package string.examples;

public class ChildClass extends ParentClass {
	
	public void display()
	{
		System.out.println("Child class display method.");
		//super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ChildClass reference and child class object");
		ChildClass c1 = new ChildClass();
		c1.display();
		
		/*System.out.println("Parentclass reference and child class object");
		ParentClass p1 = new ChildClass();
		p1.display();
		
		System.out.println("Parentclass reference and Parent class object");
		ParentClass p2 = new ParentClass();
		p2.display();
		
		System.out.println("Childclass reference and parent class object - Invalid scenario");
		
		System.out.println(c1 instanceof ChildClass);
		System.out.println(p1 instanceof ChildClass);
		System.out.println(p2 instanceof ParentClass);
		System.out.println(p2 instanceof ChildClass);*/
	}

}
