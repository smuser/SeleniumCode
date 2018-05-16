import java.util.HashMap;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String reverse = "";
		System.out.println(str.length());
		
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse = reverse +(str.charAt(i)); // break characters
			//System.out.println(reverse);
		}
		System.out.println("Reversed string: " +reverse);
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < str.length(); i++) {
		  char c = str.charAt(i);
		  if (map.containsKey(c)) {
		    int cnt = map.get(c);
		   System.out.println("Value of repeated characters: " +map.put(c, ++cnt));
		  } else {
		    map.put(c, 1);
		  }
		}
			 
	}

}
