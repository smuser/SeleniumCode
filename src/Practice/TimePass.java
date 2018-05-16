package Practice;

import java.util.*;

public class TimePass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter input values");
		int number = scan.nextInt();
		for(int i=0; i<number; i++)
		{
			for(int j=0; j<i;j++)
			{
				System.out.print(number);
			}
			System.out.println();
		}
		for(int i=0;i<number; i++)
		{
			for(int j=0;j<i;j++)
			{
				if(i==(number/2) || j==(number/2) || i==(number/4) || j==(number/4))
				{
				System.out.print("*");
				}
			}
		System.out.println();
		}
	}

}
