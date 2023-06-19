package org.problems;

/**
 * Hello world!
 *
 */
public class DuplicateNumberProblem
{
    public static void main( String[] args )
    {
        // array = [1, 2, 3, 4, 5, 3]
        // Q1: Find out the index of the duplicate number in the given array.

        int[] duplicateNumber = {1,2,3,4,5,3};
        int currentNumber;
        for (int i=0; i<duplicateNumber.length; i++) {
            currentNumber =  duplicateNumber[i];

            for (int j =i+1; j<duplicateNumber.length; j++) {
                if (currentNumber == duplicateNumber[j]) {
                    System.out.println("Duplicate Index : " + j);
                    System.exit(0);
                }
            }
        }




    }
}
