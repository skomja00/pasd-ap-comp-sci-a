package problemset10;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> stringArrayList = new ArrayList<String>();
		stringArrayList.add("c");
		stringArrayList.add("b");
		stringArrayList.add("a");
		stringArrayList.add("z");
		stringArrayList.add("y");
		stringArrayList.add("x");

		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(4);
		intArrayList.add(7);
		intArrayList.add(9);
		intArrayList.add(2);
		intArrayList.add(7);
		intArrayList.add(7);
		intArrayList.add(5);
		intArrayList.add(3);
		intArrayList.add(5);
		intArrayList.add(1);
		intArrayList.add(7);
		intArrayList.add(8);
		intArrayList.add(6);
		intArrayList.add(7);
		
		for (int i : intArrayList) {
			System.out.print(i+" ");
		}
		System.out.println(" unshuffled list.");
		
		shuffle(intArrayList);
		
		for (int i : intArrayList) {
			System.out.print(i+" ");
		}
		System.out.println(" shuffled list.");
		
		for (String a : stringArrayList) {
			System.out.print(a+" ");
		}
		System.out.println(" unsorted list.");

		arrListSelectionSort(stringArrayList);
		
		for (String a : stringArrayList) {
			System.out.print(a+" ");
		}
		System.out.println(" sorted list.");

	}
	public static void filterRange (ArrayList<Integer> list, int min, int max) {
	/*
	 * Problem 1: (10 points)	Use file ArrayListMethods.java
	 * Write a method called filterRange that accepts an ArrayList of integers and two integer values min and max as parameters and 
	 * removes all elements whose values are not in the range min through max (inclusive). For example, if a variable called list stores the values 
	 * [4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7] the call of filterRange (list, 4, 7);  should remove all values not between 4 and 7, 
	 * changing the list to store [4, 7, 7, 7, 5, 5, 7, 6, 7]. If no elements in range min-max are found in the list, 
	 * or if list is initially empty, then list should be empty after the call to filterRange.
	 */
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) { //remove it if OVER the max
				list.remove(i);
			}
			if (list.get(i) < min) { //remove if LOWER than the min
				list.remove(i);
			}
		}
	}
	public static void shuffle (ArrayList<Integer> arrList) {
	/*;
	Problem 2: (10 points)	Use file ArrayListMethods.java
	Write a method void shuffle (int [] arr) that shuffles the objects in arr in a random order. Do not use Java library methods to shuffle 
	(although you may use library methods to get a random number). Note that although this is in the ArrayListMethods class, 
	the method uses a standard array! Hint: the algorithm is very similar to Selection Sort, only on each iteration, instead of 
	finding the largest element, you choose a random one.
	*/
		int temp = 0; //to save the integer being swapped
		int random = 0; //random index position in the list
		for (int i = 0; i < arrList.size(); i++) {
			random = (int) (Math.random() * arrList.size()); //pick a random spot in the list
			temp = arrList.get(i); //save value in current spot
			arrList.set(i,arrList.get(random)); //move the random one to the current spot
			arrList.set(random,temp); //put value from current into the random spot
		}
	}
	public static void arrListSelectionSort (ArrayList<String> list) {
	/*
	Problem 3: (10 points)	Use file ArrayListMethods.java
	Write a void method called arrListSelectionSort that performs a selectionSort on an unsorted ArrayList of Strings. 
	(Hint: You may find the compareTo String method useful to determine which String comes first alphabetically.)
	*/
		int i,j;
		int smallest = 0;
		for (i = 0; i < list.size(); i++) { //go through list repeatedly putting smallest into 1st spot, than 2nd spot, etc...
			smallest = i;
			for (j = i + 1; j < list.size(); j++) {
				if (list.get(j).compareTo(list.get(smallest)) < 0) { //if j is smaller, keep j and note 
					smallest = j;
				}
			}
			if (smallest != i) { //a smaller item was found further in list past i position. swap this smallest position into the next i position
				String temp = list.get(i);
				list.set(i, list.get(smallest));
				list.set(smallest, temp);							
			}
		}
	}
}
 