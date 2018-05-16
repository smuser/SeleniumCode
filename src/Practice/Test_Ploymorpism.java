package Practice;

public class Test_Ploymorpism{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Ploymorpism x = new Test_Ploymorpism();
		x.sum(50, 50);
		x.sum(30.50, 10);
		x.sum(20, 30.50);
		x.sum(23.3, 23.45);
	}
	public void sum(int a, int b)
	{
		int y = a+b;
		System.out.println(y+ " Int");
	}
	public void sum(int a, double b)
	{
		double y = a+b;
		System.out.println(y+ " Int Double");
	}
	public void sum(double a, int b)
	{
		int y = (int) a+b;
		System.out.println(y+ " Int cast");
	}
	public void sum(double a, double b)
	{
		double y = a+b;
		System.out.println(y+ " Double acst");
	}
	
}
