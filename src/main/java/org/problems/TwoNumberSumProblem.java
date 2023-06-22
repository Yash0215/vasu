package org.problems;

import java.util.HashSet;

public class TwoNumberSumProblem {

    public static void main(String[] args) {

        // array = [1, 2, 3, 4, 5]
        // target = 7
        // Q1: Find the TWO numbers from given array whose SUM is equal to TARGET.

        int[] numbers = {1, 2, 3, 4, 5};
        int target = 7;

        int currentNumber;
//        for(int i=0; i<numbers.length; i++) {
//            currentNumber = numbers[i];
//            for(int j=i+1; j<numbers.length; j++) {
//                if (currentNumber + numbers[j]  == target) {  // CHECKING FOR DUPLICITY
//                    System.out.println(currentNumber + " , " + numbers[j]);
//                }
//            }
//        }

      //  array = [1, 2, 3, 4, 5]    search (5) = check each and every number (for loop )- time complexity = O(n)
      //  hashset = [1, 2, 3, 4, 5]  search(3) = it already knows where to look (contains(num))- time complexity = O(1)
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            set.add(numbers[i]);
        }

        for(int i=0; i<numbers.length; i++) {
            currentNumber = numbers[i];
            if(set.contains(target - currentNumber)) {
                System.out.println(currentNumber + " , " + (target - currentNumber));
                System.exit(0);
            }
        }


    }

}
