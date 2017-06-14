# selenium

package bank;

import java.util.Scanner;

public class Account 
{
	String cust_name;
	int account_no;
	String account_type;
	double balance;
	
	public Account()
	{
		cust_name = "";
		account_no = 0;
		account_type = "";
		balance = 0;
	}
	
	public Account(String cust_name, int account_no, String account_type, double balance) {
		super();
		this.cust_name = cust_name;
		this.account_no = account_no;
		this.account_type = account_type;
		this.balance = balance;
	}
	Scanner input = new Scanner(System.in);
	public void accnt_detail()
	{
		System.out.println("Enter the Customer Name: ");
		cust_name=input.next();
		System.out.println("Enter the Account Number: " +account_no);
		account_no=input.nextInt();
		System.out.println("Enter the Account Type: " +account_type);
		account_type=input.next();
		System.out.println("Enter the Account Balance: " +balance);
		balance=input.nextDouble();
	}
	
	public void display_accntdetail()
	{
		System.out.println("Customer Name: " +cust_name);
		System.out.println("Account Number: " +account_no);
		System.out.println("Account Type: " +account_type);
		System.out.println("Existing Balance: " +balance);
	}
	
    public void deposit()
    {
    	double deposit;
    	System.out.println("Enter the amount to be deposited");
    	deposit = input.nextDouble();
    	balance = balance + deposit;
    }
    public void withdraw()
    {
		
    }
    public void updateBal()
    {
    	
    }
		
}
