
public class ArrayExample 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int[] array_example = {121,133,145,132,23,35};
		/*int index=0;
		while(index <= 4)
		{
			System.out.println(array_example[index]);
			index++;
		}*/
		//Print all array
		for(int index=0; index<=array_example.length; index++)
		{
			System.out.println(array_example[index]);
			array_example.toString();
		}
		//Sum all array
	}
		catch(Exception e)
		{
			System.out.println("Exception:  " +e);
		}
		
	}
}
