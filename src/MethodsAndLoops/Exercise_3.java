package MethodsAndLoops;

import java.util.ArrayList;

/**
 *Write a method called findTerm() that takes a string term and a string ArrayList
 * as parameters. If the term exists inside the ArrayList, then a boolean value of true is returned.
 * Else the term does not exist, false is returned. Note that capitalization matters.
 * For example, "cat"and "Cat" are not considered the same term.
 */
public class Exercise_3 {

    public static boolean findTerm(String x, ArrayList<String> y){
        boolean b= false;
        for(String S:y){
            if(S.equals(x)){
                b=true;
            }
        }
        return b;
    }

    //add code above this line

    public static void main(String args[]) {
        String x = args[0];
        ArrayList<String> y = new ArrayList<String>();
        for (int i = 1; i < args.length; i++) {
            y.add(args[i]);
        }
        System.out.println(findTerm(x, y));
    }


}
