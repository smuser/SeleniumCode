//Passing parameters and returning values in methods
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = Add(100,200,300);
		int multiply = sum * 10;
		System.out.println(sum);
		System.out.println(multiply);
	}
	public static int Add(int a, int b, int c)
	{
		return (a+b+c);
	}

}
