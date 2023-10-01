package shuffleArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ShuffleArray {

public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };//declaring and intializing an array with 7 values
		List<Integer> lists = Arrays.asList(arr);/*The Arrays.asList() method is used to convert the arr array into a List of Integers*/
		Collections.shuffle(lists);//to shuffle all the elements
		lists.toArray(arr);//covertin lists to arrays
		System.out.println(Arrays.toString(arr));//printing the array
	}
}