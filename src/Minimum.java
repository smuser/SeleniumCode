//Find minimum number and max number
public class Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {13,45,67,2,12};
		int min;
		min = num[0];
		for (int i=1; i<num.length;i++)
		{
			if(min > num[i])
			{
				min = num[i];
			}
		}
		System.out.println(min);
		
	}
}
