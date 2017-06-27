package problemset8;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean [] answers = new Boolean [20]; 
		Double [] average = new Double [12];
		Candidate [] c = new Candidate [8];	

		//Problem 2: (4 points)
		//Suppose that “final” integer SIZE has been properly declared and initialized, and that an array named sample has been declared as follows:
		final int SIZE=13;
		int [] sample = new int [SIZE];
		//Write one or more Java statements to perform the following. Note that each task is independent of the other three:
		// 
		// a)  Initialize all array elements to the value 5.
		for (int i = 0; i < sample.length; i++) {
			sample [i] = i;				
		}		
		// b) “Swap” the first value in the array with the last value in the array.
		int tmp = sample [0];
		sample [0] = sample [sample.length - 1];
		sample [sample.length - 1] = tmp;
		// c) Change any negative values to positive values (of the same magnitude).
		for (int i = 0 ; i < sample.length; i++) {
			if (sample[i] < 0) {
				sample[i] = -sample[i];				
			}
		}		
		// d) Print the contents of the “odd-numbered” locations in the array.	 
		for (int index=1; index < sample.length; index=index+2) {
			System.out.println(sample [index]); 
		}
		//Write an enhanced-for loop (for-each loop) for each situation below.
		//a.	A basketball player’s points scored in each game are stored in an int [] named points. How many points did he score in the season?
		//b.	A library has all book titles stored in a String[] named titles. Print each title on its own line.
		//c.	An dating website has a Person[] named singles. Instead of combing through the entire list, your older sister only wants to print the 
		//		names of eligible bachelors who are between 25 and 29 years old. Assume the Person class has a getGender method which returns a String and getAge which returns an int.
		int [] points = {1,3,5,7,9}; //5 game season
		int total=0;
		for (int p : points) {
			total = total + p;
		}
		System.out.println(total);
		String[] titles = {"Java Dummy","Dead Sea Scrolls","Holy Bible","Koran","Talmud"};
		for (String t : titles) {
			System.out.println(t);
		}
		//a. A dating website has a Person[] named singles. Instead of combing through the entire list, your older sister only wants to print the names of eligible 
		//bachelors who are between 25 and 29 years old. Assume the Person class has a getGender method which returns a String and getAge which returns an int.
		Person a = new Person ("Archie","m",25);
		Person b = new Person ("Betty","f",29);
		Person [] singles = {a,b};
		for (Person p : singles) {
			if (p.getGender() == "m" 
				&& p.getAge() >= 25 
				&& p.getAge() <= 29) 
				System.out.println(p.getName());
		}
		
	}
}
