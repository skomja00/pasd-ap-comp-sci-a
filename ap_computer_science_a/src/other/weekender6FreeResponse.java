package other;

public class weekender6FreeResponse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threeInARow();
	}
	public static void threeInARow () {
		boolean done=false;
		String a="",b="",c="";
		int count=0;
		while (!done) {
			a=randFlip();
			b=randFlip();
			c=randFlip();
			count++;
			System.out.print(a+" "+b+" "+c+" ");
			if ((a=="H" && b=="H" && c=="H") 
			|| (a=="T" && b=="T" && c=="T")) 
				{done=true;}
		}
		if (a=="H") {System.out.println("Three heads in a row on "+count+" try.");}
		if (a=="T") {System.out.println("Three tails in a row on "+count+" try.");}	
	}
	public static String randFlip () {
	    if (Math.random() < 0.5) 
	    	return "H";
	    else return "T";
	    
	}
}
