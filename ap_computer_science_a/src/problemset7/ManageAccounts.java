package problemset7;

public class ManageAccounts {
	// ****************************************************************
	//  ManageAccounts.java
	//
	//  Use Account class to create and manage Sally and Joe's 
	//  bank accounts       
	//****************************************************************
	//
	//2)	File ManageAccounts.java contains a program that uses the Account class above. 
	//a.	Complete it as indicated by the comments. 
	//b.	Modify ManageAccounts so that it prints the balance after the calls to chargeFees. Instead of using the getBalance method like you did after the deposit 
	//	and withdrawal, use the balance that is returned from the chargeFees method. You can either store it in a variable and then print the value of the 
	//	variable, or embed the method call in a println statement

	public static void main(String[] args)
	{
			Account acct1, acct2;
	
			//create account1 for Sally with $1000
			acct1 = new Account(1000, "Sally", 1111);
	
			//create account2 for Joe with $500
			acct2 = new Account(500, "Joe", 2222);
			
			//deposit $100 to Joe's account
			acct2.deposit(100);
			
			//print Joe's new balance (use getBalance())
			System.out.println(acct2.getBalance());
	
			//withdraw $50 from Sally's account
			acct1.withdraw(50);
	
			//print Sally's new balance (use getBalance())
			System.out.println(acct1.getBalance());
			
			//charge fees to both accounts
			acct1.chargeFee();
			acct2.chargeFee();
	
			//change the name on Joe's account to Joseph
			acct2.changeName("Joseph");
	
			//print summary for both accounts
			System.out.println(acct1.toString());
			System.out.println(acct2.toString());
	
	   }

}
