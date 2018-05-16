package Practice;
//Method Overloading
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice p = new Practice();
	System.out.println(Add("John"," Dough"));//static call to method
	System.out.println(p.Add(10,18));//non static call to method
	}
	public static String Add(String a, String b)
	{
		return(a+b);
	}
	public int Add(int a, int b)
	{
		return(a+b);
	}

}
