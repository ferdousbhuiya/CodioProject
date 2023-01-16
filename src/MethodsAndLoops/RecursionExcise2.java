package MethodsAndLoops;

import java.util.Arrays;

public class RecursionExcise2 {

    public static void main(String[] args) {
        int [] listOfNumber = {1, 2, 3, 4, 5};
        System.out.println(listSum(listOfNumber));
    }
    //add method definitions below this line

    public static int listSum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else {
            int lastIndex = nums.length;
            int tail[] = Arrays.copyOfRange(nums, 1, lastIndex);
            return nums[0] + listSum(tail);
        }
    }

    //add method definitions above this line
}
