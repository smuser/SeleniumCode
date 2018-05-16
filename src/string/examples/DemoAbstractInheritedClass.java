package string.examples;

public class DemoAbstractInheritedClass extends DemoAbstract {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Inhertited abstract class method");	
	}
	
	public static void main(String args[])
	{
		int tester[] = {1,3,4,5};
		for(int x : tester)
		{
			System.out.println(x);
		}
		DemoAbstractInheritedClass test = new DemoAbstractInheritedClass();
		test.show();
		test.display();
	}

}
