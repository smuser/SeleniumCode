//Parameter subclass contains all methods and calling of these methods static n non-static
public class PassingParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameter p = new Parameter();
		int sum = p.sum(12,10);
		double sub= p.sub(12.10, 15.10);
		String fullname = Parameter.fullname("John"," Dough"); // static can be called using classname.obj
		System.out.println("Sum: " +sum); //non-static should be called obj.method
		System.out.println("Sub:" +sub);
		System.out.println("FullName:" +fullname);	
	}
}
