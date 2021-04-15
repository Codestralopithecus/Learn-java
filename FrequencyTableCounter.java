package week1Lab;

import java.util.Arrays;

public class FrequencyTableCounter {

	public static int[] frequencyTableCounter(int arrLength) {
		int[] array = new int[arrLength];
		
		// Generate an array of random integers between 0-9.
		for (int i = 0; i < arrLength; i++) {
			array[i] = (int)(Math.random() * 10);
		}
		System.out.format("Array length: %d \nArray = %s", arrLength, Arrays.toString(array));
		
		// Counts how many times each integer is included as an element in the randomly generated array.
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		
		for (int e : array) {
			if (e == 0) {
				zero += 1;
			} else if (e == 1) {
				one += 1;
			} else if (e == 2) {
				two += 1;
			} else if (e == 3) {
				three += 1;
			} else if (e == 4) {
				four += 1;
			} else if (e == 5) {
				five += 1;
			} else if (e == 6) {
				six += 1;
			} else if (e == 7) {
				seven += 1;
			} else if (e == 8) {
				eight += 1;
			} else if (e == 9) {
				nine += 1;
			}
		}
		
		System.out.format("\n\n=== Frequency Table Count result ===\nelements: 0	  1    2 	3	4	5	6	7	8	9\ncount   : %d	%d	%d	%d	%d	%d	%d	%d	%d	%d", zero, one, two, three, four, five, six, seven, eight, nine);
		
		return array;
	}
	
	public static void main(String[] args) {
		frequencyTableCounter(500);
	}

}
