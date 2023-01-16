package MethodsAndLoops;
/**
 * Problem
 * Write a recursive method called getMax that takes an array of integers as a parameter.
 * Return the largest integer in the array.
 */

import java.util.Arrays;

public class RecursionExercise5 {
    public static void main(String[] args) {
        int [] numbers = {45, 67, 23, 12, 34, 4, 99, 102};
        System.out.println(getMax(numbers));
    }
    //add method definitions below this line

    public static int getMax (int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else {
            int lastIndex = nums.length;
            int tail[] = Arrays.copyOfRange(nums, 1, lastIndex);
            return Math.max(nums[0], getMax(tail));
        }
    }
    //add method definitions above this line
}
