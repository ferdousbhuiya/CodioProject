package MethodsAndLoops;

/**
 * Write a method called getAvg() that takes two double parameters and
 * returns the average of these two parameters as doubles. If either of
 * the parameters is not a double or an integer, the program will catch
 * an exception and print One or more arguments is not a double or an int..
 */
public class Exercise_1 {
    public static double getAvg(double x, double y)
    {
        return (x+y)/2;
    }

    //add code above this line

    public static void main(String args[]) {
        try {
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);
            System.out.println(getAvg(x, y));
        }
        catch (Exception e) {
            System.out.println("One or more arguments is not a double or an int.");
        }
    }
}
