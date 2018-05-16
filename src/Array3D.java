
public class Array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][]={{1,2},{1,2}};
		int y[][]={{2,3},{4,1}};
		int i,j;
		
		for (i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			
				{
				System.out.print(x[i][j]+ " ");
				}
		System.out.println(" ");
		}
		for (i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
				{
				System.out.print(y[i][j]+ " ");
				}
			System.out.println(" ");
		}
				
		
	}
}

