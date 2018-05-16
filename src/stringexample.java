
public class stringexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "Hello World";
		int myStringlength = myString.length();
		String myStringcase = myString.toUpperCase();
		System.out.println(myStringlength);
		System.out.println(myStringcase);
		System.out.println(myString.replace('l','r')); 
		System.out.println("Test "  + myStringcase +  " Upper");
		String myStringconc	= myString.concat("!!");
		System.out.println(myStringconc);
		char result = myString.charAt(8);
	    System.out.println(result);
	    
	}

}
