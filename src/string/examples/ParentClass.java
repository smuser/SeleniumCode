package string.examples;

public class ParentClass {
	
	int age = 20;
	
	public void display()
	{
		System.out.println("parent class diplay method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClass p1 = new ParentClass();
		p1.display();
		
		ParentClass p2 = new ChildClass();
		p2.display();
		
	}

}
