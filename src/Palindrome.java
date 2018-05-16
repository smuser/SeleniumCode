import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = s.nextInt(); 
		int original_num = num;
		int last_digit, reversed_num=0;
		while(num>0)   // until all numbers / digits are reversed
		{
			last_digit = num%10; // 654                 // will give only last digit
			//System.out.print(" " +last_digit);		//will give the count
			num = num/10;								// will give number leaving last digit
			//System.out.print(" " +num);
			reversed_num = reversed_num*10+last_digit; //appending last digit to rest of number
			//System.out.print(" " +reversed_num);
			//System.out.println(" ");
		}
		System.out.println("Reversed Number:  " +reversed_num);
		if(reversed_num == original_num)
		{
			System.out.println("It is a Palindrome");
		}
		else
			System.out.println("It is not a Plaindrome");
	}
}
