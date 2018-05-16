package Practice;
/* class extends class
 * interface implements interface
 * class implements interface 
 */
public class Bank1 implements Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bank1 b = new Bank1(); // we can create obj and then call method of interface but cannot instantiate interface
	b.getInterestRate();
	b.Test();
	}

	@Override
	public void getInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("Interface getInterestRate");
	}
	
	public void Test()
	{
		System.out.println("Test method");
	}

}
