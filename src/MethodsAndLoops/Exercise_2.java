package MethodsAndLoops;

import java.util.ArrayList;

/**
 * Write a method called getOddsEvens() that takes a boolean and an
 * Integer ArrayList as parameters. If the boolean parameter is true,
 * print only the even integers separated by a newline. If the boolean parameter
 * is false, print only the odd integers separated by a newline.
 */
public class Exercise_2 {
    public static void getOddsEvens(boolean x, ArrayList<Integer> y){
        if(x==true){
            for(Integer I1:y){
                if(I1%2==0){
                    System.out.println(I1);
                }
            }
        }
        if(x==false){
            for(Integer I2:y){
                if(I2%2==1){
                    System.out.println(I2);
                }
            }
        }
    }


    //add code above this line

    public static void main(String args[]) {
        boolean x = Boolean.parseBoolean(args[0]);
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 1; i < args.length; i++) {
            y.add(Integer.parseInt(args[i]));
        }
        getOddsEvens(x, y);
    }
}
