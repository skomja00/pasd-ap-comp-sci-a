package problemset7;

public class BankAccount {
	/*
	a.	Such a class might store information about the account balance, the name of the account holder, and an account number. What instance variables would 
		you declare to hold this information? Give a type and name for each. 
	b.	There are a number of operations that would make sense for a bank account—withdraw money, deposit money, check the balance, and so on. Write a method 
		header with return type, name, and parameter list, for each such operation described below. Don't write the whole method—just the header. They will all 
		be public methods.
		i.	Withdraw a given amount from the account. This changes the account balance, but does not return a value. 
		ii.	Deposit a given amount into the account. This changes the account balance, but does not return a value. 
		iii.Get the balance from the account. This does not change anything in the account; it simply returns the balance. 
		iv.	Return a string containing the account information (name, account number, balance). This does not change anything in the account. 
		v.	Charge a $10 fee.  This changes the account balance but does not return a value.
		vi.	Create a new account given an initial balance, the name of the owner, and the account number. Note that this will be a constructor, and that a 
			constructor does not have a return type.
	*/ 
	private double acctBal=0.0d;
	private String acctName="";
	private int acctNum=0;
	BankAccount (double b, String n, int an) {
		acctBal=b;
		acctName=n;
		acctNum=an;
	}
	public void withdraw (double w) {
		acctBal=acctBal-w;
	}
	public void deposit (double d) {
		acctBal=acctBal+d;		
	}
	public double getBal () {
		return acctBal;		
	}
	public String acctInfo () {
		return "Acct. name="+acctName+" Acct. number="+acctNum+" Acct. balance="+acctBal;		
	}
	public void fee (double f) {
		acctBal=acctBal-f;
	}
	public static void main(String[] args) {
		BankAccount a = new BankAccount (1000000d,"Tank, Mr. Shark",666);
		System.out.println(a.acctInfo());
	}
}
