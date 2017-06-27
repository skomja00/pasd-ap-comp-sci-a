package problemset4;

import java.util.Scanner;

public class donor {


	public static void main(String [] args) {
		
		double contributionAmt;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter contribution amount:" );  
        contributionAmt=input.nextDouble();
        donor(contributionAmt);  
	}
 
    static void donor (double contributionAmt) {
    	
		System.out.print("You have contributed at the ");
   	
    	//$1,000.00 or more as Benefactors; 
    	if (contributionAmt > 1000.00) {
    		System.out.print("Benefactors");
    	}
     	//those who give between $500.00 and $1,000.00 as Patrons; 
    	else if (contributionAmt >= 500.00 & contributionAmt < 1000.00) {
    		System.out.print("Patron");
    		}
    	//those who give at least $100.00 and less than $500.00 as Supporters; 
    	else if (contributionAmt >= 100.00 & contributionAmt < 500.00) {
    		System.out.print("Supporters");
    	}
    	//those who give at least $15.00 and less than $100.00 as Friends; 
    	else if (contributionAmt >= 15.00 & contributionAmt < 100.00) {
    		System.out.print("Friends");
    	}
    	//and those who give less than $15 as Cheapskates.
    	else {//(contributionAmt < 15.00) {
    		System.out.print("Cheapkates");
    	}
    
		System.out.println(" donor level. Thank you!");
      
    }
 
}