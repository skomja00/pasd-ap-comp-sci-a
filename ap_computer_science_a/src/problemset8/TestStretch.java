package problemset8;

import java.util.Arrays;;

public class TestStretch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list = {18, 7, 4, 24, 11};
		int [] list2 = stretch(list);
		System.out.println(Arrays.toString(list));
		System.out.println(Arrays.toString(list2));
		
	}
	public static int [] stretch (int [] arrayA) {
		int i = 0;
		int [] arrayB = new int [arrayA.length * 2];			//create int arrayB 2 times the length of arrayA
		for (int x : arrayA ) {									//for each int in arrayA
			arrayB [i] = x / 2 + (x % 2);						//if odd add the remainder to half of original number
			arrayB [i + 1] = (x / 2);							//half of original number
			i = i + 2;
		}
		return arrayB;
	}

}
