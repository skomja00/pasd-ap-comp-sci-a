package problemset7;

public class Account {
	private double balance;
	private String name;
	private int acctNum;
	//*******************************************************
	// Account.java
	//
	// A bank account class with methods to deposit to, withdraw from,
	// change the name on, charge a fee to, and print a summary of the account.
	//*******************************************************
	//
	//1)	File Account.java contains a partial definition for a class representing a bank account. Study the partial definition and complete the Account class 
	//		as described below. Note that you won't be able to test your methods until you write ManageAccounts in part 2.
	//a.	Fill in the code for method deposit, which should add the deposited amount to the balance for the account
	//b.	Fill in the code for method toString, which should return a string containing the name, account number, and balance for the account. 
	//c.	Fill in the code for method chargeFee, which should deduct a service fee from the account and return the new balance.
	//d.	Fill in the code for method changeName which takes a string as a parameter and changes the name on the account to be that string. 

	//Constructor -- initializes balance, owner, and account number
	public Account(double initBal, String owner, int number)
	{
	balance = initBal;
	name = owner;
	acctNum = number;
	}

	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
		public void withdraw(double amount)
	 	{
	 		if (balance >= amount)
	      		balance -= amount;
	   		else
	  			System.out.println("Insufficient funds");
	}

	// Adds deposit amount to balance.
	public void deposit(double amount)
	{
		balance=balance+amount;
	}

	// Returns balance.
	public double getBalance()
	{
	return balance;
	}

	// Returns a string containing the name, account number, and balance.
	public String toString()
	{
		return "Name:"+name+", Acct#"+acctNum+", Balance $"+balance;
	}

	// Deducts $10 service fee
	public double chargeFee()
	{
 		if (balance >= 10)
      		balance -= 10;
   		else
  			System.out.println("Insufficient funds");
		return balance;
	}

	// Changes the name on the account 
	public void changeName(String newName)        
	{
		name=newName;
	}

}
