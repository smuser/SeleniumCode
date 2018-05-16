
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20, b=30;
		swapFunction(a,b);
		 System.out.println("---------------------------------------------------------");
		//Using 2 variables
		 System.out.println("After swap the Value of a: " +a+ " and Value of b: " +b);
		 	a=a+b; //50
		 	b=a-b; //50-30 = 20        
		 	a=a-b; //50-20 = 30 
		 System.out.println("Again After swap the Value of a: " +a+ " and Value of b: " +b);
		 System.out.println("---------------------------------------------------------");
		 //XOR logic
		 	int x=5, y=4;
		 System.out.println("Before swap the Value of x: " +x+ " and Value of y: " +y);
		 	x=x^y;
		 	y=x^y;
		 	x=x^y;
		 System.out.println("After swap the Value of x: " +x+ " and Value of y: " +y);
			}
	public static void swapFunction(int a, int b)
	{
		//Using 3 variables
		System.out.println("Before swapping using method, a = " + a + " b = " + b);
		 // Swap n1 with n2
		 int c = a;
		 a = b;
		 b = c;
		 System.out.println("After swapping using method, a = " + a + " b = " + b);
	}

}
