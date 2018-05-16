package string.examples;

public class String1 {
	
	int age;
	String name;
	
	public static void main(String test[])
	{
		String test1 = "   Testing Made Easy  ";
		String replace = test1.replace('e', 'F');
		String test2 = test1.trim();
		System.out.println(test2);
		System.out.println(replace);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
