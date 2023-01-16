package Polymorphism;
/**
 *
 * Exercise 4
 * Create the Median class that has the method
 * calculateMedian that calculates the median of the
 * integers passed to the method. Use method overloading so
 * that this method can accept anywhere from two to five parameters.
 */

import java.util.Arrays;

class Median {
    public double calculateMedian(int n1, int n2) {
        return (double) (n1 + n2) / 2;
    }

    public double calculateMedian(int n1, int n2, int n3) {
        int[] nums = {n1, n2, n3};
        Arrays.sort(nums);
        return (double) nums[1];
    }

    public double calculateMedian(int n1, int n2, int n3, int n4) {
        int[] nums = {n1, n2, n3, n4};
        Arrays.sort(nums);
        return (double) (nums[1] + nums[2]) / 2;
    }

    public double calculateMedian(int n1, int n2, int n3, int n4, int n5) {
        int[] nums = {n1, n2, n3, n4, n5};
        Arrays.sort(nums);
        return (double) nums[2];
    }
}
