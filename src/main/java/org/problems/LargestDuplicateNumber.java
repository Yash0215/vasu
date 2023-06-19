package org.problems;

public class LargestDuplicateNumber {
    public static void main(String[] args) {

        // array = [1, 2, 3, 4, 5, 3, 5]
        // Q1: Find out the LARGEST DUPLICATE number in the given array.

        int[] numbers = {-1,-2,-3,-4,-5,-3,-5};
        int currentNumber;
        int largestDuplicateNumber = Integer.MIN_VALUE;
        System.out.println(largestDuplicateNumber);
        for(int i=0; i<numbers.length; i++) {
            currentNumber = numbers[i];
            for(int j=i+1; j<numbers.length; j++) {
                if (currentNumber == numbers[j] ) {  // CHECKING FOR DUPLICITY
                    System.out.println(currentNumber);
                    if (currentNumber > largestDuplicateNumber) {
                        largestDuplicateNumber = currentNumber;
                    }
                }
            }
        }

        System.out.println("Largest Duplicate Number : " + largestDuplicateNumber);

    }
}
