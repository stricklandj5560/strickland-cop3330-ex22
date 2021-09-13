import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Strickland
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double[] nums = new double[3];
            System.out.print("Enter the first number: ");
            nums[0] = scan.nextDouble();
            System.out.print("Enter the second number: ");
            nums[1] = scan.nextDouble();
            System.out.print("Enter the third number: ");
            nums[2] = scan.nextDouble();
            double largest = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > largest)
                    largest = nums[i];
            }
            System.out.println("The largest number is " + largest);
        }
    }
}
