package Polymorphism;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 *
 * Use the Lottery class to the left as the superclass.
 * Create the PowerBall class as a subclass of Lottery.
 * Override the shuffle method so that it returns an
 * ArrayList of six random integers up to but not including 100.
 *
 */
class Lottery {

    public ArrayList<Integer> shuffle() {
        Random r = new Random();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            int num = r.nextInt(20);
            nums.add(num);
        }
        return nums;
    }
}

//add class definitions below this line

class PowerBall extends Lottery {
    public ArrayList<Integer> shuffle() {
        Random r = new Random();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(100);
            nums.add(num);
        }
        return nums;
    }
}

//add class definitions above this line

