package arraysAndRandomNumbers;

import java.util.Random;

public class ArraysAndRandomNumbers {

	public static void main(String[] args) {
		// Declare and instantiate a Random Number Generator object
		Random random = new Random(42);		// Same seed = same sequence of random numbers
		// System.out.println("A random number = " + random.nextInt());
		
		// Declare and instantiate an array of 1000 elements
		
		// Write a loop to sum the elements into a variable
		int [] rngSum = new int[1000];
		// Write a while loop to initialize all the array elements using RNG
		int upperBound = 0;
		while (upperBound < rngSum.length) {
			rngSum[upperBound] = random.nextInt();
			upperBound++;
				
		}
		int sum = 0;
		for (int i=0; i < rngSum.length; i++) { 
			sum += rngSum[i];
		}
		// Print sum
		System.out.println("Sum of array elements = " + sum);

	}

}
