import java.util.ArrayList;

public class MyArraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] my_array = new int[5]; Array declaration
		ArrayList<Double> myarray = new ArrayList<Double>(5); //Arraylist
		myarray.add(14.12);
		myarray.add(143.2);
		myarray.add(14.00);
		
		
		/*
		for (Double x : myarray)
		{
			System.out.println(x);
		}
		System.out.println("Size: " +myarray.size());
		myarray.remove(2);
		*/
		for (Double x : myarray)
		{
			System.out.println(x);
		}
		myarray.set(1, 50.00);
		myarray.set(2, 20.90);
		System.out.println("Size: " +myarray.size());
		for (Double x : myarray)
		System.out.println(x);
		System.out.println("Size: " +myarray.size());
		myarray.trimToSize();
		System.out.println("Size: " +myarray.size());
	}
}
