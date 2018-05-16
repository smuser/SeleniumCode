package Practice;

public class Star extends Triangle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int i=0;i<4;i++)
	{
		for(int x=0; x<4;x++)
		{
			System.out.print(" ");
			for(int j=0;j<4-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" * ");
			}
		}
		System.out.println(" ");
	}
	}

}
