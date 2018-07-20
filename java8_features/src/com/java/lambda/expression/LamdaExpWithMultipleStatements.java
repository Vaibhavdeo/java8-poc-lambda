package com.java.lambda.expression;

@FunctionalInterface
interface IAverage {

	double avg(int[] array);
}

public class LamdaExpWithMultipleStatements {

	public static void main(String[] args) {

		// 1 way
		IAverage average = (array) -> {
			double sum = 0;
			int arraySize = array.length;
			System.out.println("Size of Array" + arraySize);

			for (int i = 0; i < arraySize; i++) {

				sum = sum + array[i];
			}

			System.out.println("Sum = " + sum);

			return (sum / arraySize);

		};

		// 2nd Way using foreach

		IAverage average2 = array -> {

			if (array.length == 0) {
				return 0;
			}

			double sum = 0;
			for (int i : array) {

				sum = sum + i;
			}

			System.out.println("Sum = " + sum);
			return (sum / array.length);

		};

		int arrayEle[] = { 4, 6, 7, 8, 9 };
		System.out.println("Average of Array2" + average2.avg(arrayEle));
	}

}
