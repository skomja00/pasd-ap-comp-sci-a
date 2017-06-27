package problemset10;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BritishExploration {

	static ArrayList<String> book = new ArrayList<String>();
	
	public static void main(String[] args) throws IOException {
	/**
	 * Read the list of words in the British dictionary into ab ArrayList id strings named book.
	 * 
	 * @param () (describe parameter)
	 * @return (desription of the return value)
	 */
		//Create ArrayList named book from text 
		Scanner scanFile = new Scanner (new File ("C:\\Users\\js037847\\workspace\\ap_computer_science_a\\src\\problemset10\\BritishDictionary.txt"));
		while (scanFile.hasNext () ) {
			book.add(scanFile.next());
		}
		scanFile.close();
		
		System.out.println("hello spelled correctly? "+spellCheck ("hello"));
		System.out.println("color spelled correctly? "+spellCheck ("color"));
		System.out.println("colour spelled correctly? "+spellCheck ("colour"));
		System.out.println("defence spelled correctly? "+spellCheck ("defence"));
		System.out.println("defense spelled correctly? "+spellCheck ("defense"));
		System.out.println("McNaughtInMyHouse spelled correctly? "+spellCheck ("McNaughtInMyHouse"));
		System.out.println("Algebra spelled correctly? "+spellCheck ("Algebra"));
		
		System.out.println("hello spelled correctly (recur)? "+spellCheckRecursive ("hello",0,book.size()-1));
		System.out.println("color spelled correctly (recur)? "+spellCheckRecursive ("color",0,book.size()-1));
		System.out.println("colour spelled correctly (recur)? "+spellCheckRecursive ("colour",0,book.size()-1));
		System.out.println("defence spelled correctly (recur)? "+spellCheckRecursive ("defence",0,book.size()-1));
		System.out.println("defense spelled correctly (recur)? "+spellCheckRecursive ("defense",0,book.size()-1));
		System.out.println("McNaughtInMyHouse spelled correctly (recur)? "+spellCheckRecursive ("McNaughtInMyHouse",0,book.size()-1));
		System.out.println("Algebra spelled correctly (recur)? "+spellCheckRecursive ("Algebra",0,book.size()-1));

		
		longestWord();
		
		mostCommonLen();
		
		wheelOfFortune();
		
	}
	public static boolean spellCheck (String word) {
		/**
		 * Search the British dictionary for a word (ignoring case). This does a binary search comparing each middle word in the list which eliminates half the remaining words with each check. 
		 * 
		 * @param (word) Word is the target of the spell check search. If it isn't found in the list of words it is an incorrectly spelled British word.
		 * @return Return true if the word is found and spelled correctly. Otherwise return false if not found and an incorrectly spelled word.
		 */
		int min = 0;
		int max = book.size() - 1;
		int middle = (min + max) / 2; //pick the middle spot between min and max which will eliminate bottom half or top half remaining words with each compare
		
		boolean found = false;
		boolean done = false;
		
		while (!found && !done) { //keep going until were done or the word is found
			if (min > max) { //word is not found and we are done
				done = true; } 
			else if (book.get(middle).compareTo(word.toLowerCase()) == 0) {
				found = true; }
			else if (book.get(middle).compareTo(word.toLowerCase()) < 0)  { 
				min = middle + 1; } //target word may be below from the current middle word down in the remaining words. Move the min down.
			else {
				max = middle - 1; //target work may be above in top half of remaining words. Move the max up.
			}
			middle = (min + max) / 2; //pick the middle spot
		}
		return found;
	}
	public static boolean spellCheckRecursive (String word, int min, int max) {
		/**
		 * Recursively search the British dictionary for a word (ignoring case). 
		 * This binary search compares each middle word in a list eliminating half the remaining words with each comparison. 
		 * 
		 * @param (word) Word is the target of the spell check search. If it isn't found in the list of words it is an incorrectly spelled British word.
		 * @return Return true if the word is found and spelled correctly. Otherwise return false if not found and an incorrectly spelled word.
		 */

		int mid = (min + max) / 2; //pick the middle spot between min and max which will eliminate bottom half or top half remaining words with each compare
		
		if (book.get(mid).compareTo(word.toLowerCase()) == 0) { //found it! done
			return true; } 
		else if (min > max) { //searched entire list and word is not found. we are done
			return false; } 
		else if (book.get(mid).compareTo(word.toLowerCase()) < 0) { //target word may be below from the current middle word down in the remaining words. Move the min down. 
			min = mid + 1; 
			return spellCheckRecursive (word, min, max); }
		else {
			max = mid - 1; //target work may be above in top half of remaining words. Move the max up.
			return spellCheckRecursive (word, min, max) ;
		}
	}
	public static void longestWord () {
		/**
		 * Search the ArrayList of Strings from the British dictionary for the longest word. 
		 * 
		 * @param none
		 * @return void
		 */
		int length = 0;
		String longestWord = "";
		for (String word : book) {
			if (word.length() > length) {
				length = word.length();
				longestWord = word;
			}
		}
		System.out.println("The longest word in the British dictionary, "+longestWord+", is "+length+" characters long.");
	}
	public static void mostCommonLen () {
		/**
		 * Search for the most common word from the British dictionary. 
		 * 
		 * @param none
		 * @return void
		 */
		int length = 0;
		int mostCommonLen = 0; //this is both the most common length and a pointer into the wordLen array of frequency
		ArrayList<Integer> wordLen = new ArrayList<Integer>(45);
		for (int i = 0; i < 46; i++) { //initialize word lengths to 0
			wordLen.add(i, 0);
		}
		for (int i = 0; i < book.size(); i++) {
			length = book.get(i).length(); //get the length of the word to use as a pointer to the count of words that length
			wordLen.set(length,wordLen.get(length) + 1); //add one to the counter of this word length
		}
		for (int i = 0; i < 46; i++) { //find the largest occurrence 
			if (wordLen.get(i) > wordLen.get(mostCommonLen)) {
				mostCommonLen = i;
			}
		}
		System.out.println("The most common word length in the British dictionary is "+mostCommonLen+" characters long.");
	}
	public static void wheelOfFortune () {
		/**
		 * Find percent of words in British dictionary with at least one of each character of "R", "S", "T", "L", "N" and "E". 
		 * 
		 * @param none
		 * @return void
		 */
		ArrayList<Double> letterFrequency = new ArrayList<Double>();
		letterFrequency.add(0,0.0); //count of words with an "R"
		letterFrequency.add(1,0.0); //count of words with an "S"
		letterFrequency.add(2,0.0); //... "T"
		letterFrequency.add(3,0.0); //... "L"
		letterFrequency.add(4,0.0); //... "N"
		letterFrequency.add(5,0.0); //... "E"
		for (String word : book) {
			if (word.indexOf("r") > -1) {
				letterFrequency.set(0,letterFrequency.get(0) + 1.0); //get the counter of words with an "R" and add 1
			}
			if (word.indexOf("s") > -1) {
				letterFrequency.set(1,letterFrequency.get(1) + 1.0); //get the counter of words with an "S" and add 1
			}
			if (word.indexOf("t") > -1) {
				letterFrequency.set(2,letterFrequency.get(2) + 1.0); //... "T"
			}
			if (word.indexOf("l") > -1) {
				letterFrequency.set(3,letterFrequency.get(3) + 1.0); //... "L"
			}
			if (word.indexOf("n") > -1) {
				letterFrequency.set(4,letterFrequency.get(4) + 1.0); //... "N"
			}
			if (word.indexOf("e") > -1) {
				letterFrequency.set(5,letterFrequency.get(5) + 1.0); //... "E"
			}
		}
		System.out.println("Percentage of words with an 'R' is "+ (letterFrequency.get(0) / (double)book.size()) * 100.0);
		System.out.println("Percentage of words with an 'S' is "+ (letterFrequency.get(1) / (double)book.size()) * 100.0);
		System.out.println("Percentage of words with an 'T' is "+ (letterFrequency.get(2) / (double)book.size()) * 100.0);
		System.out.println("Percentage of words with an 'L' is "+ (letterFrequency.get(3) / (double)book.size()) * 100.0);
		System.out.println("Percentage of words with an 'N' is "+ (letterFrequency.get(4) / (double)book.size()) * 100.0);
		System.out.println("Percentage of words with an 'E' is "+ (letterFrequency.get(5) / (double)book.size()) * 100.0);
	}
}
