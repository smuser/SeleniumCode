import java.util.Arrays;

public class BubbleSort 
{
 
	public static void main(String[] args) 
	{
 
        int arr[] = {12,14,15,11,10};
        System.out.println("\nFinal result:"+Arrays.toString(BubbleSortMethod(arr)));
	}
 
    public static int[] BubbleSortMethod(int[] arr)
    {                                            
        int temp;
        for(int i=0; i < arr.length-1; i++)
        {//for pass i.e. no of pass to be made
 
            for(int j=0; j < arr.length-i-1; j++) // arr.length-1 for index and arr.length-i for pass to always be less than one as in first pass last no already sorted
            { //to swap numbers if max 
                if(arr[j] > arr[j+1])
                {
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println((i+1)+"th iteration result: "+Arrays.toString(arr));
        }
		return arr;
    }
}

