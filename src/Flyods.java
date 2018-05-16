
public class Flyods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5; i>0; i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=1; i<=4; i++)                         //****
		{												//*  *
			for(int j=1;j<=4;j++)						//*  *
			{											//****
				if(i==1||i==4||j==1||j==4)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		/*pattern 
		  1234
		  2341
		  3412
		  4123*/
		for (int i = 0; i < 4; i++) 
		{
		    for (int j = i; j < i + 4; j++) 
		    {
		        System.out.print((j % 4) + 1);
		    }
		    System.out.println();
		}
/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
	 0  //k SOP
    0 1 
   0 1 2 
  0 1 2 3 
 0 1 2 3 4 
     0  //i in SOP
    1 1 
   2 2 2 
  3 3 3 3 
 4 4 4 4 4 
 
		 */
		
		for (int i = 0; i < 5; i++) // to move to next line after loop completes
		{ 
			for (int j = 0; j < 5 - i; j++) // to print space triangle
			{ 
				System.out.print(" "); 
			}
			for (int k = 0; k <= i; k++) // to print * triangle
			{ 
				System.out.print("* " ); 
				//System.out.print(i+" " ); 
				//System.out.print(k+" " );
			}
			System.out.println();
			}
	}

}
