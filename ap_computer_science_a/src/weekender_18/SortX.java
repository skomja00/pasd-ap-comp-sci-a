package weekender_18;

public class SortX {

	public static void main(String[] args) {
		//String[] list = new String [] {"gamma", "beta", "alpha"};
		String[] list = new String [] {"Dan", "Alice", "Claire", "Evan", "Boris"};
		for (String item : list) {
			System.out.print(item+" ");			
		}
		System.out.println("");
		
		sort (list); //selection sort. swap largest to bottom. then sort n - 1. etc...
		
		for (String item : list) {
			System.out.print(item+" ");			
		}
		System.out.println("");

	}
	public static void sort (String [] items) {
		int n = items.length;
		while (n > 1) {
			sortHelper (items, n - 1);
			n--;
		}
	}
	private static void sortHelper (String [] items, int last) {
		int l = last;
		for (int k = 0; k < last;  k++) {
			if (items[k].compareTo(items[l]) > 0 ) // k > l   --  find the largest in the list 
				l = k;
		}
		String temp = items [l]; //put the largest at the bottom
		items [l] = items [last];
		items [last] = temp;
	}

}
