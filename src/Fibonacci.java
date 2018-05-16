
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// swap a = b and b = n and increment to move forward
	int a=1, b=1, n=0;
	System.out.print("Fibonacci series " +n+ " " +a+ " " +b);
		while (n<=50) // n = 1 , a = 1 , b = 2  n = 3 | n = 2 , a = 2 , b = 3
	{
		n = a+b; // n = 2 :
		System.out.print(" " +n);
		a=b; // a = 1
		b=n; // b = 2
		n++;
	}
	
	}

}
