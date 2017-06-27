package weekender_18;

public class BinarySearch {

	private	static int [] list  = new int [] 
				{		0,
						1,
						2,
						3,
						4,
						5,
						6,
						7,
						8,
						9,
						10,
						11,
						12,
						13,
						14,
						15,
						16,
						17,
						18,
						19,
						20,
						21,
						22,
						23,
						24,
						25,
						26,
						27,
						28,
						29,
						30,
						31,
						32,
						33,
						34,
						35,
						36,
						37,
						38,
						39,
						40,
						41,
						42,
						43,
						44,
						45,
						46,
						47,
						48,
						49,
						50,
						51,
						52,
						53,
						54,
						55,
						56,
						57,
						58,
						59,
						60,
						61,
						62,
						63,
						64,
						65,
						66,
						67,
						68,
						69,
						70,
						71,
						72,
						73,
						74,
						75,
						76,
						77,
						78,
						79,
						80,
						81,
						82,
						83,
						84,
						85,
						86,
						87,
						88,
						89,
						90,
						91,
						92,
						93,
						94,
						95,
						96,
						97,
						98,
						99,
						10,
						101,
						102,
						103,
						104,
						105,
						106,
						107,
						108,
						109,
						110,
						111,
						112,
						113,
						114,
						115,
						116,
						117,
						118,
						119,
						120,
						121,
						122,
						123,
						124,
						125,
						126,
						127
				};
		
		public static void main(String[] args)  {
		/**
		 * Read the list of words in the British dictionary into ab ArrayList id strings named book.
		 * 
		 * @param () (describe parameter)
		 * @return (desription of the return value)
		 */
		
			System.out.println("2? "+search(2));
			System.out.println("64? "+search(64));
			System.out.println("39? "+search(39));
			System.out.println("128? "+search(128));
			
		}
		public static boolean search (int s) {
			/**
			 * Search the a item (ignoring case). This does a binary search comparing each middle word in the list which eliminates half the remaining words with each check. 
			 * 
			 * @param (word) i is the item of the search. If it isn't found it is missing from the lis.
			 * @return Return true if the item is found. Otherwise return false.
			 */
			int min = 0;
			int max = list.length - 1;
			int mid = (min + max) / 2; //middle spot between min and max. eliminate below the middle or above the middle with each compare
			
			boolean found = false;
			boolean done = false;
					
			while (!found && !done) { //keep going until were done or the word is found
				if (min > max) { //word is not found and we are done
					done = true; } 
				else if (s == list [mid]) {
					found = true; }
				else if (s > list [mid])  { 
					min = mid + 1; } //target word may be below from the current middle word down in the remaining words. Move the min down.
				else {
					max = mid - 1; //target work may be above in top half of remaining words. Move the max up.
				}
				mid = (min + max) / 2; //pick the middle spot
			}
			return found;
		}
}
