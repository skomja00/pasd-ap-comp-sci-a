package problemset8;

public class Bool {

	public static void main(String[] args) {
		boolean [] test1 = {false, true, true, true} ; //2, 4, 3
		boolean [] test2 = {true} ; //1, 1, 1
		boolean [] test3 = {true, true, true, true, false} ; //1, 4, 4
		fullOfBool(test1);
		fullOfBool(test2);
		fullOfBool(test3);
	}
	public static void fullOfBool (boolean [] b) {
		boolean found=false;
		int first=0;
		int last=0;
		int total=0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] && (!found)) {
				first = i;
				found = true;
			}
			if (b[i]) {
				last = i; 
			}
			if (b[i]) {
				total++;
			}
		}
		System.out.println("first="+(first+1)+" last="+(last+1)+" total="+(total)); //add to first/last since array index starts at 0
	}
}