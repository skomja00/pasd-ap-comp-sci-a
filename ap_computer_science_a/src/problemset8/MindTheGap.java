package problemset8;

public class MindTheGap {

	public static void main(String[] args) {
		int [] intArrayA = {1, 3, 6, 7, 12}; //result: 1
		int [] intArrayB = {3, 5, 11, 4, 8}; //result: -7
		int [] intArrayC = {3             }; //result: 0 
		System.out.println(minGap(intArrayA));
		System.out.println(minGap(intArrayB));
		System.out.println(minGap(intArrayC));
	}
	public static int minGap (int [] intArray) {
		if (intArray.length < 2) {						//can be a gap with less than 2 numbers. return 0 all done.
			return 0;
		}
		int min=999;									//compare to a large gap to start so we know we'll pick the minimum/smallest
		int [] gaps = new int [intArray.length-1];
		for (int i = 0; i < intArray.length-1; i++) {	//calculate the gaps 
			gaps [i] = intArray[i+1] - intArray [i];
		}
		for (int gap : gaps) {							//go through all the items and pick the smallest as you go
			if (gap <= min) {
				min = gap;
			}
		}
		return min;
	}
}
