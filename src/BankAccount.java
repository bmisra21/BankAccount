// @author: bmisra21 (Bharavi Misra Period 6)



public class BankAccount 
{
	//fields
	private String name;
	private int accNum;
	private double balance;
	
	//constructors
	public BankAccount(String n, int num)
	{
		name = n;
		accNum = num;
		balance = 0;
	}
	 public BankAccount (String n, int num, double bal)
	 {
		name = n;
		accNum = num;
		balance = bal;
	 }
	 
	 //methods
	 public void deposit (double a)
	 {
		 balance += a;
	 }
	 public void withdraw (double a)
	 {
		 balance -= a;
	 }
	 public double getBalance ()
	 {
		 return balance;
	 }
	 public String toString ()
	 {
		 return name+" "+accNum+" "+balance;
	 }
}
