package MethodsAndLoops;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void printArrayList(ArrayList<String> anyarrayList) {
        for (String s : anyarrayList) {
            System.out.println(s);
        }
    }
    public static void main(String args[]) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alan");
        names.add("Adam");
        names.add("Jhon");
        printArrayList(names);
    }
}
