
public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullname = "Selenium-Test-HP-QTP-Grid";
		String name[] = fullname.split("-");
		System.out.println("Character At index 10 : " +fullname.charAt(10));
		for (int i=0; i<name.length; i++)
		{
			System.out.println("name length: " +i+ " is " +name[i]);
			if(name[i].contains("s"))
			{
				System.out.println("------------------");
			}
			
		}
		
	}

}
