package problemset6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FairyTale {
	
	public static void main (String [] args) throws IOException
	{
		System.out.println(howManyPrincess("princess"));
	}
	public static int howManyPrincess (String x) throws IOException
	{
		Scanner scan = new Scanner (new File("Grimms_Fairy_Tales.txt"));
		
		int prinCount = 0;
		
		while (scan.hasNext() )
		{
			String temp = scan.next().toLowerCase();
			if(temp.contains("princess"))
			{
				prinCount++;
			}
			if(temp.contains("Princess"))
			{
				prinCount++;
			}
			if(temp.contains("PRINCESS"))
			{
				prinCount++;
			}
			if(temp.contains("PRINCESSES"))
			{
				prinCount++;
			}
			if(temp.contains("princesses"))
			{
				prinCount++;
			}
			if(temp.contains("Princesses"))
			{
				prinCount++;
			}
		}
		return prinCount;
	}	
}