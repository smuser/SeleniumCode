// how to use class constructor
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube calc = new Cube();
		System.out.println(calc.getVolume());
		Bank b = new Bank();
		System.out.println(b.getInterestRate());
		Bank abc = new Bank_ABC();
		System.out.println(abc.getInterestRate());
		Bank xyz = new Bank_XYZ();
		System.out.println(xyz.getInterestRate());
	}

}
