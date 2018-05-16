//Find maximum number
public class Maximum {

	public static void main(String[] args) {
	int[] num = {13,45,67,2,12};
	
	int max = num[0];
	for (int i=1; i<num.length;i++)
	{
		if(max < num[i])
		{
			max = num[i];
		}
	}
	System.out.println(max);
	}
}
