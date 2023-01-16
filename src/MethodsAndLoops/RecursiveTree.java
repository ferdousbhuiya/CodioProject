package MethodsAndLoops;

/**
 * This is demonstration of Turtle class.
 * If we want to use the Turtle class we have to copy the Turtle.java, StdDraw.java and SquiralSprital.java files
 * in the same folder where we will use this class Turtle. 
 */
public class RecursiveTree {
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.left(90);
        t.speed(10);
        recursiveTree(50, 20, t);
    }
    public static void recursiveTree(int branchLength, int angle, Turtle t) {
        if (branchLength > 5) {
            t.forward(branchLength);
            t.right(angle);
            recursiveTree(branchLength - 5, angle, t);
            t.left(angle * 2);
            recursiveTree(branchLength - 5, angle, t);
            t.right(angle);
            t.backward(branchLength);
        }
    }



}
