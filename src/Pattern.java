
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//First traingle
		for(int i=0;i<5;i++)
		{
			for(int j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i;k++)
			{
				System.out.print("  "+(i+k));
			}
			System.out.println();
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("  ");
			}
			for(int k=3;k>=i;k--)
			{
				System.out.print("   "+k);
			}
			System.out.println();
		}
	}
}
