import java.util.Scanner;
class Account
{
	private String accountNumber;
	private int balance;
	Account(String accountNumber,int balance)
	{
		this.accountNumber= accountNumber;
		this.balance= balance;
	}
	public void setaccountDetails(String accountNumber,int balance)
	{
		this.accountNumber= accountNumber;
		this.balance= balance;
	}
	public int getBalance()
	{
		System.out.print("Account balance is: "+this.balance);
		return 0;
	}
	public void deposit(int transactionAmount)
	{
		this.balance =this.balance + transactionAmount;
		System.out.println("Your balance after the transaction is: "+ this.balance);
	}
	public void withdraw(int transactionAmount)
	{
		if(((this.balance - transactionAmount)==0) || (this.balance<transactionAmount))
		{
			System.out.println("Insufficient balance");
			getBalance();
		}
		else
		{
			this.balance =this.balance - transactionAmount;
			System.out.println("Your balance after the transaction is: "+ this.balance);
		}
	}
}
public class Account_Transactions
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Account Number");
		String accountNumber = sc.nextLine();
		
		System.out.println("Enter the Account Balance");
		int balance = sc.nextInt();
		
		Account ac = new Account(accountNumber,balance);
		
		System.out.println("Enter 1 - to deposit an amount, 2 - to withdraw an amount, 3 - Account Balance");
		int choice = sc.nextInt();
		
		if(choice==1) 
		{
			System.out.println("Enter the amount to deposit");
			int transactionAmount = sc.nextInt();
			ac.deposit(transactionAmount);
		}
		else if(choice==2)
		{
			System.out.println("Enter the amount to withdraw");
			int transactionAmount = sc.nextInt();
			ac.withdraw(transactionAmount);
		}
		else
			ac.getBalance();
	}
}
