package other;

public class BabySimulator {

	public static void main(String[] args) {
		//Since the probability of a boy or girl is 50% it is very likely after the 1st child the opposite gender will be one 
		//of the next one or two children. 
		//Results...
		boysAndGirls(1);
		boysAndGirls(10);
		boysAndGirls(100);
		boysAndGirls(100000);
		boysAndGirls(1000000);
/*		Results...
  		Average: 3.0 children to get at least one of each gender.
		Number of families with 2  children: 0
		Number of families with 3  children: 1
		Number of families with 4  children: 0
		Number of families with 5+ children: 0
		Most common number of children is 3.
		boysAndGirls(10)
		Average: 2.7 children to get at least one of each gender.
		Number of families with 2  children: 7
		Number of families with 3  children: 1
		Number of families with 4  children: 1
		Number of families with 5+ children: 1
		Most common number of children is 2.
		boysAndGirls(100)
		Average: 3.06 children to get at least one of each gender.
		Number of families with 2  children: 57
		Number of families with 3  children: 9
		Number of families with 4  children: 20
		Number of families with 5+ children: 14
		Most common number of children is 2.
		boysAndGirls(100000)
		Average: 3.00668 children to get at least one of each gender.
		Number of families with 2  children: 50022
		Number of families with 3  children: 24831
		Number of families with 4  children: 12443
		Number of families with 5+ children: 12704
		Most common number of children is 2.
		boysAndGirls(1000000)
		Average: 3.001827 children to get at least one of each gender.
		Number of families with 2  children: 499404
		Number of families with 3  children: 250306
		Number of families with 4  children: 124915
		Number of families with 5+ children: 125375
		Most common number of children is 2.*/
	}
	public static void boysAndGirls(int num) {
		int i=1;
		int familySize=0,count2=0,count3=0,count4=0,count5plus=0;
		double totFamilySize=0.0;
		while (i<=num) {
			familySize=boyAndGirl();//simulate couple having children until they have at least one of each
			if (familySize==2) {count2++;}
			else if (familySize==3) {count3++;}
			else if (familySize==4) {count4++;}
			else if (familySize>=5) {count5plus++;}
			totFamilySize=totFamilySize+familySize;
			i++;
		}
		System.out.println("boysAndGirls("+num+")");
		System.out.println("Average: "+totFamilySize/num+" children to get at least one of each gender.");
		System.out.println("Number of families with 2  children: "+count2);
		System.out.println("Number of families with 3  children: "+count3);
		System.out.println("Number of families with 4  children: "+count4);
		System.out.println("Number of families with 5+ children: "+count5plus);
		if (count2>=count3 && count2>=count4 && count2>=count5plus) 
			System.out.println("Most common number of children is 2.");
		else if (count3>=count2 && count3>=count4 && count3>=count5plus) 
			System.out.println("Most common number of children is 3.");
		else if (count4>=count2 && count4>=count3 && count4>=count5plus) 
			System.out.println("Most common number of children is 4.");
		else if (count5plus>=count2 && count5plus>=count3 && count5plus>=count4) 
			System.out.println("Most common number of children is 5 or more.");
	}
	public static int boyAndGirl() {
		int numChildren=0;
		String baby="";
		boolean boy=false;
		boolean girl=false;
		boolean done=false;
		while (!done) {
			numChildren++;
			baby=haveAChild();
			if (baby=="boy") {boy=true;}
			if (baby=="girl") {girl=true;}
			if (boy && girl) {done=true;}
		}
		//System.out.println("Congratulations! You have "+numChildren+" children."); 
		return numChildren;
	}
	public static String haveAChild () {
	    if (Math.random() < 0.5) 
	    	return "boy";
	    else return "girl";
	    
	}
}
