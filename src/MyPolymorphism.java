//One name many forms
public class MyPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank x = new Bank(); // base Class
		Bank a = new Bank_ABC();//child class that extends parent class bank and inherits its methods interest rate
		Bank b = new Bank_XYZ();
		System.out.println(x.getInterestRate());
		System.out.println(a.getInterestRate());
		System.out.println(b.getInterestRate());
	}

}
