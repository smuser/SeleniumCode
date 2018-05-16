public class Pyramid{
	public static void main (String args[])
	{
		for (int i=0; i<4; i++) //to print the rows
		{
			for (int j=0; j<i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for (int i=4; i>0; i--) //to print the rows
		{
			for (int j=0; j<i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for (int i=0; i<6; i++) //to print the rows
		{
			for (int j=0; j<i;j++)
			{
				System.out.print(j/2);
			}
			System.out.println();
		}
		for (int i=0; i<6; i++) //to print the rows
		{
			for (int j=0; j<i;j++)
			{
				System.out.print(i/2);
			}
			System.out.println();
		}
		//Will print multiple of arrylength i.e. 5 triangle
		int []arry = {10,20,30,40,50}; 
		for (int x=0; x<arry.length; x++)
		{
			for (int y=0; y<x;y++)
			{
				System.out.print(arry.length*x);
			}
			System.out.println();
		}
		for(int i=0; i<4;i++)
		{	for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
		for(int j=0;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
		
	}
}