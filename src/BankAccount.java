
public class BankAccount 
{
	//fields
	private String name;
	private int accNum;
	private int balance;
	
	//constructors
	public BankAccount(String n, int num)
	{
		name = n;
		accNum = num;
		balance = 0;
	}
	 public BankAccount (String n, int num, int b)
	 {
		name = n;
		accNum = num;
		balance = b;
	 }
	 
	 //methods
	 
	 public int deposit (int a)
	 {
		 return 0;
	 }
}
