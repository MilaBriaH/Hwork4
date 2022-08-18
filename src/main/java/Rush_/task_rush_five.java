package Rush_;

import java.util.Scanner;

public class task_rush_five {
    public static void main(String[] args) {
        int numberOne, numberTwo;
        Scanner scOne = new Scanner(System.in);
        Scanner scTwo = new Scanner(System.in);
        System.out.println("Enter first number");
        numberOne = scOne.nextInt();
        System.out.println("Enter second number");
        numberTwo = scTwo.nextInt();
        System.out.println("Multiplication of two numbers is: " + (numberOne*numberTwo));
    }
}
