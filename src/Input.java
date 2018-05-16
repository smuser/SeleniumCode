import java.util.Scanner;

public class Input {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number of rows ");
	int rows = scan.nextInt();
	System.out.println("Enter number of columns");
	int columns = scan.nextInt();
	int [][]a = new int[rows][columns];
	int [][]b = new int[rows][columns];
	System.out.println("Enter the first matrix");
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			a[i][j]=scan.nextInt();
		}
		System.out.print("");
	}
	System.out.println("Enter the second matrix");
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			b[i][j]=scan.nextInt();
		}
		System.out.print("");
	}	
	int [][]c= new int [rows][columns];
	int [][]d= new int [rows][columns];
	int [][]e= new int [rows][columns];
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			c[i][j]= a[i][j]*b[i][j];
			d[i][j]= a[i][j]+b[i][j];
			e[i][j]= a[i][j]/b[i][j];
		}
	}
	System.out.println("The multiplication of the two matrices is: ");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            System.out.print(c[i][j] + "  ");
        }
        System.out.println();
	}
    System.out.println("The sum of the two matrices is: ");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            System.out.print(d[i][j] + "  ");
        }
        System.out.println();
	}
    System.out.println("The division of the two matrices is: ");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          System.out.print(e[i][j] + "  ");
        }
        System.out.println();
	}
	}
}
