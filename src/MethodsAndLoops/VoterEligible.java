package MethodsAndLoops;

import java.util.Scanner;

public class VoterEligible {
    static final int MIN_AGE = 18;

    public static void isEligible(int age) {
        if (age >= MIN_AGE) {
            System.out.println("You are 'Eligible'");
        }
        else {
            System.out.println("You are 'Not eligible'");
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter your age.");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        isEligible(age);
    }
}
