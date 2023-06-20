package org.problems;

import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class DuplicateNumberProblemOptimized
{
    public static void main( String[] args )
    {
        // array = [1, 2, 3, 3, 4, 5, 3]
        // Q1: Find out the index of the duplicate number in the given array.

        HashSet<Integer> set = new HashSet<>();

        int[] duplicateNumber = {1,2,3,4,5,3};
        int currentNumber;
        int nextNumber;
        for (int i=0; i<duplicateNumber.length; i++) {
            currentNumber =  duplicateNumber[i];
            if(set.contains(currentNumber)) {
                System.out.println("Duplicate: " + currentNumber);
            }
            set.add(currentNumber);
        }

    }
}
