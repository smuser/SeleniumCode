
public class IfElseIfExample 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String browser="Safari";
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("Chrome Browser");
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.out.println("FireFox Browser");
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.out.println("IE Browser");
		}
		else
			System.out.println("Other Browser / Invalid browser");
	}
}