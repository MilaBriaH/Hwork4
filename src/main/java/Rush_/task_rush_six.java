package Rush_;

import java.util.Scanner;

public class task_rush_six {
    public static void main(String[] args) {
        int a, b;
        Scanner sca = new Scanner(System.in);
        Scanner scb = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = sca.nextInt();
        System.out.println("Enter second number: ");
        b = scb.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
