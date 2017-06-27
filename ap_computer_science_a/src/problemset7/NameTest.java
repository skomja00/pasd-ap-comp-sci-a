package problemset7;

public class NameTest {

	public static void main(String[] args) {
		//Now write a program NameTest.java creates two Name objects (a scanner is not required). You'll need first, middle, and last to creates a Name object for each, and uses the methods of the Name class to do the following: 
		//a.	For each name, print 
		//		o	first-middle-last version 
		//		o	last-first-middle version 
		//		o	initials 
		//		o	length 
		//b.	Tell whether or not the names are the same
		Name boysName=new Name("John","F","Kennedy");
		Name girlsName=new Name("Susan","B","Anthony");
		System.out.println(boysName.getNormalOrder());
		System.out.println(boysName.getReverseOrder());
		System.out.println(boysName.initials());
		System.out.println("Name length is "+boysName.length()+".");

		System.out.println(girlsName.getNormalOrder());
		System.out.println(girlsName.getReverseOrder());
		System.out.println(girlsName.initials());
		System.out.println("Name length is "+girlsName.length()+".");

	}

}
