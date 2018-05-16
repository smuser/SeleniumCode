
public class JaggedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p[][]= {
						{1,2,3},
						{4,5},
						{6,7,8}
					};
		
		for (int i[]: p)
		{
			for (int j: i)
			{
				System.out.print(j+ " ");
			}
			System.out.println("");
		}
	}
}
